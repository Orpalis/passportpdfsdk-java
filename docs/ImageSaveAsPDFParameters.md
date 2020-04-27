

# ImageSaveAsPDFParameters

Represents the parameters for a save as PDF action.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileId** | **String** | The identifier of the previously uploaded file to be processed. | 
**pageRange** | **String** | Specifies the number of the page, or the range of pages to be saved as PDF. |  [optional]
**conformance** | [**PdfConformance**](PdfConformance.md) |  |  [optional]
**colorImageCompression** | [**PdfImageCompressionScheme**](PdfImageCompressionScheme.md) |  |  [optional]
**bitonalImageCompression** | [**PdfImageCompressionScheme**](PdfImageCompressionScheme.md) |  |  [optional]
**enableColorDetection** | **Boolean** | Specifies is color detection must be used. |  [optional]
**imageQuality** | **Integer** | Specifies the quality to be used for the compression of the images from the PDF.  Must be in the range [0 (best compression - worst quality) - 100 (worst quality - best compression)]. |  [optional]
**downscaleResolution** | **Integer** | Specifies the resolution for downscaling images, if any. |  [optional]
**fastWebView** | **Boolean** | Specifies whether the PDF shall be optimized for online distribution. |  [optional]



