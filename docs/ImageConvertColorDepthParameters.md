

# ImageConvertColorDepthParameters

Represents the parameters for an image color depth change action.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileId** | **String** | The identifier of the previously uploaded file to be processed. | 
**pageRange** | **String** | Specifies the number of the page, or the range of pages to process. | 
**convertColorDepthMode** | [**ColorDepthConversionMethod**](ColorDepthConversionMethod.md) |  | 
**depth1BppOtsuThreshold** | **Integer** | Specifies the threshold for a conversion using the Depth1BppOtsu method. |  [optional]
**depth1BppBradleyThreshold** | **Integer** | Specifies the threshold for a conversion using the Depth1BppBradley method. |  [optional]
**depth1BppSauvolaFactor** | **Float** | Specifies the factor for a conversion using the Depth1BppSauvola method. |  [optional]



