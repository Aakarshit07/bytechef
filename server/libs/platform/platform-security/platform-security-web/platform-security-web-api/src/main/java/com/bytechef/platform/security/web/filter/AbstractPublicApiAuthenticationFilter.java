/*
 * Copyright 2023-present ByteChef Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bytechef.platform.security.web.filter;

import com.bytechef.platform.constant.AppType;
import com.bytechef.platform.constant.Environment;
import com.bytechef.platform.security.web.authentication.AbstractPublicApiAuthenticationToken;
import com.bytechef.platform.security.web.authentication.ApiKeyAuthenticationToken;
import com.bytechef.platform.tenant.util.TenantUtils;
import com.bytechef.platform.user.domain.TenantKey;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import jakarta.servlet.FilterChain;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.util.matcher.NegatedRequestMatcher;
import org.springframework.security.web.util.matcher.RegexRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * @author Ivica Cardic
 */
public abstract class AbstractPublicApiAuthenticationFilter extends OncePerRequestFilter {

    private static final String AUTH_TOKEN_HEADER_NAME = "Authorization";

    private final AuthenticationManager authenticationManager;
    private final RequestMatcher requestMatcher;

    @SuppressFBWarnings("EI")
    public AbstractPublicApiAuthenticationFilter(String pathPatternRegex, AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
        this.requestMatcher = new NegatedRequestMatcher(RegexRequestMatcher.regexMatcher(pathPatternRegex));
    }

    @Override
    protected void doFilterInternal(
        HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) {

        AbstractPublicApiAuthenticationToken authentication =
            (AbstractPublicApiAuthenticationToken) getAuthentication(httpServletRequest);

        TenantUtils.runWithTenantId(
            authentication.getTenantId(),
            () -> {
                Authentication authenticatedAuthentication = authenticationManager.authenticate(authentication);

                SecurityContext context = SecurityContextHolder.getContext();

                context.setAuthentication(authenticatedAuthentication);

                filterChain.doFilter(httpServletRequest, httpServletResponse);
            });
    }

    protected Authentication getAuthentication(HttpServletRequest request) {
        String token = getAuthToken(request);

        TenantKey tenantKey = TenantKey.parse(token);

        String requestURI = request.getRequestURI();

        AppType type = null;

        if (requestURI.contains("/automation/")) {
            type = AppType.AUTOMATION;
        } else if (requestURI.contains("/embedded/")) {
            type = AppType.EMBEDDED;
        }

        return new ApiKeyAuthenticationToken(token, getEnvironment(request), tenantKey.getTenantId(), type);
    }

    protected String getAuthToken(HttpServletRequest request) {
        String token = request.getHeader(AUTH_TOKEN_HEADER_NAME);

        if (token == null) {
            throw new BadCredentialsException("Authorization token does not exist");
        }

        return token.replace("Bearer ", "");
    }

    protected Environment getEnvironment(HttpServletRequest request) {
        String environment = request.getHeader("x-environment");

        if (StringUtils.isNotBlank(environment)) {
            return Environment.valueOf(environment.toUpperCase());
        }

        return null;
    }

    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) {
        return requestMatcher.matches(request);
    }
}