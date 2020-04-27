

# ImageSaveAsPDFMRCParameters

Represents the parameters for a save as PDF MRC action.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileId** | **String** | The identifier of the previously uploaded file to be processed. | 
**pageRange** | **String** | Specifies the number of the page, or the range of pages to be saved as PDF MRC. |  [optional]
**conformance** | [**PdfConformance**](PdfConformance.md) |  |  [optional]
**colorImageCompression** | [**PdfImageCompressionScheme**](PdfImageCompressionScheme.md) |  |  [optional]
**bitonalImageCompression** | [**PdfImageCompressionScheme**](PdfImageCompressionScheme.md) |  |  [optional]
**imageQuality** | **Integer** | Specifies the quality to be used for the compression of the images from the PDF.  Must be in the range [0 (best compression - worst quality) - 100 (worst quality - best compression)]. |  [optional]
**downscaleResolution** | **Integer** | Specifies the resolution for downscaling the background layer, if any. |  [optional]
**preserveSmoothing** | **Boolean** | Specifies whether the MRC engine should try to preserve smoothing between different layers.   Enabling this option should globally enhance the text quality but also reduce the compression rate. |  [optional]
**fastWebView** | **Boolean** | Specifies whether the PDF shall be optimized for online distribution. |  [optional]
**jbIG2PMSThreshold** | **Float** | Specifies the threshold value for the JBIG2 encoder pattern matching and substitution between 0 and 1. Any number lower than 1 may lead to lossy compression. |  [optional]



