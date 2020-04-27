

# PdfSaveAsPNGParameters

Represents the parameters for a save as PNG acion.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileId** | **String** | The identifier of the previously uploaded file to be processed. | 
**pageRange** | **String** | Specifies the number of the page, or the range of pages to be saved as PNG. |  [optional]
**compression** | **Integer** | Specifies the level of compression to be used for the PNG output, between 0 (no compression - faster encoding) to 9(max compression - slower encoding). |  [optional]
**interlaced** | **Boolean** | Specifies if the produced PNG image must be interlaced. |  [optional]
**resolution** | **Float** | Specifies the resolution to be used for the rendition process. |  [optional]
**renderFormFields** | **Boolean** | Specifies whether the form fields of the PDF shall be rendered. |  [optional]
**keepRasterPDFResolution** | **Boolean** | Specifies if the initial image resolution must be kept in case of raster-pdf processing. |  [optional]



