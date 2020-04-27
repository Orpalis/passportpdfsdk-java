# ConfigApi

All URIs are relative to *https://passportpdfapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**configGetAPIVersion**](ConfigApi.md#configGetAPIVersion) | **GET** /api/config/ConfigGetAPIVersion | 
[**configGetMaxAllowedContentLength**](ConfigApi.md#configGetMaxAllowedContentLength) | **GET** /api/config/ConfigGetMaxAllowedContentLength | Gets the maximal length of a request content, in bytes.
[**configGetSuggestedClientTimeout**](ConfigApi.md#configGetSuggestedClientTimeout) | **GET** /api/config/ConfigGetSuggestedClientTimeout | Gets the suggested client API timeout, in milliseconds.
[**configGetSuggestedMaxClientThreads**](ConfigApi.md#configGetSuggestedMaxClientThreads) | **GET** /api/config/ConfigGetSuggestedMaxClientThreads | Gets the suggested maximum number of threads to be used simultaneously by a client application.
[**configGetSupportedFonts**](ConfigApi.md#configGetSupportedFonts) | **GET** /api/config/ConfigGetSupportedFonts | Gets the list of supported fonts for text drawing operations.
[**configGetSupportedOCRLanguages**](ConfigApi.md#configGetSupportedOCRLanguages) | **GET** /api/config/ConfigGetSupportedOCRLanguages | Gets the list of supported languages for OCR.


<a name="configGetAPIVersion"></a>
# **configGetAPIVersion**
> String configGetAPIVersion()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ConfigApi apiInstance = new ConfigApi(defaultClient);
    try {
      String result = apiInstance.configGetAPIVersion();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#configGetAPIVersion");
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

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="configGetMaxAllowedContentLength"></a>
# **configGetMaxAllowedContentLength**
> LongResponse configGetMaxAllowedContentLength()

Gets the maximal length of a request content, in bytes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ConfigApi apiInstance = new ConfigApi(defaultClient);
    try {
      LongResponse result = apiInstance.configGetMaxAllowedContentLength();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#configGetMaxAllowedContentLength");
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

[**LongResponse**](LongResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="configGetSuggestedClientTimeout"></a>
# **configGetSuggestedClientTimeout**
> IntegerResponse configGetSuggestedClientTimeout()

Gets the suggested client API timeout, in milliseconds.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ConfigApi apiInstance = new ConfigApi(defaultClient);
    try {
      IntegerResponse result = apiInstance.configGetSuggestedClientTimeout();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#configGetSuggestedClientTimeout");
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

<a name="configGetSuggestedMaxClientThreads"></a>
# **configGetSuggestedMaxClientThreads**
> IntegerResponse configGetSuggestedMaxClientThreads()

Gets the suggested maximum number of threads to be used simultaneously by a client application.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ConfigApi apiInstance = new ConfigApi(defaultClient);
    try {
      IntegerResponse result = apiInstance.configGetSuggestedMaxClientThreads();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#configGetSuggestedMaxClientThreads");
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

<a name="configGetSupportedFonts"></a>
# **configGetSupportedFonts**
> List&lt;Font&gt; configGetSupportedFonts()

Gets the list of supported fonts for text drawing operations.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ConfigApi apiInstance = new ConfigApi(defaultClient);
    try {
      List<Font> result = apiInstance.configGetSupportedFonts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#configGetSupportedFonts");
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

[**List&lt;Font&gt;**](Font.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="configGetSupportedOCRLanguages"></a>
# **configGetSupportedOCRLanguages**
> StringArrayResponse configGetSupportedOCRLanguages()

Gets the list of supported languages for OCR.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ConfigApi apiInstance = new ConfigApi(defaultClient);
    try {
      StringArrayResponse result = apiInstance.configGetSupportedOCRLanguages();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#configGetSupportedOCRLanguages");
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

[**StringArrayResponse**](StringArrayResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

