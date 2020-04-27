# PassportManagerApi

All URIs are relative to *https://passportpdfapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**passportManagerGetPassportInfo**](PassportManagerApi.md#passportManagerGetPassportInfo) | **GET** /api/passportmanager/PassportManagerGetPassportInfo | 


<a name="passportManagerGetPassportInfo"></a>
# **passportManagerGetPassportInfo**
> PassportPDFPassport passportManagerGetPassportInfo(passportId)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PassportManagerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PassportManagerApi apiInstance = new PassportManagerApi(defaultClient);
    String passportId = "passportId_example"; // String | 
    try {
      PassportPDFPassport result = apiInstance.passportManagerGetPassportInfo(passportId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PassportManagerApi#passportManagerGetPassportInfo");
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
 **passportId** | **String**|  |

### Return type

[**PassportPDFPassport**](PassportPDFPassport.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

