

# PdfLoadDocumentResponse

Represents the response to a load document action request.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**Error**](Error.md) |  |  [optional]
**remainingTokens** | **Long** | Specifies the number of remaining tokens. |  [optional]
**fileId** | **String** | Specifies the file identifier of the loaded document. |  [optional] [readonly]
**pageCount** | **Integer** | Specifies the number of pages into the loaded document. |  [optional] [readonly]
**encryption** | [**EncryptionAlgorithm**](EncryptionAlgorithm.md) |  |  [optional]
**passwordIsRequired** | **Boolean** | Specifies if a password will be subsequently required to open the document.  Password can be provided using the SetPassword action / method. |  [optional] [readonly]
**thumbnailData** | **byte[]** | Specifies the data of a thumbnail from the first page of the document, in PNG format. Only applicable if the GetPreview field of the request has been set to true. |  [optional] [readonly]



