
/*
 * Copyright 2021 <your company/name>.
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

package com.bytechef.helios.project.web.rest.mapper.config;

import com.bytechef.hermes.workflow.web.rest.adapter.WorkflowConversionServiceAdapter;
import com.bytechef.category.web.rest.mapper.adapter.CategoryConversionServiceAdapter;
import com.bytechef.helios.project.web.rest.adapter.ProjectConversionServiceAdapter;
import com.bytechef.hermes.connection.web.rest.adapter.ConnectionConversionServiceAdapter;
import com.bytechef.tag.web.rest.mapper.adapter.TagConversionServiceAdapter;
import org.mapstruct.MapperConfig;
import org.mapstruct.extensions.spring.SpringMapperConfig;

/**
 * @author Ivica Cardic
 */
@MapperConfig(componentModel = "spring", uses = {
    CategoryConversionServiceAdapter.class, ConnectionConversionServiceAdapter.class,
    ProjectConversionServiceAdapter.class, TagConversionServiceAdapter.class, WorkflowConversionServiceAdapter.class
})
@SpringMapperConfig(
    conversionServiceAdapterPackage = "com.bytechef.helios.project.web.rest.adapter",
    conversionServiceAdapterClassName = "ProjectConversionServiceAdapter")
public interface ProjectMapperSpringConfig {
}
