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

package com.bytechef.atlas.config;

import com.bytechef.atlas.repository.ContextRepository;
import com.bytechef.atlas.repository.CounterRepository;
import com.bytechef.atlas.repository.JobRepository;
import com.bytechef.atlas.repository.TaskExecutionRepository;
import com.bytechef.atlas.repository.WorkflowRepository;
import com.bytechef.atlas.service.ContextService;
import com.bytechef.atlas.service.CounterService;
import com.bytechef.atlas.service.JobService;
import com.bytechef.atlas.service.TaskExecutionService;
import com.bytechef.atlas.service.WorkflowService;
import com.bytechef.atlas.service.impl.ContextServiceImpl;
import com.bytechef.atlas.service.impl.CounterServiceImpl;
import com.bytechef.atlas.service.impl.JobServiceImpl;
import com.bytechef.atlas.service.impl.TaskExecutionServiceImpl;
import com.bytechef.atlas.service.impl.WorkflowServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ivica Cardic
 */
@Configuration
public class WorkflowConfiguration {

    @Bean
    public ContextService contextService(ContextRepository contextRepository) {
        return new ContextServiceImpl(contextRepository);
    }

    @Bean
    public CounterService counterService(CounterRepository counterRepository) {
        return new CounterServiceImpl(counterRepository);
    }

    @Bean
    public JobService jobService(JobRepository jobRepository, WorkflowRepository workflowRepository) {
        return new JobServiceImpl(jobRepository, workflowRepository);
    }

    @Bean
    public TaskExecutionService taskExecutionService(TaskExecutionRepository taskExecutionRepository) {
        return new TaskExecutionServiceImpl(taskExecutionRepository);
    }

    @Bean
    public WorkflowService workflowService(WorkflowRepository workflowRepository) {
        return new WorkflowServiceImpl(workflowRepository);
    }
}
