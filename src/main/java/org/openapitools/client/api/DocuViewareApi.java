/*
 * PassportPDF API
 * Another brick in the cloud
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.DocuViewareGetControlParameters;
import org.openapitools.client.model.DocuViewareGetControlResponse;
import org.openapitools.client.model.DocuViewareSaveParameters;
import org.openapitools.client.model.DocuViewareSaveResponse;
import org.openapitools.client.model.StringResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocuViewareApi {
    private ApiClient localVarApiClient;

    public DocuViewareApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DocuViewareApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for docuViewareGetControl
     * @param docuViewareGetControlParameters A DocuViewareGetControlParameters object specifying the parameters of the action. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call docuViewareGetControlCall(DocuViewareGetControlParameters docuViewareGetControlParameters, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = docuViewareGetControlParameters;

        // create path and map variables
        String localVarPath = "/api/docuvieware/DocuViewareGetControl";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call docuViewareGetControlValidateBeforeCall(DocuViewareGetControlParameters docuViewareGetControlParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'docuViewareGetControlParameters' is set
        if (docuViewareGetControlParameters == null) {
            throw new ApiException("Missing the required parameter 'docuViewareGetControlParameters' when calling docuViewareGetControl(Async)");
        }
        

        okhttp3.Call localVarCall = docuViewareGetControlCall(docuViewareGetControlParameters, _callback);
        return localVarCall;

    }

    /**
     * Gets the HTML dom of a DocuVieware control.
     * 
     * @param docuViewareGetControlParameters A DocuViewareGetControlParameters object specifying the parameters of the action. (required)
     * @return DocuViewareGetControlResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public DocuViewareGetControlResponse docuViewareGetControl(DocuViewareGetControlParameters docuViewareGetControlParameters) throws ApiException {
        ApiResponse<DocuViewareGetControlResponse> localVarResp = docuViewareGetControlWithHttpInfo(docuViewareGetControlParameters);
        return localVarResp.getData();
    }

    /**
     * Gets the HTML dom of a DocuVieware control.
     * 
     * @param docuViewareGetControlParameters A DocuViewareGetControlParameters object specifying the parameters of the action. (required)
     * @return ApiResponse&lt;DocuViewareGetControlResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DocuViewareGetControlResponse> docuViewareGetControlWithHttpInfo(DocuViewareGetControlParameters docuViewareGetControlParameters) throws ApiException {
        okhttp3.Call localVarCall = docuViewareGetControlValidateBeforeCall(docuViewareGetControlParameters, null);
        Type localVarReturnType = new TypeToken<DocuViewareGetControlResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Gets the HTML dom of a DocuVieware control. (asynchronously)
     * 
     * @param docuViewareGetControlParameters A DocuViewareGetControlParameters object specifying the parameters of the action. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call docuViewareGetControlAsync(DocuViewareGetControlParameters docuViewareGetControlParameters, final ApiCallback<DocuViewareGetControlResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = docuViewareGetControlValidateBeforeCall(docuViewareGetControlParameters, _callback);
        Type localVarReturnType = new TypeToken<DocuViewareGetControlResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for docuViewareGetVersion
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call docuViewareGetVersionCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/docuvieware/DocuViewareGetVersion";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call docuViewareGetVersionValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = docuViewareGetVersionCall(_callback);
        return localVarCall;

    }

    /**
     * Get the DocuVieware engine version.
     * 
     * @return StringResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public StringResponse docuViewareGetVersion() throws ApiException {
        ApiResponse<StringResponse> localVarResp = docuViewareGetVersionWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get the DocuVieware engine version.
     * 
     * @return ApiResponse&lt;StringResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StringResponse> docuViewareGetVersionWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = docuViewareGetVersionValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<StringResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the DocuVieware engine version. (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call docuViewareGetVersionAsync(final ApiCallback<StringResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = docuViewareGetVersionValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<StringResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for docuViewareSave
     * @param docuViewareSaveParameters A DocuViewareSaveParameters object specifying the parameters of the action. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call docuViewareSaveCall(DocuViewareSaveParameters docuViewareSaveParameters, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = docuViewareSaveParameters;

        // create path and map variables
        String localVarPath = "/api/docuvieware/DocuViewareSave";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call docuViewareSaveValidateBeforeCall(DocuViewareSaveParameters docuViewareSaveParameters, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'docuViewareSaveParameters' is set
        if (docuViewareSaveParameters == null) {
            throw new ApiException("Missing the required parameter 'docuViewareSaveParameters' when calling docuViewareSave(Async)");
        }
        

        okhttp3.Call localVarCall = docuViewareSaveCall(docuViewareSaveParameters, _callback);
        return localVarCall;

    }

    /**
     * Saves the document being handled by a specific DocuVieware control, in its current state.
     * 
     * @param docuViewareSaveParameters A DocuViewareSaveParameters object specifying the parameters of the action. (required)
     * @return DocuViewareSaveResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public DocuViewareSaveResponse docuViewareSave(DocuViewareSaveParameters docuViewareSaveParameters) throws ApiException {
        ApiResponse<DocuViewareSaveResponse> localVarResp = docuViewareSaveWithHttpInfo(docuViewareSaveParameters);
        return localVarResp.getData();
    }

    /**
     * Saves the document being handled by a specific DocuVieware control, in its current state.
     * 
     * @param docuViewareSaveParameters A DocuViewareSaveParameters object specifying the parameters of the action. (required)
     * @return ApiResponse&lt;DocuViewareSaveResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DocuViewareSaveResponse> docuViewareSaveWithHttpInfo(DocuViewareSaveParameters docuViewareSaveParameters) throws ApiException {
        okhttp3.Call localVarCall = docuViewareSaveValidateBeforeCall(docuViewareSaveParameters, null);
        Type localVarReturnType = new TypeToken<DocuViewareSaveResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Saves the document being handled by a specific DocuVieware control, in its current state. (asynchronously)
     * 
     * @param docuViewareSaveParameters A DocuViewareSaveParameters object specifying the parameters of the action. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call docuViewareSaveAsync(DocuViewareSaveParameters docuViewareSaveParameters, final ApiCallback<DocuViewareSaveResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = docuViewareSaveValidateBeforeCall(docuViewareSaveParameters, _callback);
        Type localVarReturnType = new TypeToken<DocuViewareSaveResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
