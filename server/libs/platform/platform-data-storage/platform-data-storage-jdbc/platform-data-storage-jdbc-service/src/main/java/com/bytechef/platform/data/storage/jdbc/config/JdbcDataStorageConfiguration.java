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

package com.bytechef.platform.data.storage.jdbc.config;

import com.bytechef.platform.constant.AppType;
import com.bytechef.platform.data.storage.annotation.ConditionalOnDataStorageProviderJdbc;
import com.bytechef.platform.data.storage.domain.DataStorageScope;
import com.bytechef.platform.data.storage.jdbc.repository.DataStorageRepository;
import com.bytechef.platform.data.storage.jdbc.service.JdbcDataStorageService;
import com.bytechef.platform.data.storage.jdbc.service.JdbcDataStorageServiceImpl;
import com.bytechef.platform.data.storage.service.DataStorageService;
import java.util.Map;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ivica Cardic
 */
@Configuration
@ConditionalOnDataStorageProviderJdbc
public class JdbcDataStorageConfiguration {

    private static final Logger logger = LoggerFactory.getLogger(JdbcDataStorageConfiguration.class);

    public JdbcDataStorageConfiguration() {
        if (logger.isInfoEnabled()) {
            logger.info("Data storage provider type enabled: jdbc");
        }
    }

    @Bean
    JdbcDataStorageService dbDataStorageService(DataStorageRepository dataStorageRepository) {
        return new JdbcDataStorageServiceImpl(dataStorageRepository);
    }

    @Bean
    DataStorageService dataStorageService(JdbcDataStorageService dbDataStorageService) {
        return new DataStorageServiceImpl(dbDataStorageService);
    }

    private record DataStorageServiceImpl(JdbcDataStorageService jdbcDataStorageService) implements DataStorageService {

        @Override
        public <T> Optional<T> fetch(
            String componentName, DataStorageScope scope, String scopeId, String key, AppType type) {

            return jdbcDataStorageService.fetch(componentName, scope, scopeId, key, type);
        }

        @Override
        public <T> T get(String componentName, DataStorageScope scope, String scopeId, String key, AppType type) {
            return jdbcDataStorageService.get(componentName, scope, scopeId, key, type);
        }

        @Override
        public <T> Map<String, T> getAll(String componentName, DataStorageScope scope, String scopeId, AppType type) {
            return jdbcDataStorageService.getAll(componentName, scope, scopeId, type);
        }

        @Override
        public void
            put(String componentName, DataStorageScope scope, String scopeId, String key, AppType type, Object value) {
            jdbcDataStorageService.put(componentName, scope, scopeId, key, type, value);
        }

        @Override
        public void delete(String componentName, DataStorageScope scope, String scopeId, String key, AppType type) {
            jdbcDataStorageService.delete(componentName, scope, scopeId, key, type);
        }
    }
}
