/* tslint:disable */
/* eslint-disable */
/**
 * The Automation Configuration API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import * as runtime from '../runtime';
import type {
  ProjectModel,
  ProjectStatusModel,
  ProjectVersionModel,
  PublishProjectRequestModel,
} from '../models/index';
import {
    ProjectModelFromJSON,
    ProjectModelToJSON,
    ProjectStatusModelFromJSON,
    ProjectStatusModelToJSON,
    ProjectVersionModelFromJSON,
    ProjectVersionModelToJSON,
    PublishProjectRequestModelFromJSON,
    PublishProjectRequestModelToJSON,
} from '../models/index';

export interface CreateProjectRequest {
    projectModel: ProjectModel;
}

export interface DeleteProjectRequest {
    id: number;
}

export interface DuplicateProjectRequest {
    id: number;
}

export interface GetProjectRequest {
    id: number;
}

export interface GetProjectVersionsRequest {
    id: number;
}

export interface GetProjectsRequest {
    categoryId?: number;
    projectInstances?: boolean;
    tagId?: number;
    status?: ProjectStatusModel;
}

export interface PublishProjectRequest {
    id: number;
    publishProjectRequestModel?: PublishProjectRequestModel;
}

export interface UpdateProjectRequest {
    id: number;
    projectModel: ProjectModel;
}

/**
 * 
 */
export class ProjectApi extends runtime.BaseAPI {

    /**
     * Create a new project.
     * Create a new project.
     */
    async createProjectRaw(requestParameters: CreateProjectRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ProjectModel>> {
        if (requestParameters['projectModel'] == null) {
            throw new runtime.RequiredError(
                'projectModel',
                'Required parameter "projectModel" was null or undefined when calling createProject().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/projects`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: ProjectModelToJSON(requestParameters['projectModel']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ProjectModelFromJSON(jsonValue));
    }

    /**
     * Create a new project.
     * Create a new project.
     */
    async createProject(requestParameters: CreateProjectRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ProjectModel> {
        const response = await this.createProjectRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Delete a project.
     * Delete a project.
     */
    async deleteProjectRaw(requestParameters: DeleteProjectRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<void>> {
        if (requestParameters['id'] == null) {
            throw new runtime.RequiredError(
                'id',
                'Required parameter "id" was null or undefined when calling deleteProject().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/projects/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters['id']))),
            method: 'DELETE',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.VoidApiResponse(response);
    }

    /**
     * Delete a project.
     * Delete a project.
     */
    async deleteProject(requestParameters: DeleteProjectRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<void> {
        await this.deleteProjectRaw(requestParameters, initOverrides);
    }

    /**
     * Duplicates existing project.
     * Duplicates existing project.
     */
    async duplicateProjectRaw(requestParameters: DuplicateProjectRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ProjectModel>> {
        if (requestParameters['id'] == null) {
            throw new runtime.RequiredError(
                'id',
                'Required parameter "id" was null or undefined when calling duplicateProject().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/projects/{id}/duplicate`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters['id']))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ProjectModelFromJSON(jsonValue));
    }

    /**
     * Duplicates existing project.
     * Duplicates existing project.
     */
    async duplicateProject(requestParameters: DuplicateProjectRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ProjectModel> {
        const response = await this.duplicateProjectRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Get a project by id.
     * Get a project by id.
     */
    async getProjectRaw(requestParameters: GetProjectRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ProjectModel>> {
        if (requestParameters['id'] == null) {
            throw new runtime.RequiredError(
                'id',
                'Required parameter "id" was null or undefined when calling getProject().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/projects/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters['id']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ProjectModelFromJSON(jsonValue));
    }

    /**
     * Get a project by id.
     * Get a project by id.
     */
    async getProject(requestParameters: GetProjectRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ProjectModel> {
        const response = await this.getProjectRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Get a project versions.
     * Get a project versions.
     */
    async getProjectVersionsRaw(requestParameters: GetProjectVersionsRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<ProjectVersionModel>>> {
        if (requestParameters['id'] == null) {
            throw new runtime.RequiredError(
                'id',
                'Required parameter "id" was null or undefined when calling getProjectVersions().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/projects/{id}/versions`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters['id']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(ProjectVersionModelFromJSON));
    }

    /**
     * Get a project versions.
     * Get a project versions.
     */
    async getProjectVersions(requestParameters: GetProjectVersionsRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<ProjectVersionModel>> {
        const response = await this.getProjectVersionsRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Get projects.
     * Get projects.
     */
    async getProjectsRaw(requestParameters: GetProjectsRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<ProjectModel>>> {
        const queryParameters: any = {};

        if (requestParameters['categoryId'] != null) {
            queryParameters['categoryId'] = requestParameters['categoryId'];
        }

        if (requestParameters['projectInstances'] != null) {
            queryParameters['projectInstances'] = requestParameters['projectInstances'];
        }

        if (requestParameters['tagId'] != null) {
            queryParameters['tagId'] = requestParameters['tagId'];
        }

        if (requestParameters['status'] != null) {
            queryParameters['status'] = requestParameters['status'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/projects`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(ProjectModelFromJSON));
    }

    /**
     * Get projects.
     * Get projects.
     */
    async getProjects(requestParameters: GetProjectsRequest = {}, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<ProjectModel>> {
        const response = await this.getProjectsRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Publishes existing project.
     * Publishes existing project.
     */
    async publishProjectRaw(requestParameters: PublishProjectRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<void>> {
        if (requestParameters['id'] == null) {
            throw new runtime.RequiredError(
                'id',
                'Required parameter "id" was null or undefined when calling publishProject().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/projects/{id}/publish`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters['id']))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: PublishProjectRequestModelToJSON(requestParameters['publishProjectRequestModel']),
        }, initOverrides);

        return new runtime.VoidApiResponse(response);
    }

    /**
     * Publishes existing project.
     * Publishes existing project.
     */
    async publishProject(requestParameters: PublishProjectRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<void> {
        await this.publishProjectRaw(requestParameters, initOverrides);
    }

    /**
     * Update an existing project.
     * Update an existing project.
     */
    async updateProjectRaw(requestParameters: UpdateProjectRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ProjectModel>> {
        if (requestParameters['id'] == null) {
            throw new runtime.RequiredError(
                'id',
                'Required parameter "id" was null or undefined when calling updateProject().'
            );
        }

        if (requestParameters['projectModel'] == null) {
            throw new runtime.RequiredError(
                'projectModel',
                'Required parameter "projectModel" was null or undefined when calling updateProject().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/projects/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters['id']))),
            method: 'PUT',
            headers: headerParameters,
            query: queryParameters,
            body: ProjectModelToJSON(requestParameters['projectModel']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ProjectModelFromJSON(jsonValue));
    }

    /**
     * Update an existing project.
     * Update an existing project.
     */
    async updateProject(requestParameters: UpdateProjectRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ProjectModel> {
        const response = await this.updateProjectRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
