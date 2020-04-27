# DocumentApi

All URIs are relative to *https://passportpdfapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**documentClose**](DocumentApi.md#documentClose) | **POST** /api/document/DocumentClose | Closes a previously uploaded document.
[**documentGetPreview**](DocumentApi.md#documentGetPreview) | **POST** /api/document/DocumentGetPreview | Gets the format, the page count and a thumbnail of a previously uploaded document.
[**documentLoad**](DocumentApi.md#documentLoad) | **POST** /api/document/DocumentLoad | Loads the provided document file.
[**documentLoadFromURI**](DocumentApi.md#documentLoadFromURI) | **POST** /api/document/DocumentLoadFromURI | Loads the provided document file from an URI.
[**documentLoadMultipart**](DocumentApi.md#documentLoadMultipart) | **POST** /api/document/DocumentLoadMultipart | Loads the provided document file using Multipart Upload.


<a name="documentClose"></a>
# **documentClose**
> DocumentCloseResponse documentClose(documentCloseParameters)

Closes a previously uploaded document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    DocumentApi apiInstance = new DocumentApi(defaultClient);
    DocumentCloseParameters documentCloseParameters = new DocumentCloseParameters(); // DocumentCloseParameters | A DocumentCloseParameters object specifying the parameters of the action.
    try {
      DocumentCloseResponse result = apiInstance.documentClose(documentCloseParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#documentClose");
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
 **documentCloseParameters** | [**DocumentCloseParameters**](DocumentCloseParameters.md)| A DocumentCloseParameters object specifying the parameters of the action. |

### Return type

[**DocumentCloseResponse**](DocumentCloseResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="documentGetPreview"></a>
# **documentGetPreview**
> DocumentGetPreviewResponse documentGetPreview(getDocumentPreviewParameters)

Gets the format, the page count and a thumbnail of a previously uploaded document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    DocumentApi apiInstance = new DocumentApi(defaultClient);
    GetDocumentPreviewParameters getDocumentPreviewParameters = new GetDocumentPreviewParameters(); // GetDocumentPreviewParameters | A GetDocumentPreviewParameters object specifying the parameters of the action.
    try {
      DocumentGetPreviewResponse result = apiInstance.documentGetPreview(getDocumentPreviewParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#documentGetPreview");
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
 **getDocumentPreviewParameters** | [**GetDocumentPreviewParameters**](GetDocumentPreviewParameters.md)| A GetDocumentPreviewParameters object specifying the parameters of the action. |

### Return type

[**DocumentGetPreviewResponse**](DocumentGetPreviewResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="documentLoad"></a>
# **documentLoad**
> DocumentLoadResponse documentLoad(loadDocumentFromByteArrayParameters)

Loads the provided document file.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    DocumentApi apiInstance = new DocumentApi(defaultClient);
    LoadDocumentFromByteArrayParameters loadDocumentFromByteArrayParameters = new LoadDocumentFromByteArrayParameters(); // LoadDocumentFromByteArrayParameters | A LoadDocumentFromByteArrayParameters object specifying the parameters of the action.
    try {
      DocumentLoadResponse result = apiInstance.documentLoad(loadDocumentFromByteArrayParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#documentLoad");
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
 **loadDocumentFromByteArrayParameters** | [**LoadDocumentFromByteArrayParameters**](LoadDocumentFromByteArrayParameters.md)| A LoadDocumentFromByteArrayParameters object specifying the parameters of the action. |

### Return type

[**DocumentLoadResponse**](DocumentLoadResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="documentLoadFromURI"></a>
# **documentLoadFromURI**
> DocumentLoadResponse documentLoadFromURI(loadDocumentFromURIParameters)

Loads the provided document file from an URI.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    DocumentApi apiInstance = new DocumentApi(defaultClient);
    LoadDocumentFromURIParameters loadDocumentFromURIParameters = new LoadDocumentFromURIParameters(); // LoadDocumentFromURIParameters | A LoadDocumentFromURIParameters object specifying the parameters of the action.
    try {
      DocumentLoadResponse result = apiInstance.documentLoadFromURI(loadDocumentFromURIParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#documentLoadFromURI");
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
 **loadDocumentFromURIParameters** | [**LoadDocumentFromURIParameters**](LoadDocumentFromURIParameters.md)| A LoadDocumentFromURIParameters object specifying the parameters of the action. |

### Return type

[**DocumentLoadResponse**](DocumentLoadResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="documentLoadMultipart"></a>
# **documentLoadMultipart**
> DocumentLoadResponse documentLoadMultipart(fileData, loadDocumentParameters)

Loads the provided document file using Multipart Upload.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    DocumentApi apiInstance = new DocumentApi(defaultClient);
    File fileData = new File("/path/to/file"); // File | The data of the document.
    LoadDocumentParameters loadDocumentParameters = new LoadDocumentParameters(); // LoadDocumentParameters | 
    try {
      DocumentLoadResponse result = apiInstance.documentLoadMultipart(fileData, loadDocumentParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#documentLoadMultipart");
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
 **fileData** | **File**| The data of the document. |
 **loadDocumentParameters** | [**LoadDocumentParameters**](LoadDocumentParameters.md)|  | [optional]

### Return type

[**DocumentLoadResponse**](DocumentLoadResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

