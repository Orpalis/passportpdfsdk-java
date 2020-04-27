

# ImageAdjustParameters

Represents the parameters for an image adjustment action.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileId** | **String** | The identifier of the previously uploaded file to be processed. | 
**pageRange** | **String** | Specifies the number of the page, or the range of pages to adjust. | 
**roiLeft** | **Integer** | Specifies the left coordinate, in pixel, of the region to process. |  [optional]
**roiTop** | **Integer** | Specifies the top coordinate, in pixel, of the region to process. |  [optional]
**roiWidth** | **Integer** | Specifies the width, in pixel, of the region to process. 0 causes the entire image to be processed. |  [optional]
**roiHeight** | **Integer** | Specifies the height, in pixel, of the region to process. 0 causes the entire image to be processed. |  [optional]
**gammaCorrection** | **Integer** | Specifies the gamma correction parameter. |  [optional]
**brightness** | **Integer** | Specifies the brightness parameter. |  [optional]
**contrast** | **Integer** | Specifies the contrast parameter. |  [optional]
**saturation** | **Integer** | Specifies the saturation parameter. |  [optional]
**autoContrastEnhancement** | **Boolean** | Specifies whether the contrast shall be automatically enhanced. |  [optional]
**contrastHistogramStretch** | **Boolean** | Specifies whether a contrast histogram stretch filter shall be performed. |  [optional]



