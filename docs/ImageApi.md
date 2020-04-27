# ImageApi

All URIs are relative to *https://passportpdfapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**imageAdjust**](ImageApi.md#imageAdjust) | **POST** /api/image/ImageAdjust | Adjusts a previously uploaded image.
[**imageAutoCrop**](ImageApi.md#imageAutoCrop) | **POST** /api/image/ImageAutoCrop | Automatically crops a previously uploaded image.
[**imageCleanupDocument**](ImageApi.md#imageCleanupDocument) | **POST** /api/image/ImageCleanupDocument | Cleanup a previously uploaded image.
[**imageCloneRegions**](ImageApi.md#imageCloneRegions) | **POST** /api/image/ImageCloneRegions | Clones regions from a previously uploaded image into new images.
[**imageClose**](ImageApi.md#imageClose) | **POST** /api/image/ImageClose | Closes a previously uploaded image.
[**imageConvertColorDepth**](ImageApi.md#imageConvertColorDepth) | **POST** /api/image/ImageConvertColorDepth | Converts the color depth of a previously uploaded image.
[**imageCrop**](ImageApi.md#imageCrop) | **POST** /api/image/ImageCrop | Crops a previously uploaded image.
[**imageDeletePage**](ImageApi.md#imageDeletePage) | **POST** /api/image/ImageDeletePage | Deletes a page range from a previously uploaded image.
[**imageDetectBlankPages**](ImageApi.md#imageDetectBlankPages) | **POST** /api/image/ImageDetectBlankPages | Detects the blank page(s) from a previously uploaded image and offers to remove them.
[**imageDetectColor**](ImageApi.md#imageDetectColor) | **POST** /api/image/ImageDetectColor | Performs color detection  on a previously uploaded image.
[**imageDetectPageOrientation**](ImageApi.md#imageDetectPageOrientation) | **POST** /api/image/ImageDetectPageOrientation | Detects the orientation of the page(s) of a previously uploaded image and offers to automatically rotate them.
[**imageFilter**](ImageApi.md#imageFilter) | **POST** /api/image/ImageFilter | Applies filters to a previously uploaded image.
[**imageGetPageThumbnail**](ImageApi.md#imageGetPageThumbnail) | **POST** /api/image/ImageGetPageThumbnail | Gets a thumbnail of each page within the provided page range from a previously uploaded image.
[**imageGetSupportedFileExtensions**](ImageApi.md#imageGetSupportedFileExtensions) | **GET** /api/image/ImageGetSupportedFileExtensions | Gets the supported file extensions by the image loading actions.
[**imageLoad**](ImageApi.md#imageLoad) | **POST** /api/image/ImageLoad | Loads the provided image file.  Supported image formats can be retrieved by the GetSupportedImageFileExtensions action.
[**imageLoadMultipart**](ImageApi.md#imageLoadMultipart) | **POST** /api/image/ImageLoadMultipart | Loads the provided image file using Multipart Upload.  Supported image formats can be retrieved by the GetSupportedImageFileExtensions action.
[**imageMICR**](ImageApi.md#imageMICR) | **POST** /api/image/ImageMICR | Performs MICR (Magnetic Ink Character Recognition) on a previously uploaded image.
[**imageReadBarcodes**](ImageApi.md#imageReadBarcodes) | **POST** /api/image/ImageReadBarcodes | Reads barcodes from a previously uploaded image.
[**imageResize**](ImageApi.md#imageResize) | **POST** /api/image/ImageResize | Resizes a previously uploaded image.
[**imageRotate**](ImageApi.md#imageRotate) | **POST** /api/image/ImageRotate | Rotates and/or flips a previously uploaded image.
[**imageSaveAsJPEG**](ImageApi.md#imageSaveAsJPEG) | **POST** /api/image/ImageSaveAsJPEG | Saves a previously uploaded image as JPEG, and sends the file data in a JSON-serialized object.
[**imageSaveAsJPEGFile**](ImageApi.md#imageSaveAsJPEGFile) | **POST** /api/image/ImageSaveAsJPEGFile | Saves a previously uploaded image as JPEG, and streams the file binary data to the response (this is the most efficient download method).
[**imageSaveAsPDF**](ImageApi.md#imageSaveAsPDF) | **POST** /api/image/ImageSaveAsPDF | Saves a previously uploaded image as PDF, and sends the file data in a JSON-serialized object.
[**imageSaveAsPDFFile**](ImageApi.md#imageSaveAsPDFFile) | **POST** /api/image/ImageSaveAsPDFFile | Saves a previously uploaded image as PDF, and streams the file binary data to the response (this is the most efficient download method).
[**imageSaveAsPDFMRC**](ImageApi.md#imageSaveAsPDFMRC) | **POST** /api/image/ImageSaveAsPDFMRC | Saves a previously uploaded image as PDF using MRC compression, and sends the file data in a JSON-serialized object.
[**imageSaveAsPDFMRCFile**](ImageApi.md#imageSaveAsPDFMRCFile) | **POST** /api/image/ImageSaveAsPDFMRCFile | Saves a previously uploaded image as PDF using MRC compression, and streams the file binary data to the response (this is the most efficient download method).
[**imageSaveAsPNG**](ImageApi.md#imageSaveAsPNG) | **POST** /api/image/ImageSaveAsPNG | Saves a previously uploaded image as PNG, and sends the file data in a JSON-serialized object.
[**imageSaveAsPNGFile**](ImageApi.md#imageSaveAsPNGFile) | **POST** /api/image/ImageSaveAsPNGFile | Saves a previously uploaded image as PNG, and streams the file binary data to the response (this is the most efficient download method).
[**imageSaveAsTIFF**](ImageApi.md#imageSaveAsTIFF) | **POST** /api/image/ImageSaveAsTIFF | Saves a previously uploaded image as TIFF, and sends the file data in a JSON-serialized object.
[**imageSaveAsTIFFFile**](ImageApi.md#imageSaveAsTIFFFile) | **POST** /api/image/ImageSaveAsTIFFFile | Saves a previously uploaded image as TIFF, and streams the file binary data to the response (this is the most efficient download method).
[**imageSaveAsTIFFMultipage**](ImageApi.md#imageSaveAsTIFFMultipage) | **POST** /api/image/ImageSaveAsTIFFMultipage | Saves a previously uploaded image as multipage TIFF, and sends the file data in a JSON-serialized object.
[**imageSaveAsTIFFMultipageFile**](ImageApi.md#imageSaveAsTIFFMultipageFile) | **POST** /api/image/ImageSaveAsTIFFMultipageFile | Saves a previously uploaded image as multipage TIFF, and streams the file binary data to the response (this is the most efficient download method).
[**imageSwapPages**](ImageApi.md#imageSwapPages) | **POST** /api/image/ImageSwapPages | Swaps two pages from a previously uploaded image.


<a name="imageAdjust"></a>
# **imageAdjust**
> ImageAdjustResponse imageAdjust(imageAdjustParameters)

Adjusts a previously uploaded image.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageAdjustParameters imageAdjustParameters = new ImageAdjustParameters(); // ImageAdjustParameters | An ImageAdjustParameters object specifying the parameters for the action.
    try {
      ImageAdjustResponse result = apiInstance.imageAdjust(imageAdjustParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageAdjust");
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
 **imageAdjustParameters** | [**ImageAdjustParameters**](ImageAdjustParameters.md)| An ImageAdjustParameters object specifying the parameters for the action. |

### Return type

[**ImageAdjustResponse**](ImageAdjustResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageAutoCrop"></a>
# **imageAutoCrop**
> ImageAutoCropResponse imageAutoCrop(imageAutoCropParameters)

Automatically crops a previously uploaded image.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageAutoCropParameters imageAutoCropParameters = new ImageAutoCropParameters(); // ImageAutoCropParameters | An ImageAutoCropParameters object specifying the parameters for the action.
    try {
      ImageAutoCropResponse result = apiInstance.imageAutoCrop(imageAutoCropParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageAutoCrop");
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
 **imageAutoCropParameters** | [**ImageAutoCropParameters**](ImageAutoCropParameters.md)| An ImageAutoCropParameters object specifying the parameters for the action. |

### Return type

[**ImageAutoCropResponse**](ImageAutoCropResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageCleanupDocument"></a>
# **imageCleanupDocument**
> ImageCleanupDocumentResponse imageCleanupDocument(imageCleanupDocumentParameters)

Cleanup a previously uploaded image.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageCleanupDocumentParameters imageCleanupDocumentParameters = new ImageCleanupDocumentParameters(); // ImageCleanupDocumentParameters | An ImageCleanupDocumentParameters object specifying the parameters for the action.
    try {
      ImageCleanupDocumentResponse result = apiInstance.imageCleanupDocument(imageCleanupDocumentParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageCleanupDocument");
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
 **imageCleanupDocumentParameters** | [**ImageCleanupDocumentParameters**](ImageCleanupDocumentParameters.md)| An ImageCleanupDocumentParameters object specifying the parameters for the action. |

### Return type

[**ImageCleanupDocumentResponse**](ImageCleanupDocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageCloneRegions"></a>
# **imageCloneRegions**
> ImageCloneRegionsResponse imageCloneRegions(imageCloneRegionsParameters)

Clones regions from a previously uploaded image into new images.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageCloneRegionsParameters imageCloneRegionsParameters = new ImageCloneRegionsParameters(); // ImageCloneRegionsParameters | An ImageCloneRegionsParameters object specifying the parameters of the action.
    try {
      ImageCloneRegionsResponse result = apiInstance.imageCloneRegions(imageCloneRegionsParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageCloneRegions");
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
 **imageCloneRegionsParameters** | [**ImageCloneRegionsParameters**](ImageCloneRegionsParameters.md)| An ImageCloneRegionsParameters object specifying the parameters of the action. |

### Return type

[**ImageCloneRegionsResponse**](ImageCloneRegionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageClose"></a>
# **imageClose**
> ImageCloseResponse imageClose(imageCloseParameters)

Closes a previously uploaded image.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageCloseParameters imageCloseParameters = new ImageCloseParameters(); // ImageCloseParameters | An ImageCloseParameters object specifying the parameters of the action.
    try {
      ImageCloseResponse result = apiInstance.imageClose(imageCloseParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageClose");
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
 **imageCloseParameters** | [**ImageCloseParameters**](ImageCloseParameters.md)| An ImageCloseParameters object specifying the parameters of the action. |

### Return type

[**ImageCloseResponse**](ImageCloseResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageConvertColorDepth"></a>
# **imageConvertColorDepth**
> ImageConvertColorDepthResponse imageConvertColorDepth(imageConvertColorDepthParameters)

Converts the color depth of a previously uploaded image.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageConvertColorDepthParameters imageConvertColorDepthParameters = new ImageConvertColorDepthParameters(); // ImageConvertColorDepthParameters | An ImageConvertColorDepthParameters object specifying the parameters for the action.
    try {
      ImageConvertColorDepthResponse result = apiInstance.imageConvertColorDepth(imageConvertColorDepthParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageConvertColorDepth");
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
 **imageConvertColorDepthParameters** | [**ImageConvertColorDepthParameters**](ImageConvertColorDepthParameters.md)| An ImageConvertColorDepthParameters object specifying the parameters for the action. |

### Return type

[**ImageConvertColorDepthResponse**](ImageConvertColorDepthResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageCrop"></a>
# **imageCrop**
> ImageCropResponse imageCrop(imageCropParameters)

Crops a previously uploaded image.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageCropParameters imageCropParameters = new ImageCropParameters(); // ImageCropParameters | An ImageCropParameters object specifying the parameters for the action.
    try {
      ImageCropResponse result = apiInstance.imageCrop(imageCropParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageCrop");
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
 **imageCropParameters** | [**ImageCropParameters**](ImageCropParameters.md)| An ImageCropParameters object specifying the parameters for the action. |

### Return type

[**ImageCropResponse**](ImageCropResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageDeletePage"></a>
# **imageDeletePage**
> ImageDeletePageResponse imageDeletePage(imageDeletePageParameters)

Deletes a page range from a previously uploaded image.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageDeletePageParameters imageDeletePageParameters = new ImageDeletePageParameters(); // ImageDeletePageParameters | An ImageDeletePageParameters object specifying the parameters of the action.
    try {
      ImageDeletePageResponse result = apiInstance.imageDeletePage(imageDeletePageParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageDeletePage");
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
 **imageDeletePageParameters** | [**ImageDeletePageParameters**](ImageDeletePageParameters.md)| An ImageDeletePageParameters object specifying the parameters of the action. |

### Return type

[**ImageDeletePageResponse**](ImageDeletePageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageDetectBlankPages"></a>
# **imageDetectBlankPages**
> ImageDetectBlankPagesResponse imageDetectBlankPages(imageDetectBlankPagesParameters)

Detects the blank page(s) from a previously uploaded image and offers to remove them.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageDetectBlankPagesParameters imageDetectBlankPagesParameters = new ImageDetectBlankPagesParameters(); // ImageDetectBlankPagesParameters | An ImageDetectBlankPagesParameters object specifying the parameters of the action.
    try {
      ImageDetectBlankPagesResponse result = apiInstance.imageDetectBlankPages(imageDetectBlankPagesParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageDetectBlankPages");
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
 **imageDetectBlankPagesParameters** | [**ImageDetectBlankPagesParameters**](ImageDetectBlankPagesParameters.md)| An ImageDetectBlankPagesParameters object specifying the parameters of the action. |

### Return type

[**ImageDetectBlankPagesResponse**](ImageDetectBlankPagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageDetectColor"></a>
# **imageDetectColor**
> ImageDetectColorResponse imageDetectColor(imageDetectColorParameters)

Performs color detection  on a previously uploaded image.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageDetectColorParameters imageDetectColorParameters = new ImageDetectColorParameters(); // ImageDetectColorParameters | An ImageDetectColorParameters object specifying the parameters for the action.
    try {
      ImageDetectColorResponse result = apiInstance.imageDetectColor(imageDetectColorParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageDetectColor");
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
 **imageDetectColorParameters** | [**ImageDetectColorParameters**](ImageDetectColorParameters.md)| An ImageDetectColorParameters object specifying the parameters for the action. |

### Return type

[**ImageDetectColorResponse**](ImageDetectColorResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageDetectPageOrientation"></a>
# **imageDetectPageOrientation**
> ImageDetectPageOrientationResponse imageDetectPageOrientation(imageDetectPageOrientationParameters)

Detects the orientation of the page(s) of a previously uploaded image and offers to automatically rotate them.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageDetectPageOrientationParameters imageDetectPageOrientationParameters = new ImageDetectPageOrientationParameters(); // ImageDetectPageOrientationParameters | An ImagedetectPageOrientationParameters object specifying the parameters of the action.
    try {
      ImageDetectPageOrientationResponse result = apiInstance.imageDetectPageOrientation(imageDetectPageOrientationParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageDetectPageOrientation");
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
 **imageDetectPageOrientationParameters** | [**ImageDetectPageOrientationParameters**](ImageDetectPageOrientationParameters.md)| An ImagedetectPageOrientationParameters object specifying the parameters of the action. |

### Return type

[**ImageDetectPageOrientationResponse**](ImageDetectPageOrientationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageFilter"></a>
# **imageFilter**
> ImageFilterResponse imageFilter(imageFilterParameters)

Applies filters to a previously uploaded image.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageFilterParameters imageFilterParameters = new ImageFilterParameters(); // ImageFilterParameters | An ImageFilterParameters object specifying the parameters for the action.
    try {
      ImageFilterResponse result = apiInstance.imageFilter(imageFilterParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageFilter");
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
 **imageFilterParameters** | [**ImageFilterParameters**](ImageFilterParameters.md)| An ImageFilterParameters object specifying the parameters for the action. |

### Return type

[**ImageFilterResponse**](ImageFilterResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageGetPageThumbnail"></a>
# **imageGetPageThumbnail**
> ImageGetPageThumbnailResponse imageGetPageThumbnail(imageGetPageThumbnailParameters)

Gets a thumbnail of each page within the provided page range from a previously uploaded image.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageGetPageThumbnailParameters imageGetPageThumbnailParameters = new ImageGetPageThumbnailParameters(); // ImageGetPageThumbnailParameters | A PDFGetPageThumbnailParameters object specifying the parameters of the action.
    try {
      ImageGetPageThumbnailResponse result = apiInstance.imageGetPageThumbnail(imageGetPageThumbnailParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageGetPageThumbnail");
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
 **imageGetPageThumbnailParameters** | [**ImageGetPageThumbnailParameters**](ImageGetPageThumbnailParameters.md)| A PDFGetPageThumbnailParameters object specifying the parameters of the action. |

### Return type

[**ImageGetPageThumbnailResponse**](ImageGetPageThumbnailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageGetSupportedFileExtensions"></a>
# **imageGetSupportedFileExtensions**
> StringArrayResponse imageGetSupportedFileExtensions()

Gets the supported file extensions by the image loading actions.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    try {
      StringArrayResponse result = apiInstance.imageGetSupportedFileExtensions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageGetSupportedFileExtensions");
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

<a name="imageLoad"></a>
# **imageLoad**
> ImageLoadResponse imageLoad(loadImageFromByteArrayParameters)

Loads the provided image file.  Supported image formats can be retrieved by the GetSupportedImageFileExtensions action.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    LoadImageFromByteArrayParameters loadImageFromByteArrayParameters = new LoadImageFromByteArrayParameters(); // LoadImageFromByteArrayParameters | A LoadImageFromByteArrayParameters object specifying the parameters of the action.
    try {
      ImageLoadResponse result = apiInstance.imageLoad(loadImageFromByteArrayParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageLoad");
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
 **loadImageFromByteArrayParameters** | [**LoadImageFromByteArrayParameters**](LoadImageFromByteArrayParameters.md)| A LoadImageFromByteArrayParameters object specifying the parameters of the action. |

### Return type

[**ImageLoadResponse**](ImageLoadResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageLoadMultipart"></a>
# **imageLoadMultipart**
> ImageLoadResponse imageLoadMultipart(fileData, loadImageParameters)

Loads the provided image file using Multipart Upload.  Supported image formats can be retrieved by the GetSupportedImageFileExtensions action.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    File fileData = new File("/path/to/file"); // File | The data of the document.
    LoadImageParameters loadImageParameters = new LoadImageParameters(); // LoadImageParameters | 
    try {
      ImageLoadResponse result = apiInstance.imageLoadMultipart(fileData, loadImageParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageLoadMultipart");
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
 **loadImageParameters** | [**LoadImageParameters**](LoadImageParameters.md)|  | [optional]

### Return type

[**ImageLoadResponse**](ImageLoadResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageMICR"></a>
# **imageMICR**
> ImageMICRResponse imageMICR(imageMICRParameters)

Performs MICR (Magnetic Ink Character Recognition) on a previously uploaded image.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageMICRParameters imageMICRParameters = new ImageMICRParameters(); // ImageMICRParameters | An ImageMICRParameters object specifying the parameters of the action.
    try {
      ImageMICRResponse result = apiInstance.imageMICR(imageMICRParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageMICR");
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
 **imageMICRParameters** | [**ImageMICRParameters**](ImageMICRParameters.md)| An ImageMICRParameters object specifying the parameters of the action. |

### Return type

[**ImageMICRResponse**](ImageMICRResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageReadBarcodes"></a>
# **imageReadBarcodes**
> ReadBarcodesResponse imageReadBarcodes(imageReadBarcodesParameters)

Reads barcodes from a previously uploaded image.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageReadBarcodesParameters imageReadBarcodesParameters = new ImageReadBarcodesParameters(); // ImageReadBarcodesParameters | An ImageReadBarcodesParameters object specifying the parameters of the action.
    try {
      ReadBarcodesResponse result = apiInstance.imageReadBarcodes(imageReadBarcodesParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageReadBarcodes");
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
 **imageReadBarcodesParameters** | [**ImageReadBarcodesParameters**](ImageReadBarcodesParameters.md)| An ImageReadBarcodesParameters object specifying the parameters of the action. |

### Return type

[**ReadBarcodesResponse**](ReadBarcodesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageResize"></a>
# **imageResize**
> ImageResizeResponse imageResize(imageResizeParameters)

Resizes a previously uploaded image.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageResizeParameters imageResizeParameters = new ImageResizeParameters(); // ImageResizeParameters | An ImageResizeParameters object specifying the parameters for the action.
    try {
      ImageResizeResponse result = apiInstance.imageResize(imageResizeParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageResize");
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
 **imageResizeParameters** | [**ImageResizeParameters**](ImageResizeParameters.md)| An ImageResizeParameters object specifying the parameters for the action. |

### Return type

[**ImageResizeResponse**](ImageResizeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageRotate"></a>
# **imageRotate**
> ImageRotateResponse imageRotate(imageRotateParameters)

Rotates and/or flips a previously uploaded image.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageRotateParameters imageRotateParameters = new ImageRotateParameters(); // ImageRotateParameters | An ImageRotateParameters object specifying the parameters for the action.
    try {
      ImageRotateResponse result = apiInstance.imageRotate(imageRotateParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageRotate");
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
 **imageRotateParameters** | [**ImageRotateParameters**](ImageRotateParameters.md)| An ImageRotateParameters object specifying the parameters for the action. |

### Return type

[**ImageRotateResponse**](ImageRotateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageSaveAsJPEG"></a>
# **imageSaveAsJPEG**
> ImageSaveAsJPEGResponse imageSaveAsJPEG(imageSaveAsJPEGParameters)

Saves a previously uploaded image as JPEG, and sends the file data in a JSON-serialized object.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageSaveAsJPEGParameters imageSaveAsJPEGParameters = new ImageSaveAsJPEGParameters(); // ImageSaveAsJPEGParameters | An ImageSaveAsJPEGParameters object specifying the parameters of the action.
    try {
      ImageSaveAsJPEGResponse result = apiInstance.imageSaveAsJPEG(imageSaveAsJPEGParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageSaveAsJPEG");
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
 **imageSaveAsJPEGParameters** | [**ImageSaveAsJPEGParameters**](ImageSaveAsJPEGParameters.md)| An ImageSaveAsJPEGParameters object specifying the parameters of the action. |

### Return type

[**ImageSaveAsJPEGResponse**](ImageSaveAsJPEGResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageSaveAsJPEGFile"></a>
# **imageSaveAsJPEGFile**
> File imageSaveAsJPEGFile(imageSaveAsJPEGParameters)

Saves a previously uploaded image as JPEG, and streams the file binary data to the response (this is the most efficient download method).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageSaveAsJPEGParameters imageSaveAsJPEGParameters = new ImageSaveAsJPEGParameters(); // ImageSaveAsJPEGParameters | An ImageSaveAsJPEGParameters object specifying the parameters of the action.
    try {
      File result = apiInstance.imageSaveAsJPEGFile(imageSaveAsJPEGParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageSaveAsJPEGFile");
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
 **imageSaveAsJPEGParameters** | [**ImageSaveAsJPEGParameters**](ImageSaveAsJPEGParameters.md)| An ImageSaveAsJPEGParameters object specifying the parameters of the action. |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageSaveAsPDF"></a>
# **imageSaveAsPDF**
> ImageSaveAsPDFResponse imageSaveAsPDF(imageSaveAsPDFParameters)

Saves a previously uploaded image as PDF, and sends the file data in a JSON-serialized object.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageSaveAsPDFParameters imageSaveAsPDFParameters = new ImageSaveAsPDFParameters(); // ImageSaveAsPDFParameters | An ImagesaveAsPDFParameters object specifying the parameters of the action.
    try {
      ImageSaveAsPDFResponse result = apiInstance.imageSaveAsPDF(imageSaveAsPDFParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageSaveAsPDF");
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
 **imageSaveAsPDFParameters** | [**ImageSaveAsPDFParameters**](ImageSaveAsPDFParameters.md)| An ImagesaveAsPDFParameters object specifying the parameters of the action. |

### Return type

[**ImageSaveAsPDFResponse**](ImageSaveAsPDFResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageSaveAsPDFFile"></a>
# **imageSaveAsPDFFile**
> File imageSaveAsPDFFile(imageSaveAsPDFParameters)

Saves a previously uploaded image as PDF, and streams the file binary data to the response (this is the most efficient download method).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageSaveAsPDFParameters imageSaveAsPDFParameters = new ImageSaveAsPDFParameters(); // ImageSaveAsPDFParameters | An ImagesaveAsPDFParameters object specifying the parameters of the action.
    try {
      File result = apiInstance.imageSaveAsPDFFile(imageSaveAsPDFParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageSaveAsPDFFile");
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
 **imageSaveAsPDFParameters** | [**ImageSaveAsPDFParameters**](ImageSaveAsPDFParameters.md)| An ImagesaveAsPDFParameters object specifying the parameters of the action. |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageSaveAsPDFMRC"></a>
# **imageSaveAsPDFMRC**
> ImageSaveAsPDFMRCResponse imageSaveAsPDFMRC(imageSaveAsPDFMRCParameters)

Saves a previously uploaded image as PDF using MRC compression, and sends the file data in a JSON-serialized object.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageSaveAsPDFMRCParameters imageSaveAsPDFMRCParameters = new ImageSaveAsPDFMRCParameters(); // ImageSaveAsPDFMRCParameters | An ImagesaveAsPDFMRCParameters object specifying the parameters of the action.
    try {
      ImageSaveAsPDFMRCResponse result = apiInstance.imageSaveAsPDFMRC(imageSaveAsPDFMRCParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageSaveAsPDFMRC");
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
 **imageSaveAsPDFMRCParameters** | [**ImageSaveAsPDFMRCParameters**](ImageSaveAsPDFMRCParameters.md)| An ImagesaveAsPDFMRCParameters object specifying the parameters of the action. |

### Return type

[**ImageSaveAsPDFMRCResponse**](ImageSaveAsPDFMRCResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageSaveAsPDFMRCFile"></a>
# **imageSaveAsPDFMRCFile**
> File imageSaveAsPDFMRCFile(imageSaveAsPDFMRCParameters)

Saves a previously uploaded image as PDF using MRC compression, and streams the file binary data to the response (this is the most efficient download method).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageSaveAsPDFMRCParameters imageSaveAsPDFMRCParameters = new ImageSaveAsPDFMRCParameters(); // ImageSaveAsPDFMRCParameters | An ImagesaveAsPDFMRCParameters object specifying the parameters of the action.
    try {
      File result = apiInstance.imageSaveAsPDFMRCFile(imageSaveAsPDFMRCParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageSaveAsPDFMRCFile");
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
 **imageSaveAsPDFMRCParameters** | [**ImageSaveAsPDFMRCParameters**](ImageSaveAsPDFMRCParameters.md)| An ImagesaveAsPDFMRCParameters object specifying the parameters of the action. |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageSaveAsPNG"></a>
# **imageSaveAsPNG**
> ImageSaveAsPNGResponse imageSaveAsPNG(imageSaveAsPNGParameters)

Saves a previously uploaded image as PNG, and sends the file data in a JSON-serialized object.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageSaveAsPNGParameters imageSaveAsPNGParameters = new ImageSaveAsPNGParameters(); // ImageSaveAsPNGParameters | An ImageSaveAsPNGParameters object specifying the parameters of the action.
    try {
      ImageSaveAsPNGResponse result = apiInstance.imageSaveAsPNG(imageSaveAsPNGParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageSaveAsPNG");
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
 **imageSaveAsPNGParameters** | [**ImageSaveAsPNGParameters**](ImageSaveAsPNGParameters.md)| An ImageSaveAsPNGParameters object specifying the parameters of the action. |

### Return type

[**ImageSaveAsPNGResponse**](ImageSaveAsPNGResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageSaveAsPNGFile"></a>
# **imageSaveAsPNGFile**
> File imageSaveAsPNGFile(imageSaveAsPNGParameters)

Saves a previously uploaded image as PNG, and streams the file binary data to the response (this is the most efficient download method).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageSaveAsPNGParameters imageSaveAsPNGParameters = new ImageSaveAsPNGParameters(); // ImageSaveAsPNGParameters | An ImageSaveAsPNGParameters object specifying the parameters of the action.
    try {
      File result = apiInstance.imageSaveAsPNGFile(imageSaveAsPNGParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageSaveAsPNGFile");
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
 **imageSaveAsPNGParameters** | [**ImageSaveAsPNGParameters**](ImageSaveAsPNGParameters.md)| An ImageSaveAsPNGParameters object specifying the parameters of the action. |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageSaveAsTIFF"></a>
# **imageSaveAsTIFF**
> ImageSaveAsTIFFResponse imageSaveAsTIFF(imageSaveAsTIFFParameters)

Saves a previously uploaded image as TIFF, and sends the file data in a JSON-serialized object.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageSaveAsTIFFParameters imageSaveAsTIFFParameters = new ImageSaveAsTIFFParameters(); // ImageSaveAsTIFFParameters | An ImageSaveAsTIFFParameters object specifying the parameters of the action.
    try {
      ImageSaveAsTIFFResponse result = apiInstance.imageSaveAsTIFF(imageSaveAsTIFFParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageSaveAsTIFF");
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
 **imageSaveAsTIFFParameters** | [**ImageSaveAsTIFFParameters**](ImageSaveAsTIFFParameters.md)| An ImageSaveAsTIFFParameters object specifying the parameters of the action. |

### Return type

[**ImageSaveAsTIFFResponse**](ImageSaveAsTIFFResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageSaveAsTIFFFile"></a>
# **imageSaveAsTIFFFile**
> File imageSaveAsTIFFFile(imageSaveAsTIFFParameters)

Saves a previously uploaded image as TIFF, and streams the file binary data to the response (this is the most efficient download method).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageSaveAsTIFFParameters imageSaveAsTIFFParameters = new ImageSaveAsTIFFParameters(); // ImageSaveAsTIFFParameters | An ImageSaveAsTIFFParameters object specifying the parameters of the action.
    try {
      File result = apiInstance.imageSaveAsTIFFFile(imageSaveAsTIFFParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageSaveAsTIFFFile");
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
 **imageSaveAsTIFFParameters** | [**ImageSaveAsTIFFParameters**](ImageSaveAsTIFFParameters.md)| An ImageSaveAsTIFFParameters object specifying the parameters of the action. |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageSaveAsTIFFMultipage"></a>
# **imageSaveAsTIFFMultipage**
> ImageSaveAsTIFFMultipageResponse imageSaveAsTIFFMultipage(imageSaveAsTIFFMultipageParameters)

Saves a previously uploaded image as multipage TIFF, and sends the file data in a JSON-serialized object.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageSaveAsTIFFMultipageParameters imageSaveAsTIFFMultipageParameters = new ImageSaveAsTIFFMultipageParameters(); // ImageSaveAsTIFFMultipageParameters | An ImageSaveAsTIFFMultipageParameters object specifying the parameters of the action.
    try {
      ImageSaveAsTIFFMultipageResponse result = apiInstance.imageSaveAsTIFFMultipage(imageSaveAsTIFFMultipageParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageSaveAsTIFFMultipage");
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
 **imageSaveAsTIFFMultipageParameters** | [**ImageSaveAsTIFFMultipageParameters**](ImageSaveAsTIFFMultipageParameters.md)| An ImageSaveAsTIFFMultipageParameters object specifying the parameters of the action. |

### Return type

[**ImageSaveAsTIFFMultipageResponse**](ImageSaveAsTIFFMultipageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageSaveAsTIFFMultipageFile"></a>
# **imageSaveAsTIFFMultipageFile**
> File imageSaveAsTIFFMultipageFile(imageSaveAsTIFFMultipageParameters)

Saves a previously uploaded image as multipage TIFF, and streams the file binary data to the response (this is the most efficient download method).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageSaveAsTIFFMultipageParameters imageSaveAsTIFFMultipageParameters = new ImageSaveAsTIFFMultipageParameters(); // ImageSaveAsTIFFMultipageParameters | An ImageSaveAsTIFFMultipageParameters object specifying the parameters of the action.
    try {
      File result = apiInstance.imageSaveAsTIFFMultipageFile(imageSaveAsTIFFMultipageParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageSaveAsTIFFMultipageFile");
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
 **imageSaveAsTIFFMultipageParameters** | [**ImageSaveAsTIFFMultipageParameters**](ImageSaveAsTIFFMultipageParameters.md)| An ImageSaveAsTIFFMultipageParameters object specifying the parameters of the action. |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="imageSwapPages"></a>
# **imageSwapPages**
> ImageSwapPagesResponse imageSwapPages(imageSwapPagesParameters)

Swaps two pages from a previously uploaded image.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    ImageApi apiInstance = new ImageApi(defaultClient);
    ImageSwapPagesParameters imageSwapPagesParameters = new ImageSwapPagesParameters(); // ImageSwapPagesParameters | An ImageSwapPagesParameters object specifying the parameters of the action.
    try {
      ImageSwapPagesResponse result = apiInstance.imageSwapPages(imageSwapPagesParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageApi#imageSwapPages");
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
 **imageSwapPagesParameters** | [**ImageSwapPagesParameters**](ImageSwapPagesParameters.md)| An ImageSwapPagesParameters object specifying the parameters of the action. |

### Return type

[**ImageSwapPagesResponse**](ImageSwapPagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

