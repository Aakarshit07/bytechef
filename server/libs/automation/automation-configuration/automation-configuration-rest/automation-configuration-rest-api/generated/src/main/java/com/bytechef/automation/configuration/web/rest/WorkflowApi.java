/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytechef.automation.configuration.web.rest;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-04-21T11:16:38.575847+02:00[Europe/Zagreb]", comments = "Generator version: 7.4.0")
@Validated
@Tag(name = "workflow", description = "The Automation Workflow API")
public interface WorkflowApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /projects/{id}/workflows : Create new workflow and adds it to an existing project.
     * Create new workflow and adds it to an existing project.
     *
     * @param id The id of a project. (required)
     * @param comBytechefPlatformConfigurationWebRestModelWorkflowModel  (required)
     * @return The updated project object. (status code 200)
     */
    @Operation(
        operationId = "createProjectWorkflow",
        summary = "Create new workflow and adds it to an existing project.",
        description = "Create new workflow and adds it to an existing project.",
        tags = { "workflow" },
        responses = {
            @ApiResponse(responseCode = "200", description = "The updated project object.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = com.bytechef.platform.configuration.web.rest.model.WorkflowModel.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/projects/{id}/workflows",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<com.bytechef.platform.configuration.web.rest.model.WorkflowModel> createProjectWorkflow(
        @Parameter(name = "id", description = "The id of a project.", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "com.bytechef.platform.configuration.web.rest.model.WorkflowModel", description = "", required = true) @Valid @RequestBody com.bytechef.platform.configuration.web.rest.model.WorkflowModel comBytechefPlatformConfigurationWebRestModelWorkflowModel
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"outputs\" : [ { \"name\" : \"name\", \"value\" : \"{}\" }, { \"name\" : \"name\", \"value\" : \"{}\" } ], \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"inputs\" : [ { \"name\" : \"name\", \"label\" : \"label\", \"type\" : \"string\", \"required\" : false }, { \"name\" : \"name\", \"label\" : \"label\", \"type\" : \"string\", \"required\" : false } ], \"lastModifiedBy\" : \"lastModifiedBy\", \"description\" : \"description\", \"label\" : \"label\", \"triggers\" : [ { \"name\" : \"name\", \"label\" : \"label\", \"type\" : \"type\", \"parameters\" : { \"key\" : \"{}\" }, \"connections\" : [ { \"workflowNodeName\" : \"workflowNodeName\", \"componentName\" : \"componentName\", \"componentVersion\" : 6, \"key\" : \"key\", \"required\" : true }, { \"workflowNodeName\" : \"workflowNodeName\", \"componentName\" : \"componentName\", \"componentVersion\" : 6, \"key\" : \"key\", \"required\" : true } ], \"timeout\" : \"timeout\" }, { \"name\" : \"name\", \"label\" : \"label\", \"type\" : \"type\", \"parameters\" : { \"key\" : \"{}\" }, \"connections\" : [ { \"workflowNodeName\" : \"workflowNodeName\", \"componentName\" : \"componentName\", \"componentVersion\" : 6, \"key\" : \"key\", \"required\" : true }, { \"workflowNodeName\" : \"workflowNodeName\", \"componentName\" : \"componentName\", \"componentVersion\" : 6, \"key\" : \"key\", \"required\" : true } ], \"timeout\" : \"timeout\" } ], \"__version\" : 5, \"maxRetries\" : 0, \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"createdBy\" : \"createdBy\", \"sourceType\" : \"CLASSPATH\", \"definition\" : \"definition\", \"id\" : \"id\", \"tasks\" : [ { \"node\" : \"node\", \"pre\" : [ null, null ], \"post\" : [ null, null ], \"destination\" : { \"componentName\" : \"componentName\", \"componentVersion\" : 1 }, \"name\" : \"name\", \"finalize\" : [ null, null ], \"label\" : \"label\", \"source\" : { \"componentName\" : \"componentName\", \"componentVersion\" : 1 }, \"type\" : \"type\", \"parameters\" : { \"key\" : \"{}\" }, \"connections\" : [ { \"workflowNodeName\" : \"workflowNodeName\", \"componentName\" : \"componentName\", \"componentVersion\" : 6, \"key\" : \"key\", \"required\" : true }, { \"workflowNodeName\" : \"workflowNodeName\", \"componentName\" : \"componentName\", \"componentVersion\" : 6, \"key\" : \"key\", \"required\" : true } ], \"timeout\" : \"timeout\" }, { \"node\" : \"node\", \"pre\" : [ null, null ], \"post\" : [ null, null ], \"destination\" : { \"componentName\" : \"componentName\", \"componentVersion\" : 1 }, \"name\" : \"name\", \"finalize\" : [ null, null ], \"label\" : \"label\", \"source\" : { \"componentName\" : \"componentName\", \"componentVersion\" : 1 }, \"type\" : \"type\", \"parameters\" : { \"key\" : \"{}\" }, \"connections\" : [ { \"workflowNodeName\" : \"workflowNodeName\", \"componentName\" : \"componentName\", \"componentVersion\" : 6, \"key\" : \"key\", \"required\" : true }, { \"workflowNodeName\" : \"workflowNodeName\", \"componentName\" : \"componentName\", \"componentVersion\" : 6, \"key\" : \"key\", \"required\" : true } ], \"timeout\" : \"timeout\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /workflows/{id} : Delete a workflow
     * Delete a workflow.
     *
     * @param id The id of a project. (required)
     * @param workflowId The id of the workflow to delete. (required)
     * @return Successful operation. (status code 200)
     */
    @Operation(
        operationId = "deleteWorkflow",
        summary = "Delete a workflow",
        description = "Delete a workflow.",
        tags = { "workflow" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation.")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/workflows/{id}"
    )
    
    default ResponseEntity<Void> deleteWorkflow(
        @Parameter(name = "id", description = "The id of a project.", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "workflowId", description = "The id of the workflow to delete.", required = true, in = ParameterIn.PATH) @PathVariable("workflowId") String workflowId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /projects/{id}/workflows/{workflowId}/duplicate : Duplicates existing workflow.
     * Duplicates existing workflow.
     *
     * @param id The id of a project. (required)
     * @param workflowId The id of a workflow. (required)
     * @return The id of a new duplicated workflow object. (status code 200)
     */
    @Operation(
        operationId = "duplicateWorkflow",
        summary = "Duplicates existing workflow.",
        description = "Duplicates existing workflow.",
        tags = { "workflow" },
        responses = {
            @ApiResponse(responseCode = "200", description = "The id of a new duplicated workflow object.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/projects/{id}/workflows/{workflowId}/duplicate",
        produces = { "application/json" }
    )
    
    default ResponseEntity<String> duplicateWorkflow(
        @Parameter(name = "id", description = "The id of a project.", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "workflowId", description = "The id of a workflow.", required = true, in = ParameterIn.PATH) @PathVariable("workflowId") String workflowId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /projects/{id}/{projectVersion}/workflows : Get workflows for particular project version.
     * Get workflows for particular project version.
     *
     * @param id The id of a project. (required)
     * @param projectVersion The version of a project. (required)
     * @return The array of project workflows. (status code 200)
     */
    @Operation(
        operationId = "getProjectVersionWorkflows",
        summary = "Get workflows for particular project version.",
        description = "Get workflows for particular project version.",
        tags = { "workflow" },
        responses = {
            @ApiResponse(responseCode = "200", description = "The array of project workflows.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = com.bytechef.platform.configuration.web.rest.model.WorkflowBasicModel.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/projects/{id}/{projectVersion}/workflows",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<com.bytechef.platform.configuration.web.rest.model.WorkflowBasicModel>> getProjectVersionWorkflows(
        @Parameter(name = "id", description = "The id of a project.", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "projectVersion", description = "The version of a project.", required = true, in = ParameterIn.PATH) @PathVariable("projectVersion") Integer projectVersion
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedBy\" : \"lastModifiedBy\", \"description\" : \"description\", \"workflowTaskComponentNames\" : [ \"workflowTaskComponentNames\", \"workflowTaskComponentNames\" ], \"label\" : \"label\", \"inputsCount\" : 6, \"connectionsCount\" : 0, \"__version\" : 1, \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"createdBy\" : \"createdBy\", \"manualTrigger\" : true, \"workflowTriggerComponentNames\" : [ \"workflowTriggerComponentNames\", \"workflowTriggerComponentNames\" ], \"id\" : \"id\" }, { \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedBy\" : \"lastModifiedBy\", \"description\" : \"description\", \"workflowTaskComponentNames\" : [ \"workflowTaskComponentNames\", \"workflowTaskComponentNames\" ], \"label\" : \"label\", \"inputsCount\" : 6, \"connectionsCount\" : 0, \"__version\" : 1, \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"createdBy\" : \"createdBy\", \"manualTrigger\" : true, \"workflowTriggerComponentNames\" : [ \"workflowTriggerComponentNames\", \"workflowTriggerComponentNames\" ], \"id\" : \"id\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /projects/{id}/workflows : Get workflows for particular project.
     * Get workflows for particular project.
     *
     * @param id The id of a project. (required)
     * @return The array project workflows. (status code 200)
     */
    @Operation(
        operationId = "getProjectWorkflows",
        summary = "Get workflows for particular project.",
        description = "Get workflows for particular project.",
        tags = { "workflow" },
        responses = {
            @ApiResponse(responseCode = "200", description = "The array project workflows.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = com.bytechef.platform.configuration.web.rest.model.WorkflowBasicModel.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/projects/{id}/workflows",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<com.bytechef.platform.configuration.web.rest.model.WorkflowBasicModel>> getProjectWorkflows(
        @Parameter(name = "id", description = "The id of a project.", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedBy\" : \"lastModifiedBy\", \"description\" : \"description\", \"workflowTaskComponentNames\" : [ \"workflowTaskComponentNames\", \"workflowTaskComponentNames\" ], \"label\" : \"label\", \"inputsCount\" : 6, \"connectionsCount\" : 0, \"__version\" : 1, \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"createdBy\" : \"createdBy\", \"manualTrigger\" : true, \"workflowTriggerComponentNames\" : [ \"workflowTriggerComponentNames\", \"workflowTriggerComponentNames\" ], \"id\" : \"id\" }, { \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"lastModifiedBy\" : \"lastModifiedBy\", \"description\" : \"description\", \"workflowTaskComponentNames\" : [ \"workflowTaskComponentNames\", \"workflowTaskComponentNames\" ], \"label\" : \"label\", \"inputsCount\" : 6, \"connectionsCount\" : 0, \"__version\" : 1, \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"createdBy\" : \"createdBy\", \"manualTrigger\" : true, \"workflowTriggerComponentNames\" : [ \"workflowTriggerComponentNames\", \"workflowTriggerComponentNames\" ], \"id\" : \"id\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /workflows/{id} : Get a workflow by id
     * Get a workflow by id.
     *
     * @param id The id of the workflow to get. (required)
     * @return The workflow object. (status code 200)
     */
    @Operation(
        operationId = "getWorkflow",
        summary = "Get a workflow by id",
        description = "Get a workflow by id.",
        tags = { "workflow" },
        responses = {
            @ApiResponse(responseCode = "200", description = "The workflow object.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = com.bytechef.platform.configuration.web.rest.model.WorkflowModel.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/workflows/{id}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<com.bytechef.platform.configuration.web.rest.model.WorkflowModel> getWorkflow(
        @Parameter(name = "id", description = "The id of the workflow to get.", required = true, in = ParameterIn.PATH) @PathVariable("id") String id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"outputs\" : [ { \"name\" : \"name\", \"value\" : \"{}\" }, { \"name\" : \"name\", \"value\" : \"{}\" } ], \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"inputs\" : [ { \"name\" : \"name\", \"label\" : \"label\", \"type\" : \"string\", \"required\" : false }, { \"name\" : \"name\", \"label\" : \"label\", \"type\" : \"string\", \"required\" : false } ], \"lastModifiedBy\" : \"lastModifiedBy\", \"description\" : \"description\", \"label\" : \"label\", \"triggers\" : [ { \"name\" : \"name\", \"label\" : \"label\", \"type\" : \"type\", \"parameters\" : { \"key\" : \"{}\" }, \"connections\" : [ { \"workflowNodeName\" : \"workflowNodeName\", \"componentName\" : \"componentName\", \"componentVersion\" : 6, \"key\" : \"key\", \"required\" : true }, { \"workflowNodeName\" : \"workflowNodeName\", \"componentName\" : \"componentName\", \"componentVersion\" : 6, \"key\" : \"key\", \"required\" : true } ], \"timeout\" : \"timeout\" }, { \"name\" : \"name\", \"label\" : \"label\", \"type\" : \"type\", \"parameters\" : { \"key\" : \"{}\" }, \"connections\" : [ { \"workflowNodeName\" : \"workflowNodeName\", \"componentName\" : \"componentName\", \"componentVersion\" : 6, \"key\" : \"key\", \"required\" : true }, { \"workflowNodeName\" : \"workflowNodeName\", \"componentName\" : \"componentName\", \"componentVersion\" : 6, \"key\" : \"key\", \"required\" : true } ], \"timeout\" : \"timeout\" } ], \"__version\" : 5, \"maxRetries\" : 0, \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"createdBy\" : \"createdBy\", \"sourceType\" : \"CLASSPATH\", \"definition\" : \"definition\", \"id\" : \"id\", \"tasks\" : [ { \"node\" : \"node\", \"pre\" : [ null, null ], \"post\" : [ null, null ], \"destination\" : { \"componentName\" : \"componentName\", \"componentVersion\" : 1 }, \"name\" : \"name\", \"finalize\" : [ null, null ], \"label\" : \"label\", \"source\" : { \"componentName\" : \"componentName\", \"componentVersion\" : 1 }, \"type\" : \"type\", \"parameters\" : { \"key\" : \"{}\" }, \"connections\" : [ { \"workflowNodeName\" : \"workflowNodeName\", \"componentName\" : \"componentName\", \"componentVersion\" : 6, \"key\" : \"key\", \"required\" : true }, { \"workflowNodeName\" : \"workflowNodeName\", \"componentName\" : \"componentName\", \"componentVersion\" : 6, \"key\" : \"key\", \"required\" : true } ], \"timeout\" : \"timeout\" }, { \"node\" : \"node\", \"pre\" : [ null, null ], \"post\" : [ null, null ], \"destination\" : { \"componentName\" : \"componentName\", \"componentVersion\" : 1 }, \"name\" : \"name\", \"finalize\" : [ null, null ], \"label\" : \"label\", \"source\" : { \"componentName\" : \"componentName\", \"componentVersion\" : 1 }, \"type\" : \"type\", \"parameters\" : { \"key\" : \"{}\" }, \"connections\" : [ { \"workflowNodeName\" : \"workflowNodeName\", \"componentName\" : \"componentName\", \"componentVersion\" : 6, \"key\" : \"key\", \"required\" : true }, { \"workflowNodeName\" : \"workflowNodeName\", \"componentName\" : \"componentName\", \"componentVersion\" : 6, \"key\" : \"key\", \"required\" : true } ], \"timeout\" : \"timeout\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /workflows/{id} : Update an existing workflow
     * Update an existing workflow.
     *
     * @param id The id of the workflow to update. (required)
     * @param comBytechefPlatformConfigurationWebRestModelWorkflowModel  (required)
     * @return The updated workflow object. (status code 200)
     */
    @Operation(
        operationId = "updateWorkflow",
        summary = "Update an existing workflow",
        description = "Update an existing workflow.",
        tags = { "workflow" },
        responses = {
            @ApiResponse(responseCode = "200", description = "The updated workflow object.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = com.bytechef.platform.configuration.web.rest.model.WorkflowModel.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/workflows/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<com.bytechef.platform.configuration.web.rest.model.WorkflowModel> updateWorkflow(
        @Parameter(name = "id", description = "The id of the workflow to update.", required = true, in = ParameterIn.PATH) @PathVariable("id") String id,
        @Parameter(name = "com.bytechef.platform.configuration.web.rest.model.WorkflowModel", description = "", required = true) @Valid @RequestBody com.bytechef.platform.configuration.web.rest.model.WorkflowModel comBytechefPlatformConfigurationWebRestModelWorkflowModel
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"outputs\" : [ { \"name\" : \"name\", \"value\" : \"{}\" }, { \"name\" : \"name\", \"value\" : \"{}\" } ], \"lastModifiedDate\" : \"2000-01-23T04:56:07.000+00:00\", \"inputs\" : [ { \"name\" : \"name\", \"label\" : \"label\", \"type\" : \"string\", \"required\" : false }, { \"name\" : \"name\", \"label\" : \"label\", \"type\" : \"string\", \"required\" : false } ], \"lastModifiedBy\" : \"lastModifiedBy\", \"description\" : \"description\", \"label\" : \"label\", \"triggers\" : [ { \"name\" : \"name\", \"label\" : \"label\", \"type\" : \"type\", \"parameters\" : { \"key\" : \"{}\" }, \"connections\" : [ { \"workflowNodeName\" : \"workflowNodeName\", \"componentName\" : \"componentName\", \"componentVersion\" : 6, \"key\" : \"key\", \"required\" : true }, { \"workflowNodeName\" : \"workflowNodeName\", \"componentName\" : \"componentName\", \"componentVersion\" : 6, \"key\" : \"key\", \"required\" : true } ], \"timeout\" : \"timeout\" }, { \"name\" : \"name\", \"label\" : \"label\", \"type\" : \"type\", \"parameters\" : { \"key\" : \"{}\" }, \"connections\" : [ { \"workflowNodeName\" : \"workflowNodeName\", \"componentName\" : \"componentName\", \"componentVersion\" : 6, \"key\" : \"key\", \"required\" : true }, { \"workflowNodeName\" : \"workflowNodeName\", \"componentName\" : \"componentName\", \"componentVersion\" : 6, \"key\" : \"key\", \"required\" : true } ], \"timeout\" : \"timeout\" } ], \"__version\" : 5, \"maxRetries\" : 0, \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\", \"createdBy\" : \"createdBy\", \"sourceType\" : \"CLASSPATH\", \"definition\" : \"definition\", \"id\" : \"id\", \"tasks\" : [ { \"node\" : \"node\", \"pre\" : [ null, null ], \"post\" : [ null, null ], \"destination\" : { \"componentName\" : \"componentName\", \"componentVersion\" : 1 }, \"name\" : \"name\", \"finalize\" : [ null, null ], \"label\" : \"label\", \"source\" : { \"componentName\" : \"componentName\", \"componentVersion\" : 1 }, \"type\" : \"type\", \"parameters\" : { \"key\" : \"{}\" }, \"connections\" : [ { \"workflowNodeName\" : \"workflowNodeName\", \"componentName\" : \"componentName\", \"componentVersion\" : 6, \"key\" : \"key\", \"required\" : true }, { \"workflowNodeName\" : \"workflowNodeName\", \"componentName\" : \"componentName\", \"componentVersion\" : 6, \"key\" : \"key\", \"required\" : true } ], \"timeout\" : \"timeout\" }, { \"node\" : \"node\", \"pre\" : [ null, null ], \"post\" : [ null, null ], \"destination\" : { \"componentName\" : \"componentName\", \"componentVersion\" : 1 }, \"name\" : \"name\", \"finalize\" : [ null, null ], \"label\" : \"label\", \"source\" : { \"componentName\" : \"componentName\", \"componentVersion\" : 1 }, \"type\" : \"type\", \"parameters\" : { \"key\" : \"{}\" }, \"connections\" : [ { \"workflowNodeName\" : \"workflowNodeName\", \"componentName\" : \"componentName\", \"componentVersion\" : 6, \"key\" : \"key\", \"required\" : true }, { \"workflowNodeName\" : \"workflowNodeName\", \"componentName\" : \"componentName\", \"componentVersion\" : 6, \"key\" : \"key\", \"required\" : true } ], \"timeout\" : \"timeout\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
