

# PdfDrawImageParameters

Represents the parameters for a draw image action.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileId** | **String** | The identifier of the previously uploaded file to be processed. | 
**pageRange** | **String** | Specifies the page or the page range on which the image shall be drawn. | 
**imageData** | **byte[]** | Specifies the data of the image to be drawn. |  [optional]
**imageFileId** | **String** | Specifies the file ID of the image to be drawn. |  [optional]
**quality** | **Integer** | Specifies the level of quality to be used for the compression, from 1 (poorest) to 100 (greatest). |  [optional]
**colorImageCompression** | [**PdfImageCompressionScheme**](PdfImageCompressionScheme.md) |  |  [optional]
**bitonalCompression** | [**PdfImageCompressionScheme**](PdfImageCompressionScheme.md) |  |  [optional]
**imageLayout** | [**DrawableContentLayoutParameters**](DrawableContentLayoutParameters.md) |  |  [optional]



