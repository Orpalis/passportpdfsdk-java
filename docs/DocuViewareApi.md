# DocuViewareApi

All URIs are relative to *https://passportpdfapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**docuViewareGetControl**](DocuViewareApi.md#docuViewareGetControl) | **POST** /api/docuvieware/DocuViewareGetControl | Gets the HTML dom of a DocuVieware control.
[**docuViewareGetVersion**](DocuViewareApi.md#docuViewareGetVersion) | **GET** /api/docuvieware/DocuViewareGetVersion | Get the DocuVieware engine version.
[**docuViewareSave**](DocuViewareApi.md#docuViewareSave) | **POST** /api/docuvieware/DocuViewareSave | Saves the document being handled by a specific DocuVieware control, in its current state.


<a name="docuViewareGetControl"></a>
# **docuViewareGetControl**
> DocuViewareGetControlResponse docuViewareGetControl(docuViewareGetControlParameters)

Gets the HTML dom of a DocuVieware control.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DocuViewareApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    DocuViewareApi apiInstance = new DocuViewareApi(defaultClient);
    DocuViewareGetControlParameters docuViewareGetControlParameters = new DocuViewareGetControlParameters(); // DocuViewareGetControlParameters | A DocuViewareGetControlParameters object specifying the parameters of the action.
    try {
      DocuViewareGetControlResponse result = apiInstance.docuViewareGetControl(docuViewareGetControlParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocuViewareApi#docuViewareGetControl");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docuViewareGetControlParameters** | [**DocuViewareGetControlParameters**](DocuViewareGetControlParameters.md)| A DocuViewareGetControlParameters object specifying the parameters of the action. |

### Return type

[**DocuViewareGetControlResponse**](DocuViewareGetControlResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="docuViewareGetVersion"></a>
# **docuViewareGetVersion**
> StringResponse docuViewareGetVersion()

Get the DocuVieware engine version.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DocuViewareApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    DocuViewareApi apiInstance = new DocuViewareApi(defaultClient);
    try {
      StringResponse result = apiInstance.docuViewareGetVersion();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocuViewareApi#docuViewareGetVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StringResponse**](StringResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="docuViewareSave"></a>
# **docuViewareSave**
> DocuViewareSaveResponse docuViewareSave(docuViewareSaveParameters)

Saves the document being handled by a specific DocuVieware control, in its current state.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DocuViewareApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    DocuViewareApi apiInstance = new DocuViewareApi(defaultClient);
    DocuViewareSaveParameters docuViewareSaveParameters = new DocuViewareSaveParameters(); // DocuViewareSaveParameters | A DocuViewareSaveParameters object specifying the parameters of the action.
    try {
      DocuViewareSaveResponse result = apiInstance.docuViewareSave(docuViewareSaveParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocuViewareApi#docuViewareSave");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **docuViewareSaveParameters** | [**DocuViewareSaveParameters**](DocuViewareSaveParameters.md)| A DocuViewareSaveParameters object specifying the parameters of the action. |

### Return type

[**DocuViewareSaveResponse**](DocuViewareSaveResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

