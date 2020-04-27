

# PdfReadBarcodesParameters

Represents the parameters for a read barcode action.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileId** | **String** | The identifier of the previously uploaded file to be processed. | 
**pageRange** | **String** | Specifies the number of the page, or the range of pages to read the barcodes from. | 
**scanMode** | [**ScanMode**](ScanMode.md) |  |  [optional]
**scanBarcode1D** | **Boolean** | Specifies whether the barcodes of type 1D shall be read. |  [optional]
**scanBarcodeQR** | **Boolean** | Specifies whether the barcodes of type QR shall be read. |  [optional]
**scanBarcodeMicroQR** | **Boolean** | Specifies whether the barcodes of type Micro QR shall be read. |  [optional]
**scanBarcodePDF417** | **Boolean** | Specifies whether the barcodes of type PDF 147 shall be read. |  [optional]
**scanBarcodeDataMatrix** | **Boolean** | Specifies whether the barcodes of type Data Matrix shall be read. |  [optional]
**scanBarcodeAztec** | **Boolean** | Specifies whether the barcodes of type Aztec shall be read. |  [optional]



