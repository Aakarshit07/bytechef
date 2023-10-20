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

package com.bytechef.hermes.file.storage.filesystem.config;

import com.bytechef.hermes.file.storage.config.FileStorageProperties;
import com.bytechef.hermes.file.storage.filesystem.service.FilesystemFileStorageService;
import com.bytechef.hermes.file.storage.service.FileStorageService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ivica Cardic
 */
@Configuration
@EnableConfigurationProperties(FileStorageProperties.class)
@ConditionalOnProperty(name = "file.storage.provider", havingValue = "filesystem")
public class FilesystemFileStorageConfiguration {

    @Bean
    FileStorageService fileSystemFileStorageService(FileStorageProperties storageProperties) {
        return new FilesystemFileStorageService(storageProperties.getFileStorageDir());
    }
}
