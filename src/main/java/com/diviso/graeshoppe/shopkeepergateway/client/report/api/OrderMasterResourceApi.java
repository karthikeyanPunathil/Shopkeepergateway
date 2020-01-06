/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.diviso.graeshoppe.shopkeepergateway.client.report.api;

import com.diviso.graeshoppe.shopkeepergateway.client.report.model.OrderMasterDTO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-03T09:32:05.158+05:30[Asia/Kolkata]")

@Api(value = "OrderMasterResource", description = "the OrderMasterResource API")
public interface OrderMasterResourceApi {

    @ApiOperation(value = "createOrderMaster", nickname = "createOrderMasterUsingPOST", notes = "", response = OrderMasterDTO.class, tags={ "order-master-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderMasterDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/order-masters",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<OrderMasterDTO> createOrderMasterUsingPOST(@ApiParam(value = "orderMasterDTO" ,required=true )  @Valid @RequestBody OrderMasterDTO orderMasterDTO);


    @ApiOperation(value = "deleteOrderMaster", nickname = "deleteOrderMasterUsingDELETE", notes = "", tags={ "order-master-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/api/order-masters/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteOrderMasterUsingDELETE(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "getAllOrderMasters", nickname = "getAllOrderMastersUsingGET", notes = "", response = OrderMasterDTO.class, responseContainer = "List", tags={ "order-master-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderMasterDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/order-masters",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<OrderMasterDTO>> getAllOrderMastersUsingGET(@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "getOrderMaster", nickname = "getOrderMasterUsingGET", notes = "", response = OrderMasterDTO.class, tags={ "order-master-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderMasterDTO.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/order-masters/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<OrderMasterDTO> getOrderMasterUsingGET(@ApiParam(value = "id",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "searchOrderMasters", nickname = "searchOrderMastersUsingGET", notes = "", response = OrderMasterDTO.class, responseContainer = "List", tags={ "order-master-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderMasterDTO.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/_search/order-masters",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<OrderMasterDTO>> searchOrderMastersUsingGET(@NotNull @ApiParam(value = "query", required = true) @Valid @RequestParam(value = "query", required = true) String query,@ApiParam(value = "Page number of the requested page") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Size of a page") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Sorting criteria in the format: property(,asc|desc). Default sort order is ascending. Multiple sort criteria are supported.") @Valid @RequestParam(value = "sort", required = false) List<String> sort);


    @ApiOperation(value = "updateOrderMaster", nickname = "updateOrderMasterUsingPUT", notes = "", response = OrderMasterDTO.class, tags={ "order-master-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderMasterDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/order-masters",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<OrderMasterDTO> updateOrderMasterUsingPUT(@ApiParam(value = "orderMasterDTO" ,required=true )  @Valid @RequestBody OrderMasterDTO orderMasterDTO);

}
