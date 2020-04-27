

# BarcodeInfo

Represents information about a read barcode.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**BarcodeType**](BarcodeType.md) |  |  [optional]
**barcode1DSymbology** | [**Barcode1DSymbology**](Barcode1DSymbology.md) |  |  [optional]
**data** | **String** | Specifies the data contained within the barcode. |  [optional] [readonly]
**X1** | **Integer** | Specifies the horizontal top-left position of the barcode, in pixels. |  [optional] [readonly]
**X2** | **Integer** | Specifies the horizontal top-right position of the barcode, in pixels. |  [optional] [readonly]
**X3** | **Integer** | Specifies the horizontal bottom-left position of the barcode, in pixels. |  [optional] [readonly]
**X4** | **Integer** | Specifies the horizontal bottom-right position of the barcode, in pixels. |  [optional] [readonly]
**Y1** | **Integer** | Specifies the vertical top-left position of the barcode, in pixels. |  [optional] [readonly]
**Y2** | **Integer** | Specifies the vertical top-right position of the barcode, in pixels. |  [optional] [readonly]
**Y3** | **Integer** | Specifies the vertical bottom-left position of the barcode, in pixels. |  [optional] [readonly]
**Y4** | **Integer** | Specifies the vertical bottom-right position of the barcode, in pixels. |  [optional] [readonly]
**bboxLeftInches** | **Float** | Specifies the left coordinates of the bounding box of the barcode, in inches. |  [optional] [readonly]
**bboxTopInches** | **Float** | Specifies the top coordinates of the bounding box of the barcode, in inches. |  [optional] [readonly]
**bboxWidthInches** | **Float** | Specifies the width of the bounding box of the barcode, in inches. |  [optional] [readonly]
**bboxHeightInches** | **Float** | Specifies the height of the bounding box of the barcode, in inches. |  [optional] [readonly]
**pageNumber** | **Integer** | Specifies the number of the page on which the barcode was read. |  [optional] [readonly]
**pagePixelWidth** | **Integer** | Specifies the width, in pixels, of the page where the barcode has been decoded. |  [optional] [readonly]
**pagePixelHeight** | **Integer** | Specifies the height, in pixels, of the page where the barcode has been decoded. |  [optional] [readonly]
**pageHorizontalResolution** | **Float** | Specifies the horizontal resolution, in pixel per inches, of the page where the barcode has been decoded. |  [optional] [readonly]
**pageVerticalResolution** | **Float** | Specifies the vertical resolution, in pixel per inches, of the page where the barcode has been decoded. |  [optional] [readonly]



