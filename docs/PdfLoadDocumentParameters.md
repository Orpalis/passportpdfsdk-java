

# PdfLoadDocumentParameters

Represents the parameters for importing a document as PDF.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileName** | **String** | Specifies the name of the document. |  [optional]
**password** | **String** | Specifies the password of the document. |  [optional]
**conformance** | [**PdfConformance**](PdfConformance.md) |  |  [optional]
**contentEncoding** | [**ContentEncoding**](ContentEncoding.md) |  |  [optional]
**enableColorDetection** | **Boolean** | Specifies whether color detection must be used while importing a raster format to PDF. |  [optional]
**getPreview** | **Boolean** | Specifies whether the response must contain a thumbnail of the first page of the document. |  [optional]
**thumbnailWidth** | **Integer** | Specifies, in pixels, the width of the thumbnail to be retrieved. Only applicable if GetPreview has been set to true. |  [optional]
**thumbnailHeight** | **Integer** | Specifies, in pixels, the height of the thumbnail to be retrieved.  Only applicable if GetPreview has been set to true. |  [optional]
**thumbnailBackgroundColor** | **String** | Specifies the background color of the thumbnail, using the color name (ie: \&quot;red\&quot;) or its RGBa code (ie: \&quot;rgba(255,0,0,1)\&quot;).   Only applicable if GetPreview has been set to true. |  [optional]
**thumbnailFitToPageSize** | **Boolean** | Specifies if the size of the produced thumbnail is automatically adjusted to don&#39;t have any margin.  Only applicable if GetPreview has been set to true. |  [optional]
**txtPageWidth** | **Float** | Specifies the page width, in points, of produced documents from txt files. |  [optional]
**txtPageHeight** | **Float** | Specifies the page height, in points, of produced documents from txt files. |  [optional]
**txtPageMarginLeft** | **Float** | Specifies the page margin left, in points, of produced documents from txt files. |  [optional]
**txtPageMarginTop** | **Float** | Specifies the page margin top, in points, of produced documents from txt files. |  [optional]
**txtPageMarginRight** | **Float** | Specifies the page margin right, in points, of produced documents from txt files. |  [optional]
**txtPageMarginBottom** | **Float** | Specifies the page margin bottom, in points, of produced documents from txt files. |  [optional]
**txtHorizontalTextAlignment** | [**TextAlignment**](TextAlignment.md) |  |  [optional]
**txtFontSize** | **Float** | Specifies the text size, in points, to be used for producing documents from txt files. |  [optional]
**txtFontFamily** | **String** | Specifies the name of the font to be used for producing documents from txt files. |  [optional]
**txtFontBold** | **Boolean** | Specifies whether the font to be used for producing documents from txt files must have a bold style. |  [optional]
**txtFontItalic** | **Boolean** | Specifies whether the font to be used for producing documents from txt files must have an italic style. |  [optional]



