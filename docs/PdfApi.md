# PdfApi

All URIs are relative to *https://passportpdfapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**annotate**](PdfApi.md#annotate) | **POST** /api/pdf/Annotate | Annotates a previously uploaded document.
[**autoDeskew**](PdfApi.md#autoDeskew) | **POST** /api/pdf/AutoDeskew | Performs auto deskew on a page range of a previously uploaded document.
[**clearPage**](PdfApi.md#clearPage) | **POST** /api/pdf/ClearPage | Clears a page range from a previously uploaded document.
[**clonePage**](PdfApi.md#clonePage) | **POST** /api/pdf/ClonePage | Clones specific pages from a previously uploaded document to another previously uploaded document.
[**closePDF**](PdfApi.md#closePDF) | **POST** /api/pdf/ClosePDF | Closes a previously uploaded document.
[**convertToPDFA**](PdfApi.md#convertToPDFA) | **POST** /api/pdf/ConvertToPDFA | Converts a previously uploaded document to PDF/A.
[**deletePage**](PdfApi.md#deletePage) | **POST** /api/pdf/DeletePage | Deletes a page range from a previously uploaded document.
[**detectPageOrientation**](PdfApi.md#detectPageOrientation) | **POST** /api/pdf/DetectPageOrientation | Detects the orientation of the page(s) of a previously uploaded document and offers to automatically rotate them.
[**digiSign**](PdfApi.md#digiSign) | **POST** /api/pdf/DigiSign | Signs a previously uploaded document digitally.
[**drawImage**](PdfApi.md#drawImage) | **POST** /api/pdf/DrawImage | Draws an image on a page range of a previously uploaded document.
[**extractPage**](PdfApi.md#extractPage) | **POST** /api/pdf/ExtractPage | Extracts a page range from a previously uploaded document into one or several new documents.
[**extractText**](PdfApi.md#extractText) | **POST** /api/pdf/ExtractText | Extracts text from the document pages.
[**flatten**](PdfApi.md#flatten) | **POST** /api/pdf/Flatten | Flattens the form-fields, annotations, and/or the layers of a previously uploaded document.
[**getInfo**](PdfApi.md#getInfo) | **POST** /api/pdf/GetInfo | Gets information about a previously uploaded document.
[**getPDFImportSupportedFileExtensions**](PdfApi.md#getPDFImportSupportedFileExtensions) | **GET** /api/pdf/GetPDFImportSupportedFileExtensions | Gets the supported file extensions by the LoadDocumentAsPDF action.
[**getPageThumbnail**](PdfApi.md#getPageThumbnail) | **POST** /api/pdf/GetPageThumbnail | Gets a thumbnail of each page within the provided page range from a previously uploaded document.
[**insertImage**](PdfApi.md#insertImage) | **POST** /api/pdf/InsertImage | Inserts an image on a new page of a previously uploaded document.
[**insertNewPage**](PdfApi.md#insertNewPage) | **POST** /api/pdf/InsertNewPage | Inserts one or more new blank pages to a specific position in a previously uploaded document.
[**insertPageNumber**](PdfApi.md#insertPageNumber) | **POST** /api/pdf/InsertPageNumber | Inserts page number(s) on a document.
[**insertText**](PdfApi.md#insertText) | **POST** /api/pdf/InsertText | Inserts text on a document.
[**linearize**](PdfApi.md#linearize) | **POST** /api/pdf/Linearize | Linearizes a previously uploaded document.
[**loadDocumentAsPDF**](PdfApi.md#loadDocumentAsPDF) | **POST** /api/pdf/LoadDocument | Imports the provided document as PDF.  Supported document formats can be retrieved by the GetPDFImportSupportedFileExtensions action.
[**loadDocumentAsPDFMultipart**](PdfApi.md#loadDocumentAsPDFMultipart) | **POST** /api/pdf/LoadDocumentAsPDFMultipart | Imports the provided document as PDF using Multipart Upload.  Supported document formats can be retrieved by the GetPDFImportSupportedFileExtensions action.
[**merge**](PdfApi.md#merge) | **POST** /api/pdf/Merge | Merges several previously uploaded documents into a new PDF.
[**mergePages**](PdfApi.md#mergePages) | **POST** /api/pdf/MergePages | Merges multiple pages, vertically, within a previously uploaded document into one single page.
[**movePage**](PdfApi.md#movePage) | **POST** /api/pdf/MovePage | Moves a page range from a previously uploaded document.
[**oCR**](PdfApi.md#oCR) | **POST** /api/pdf/OCR | Performs optical character recognition on a page range of a previously uploaded document.  The recognized text is added as invisible text on each processed page.  No token is charged for blank pages.
[**protect**](PdfApi.md#protect) | **POST** /api/pdf/Protect | Protects a previously uploaded document.
[**readBarcodes**](PdfApi.md#readBarcodes) | **POST** /api/pdf/ReadBarcodes | Reads barcodes from a previously uploaded document.
[**reduce**](PdfApi.md#reduce) | **POST** /api/pdf/Reduce | Reduces the size of a previously uploaded document.
[**removePageFormFields**](PdfApi.md#removePageFormFields) | **POST** /api/pdf/RemovePageFormFields | Removes the form fields from a page range of a previously uploaded document.
[**removeText**](PdfApi.md#removeText) | **POST** /api/pdf/RemoveText | Removes text (all text or only invisible one) from a previously uploaded PDF.
[**reorderPages**](PdfApi.md#reorderPages) | **POST** /api/pdf/ReorderPages | Reorders pages of a previously uploaded document.
[**repairDocument**](PdfApi.md#repairDocument) | **POST** /api/pdf/RepairDocument | Repairs a previously uploaded PDF document.
[**rotatePageStandard**](PdfApi.md#rotatePageStandard) | **POST** /api/pdf/RotatePageStandard | Rotates (standardly) a page range from a previously uploaded document.
[**saveAsJPEG**](PdfApi.md#saveAsJPEG) | **POST** /api/pdf/SaveAsJPEG | Saves a previously uploaded document as JPEG, and sends the file data in a JSON-serialized object.
[**saveAsJPEGFile**](PdfApi.md#saveAsJPEGFile) | **POST** /api/pdf/SaveAsJPEGFile | Saves a previously uploaded document as JPEG, and streams the file binary data to the response (this is the most efficient download method).
[**saveAsPNG**](PdfApi.md#saveAsPNG) | **POST** /api/pdf/SaveAsPNG | Saves a previously uploaded document as PNG, and sends the file data in a JSON-serialized object.
[**saveAsPNGFile**](PdfApi.md#saveAsPNGFile) | **POST** /api/pdf/SaveAsPNGFile | Saves a previously uploaded document as PNG, and streams the file binary data to the response (this is the most efficient download method).
[**saveAsTIFF**](PdfApi.md#saveAsTIFF) | **POST** /api/pdf/SaveAsTIFF | Saves a previously uploaded document as TIFF, and sends the file data in a JSON-serialized object.
[**saveAsTIFFFile**](PdfApi.md#saveAsTIFFFile) | **POST** /api/pdf/SaveAsTIFFFile | Saves a previously uploaded document as TIFF, and streams the file binary data to the response (this is the most efficient download method).
[**saveAsTIFFMultipage**](PdfApi.md#saveAsTIFFMultipage) | **POST** /api/pdf/SaveAsTIFFMultipage | Saves a previously uploaded document as multipage TIFF, and sends the file data in a JSON-serialized object.
[**saveAsTIFFMultipageFile**](PdfApi.md#saveAsTIFFMultipageFile) | **POST** /api/pdf/SaveAsTIFFMultipageFile | Saves a previously uploaded document as multipage TIFF, and streams the file binary data to the response (this is the most efficient download method).
[**saveDocument**](PdfApi.md#saveDocument) | **POST** /api/pdf/SaveDocument | Saves a previously uploaded document as PDF, and sends the file data in a JSON-serialized object.
[**saveDocumentToFile**](PdfApi.md#saveDocumentToFile) | **POST** /api/pdf/SaveDocumentToFile | Saves a previously uploaded document as PDF, and streams the file binary data to the response (this is the most efficient download method).
[**scalePage**](PdfApi.md#scalePage) | **POST** /api/pdf/ScalePage | Scales a page range from a previously uploaded document.
[**setInfo**](PdfApi.md#setInfo) | **POST** /api/pdf/SetInfo | Sets information to a previously uploaded document.
[**setInitialView**](PdfApi.md#setInitialView) | **POST** /api/pdf/SetInitialView | Sets various document level initial view options to a previously uploaded document.
[**setPageBox**](PdfApi.md#setPageBox) | **POST** /api/pdf/SetPageBox | Sets pagebox to a page range from previously uploaded document.
[**setPassword**](PdfApi.md#setPassword) | **POST** /api/pdf/SetPassword | Unprotects a previously uploaded document.
[**split**](PdfApi.md#split) | **POST** /api/pdf/Split | Splits a previously uploaded document into new ones.
[**swapPages**](PdfApi.md#swapPages) | **POST** /api/pdf/SwapPages | Swaps two pages from a previously uploaded document.
[**unprotect**](PdfApi.md#unprotect) | **POST** /api/pdf/Unprotect | Unprotects a previously uploaded document.


<a name="annotate"></a>
# **annotate**
> PdfAnnotateResponse annotate(pdfAnnotateParameters)

Annotates a previously uploaded document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfAnnotateParameters pdfAnnotateParameters = new PdfAnnotateParameters(); // PdfAnnotateParameters | A PdfAnnotateParameters object specifying the parameters of the action.
    try {
      PdfAnnotateResponse result = apiInstance.annotate(pdfAnnotateParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#annotate");
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
 **pdfAnnotateParameters** | [**PdfAnnotateParameters**](PdfAnnotateParameters.md)| A PdfAnnotateParameters object specifying the parameters of the action. |

### Return type

[**PdfAnnotateResponse**](PdfAnnotateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="autoDeskew"></a>
# **autoDeskew**
> PdfAutoDeskewResponse autoDeskew(pdfAutoDeskewParameters)

Performs auto deskew on a page range of a previously uploaded document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfAutoDeskewParameters pdfAutoDeskewParameters = new PdfAutoDeskewParameters(); // PdfAutoDeskewParameters | A PdfAutoDeskewParameters object specifying the parameters of the action.
    try {
      PdfAutoDeskewResponse result = apiInstance.autoDeskew(pdfAutoDeskewParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#autoDeskew");
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
 **pdfAutoDeskewParameters** | [**PdfAutoDeskewParameters**](PdfAutoDeskewParameters.md)| A PdfAutoDeskewParameters object specifying the parameters of the action. |

### Return type

[**PdfAutoDeskewResponse**](PdfAutoDeskewResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="clearPage"></a>
# **clearPage**
> PdfClearPageResponse clearPage(pdfClearPageParameters)

Clears a page range from a previously uploaded document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfClearPageParameters pdfClearPageParameters = new PdfClearPageParameters(); // PdfClearPageParameters | A PdfClearPageParameters object specifying the parameters of the action.
    try {
      PdfClearPageResponse result = apiInstance.clearPage(pdfClearPageParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#clearPage");
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
 **pdfClearPageParameters** | [**PdfClearPageParameters**](PdfClearPageParameters.md)| A PdfClearPageParameters object specifying the parameters of the action. |

### Return type

[**PdfClearPageResponse**](PdfClearPageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="clonePage"></a>
# **clonePage**
> PdfClonePageResponse clonePage(pdfClonePageParameters)

Clones specific pages from a previously uploaded document to another previously uploaded document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfClonePageParameters pdfClonePageParameters = new PdfClonePageParameters(); // PdfClonePageParameters | A PdfClonePageParameters object specifying the parameters of the action.
    try {
      PdfClonePageResponse result = apiInstance.clonePage(pdfClonePageParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#clonePage");
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
 **pdfClonePageParameters** | [**PdfClonePageParameters**](PdfClonePageParameters.md)| A PdfClonePageParameters object specifying the parameters of the action. |

### Return type

[**PdfClonePageResponse**](PdfClonePageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="closePDF"></a>
# **closePDF**
> PdfCloseDocumentResponse closePDF(pdfCloseDocumentParameters)

Closes a previously uploaded document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfCloseDocumentParameters pdfCloseDocumentParameters = new PdfCloseDocumentParameters(); // PdfCloseDocumentParameters | A PdfCloseDocumentParameters object specifying the parameters of the action.
    try {
      PdfCloseDocumentResponse result = apiInstance.closePDF(pdfCloseDocumentParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#closePDF");
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
 **pdfCloseDocumentParameters** | [**PdfCloseDocumentParameters**](PdfCloseDocumentParameters.md)| A PdfCloseDocumentParameters object specifying the parameters of the action. |

### Return type

[**PdfCloseDocumentResponse**](PdfCloseDocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="convertToPDFA"></a>
# **convertToPDFA**
> PdfConvertToPDFAResponse convertToPDFA(pdfConvertToPDFAParameters)

Converts a previously uploaded document to PDF/A.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfConvertToPDFAParameters pdfConvertToPDFAParameters = new PdfConvertToPDFAParameters(); // PdfConvertToPDFAParameters | A PdfConvertToPDFAParameters object specifying the parameters of the action.
    try {
      PdfConvertToPDFAResponse result = apiInstance.convertToPDFA(pdfConvertToPDFAParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#convertToPDFA");
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
 **pdfConvertToPDFAParameters** | [**PdfConvertToPDFAParameters**](PdfConvertToPDFAParameters.md)| A PdfConvertToPDFAParameters object specifying the parameters of the action. |

### Return type

[**PdfConvertToPDFAResponse**](PdfConvertToPDFAResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="deletePage"></a>
# **deletePage**
> PdfDeletePageResponse deletePage(pdfDeletePageParameters)

Deletes a page range from a previously uploaded document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfDeletePageParameters pdfDeletePageParameters = new PdfDeletePageParameters(); // PdfDeletePageParameters | A PdfDeletePageParameters object specifying the parameters of the action.
    try {
      PdfDeletePageResponse result = apiInstance.deletePage(pdfDeletePageParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#deletePage");
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
 **pdfDeletePageParameters** | [**PdfDeletePageParameters**](PdfDeletePageParameters.md)| A PdfDeletePageParameters object specifying the parameters of the action. |

### Return type

[**PdfDeletePageResponse**](PdfDeletePageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="detectPageOrientation"></a>
# **detectPageOrientation**
> PdfDetectPageOrientationResponse detectPageOrientation(pdfDetectPageOrientationParameters)

Detects the orientation of the page(s) of a previously uploaded document and offers to automatically rotate them.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfDetectPageOrientationParameters pdfDetectPageOrientationParameters = new PdfDetectPageOrientationParameters(); // PdfDetectPageOrientationParameters | A PdfDetectPageOrientationParameters object specifying the parameters of the action.
    try {
      PdfDetectPageOrientationResponse result = apiInstance.detectPageOrientation(pdfDetectPageOrientationParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#detectPageOrientation");
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
 **pdfDetectPageOrientationParameters** | [**PdfDetectPageOrientationParameters**](PdfDetectPageOrientationParameters.md)| A PdfDetectPageOrientationParameters object specifying the parameters of the action. |

### Return type

[**PdfDetectPageOrientationResponse**](PdfDetectPageOrientationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="digiSign"></a>
# **digiSign**
> PdfDigiSignResponse digiSign(pdfDigiSignParameters)

Signs a previously uploaded document digitally.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfDigiSignParameters pdfDigiSignParameters = new PdfDigiSignParameters(); // PdfDigiSignParameters | A PdfDigiSignParameters object specifying the parameters of the action.
    try {
      PdfDigiSignResponse result = apiInstance.digiSign(pdfDigiSignParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#digiSign");
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
 **pdfDigiSignParameters** | [**PdfDigiSignParameters**](PdfDigiSignParameters.md)| A PdfDigiSignParameters object specifying the parameters of the action. |

### Return type

[**PdfDigiSignResponse**](PdfDigiSignResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="drawImage"></a>
# **drawImage**
> PdfDrawImageResponse drawImage(pdfDrawImageParameters)

Draws an image on a page range of a previously uploaded document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfDrawImageParameters pdfDrawImageParameters = new PdfDrawImageParameters(); // PdfDrawImageParameters | A PdfDrawImageParameters object specifying the parameters of the action.
    try {
      PdfDrawImageResponse result = apiInstance.drawImage(pdfDrawImageParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#drawImage");
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
 **pdfDrawImageParameters** | [**PdfDrawImageParameters**](PdfDrawImageParameters.md)| A PdfDrawImageParameters object specifying the parameters of the action. |

### Return type

[**PdfDrawImageResponse**](PdfDrawImageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="extractPage"></a>
# **extractPage**
> PdfExtractPageResponse extractPage(pdfExtractPageParameters)

Extracts a page range from a previously uploaded document into one or several new documents.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfExtractPageParameters pdfExtractPageParameters = new PdfExtractPageParameters(); // PdfExtractPageParameters | A PdfExtractPageParameters object specifying the parameters of the action.
    try {
      PdfExtractPageResponse result = apiInstance.extractPage(pdfExtractPageParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#extractPage");
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
 **pdfExtractPageParameters** | [**PdfExtractPageParameters**](PdfExtractPageParameters.md)| A PdfExtractPageParameters object specifying the parameters of the action. |

### Return type

[**PdfExtractPageResponse**](PdfExtractPageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="extractText"></a>
# **extractText**
> PdfExtractTextResponse extractText(pdfExtractTextParameters)

Extracts text from the document pages.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfExtractTextParameters pdfExtractTextParameters = new PdfExtractTextParameters(); // PdfExtractTextParameters | A PdfExtractTextParameters object specifying the parameters of the action.
    try {
      PdfExtractTextResponse result = apiInstance.extractText(pdfExtractTextParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#extractText");
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
 **pdfExtractTextParameters** | [**PdfExtractTextParameters**](PdfExtractTextParameters.md)| A PdfExtractTextParameters object specifying the parameters of the action. |

### Return type

[**PdfExtractTextResponse**](PdfExtractTextResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="flatten"></a>
# **flatten**
> PdfFlattenResponse flatten(pdfFlattenParameters)

Flattens the form-fields, annotations, and/or the layers of a previously uploaded document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfFlattenParameters pdfFlattenParameters = new PdfFlattenParameters(); // PdfFlattenParameters | A PdfFlatten object specifying the parameters of the action.
    try {
      PdfFlattenResponse result = apiInstance.flatten(pdfFlattenParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#flatten");
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
 **pdfFlattenParameters** | [**PdfFlattenParameters**](PdfFlattenParameters.md)| A PdfFlatten object specifying the parameters of the action. |

### Return type

[**PdfFlattenResponse**](PdfFlattenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getInfo"></a>
# **getInfo**
> PdfGetInfoResponse getInfo(pdfGetInfoParameters)

Gets information about a previously uploaded document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfGetInfoParameters pdfGetInfoParameters = new PdfGetInfoParameters(); // PdfGetInfoParameters | A PdfGetInfoParameters object specifying the parameters of the action.
    try {
      PdfGetInfoResponse result = apiInstance.getInfo(pdfGetInfoParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#getInfo");
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
 **pdfGetInfoParameters** | [**PdfGetInfoParameters**](PdfGetInfoParameters.md)| A PdfGetInfoParameters object specifying the parameters of the action. |

### Return type

[**PdfGetInfoResponse**](PdfGetInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getPDFImportSupportedFileExtensions"></a>
# **getPDFImportSupportedFileExtensions**
> StringArrayResponse getPDFImportSupportedFileExtensions()

Gets the supported file extensions by the LoadDocumentAsPDF action.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    try {
      StringArrayResponse result = apiInstance.getPDFImportSupportedFileExtensions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#getPDFImportSupportedFileExtensions");
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

<a name="getPageThumbnail"></a>
# **getPageThumbnail**
> PdfGetPageThumbnailResponse getPageThumbnail(pdfGetPageThumbnailParameters)

Gets a thumbnail of each page within the provided page range from a previously uploaded document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfGetPageThumbnailParameters pdfGetPageThumbnailParameters = new PdfGetPageThumbnailParameters(); // PdfGetPageThumbnailParameters | A PdfGetPageThumbnailParameters object specifying the parameters of the action.
    try {
      PdfGetPageThumbnailResponse result = apiInstance.getPageThumbnail(pdfGetPageThumbnailParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#getPageThumbnail");
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
 **pdfGetPageThumbnailParameters** | [**PdfGetPageThumbnailParameters**](PdfGetPageThumbnailParameters.md)| A PdfGetPageThumbnailParameters object specifying the parameters of the action. |

### Return type

[**PdfGetPageThumbnailResponse**](PdfGetPageThumbnailResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="insertImage"></a>
# **insertImage**
> PdfInsertImageResponse insertImage(pdfInsertImageParameters)

Inserts an image on a new page of a previously uploaded document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfInsertImageParameters pdfInsertImageParameters = new PdfInsertImageParameters(); // PdfInsertImageParameters | A PdfInsertImageParameters object specifying the parameters of the action.
    try {
      PdfInsertImageResponse result = apiInstance.insertImage(pdfInsertImageParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#insertImage");
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
 **pdfInsertImageParameters** | [**PdfInsertImageParameters**](PdfInsertImageParameters.md)| A PdfInsertImageParameters object specifying the parameters of the action. |

### Return type

[**PdfInsertImageResponse**](PdfInsertImageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="insertNewPage"></a>
# **insertNewPage**
> PdfInsertNewPageResponse insertNewPage(pdfInsertNewPageParameters)

Inserts one or more new blank pages to a specific position in a previously uploaded document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfInsertNewPageParameters pdfInsertNewPageParameters = new PdfInsertNewPageParameters(); // PdfInsertNewPageParameters | A PdfInsertNewPageParameters object specifying the parameters of the action.
    try {
      PdfInsertNewPageResponse result = apiInstance.insertNewPage(pdfInsertNewPageParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#insertNewPage");
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
 **pdfInsertNewPageParameters** | [**PdfInsertNewPageParameters**](PdfInsertNewPageParameters.md)| A PdfInsertNewPageParameters object specifying the parameters of the action. |

### Return type

[**PdfInsertNewPageResponse**](PdfInsertNewPageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="insertPageNumber"></a>
# **insertPageNumber**
> PdfInsertPageNumberResponse insertPageNumber(pdfInsertPageNumberParameters)

Inserts page number(s) on a document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfInsertPageNumberParameters pdfInsertPageNumberParameters = new PdfInsertPageNumberParameters(); // PdfInsertPageNumberParameters | A PdfInsertPageNumberParameters object specifying the parameters of the action.
    try {
      PdfInsertPageNumberResponse result = apiInstance.insertPageNumber(pdfInsertPageNumberParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#insertPageNumber");
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
 **pdfInsertPageNumberParameters** | [**PdfInsertPageNumberParameters**](PdfInsertPageNumberParameters.md)| A PdfInsertPageNumberParameters object specifying the parameters of the action. |

### Return type

[**PdfInsertPageNumberResponse**](PdfInsertPageNumberResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="insertText"></a>
# **insertText**
> PdfInsertTextResponse insertText(pdfInsertTextParameters)

Inserts text on a document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfInsertTextParameters pdfInsertTextParameters = new PdfInsertTextParameters(); // PdfInsertTextParameters | A PdfInsertTextParameters object specifying the parameters of the action.
    try {
      PdfInsertTextResponse result = apiInstance.insertText(pdfInsertTextParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#insertText");
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
 **pdfInsertTextParameters** | [**PdfInsertTextParameters**](PdfInsertTextParameters.md)| A PdfInsertTextParameters object specifying the parameters of the action. |

### Return type

[**PdfInsertTextResponse**](PdfInsertTextResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="linearize"></a>
# **linearize**
> PdfLinearizeResponse linearize(pdfLinearizeParameters)

Linearizes a previously uploaded document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfLinearizeParameters pdfLinearizeParameters = new PdfLinearizeParameters(); // PdfLinearizeParameters | A PdfLinearizeParameters object specifying the parameters of the action.
    try {
      PdfLinearizeResponse result = apiInstance.linearize(pdfLinearizeParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#linearize");
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
 **pdfLinearizeParameters** | [**PdfLinearizeParameters**](PdfLinearizeParameters.md)| A PdfLinearizeParameters object specifying the parameters of the action. |

### Return type

[**PdfLinearizeResponse**](PdfLinearizeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="loadDocumentAsPDF"></a>
# **loadDocumentAsPDF**
> PdfLoadDocumentResponse loadDocumentAsPDF(pdfLoadDocumentFromByteArrayParameters)

Imports the provided document as PDF.  Supported document formats can be retrieved by the GetPDFImportSupportedFileExtensions action.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfLoadDocumentFromByteArrayParameters pdfLoadDocumentFromByteArrayParameters = new PdfLoadDocumentFromByteArrayParameters(); // PdfLoadDocumentFromByteArrayParameters | A PdfLoadDocumentFromByteArrayParameters object specifying the parameters of the action.
    try {
      PdfLoadDocumentResponse result = apiInstance.loadDocumentAsPDF(pdfLoadDocumentFromByteArrayParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#loadDocumentAsPDF");
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
 **pdfLoadDocumentFromByteArrayParameters** | [**PdfLoadDocumentFromByteArrayParameters**](PdfLoadDocumentFromByteArrayParameters.md)| A PdfLoadDocumentFromByteArrayParameters object specifying the parameters of the action. |

### Return type

[**PdfLoadDocumentResponse**](PdfLoadDocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="loadDocumentAsPDFMultipart"></a>
# **loadDocumentAsPDFMultipart**
> PdfLoadDocumentResponse loadDocumentAsPDFMultipart(fileData, loadDocumentParameters)

Imports the provided document as PDF using Multipart Upload.  Supported document formats can be retrieved by the GetPDFImportSupportedFileExtensions action.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    File fileData = new File("/path/to/file"); // File | The data of the document.
    PdfLoadDocumentParameters loadDocumentParameters = new PdfLoadDocumentParameters(); // PdfLoadDocumentParameters | 
    try {
      PdfLoadDocumentResponse result = apiInstance.loadDocumentAsPDFMultipart(fileData, loadDocumentParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#loadDocumentAsPDFMultipart");
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
 **loadDocumentParameters** | [**PdfLoadDocumentParameters**](PdfLoadDocumentParameters.md)|  | [optional]

### Return type

[**PdfLoadDocumentResponse**](PdfLoadDocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="merge"></a>
# **merge**
> PdfMergeResponse merge(pdfMergeParameters)

Merges several previously uploaded documents into a new PDF.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfMergeParameters pdfMergeParameters = new PdfMergeParameters(); // PdfMergeParameters | A PdfMergeParameters object specifying the parameters of the action.
    try {
      PdfMergeResponse result = apiInstance.merge(pdfMergeParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#merge");
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
 **pdfMergeParameters** | [**PdfMergeParameters**](PdfMergeParameters.md)| A PdfMergeParameters object specifying the parameters of the action. |

### Return type

[**PdfMergeResponse**](PdfMergeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="mergePages"></a>
# **mergePages**
> PdfMergePagesResponse mergePages(pdfMergePagesParameters)

Merges multiple pages, vertically, within a previously uploaded document into one single page.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfMergePagesParameters pdfMergePagesParameters = new PdfMergePagesParameters(); // PdfMergePagesParameters | A PdfMergePages object specifying the parameters of the action.
    try {
      PdfMergePagesResponse result = apiInstance.mergePages(pdfMergePagesParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#mergePages");
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
 **pdfMergePagesParameters** | [**PdfMergePagesParameters**](PdfMergePagesParameters.md)| A PdfMergePages object specifying the parameters of the action. |

### Return type

[**PdfMergePagesResponse**](PdfMergePagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="movePage"></a>
# **movePage**
> PdfMovePageResponse movePage(pdfMovePageParameters)

Moves a page range from a previously uploaded document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfMovePageParameters pdfMovePageParameters = new PdfMovePageParameters(); // PdfMovePageParameters | A PdfMovePageParameters object specifying the parameters of the action.
    try {
      PdfMovePageResponse result = apiInstance.movePage(pdfMovePageParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#movePage");
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
 **pdfMovePageParameters** | [**PdfMovePageParameters**](PdfMovePageParameters.md)| A PdfMovePageParameters object specifying the parameters of the action. |

### Return type

[**PdfMovePageResponse**](PdfMovePageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="oCR"></a>
# **oCR**
> PdfOCRResponse oCR(pdfOCRParameters)

Performs optical character recognition on a page range of a previously uploaded document.  The recognized text is added as invisible text on each processed page.  No token is charged for blank pages.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfOCRParameters pdfOCRParameters = new PdfOCRParameters(); // PdfOCRParameters | A PdfOCRParameters object specifying the parameters of the action.
    try {
      PdfOCRResponse result = apiInstance.oCR(pdfOCRParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#oCR");
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
 **pdfOCRParameters** | [**PdfOCRParameters**](PdfOCRParameters.md)| A PdfOCRParameters object specifying the parameters of the action. |

### Return type

[**PdfOCRResponse**](PdfOCRResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="protect"></a>
# **protect**
> PdfProtectResponse protect(pdfProtectParameters)

Protects a previously uploaded document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfProtectParameters pdfProtectParameters = new PdfProtectParameters(); // PdfProtectParameters | A PdfProtectParameters object specifying the parameters of the action.
    try {
      PdfProtectResponse result = apiInstance.protect(pdfProtectParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#protect");
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
 **pdfProtectParameters** | [**PdfProtectParameters**](PdfProtectParameters.md)| A PdfProtectParameters object specifying the parameters of the action. |

### Return type

[**PdfProtectResponse**](PdfProtectResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="readBarcodes"></a>
# **readBarcodes**
> ReadBarcodesResponse readBarcodes(pdfReadBarcodesParameters)

Reads barcodes from a previously uploaded document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfReadBarcodesParameters pdfReadBarcodesParameters = new PdfReadBarcodesParameters(); // PdfReadBarcodesParameters | A PdfReadBarcodesParameters object specifying the parameters of the action.
    try {
      ReadBarcodesResponse result = apiInstance.readBarcodes(pdfReadBarcodesParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#readBarcodes");
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
 **pdfReadBarcodesParameters** | [**PdfReadBarcodesParameters**](PdfReadBarcodesParameters.md)| A PdfReadBarcodesParameters object specifying the parameters of the action. |

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

<a name="reduce"></a>
# **reduce**
> PdfReduceResponse reduce(pdfReduceParameters)

Reduces the size of a previously uploaded document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfReduceParameters pdfReduceParameters = new PdfReduceParameters(); // PdfReduceParameters | A PdfReduceParameters object specifying the parameters of the action.
    try {
      PdfReduceResponse result = apiInstance.reduce(pdfReduceParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#reduce");
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
 **pdfReduceParameters** | [**PdfReduceParameters**](PdfReduceParameters.md)| A PdfReduceParameters object specifying the parameters of the action. |

### Return type

[**PdfReduceResponse**](PdfReduceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="removePageFormFields"></a>
# **removePageFormFields**
> PdfRemovePageFormFieldsResponse removePageFormFields(pdfRemovePageFormFieldsParameters)

Removes the form fields from a page range of a previously uploaded document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfRemovePageFormFieldsParameters pdfRemovePageFormFieldsParameters = new PdfRemovePageFormFieldsParameters(); // PdfRemovePageFormFieldsParameters | A PdfRemovePageFormFieldsParameters object specifying the parameters of the action.
    try {
      PdfRemovePageFormFieldsResponse result = apiInstance.removePageFormFields(pdfRemovePageFormFieldsParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#removePageFormFields");
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
 **pdfRemovePageFormFieldsParameters** | [**PdfRemovePageFormFieldsParameters**](PdfRemovePageFormFieldsParameters.md)| A PdfRemovePageFormFieldsParameters object specifying the parameters of the action. |

### Return type

[**PdfRemovePageFormFieldsResponse**](PdfRemovePageFormFieldsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="removeText"></a>
# **removeText**
> PdfRemoveTextResponse removeText(pdfRemoveTextParameters)

Removes text (all text or only invisible one) from a previously uploaded PDF.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfRemoveTextParameters pdfRemoveTextParameters = new PdfRemoveTextParameters(); // PdfRemoveTextParameters | A PdfRemoveTextParameters object specifying the parameters of the action.
    try {
      PdfRemoveTextResponse result = apiInstance.removeText(pdfRemoveTextParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#removeText");
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
 **pdfRemoveTextParameters** | [**PdfRemoveTextParameters**](PdfRemoveTextParameters.md)| A PdfRemoveTextParameters object specifying the parameters of the action. |

### Return type

[**PdfRemoveTextResponse**](PdfRemoveTextResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="reorderPages"></a>
# **reorderPages**
> PdfReorderPagesResponse reorderPages(pdfReorderPagesParameters)

Reorders pages of a previously uploaded document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfReorderPagesParameters pdfReorderPagesParameters = new PdfReorderPagesParameters(); // PdfReorderPagesParameters | A PdfReorderPagesParameters object specifying the parameters of the action.
    try {
      PdfReorderPagesResponse result = apiInstance.reorderPages(pdfReorderPagesParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#reorderPages");
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
 **pdfReorderPagesParameters** | [**PdfReorderPagesParameters**](PdfReorderPagesParameters.md)| A PdfReorderPagesParameters object specifying the parameters of the action. |

### Return type

[**PdfReorderPagesResponse**](PdfReorderPagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="repairDocument"></a>
# **repairDocument**
> PdfRepairDocumentResponse repairDocument(pdfRepairDocumentParameters)

Repairs a previously uploaded PDF document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfRepairDocumentParameters pdfRepairDocumentParameters = new PdfRepairDocumentParameters(); // PdfRepairDocumentParameters | A PdfRepairDocumentParameters object specifying the parameters of the action.
    try {
      PdfRepairDocumentResponse result = apiInstance.repairDocument(pdfRepairDocumentParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#repairDocument");
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
 **pdfRepairDocumentParameters** | [**PdfRepairDocumentParameters**](PdfRepairDocumentParameters.md)| A PdfRepairDocumentParameters object specifying the parameters of the action. |

### Return type

[**PdfRepairDocumentResponse**](PdfRepairDocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="rotatePageStandard"></a>
# **rotatePageStandard**
> PdfRotatePageStandardResponse rotatePageStandard(pdfRotatePageStandardParameters)

Rotates (standardly) a page range from a previously uploaded document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfRotatePageStandardParameters pdfRotatePageStandardParameters = new PdfRotatePageStandardParameters(); // PdfRotatePageStandardParameters | A PdfRotatePageStandardParameters object specifying the parameters of the action.
    try {
      PdfRotatePageStandardResponse result = apiInstance.rotatePageStandard(pdfRotatePageStandardParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#rotatePageStandard");
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
 **pdfRotatePageStandardParameters** | [**PdfRotatePageStandardParameters**](PdfRotatePageStandardParameters.md)| A PdfRotatePageStandardParameters object specifying the parameters of the action. |

### Return type

[**PdfRotatePageStandardResponse**](PdfRotatePageStandardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="saveAsJPEG"></a>
# **saveAsJPEG**
> PdfSaveAsJPEGResponse saveAsJPEG(pdfSaveAsJPEGParameters)

Saves a previously uploaded document as JPEG, and sends the file data in a JSON-serialized object.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfSaveAsJPEGParameters pdfSaveAsJPEGParameters = new PdfSaveAsJPEGParameters(); // PdfSaveAsJPEGParameters | A PdfSaveAsJPEGParameters object specifying the parameters of the action.
    try {
      PdfSaveAsJPEGResponse result = apiInstance.saveAsJPEG(pdfSaveAsJPEGParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#saveAsJPEG");
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
 **pdfSaveAsJPEGParameters** | [**PdfSaveAsJPEGParameters**](PdfSaveAsJPEGParameters.md)| A PdfSaveAsJPEGParameters object specifying the parameters of the action. |

### Return type

[**PdfSaveAsJPEGResponse**](PdfSaveAsJPEGResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="saveAsJPEGFile"></a>
# **saveAsJPEGFile**
> File saveAsJPEGFile(pdfSaveAsJPEGParameters)

Saves a previously uploaded document as JPEG, and streams the file binary data to the response (this is the most efficient download method).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfSaveAsJPEGParameters pdfSaveAsJPEGParameters = new PdfSaveAsJPEGParameters(); // PdfSaveAsJPEGParameters | A PdfSaveAsJPEGParameters object specifying the parameters of the action.
    try {
      File result = apiInstance.saveAsJPEGFile(pdfSaveAsJPEGParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#saveAsJPEGFile");
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
 **pdfSaveAsJPEGParameters** | [**PdfSaveAsJPEGParameters**](PdfSaveAsJPEGParameters.md)| A PdfSaveAsJPEGParameters object specifying the parameters of the action. |

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

<a name="saveAsPNG"></a>
# **saveAsPNG**
> PdfSaveAsPNGResponse saveAsPNG(pdfSaveAsPNGParameters)

Saves a previously uploaded document as PNG, and sends the file data in a JSON-serialized object.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfSaveAsPNGParameters pdfSaveAsPNGParameters = new PdfSaveAsPNGParameters(); // PdfSaveAsPNGParameters | A PdfSaveAsPNGParameters object specifying the parameters of the action.
    try {
      PdfSaveAsPNGResponse result = apiInstance.saveAsPNG(pdfSaveAsPNGParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#saveAsPNG");
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
 **pdfSaveAsPNGParameters** | [**PdfSaveAsPNGParameters**](PdfSaveAsPNGParameters.md)| A PdfSaveAsPNGParameters object specifying the parameters of the action. |

### Return type

[**PdfSaveAsPNGResponse**](PdfSaveAsPNGResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="saveAsPNGFile"></a>
# **saveAsPNGFile**
> File saveAsPNGFile(pdfSaveAsPNGParameters)

Saves a previously uploaded document as PNG, and streams the file binary data to the response (this is the most efficient download method).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfSaveAsPNGParameters pdfSaveAsPNGParameters = new PdfSaveAsPNGParameters(); // PdfSaveAsPNGParameters | A PdfSaveAsPNGParameters object specifying the parameters of the action.
    try {
      File result = apiInstance.saveAsPNGFile(pdfSaveAsPNGParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#saveAsPNGFile");
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
 **pdfSaveAsPNGParameters** | [**PdfSaveAsPNGParameters**](PdfSaveAsPNGParameters.md)| A PdfSaveAsPNGParameters object specifying the parameters of the action. |

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

<a name="saveAsTIFF"></a>
# **saveAsTIFF**
> PdfSaveAsTIFFResponse saveAsTIFF(pdfSaveAsTIFFParameters)

Saves a previously uploaded document as TIFF, and sends the file data in a JSON-serialized object.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfSaveAsTIFFParameters pdfSaveAsTIFFParameters = new PdfSaveAsTIFFParameters(); // PdfSaveAsTIFFParameters | A PdfSaveAsTIFFParameters object specifying the parameters of the action.
    try {
      PdfSaveAsTIFFResponse result = apiInstance.saveAsTIFF(pdfSaveAsTIFFParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#saveAsTIFF");
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
 **pdfSaveAsTIFFParameters** | [**PdfSaveAsTIFFParameters**](PdfSaveAsTIFFParameters.md)| A PdfSaveAsTIFFParameters object specifying the parameters of the action. |

### Return type

[**PdfSaveAsTIFFResponse**](PdfSaveAsTIFFResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="saveAsTIFFFile"></a>
# **saveAsTIFFFile**
> File saveAsTIFFFile(pdfSaveAsTIFFParameters)

Saves a previously uploaded document as TIFF, and streams the file binary data to the response (this is the most efficient download method).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfSaveAsTIFFParameters pdfSaveAsTIFFParameters = new PdfSaveAsTIFFParameters(); // PdfSaveAsTIFFParameters | A PdfSaveAsTIFFParameters object specifying the parameters of the action.
    try {
      File result = apiInstance.saveAsTIFFFile(pdfSaveAsTIFFParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#saveAsTIFFFile");
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
 **pdfSaveAsTIFFParameters** | [**PdfSaveAsTIFFParameters**](PdfSaveAsTIFFParameters.md)| A PdfSaveAsTIFFParameters object specifying the parameters of the action. |

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

<a name="saveAsTIFFMultipage"></a>
# **saveAsTIFFMultipage**
> PdfSaveAsTIFFMultipageResponse saveAsTIFFMultipage(pdfSaveAsTIFFMultipageParameters)

Saves a previously uploaded document as multipage TIFF, and sends the file data in a JSON-serialized object.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfSaveAsTIFFMultipageParameters pdfSaveAsTIFFMultipageParameters = new PdfSaveAsTIFFMultipageParameters(); // PdfSaveAsTIFFMultipageParameters | A PdfSaveAsTIFFMultipageParameters object specifying the parameters of the action.
    try {
      PdfSaveAsTIFFMultipageResponse result = apiInstance.saveAsTIFFMultipage(pdfSaveAsTIFFMultipageParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#saveAsTIFFMultipage");
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
 **pdfSaveAsTIFFMultipageParameters** | [**PdfSaveAsTIFFMultipageParameters**](PdfSaveAsTIFFMultipageParameters.md)| A PdfSaveAsTIFFMultipageParameters object specifying the parameters of the action. |

### Return type

[**PdfSaveAsTIFFMultipageResponse**](PdfSaveAsTIFFMultipageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="saveAsTIFFMultipageFile"></a>
# **saveAsTIFFMultipageFile**
> File saveAsTIFFMultipageFile(pdfSaveAsTIFFMultipageParameters)

Saves a previously uploaded document as multipage TIFF, and streams the file binary data to the response (this is the most efficient download method).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfSaveAsTIFFMultipageParameters pdfSaveAsTIFFMultipageParameters = new PdfSaveAsTIFFMultipageParameters(); // PdfSaveAsTIFFMultipageParameters | A PdfSaveAsTIFFMultipageParameters object specifying the parameters of the action.
    try {
      File result = apiInstance.saveAsTIFFMultipageFile(pdfSaveAsTIFFMultipageParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#saveAsTIFFMultipageFile");
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
 **pdfSaveAsTIFFMultipageParameters** | [**PdfSaveAsTIFFMultipageParameters**](PdfSaveAsTIFFMultipageParameters.md)| A PdfSaveAsTIFFMultipageParameters object specifying the parameters of the action. |

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

<a name="saveDocument"></a>
# **saveDocument**
> PdfSaveDocumentResponse saveDocument(pdfSaveDocumentParameters)

Saves a previously uploaded document as PDF, and sends the file data in a JSON-serialized object.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfSaveDocumentParameters pdfSaveDocumentParameters = new PdfSaveDocumentParameters(); // PdfSaveDocumentParameters | A PdfSaveDocumentParameters object specifying the parameters of the action.
    try {
      PdfSaveDocumentResponse result = apiInstance.saveDocument(pdfSaveDocumentParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#saveDocument");
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
 **pdfSaveDocumentParameters** | [**PdfSaveDocumentParameters**](PdfSaveDocumentParameters.md)| A PdfSaveDocumentParameters object specifying the parameters of the action. |

### Return type

[**PdfSaveDocumentResponse**](PdfSaveDocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="saveDocumentToFile"></a>
# **saveDocumentToFile**
> File saveDocumentToFile(pdfSaveDocumentParameters)

Saves a previously uploaded document as PDF, and streams the file binary data to the response (this is the most efficient download method).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfSaveDocumentParameters pdfSaveDocumentParameters = new PdfSaveDocumentParameters(); // PdfSaveDocumentParameters | A PdfSaveDocumentParameters object specifying the parameters of the action.
    try {
      File result = apiInstance.saveDocumentToFile(pdfSaveDocumentParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#saveDocumentToFile");
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
 **pdfSaveDocumentParameters** | [**PdfSaveDocumentParameters**](PdfSaveDocumentParameters.md)| A PdfSaveDocumentParameters object specifying the parameters of the action. |

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

<a name="scalePage"></a>
# **scalePage**
> PdfScalePageResponse scalePage(pdfScalePageParameters)

Scales a page range from a previously uploaded document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfScalePageParameters pdfScalePageParameters = new PdfScalePageParameters(); // PdfScalePageParameters | A PdfScalePage object specifying the parameters of the action.
    try {
      PdfScalePageResponse result = apiInstance.scalePage(pdfScalePageParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#scalePage");
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
 **pdfScalePageParameters** | [**PdfScalePageParameters**](PdfScalePageParameters.md)| A PdfScalePage object specifying the parameters of the action. |

### Return type

[**PdfScalePageResponse**](PdfScalePageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="setInfo"></a>
# **setInfo**
> PdfSetInfoResponse setInfo(pdfSetInfoParameters)

Sets information to a previously uploaded document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfSetInfoParameters pdfSetInfoParameters = new PdfSetInfoParameters(); // PdfSetInfoParameters | A PdfSetInfoParameters object specifying the parameters of the action.
    try {
      PdfSetInfoResponse result = apiInstance.setInfo(pdfSetInfoParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#setInfo");
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
 **pdfSetInfoParameters** | [**PdfSetInfoParameters**](PdfSetInfoParameters.md)| A PdfSetInfoParameters object specifying the parameters of the action. |

### Return type

[**PdfSetInfoResponse**](PdfSetInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="setInitialView"></a>
# **setInitialView**
> PdfSetInitialViewResponse setInitialView(pdfSetInitialViewParameters)

Sets various document level initial view options to a previously uploaded document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfSetInitialViewParameters pdfSetInitialViewParameters = new PdfSetInitialViewParameters(); // PdfSetInitialViewParameters | A PdfsetInitialViewParameters object specifying the parameters of the action.
    try {
      PdfSetInitialViewResponse result = apiInstance.setInitialView(pdfSetInitialViewParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#setInitialView");
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
 **pdfSetInitialViewParameters** | [**PdfSetInitialViewParameters**](PdfSetInitialViewParameters.md)| A PdfsetInitialViewParameters object specifying the parameters of the action. |

### Return type

[**PdfSetInitialViewResponse**](PdfSetInitialViewResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="setPageBox"></a>
# **setPageBox**
> PdfSetPageBoxResponse setPageBox(pdfSetPageBoxParameters)

Sets pagebox to a page range from previously uploaded document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfSetPageBoxParameters pdfSetPageBoxParameters = new PdfSetPageBoxParameters(); // PdfSetPageBoxParameters | A PdfSetPageBoxParameters object specifying the parameters of the action.
    try {
      PdfSetPageBoxResponse result = apiInstance.setPageBox(pdfSetPageBoxParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#setPageBox");
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
 **pdfSetPageBoxParameters** | [**PdfSetPageBoxParameters**](PdfSetPageBoxParameters.md)| A PdfSetPageBoxParameters object specifying the parameters of the action. |

### Return type

[**PdfSetPageBoxResponse**](PdfSetPageBoxResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="setPassword"></a>
# **setPassword**
> PdfSetPasswordResponse setPassword(pdfSetPasswordParameters)

Unprotects a previously uploaded document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfSetPasswordParameters pdfSetPasswordParameters = new PdfSetPasswordParameters(); // PdfSetPasswordParameters | A PdfSetPasswordParameters object specifying the parameters of the action.
    try {
      PdfSetPasswordResponse result = apiInstance.setPassword(pdfSetPasswordParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#setPassword");
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
 **pdfSetPasswordParameters** | [**PdfSetPasswordParameters**](PdfSetPasswordParameters.md)| A PdfSetPasswordParameters object specifying the parameters of the action. |

### Return type

[**PdfSetPasswordResponse**](PdfSetPasswordResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="split"></a>
# **split**
> PdfSplitResponse split(pdfSplitParameters)

Splits a previously uploaded document into new ones.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfSplitParameters pdfSplitParameters = new PdfSplitParameters(); // PdfSplitParameters | A PdfSplitParameters object specifying the parameters of the action.
    try {
      PdfSplitResponse result = apiInstance.split(pdfSplitParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#split");
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
 **pdfSplitParameters** | [**PdfSplitParameters**](PdfSplitParameters.md)| A PdfSplitParameters object specifying the parameters of the action. |

### Return type

[**PdfSplitResponse**](PdfSplitResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="swapPages"></a>
# **swapPages**
> PdfSwapPagesResponse swapPages(pdfSwapPagesParameters)

Swaps two pages from a previously uploaded document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfSwapPagesParameters pdfSwapPagesParameters = new PdfSwapPagesParameters(); // PdfSwapPagesParameters | A PdfSwapPagesParameters object specifying the parameters of the action.
    try {
      PdfSwapPagesResponse result = apiInstance.swapPages(pdfSwapPagesParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#swapPages");
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
 **pdfSwapPagesParameters** | [**PdfSwapPagesParameters**](PdfSwapPagesParameters.md)| A PdfSwapPagesParameters object specifying the parameters of the action. |

### Return type

[**PdfSwapPagesResponse**](PdfSwapPagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="unprotect"></a>
# **unprotect**
> PdfUnprotectResponse unprotect(pdfUnprotectParameters)

Unprotects a previously uploaded document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PdfApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://passportpdfapi.com");

    PdfApi apiInstance = new PdfApi(defaultClient);
    PdfUnprotectParameters pdfUnprotectParameters = new PdfUnprotectParameters(); // PdfUnprotectParameters | A PdfUnprotectParameters object specifying the parameters of the action.
    try {
      PdfUnprotectResponse result = apiInstance.unprotect(pdfUnprotectParameters);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PdfApi#unprotect");
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
 **pdfUnprotectParameters** | [**PdfUnprotectParameters**](PdfUnprotectParameters.md)| A PdfUnprotectParameters object specifying the parameters of the action. |

### Return type

[**PdfUnprotectResponse**](PdfUnprotectResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

