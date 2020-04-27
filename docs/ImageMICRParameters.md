

# ImageMICRParameters

Represents the parameters for a MICR action.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileId** | **String** | The identifier of the previously uploaded file to be processed. | 
**pageRange** | **String** | Specifies the page or the range of page to be processed. | 
**font** | [**MicrFont**](MicrFont.md) |  | 
**context** | [**MicrContext**](MicrContext.md) |  | 
**whiteList** | **String** | Specifies the characters to be ignored by the recognition process. |  [optional]
**roiLeft** | **Integer** | Specifies the left coordinate, in pixel, of the region to process. |  [optional]
**roiTop** | **Integer** | Specifies the top coordinate, in pixel, of the region to process. |  [optional]
**roiWidth** | **Integer** | Specifies the width, in pixel, of the region to process. 0 causes the entire image to be processed. |  [optional]
**roiHeight** | **Integer** | Specifies the height, in pixel, of the region to process. 0 causes the entire image to be processed. |  [optional]
**expectedSymbolsCount** | **Integer** | Specifies the number of symbols expected to be detected, use 0 if unknown. |  [optional]



