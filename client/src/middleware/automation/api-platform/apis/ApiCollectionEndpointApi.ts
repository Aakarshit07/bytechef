/* tslint:disable */
/* eslint-disable */
/**
 * The Automation API Platform Internal API
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
  ApiCollectionEndpoint,
} from '../models/index';
import {
    ApiCollectionEndpointFromJSON,
    ApiCollectionEndpointToJSON,
} from '../models/index';

export interface CreateApiCollectionEndpointRequest {
    apiCollectionEndpoint: Omit<ApiCollectionEndpoint, 'createdBy'|'createdDate'|'id'|'lastExecutionDate'|'lastModifiedBy'|'lastModifiedDate'|'projectInstanceWorkflowId'>;
}

export interface DeleteApiCollectionEndpointRequest {
    id: number;
}

export interface GetApiCollectionEndpointRequest {
    id: number;
}

export interface UpdateApiCollectionEndpointRequest {
    id: number;
    apiCollectionEndpoint: Omit<ApiCollectionEndpoint, 'createdBy'|'createdDate'|'id'|'lastExecutionDate'|'lastModifiedBy'|'lastModifiedDate'|'projectInstanceWorkflowId'>;
}

/**
 * 
 */
export class ApiCollectionEndpointApi extends runtime.BaseAPI {

    /**
     * Create a new API collection endpoint.
     * Create a new API collection endpoint
     */
    async createApiCollectionEndpointRaw(requestParameters: CreateApiCollectionEndpointRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ApiCollectionEndpoint>> {
        if (requestParameters['apiCollectionEndpoint'] == null) {
            throw new runtime.RequiredError(
                'apiCollectionEndpoint',
                'Required parameter "apiCollectionEndpoint" was null or undefined when calling createApiCollectionEndpoint().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/api-collection-endpoints`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: ApiCollectionEndpointToJSON(requestParameters['apiCollectionEndpoint']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ApiCollectionEndpointFromJSON(jsonValue));
    }

    /**
     * Create a new API collection endpoint.
     * Create a new API collection endpoint
     */
    async createApiCollectionEndpoint(requestParameters: CreateApiCollectionEndpointRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ApiCollectionEndpoint> {
        const response = await this.createApiCollectionEndpointRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Delete an API collection endpoint.
     * Delete an API collection endpoint
     */
    async deleteApiCollectionEndpointRaw(requestParameters: DeleteApiCollectionEndpointRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<void>> {
        if (requestParameters['id'] == null) {
            throw new runtime.RequiredError(
                'id',
                'Required parameter "id" was null or undefined when calling deleteApiCollectionEndpoint().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/api-collection-endpoints/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters['id']))),
            method: 'DELETE',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.VoidApiResponse(response);
    }

    /**
     * Delete an API collection endpoint.
     * Delete an API collection endpoint
     */
    async deleteApiCollectionEndpoint(requestParameters: DeleteApiCollectionEndpointRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<void> {
        await this.deleteApiCollectionEndpointRaw(requestParameters, initOverrides);
    }

    /**
     * Get an API collection endpoint by id.
     * Get an API collection endpoint by id
     */
    async getApiCollectionEndpointRaw(requestParameters: GetApiCollectionEndpointRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ApiCollectionEndpoint>> {
        if (requestParameters['id'] == null) {
            throw new runtime.RequiredError(
                'id',
                'Required parameter "id" was null or undefined when calling getApiCollectionEndpoint().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/api-collection-endpoints/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters['id']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ApiCollectionEndpointFromJSON(jsonValue));
    }

    /**
     * Get an API collection endpoint by id.
     * Get an API collection endpoint by id
     */
    async getApiCollectionEndpoint(requestParameters: GetApiCollectionEndpointRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ApiCollectionEndpoint> {
        const response = await this.getApiCollectionEndpointRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Update an existing API collection endpoint.
     * Update an existing API collection endpoint
     */
    async updateApiCollectionEndpointRaw(requestParameters: UpdateApiCollectionEndpointRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ApiCollectionEndpoint>> {
        if (requestParameters['id'] == null) {
            throw new runtime.RequiredError(
                'id',
                'Required parameter "id" was null or undefined when calling updateApiCollectionEndpoint().'
            );
        }

        if (requestParameters['apiCollectionEndpoint'] == null) {
            throw new runtime.RequiredError(
                'apiCollectionEndpoint',
                'Required parameter "apiCollectionEndpoint" was null or undefined when calling updateApiCollectionEndpoint().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/api-collection-endpoints/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters['id']))),
            method: 'PUT',
            headers: headerParameters,
            query: queryParameters,
            body: ApiCollectionEndpointToJSON(requestParameters['apiCollectionEndpoint']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ApiCollectionEndpointFromJSON(jsonValue));
    }

    /**
     * Update an existing API collection endpoint.
     * Update an existing API collection endpoint
     */
    async updateApiCollectionEndpoint(requestParameters: UpdateApiCollectionEndpointRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ApiCollectionEndpoint> {
        const response = await this.updateApiCollectionEndpointRaw(requestParameters, initOverrides);
        return await response.value();
    }

}