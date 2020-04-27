

# PdfSaveAsTIFFParameters

Represents the parameters for a save as TIFF action.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileId** | **String** | The identifier of the previously uploaded file to be processed. | 
**pageRange** | **String** | Specifies the number of the page, or the range of pages to be saved as TIFF. |  [optional]
**compression** | [**TiffSaveCompression**](TiffSaveCompression.md) |  |  [optional]
**jpegQuality** | **Integer** | Specifies the level of quality to be used if JPEG compression is used, from 1 (poorest) to 100 (greatest). |  [optional]
**useCMYK** | **Boolean** | Specifies whether the TIFF shall be saved in CMYK color space or not. |  [optional]
**resolution** | **Float** | Specifies the resolution to be used for the rendition process. |  [optional]
**renderFormFields** | **Boolean** | Specifies whether the form fields of the PDF shall be rendered. |  [optional]
**keepRasterPDFResolution** | **Boolean** | Specifies whether the initial image resolution must be kept in case of raster-pdf processing. |  [optional]



