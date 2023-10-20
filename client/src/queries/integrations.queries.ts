import {useQuery} from '@tanstack/react-query';
import {
    CategoryModel,
    IntegrationModel,
    IntegrationsApi,
    TagModel,
    WorkflowModel,
} from 'middleware/embedded/configuration';

export const IntegrationKeys = {
    integration: (id: number) => ['integration', id],
    integrationCategories: ['integrationCategories'] as const,
    integrationList: (filters: {categoryId?: number; tagId?: number}) => [
        ...IntegrationKeys.integrations,
        filters,
    ],
    integrationTags: ['integrationTags'] as const,
    integrationWorkflows: (id: number) => [
        ...IntegrationKeys.integrations,
        id,
        'integrationWorkflows',
    ],
    integrations: ['integrations'] as const,
};

export const useGetIntegrationCategoriesQuery = () =>
    useQuery<CategoryModel[], Error>(
        IntegrationKeys.integrationCategories,
        () => new IntegrationsApi().getIntegrationCategories()
    );

export const useGetIntegrationTagsQuery = () =>
    useQuery<TagModel[], Error>(IntegrationKeys.integrationTags, () =>
        new IntegrationsApi().getIntegrationTags()
    );

export const useGetIntegrationQuery = (
    id: number,
    initialData?: IntegrationModel
) =>
    useQuery<IntegrationModel, Error>(
        IntegrationKeys.integration(id),
        () => new IntegrationsApi().getIntegration({id}),
        {
            initialData,
        }
    );

export const useGetIntegrationsQuery = (filters: {
    categoryId?: number;
    tagId?: number;
}) =>
    useQuery<IntegrationModel[], Error>(
        IntegrationKeys.integrationList(filters),
        () => new IntegrationsApi().getIntegrations(filters)
    );

export const useGetIntegrationWorkflowsQuery = (id: number) =>
    useQuery<WorkflowModel[], Error>(
        IntegrationKeys.integrationWorkflows(id),
        () => new IntegrationsApi().getIntegrationWorkflows({id})
    );
