# PassportPdfApplicationManagerApi

All URIs are relative to *https://passportpdfapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**passportPDFApplicationManagerGetApplicationDownloadLink**](PassportPdfApplicationManagerApi.md#passportPDFApplicationManagerGetApplicationDownloadLink) | **GET** /api/passportpdfapplicationmanager/PassportPDFApplicationManagerGetApplicationDownloadLink | 
[**passportPDFApplicationManagerGetApplicationLatestVersion**](PassportPdfApplicationManagerApi.md#passportPDFApplicationManagerGetApplicationLatestVersion) | **GET** /api/passportpdfapplicationmanager/PassportPDFApplicationManagerGetApplicationLatestVersion | 
[**passportPDFApplicationManagerGetApplicationMinimumSupportedVersion**](PassportPdfApplicationManagerApi.md#passportPDFApplicationManagerGetApplicationMinimumSupportedVersion) | **GET** /api/passportpdfapplicationmanager/PassportPDFApplicationManagerGetApplicationMinimumSupportedVersion | 
[**passportPDFApplicationManagerGetMaxClientThreads**](PassportPdfApplicationManagerApi.md#passportPDFApplicationManagerGetMaxClientThreads) | **GET** /api/passportpdfapplicationmanager/PassportPDFApplicationManagerGetMaxClientThreads | Gets the maximum number of threads to be used simultaneously by a client application.


<a name="passportPDFApplicationManagerGetApplicationDownloadLink"></a>
# **passportPDFApplicationManagerGetApplicationDownloadLink**
> StringResponse passportPDFApplicationManagerGetApplicationDownloadLink(applicationId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PassportPdfApplicationManagerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PassportPdfApplicationManagerApi apiInstance = new PassportPdfApplicationManagerApi(defaultClient);
    String applicationId = "applicationId_example"; // String | 
    try {
      StringResponse result = apiInstance.passportPDFApplicationManagerGetApplicationDownloadLink(applicationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PassportPdfApplicationManagerApi#passportPDFApplicationManagerGetApplicationDownloadLink");
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
 **applicationId** | **String**|  |

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

<a name="passportPDFApplicationManagerGetApplicationLatestVersion"></a>
# **passportPDFApplicationManagerGetApplicationLatestVersion**
> StringResponse passportPDFApplicationManagerGetApplicationLatestVersion(applicationId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PassportPdfApplicationManagerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PassportPdfApplicationManagerApi apiInstance = new PassportPdfApplicationManagerApi(defaultClient);
    String applicationId = "applicationId_example"; // String | 
    try {
      StringResponse result = apiInstance.passportPDFApplicationManagerGetApplicationLatestVersion(applicationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PassportPdfApplicationManagerApi#passportPDFApplicationManagerGetApplicationLatestVersion");
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
 **applicationId** | **String**|  |

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

<a name="passportPDFApplicationManagerGetApplicationMinimumSupportedVersion"></a>
# **passportPDFApplicationManagerGetApplicationMinimumSupportedVersion**
> StringResponse passportPDFApplicationManagerGetApplicationMinimumSupportedVersion(applicationId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PassportPdfApplicationManagerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PassportPdfApplicationManagerApi apiInstance = new PassportPdfApplicationManagerApi(defaultClient);
    String applicationId = "applicationId_example"; // String | 
    try {
      StringResponse result = apiInstance.passportPDFApplicationManagerGetApplicationMinimumSupportedVersion(applicationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PassportPdfApplicationManagerApi#passportPDFApplicationManagerGetApplicationMinimumSupportedVersion");
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
 **applicationId** | **String**|  |

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

<a name="passportPDFApplicationManagerGetMaxClientThreads"></a>
# **passportPDFApplicationManagerGetMaxClientThreads**
> IntegerResponse passportPDFApplicationManagerGetMaxClientThreads(applicationId)

Gets the maximum number of threads to be used simultaneously by a client application.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PassportPdfApplicationManagerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PassportPdfApplicationManagerApi apiInstance = new PassportPdfApplicationManagerApi(defaultClient);
    String applicationId = "applicationId_example"; // String | 
    try {
      IntegerResponse result = apiInstance.passportPDFApplicationManagerGetMaxClientThreads(applicationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PassportPdfApplicationManagerApi#passportPDFApplicationManagerGetMaxClientThreads");
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
 **applicationId** | **String**|  |

### Return type

[**IntegerResponse**](IntegerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

