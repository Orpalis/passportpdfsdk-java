

# PdfConvertToPDFAParameters

Represents the parameters for a convert to PDF/A action.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileId** | **String** | The identifier of the previously uploaded file to be processed. | 
**conformance** | [**PdfAConformance**](PdfAConformance.md) |  |  [optional]
**allowVectorization** | **Boolean** | If set to true, conversion engine will use the page vectorization in case direct conversion is not possible. |  [optional]
**allowRasterization** | **Boolean** | If set to true, conversion engine will use the page rasterization in case direct conversion and verorization are not possible or allowed. |  [optional]



