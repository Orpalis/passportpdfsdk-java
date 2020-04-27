

# PdfDigiSignParameters

Represents the parameters for a digital signature action.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileId** | **String** | The identifier of the previously uploaded file to be processed. | 
**certificateData** | **byte[]** | Specifies the data of the digital PKCS#12 certificate file. | 
**certificatePassword** | **String** | Specifies the certificate password. | 
**signatureMode** | [**SignatureMode**](SignatureMode.md) |  |  [optional]
**signatureCertificationLevel** | [**SignatureCertificationLevel**](SignatureCertificationLevel.md) |  |  [optional]
**signatureHashAlgorithm** | [**SignatureHash**](SignatureHash.md) |  |  [optional]
**signerName** | **String** | Specifies the name of the signer. |  [optional]
**reason** | **String** | Specifies the reason of the signature. |  [optional]
**location** | **String** | Specifies the location where the signature is applied. |  [optional]
**contactInfo** | **String** | Specifies contact information about the signer. |  [optional]
**timeStampURL** | **String** | Specifies the URL of the server responsible of providing a time stamp. |  [optional]
**timeStampUserName** | **String** | Specifies the optional user name associated with the time stamp server. |  [optional]
**timeStampPassword** | **String** | Specifies the optional password associated with the time stamp server. |  [optional]
**linearize** | **Boolean** | Specifies whether the signed PDF shall be linearized. |  [optional]
**drawSignature** | **Boolean** | Specifies whether the signature shall be drawn on the document. |  [optional]
**pageNumber** | **Integer** | Specifies the number of the page on which the signature shall be drawn. |  [optional]
**showValidationMark** | **Boolean** | Specifies whether a validation mark shall be drawn with the signature. |  [optional]
**imageData** | **byte[]** | Specifies the data of the image to be drawn at the signature location. |  [optional]
**signatureLayout** | [**DrawableContentLayoutParameters**](DrawableContentLayoutParameters.md) |  |  [optional]
**signatureText** | [**PdfAlignedTextParameters**](PdfAlignedTextParameters.md) |  |  [optional]



