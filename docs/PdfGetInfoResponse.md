

# PdfGetInfoResponse

Represents the response to a get info action request.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**Error**](Error.md) |  |  [optional]
**remainingTokens** | **Long** | Specifies the number of remaining tokens. |  [optional]
**pageCount** | **Integer** | Specifies the number of pages of the PDF. |  [optional] [readonly]
**version** | **String** | Specifies the version of the PDF. |  [optional] [readonly]
**author** | **String** | Specifies the author name specified within the PDF, if any. |  [optional] [readonly]
**title** | **String** | Specifies the document title specified within the PDF, if any. |  [optional] [readonly]
**subject** | **String** | Specifies the document subject specified within the PDF, if any. |  [optional] [readonly]
**producer** | **String** | Specifies the producer name specified within the PDF, if any. |  [optional] [readonly]
**metadata** | **String** | Specifies the metadata contained within the PDF, if any. |  [optional] [readonly]
**keywords** | **String** | Specifies the keywords associated with the PDF, if any. |  [optional] [readonly]
**hasUserPassword** | **Boolean** | Specifies if the PDF is protected with a user password. |  [optional] [readonly]
**hasOwnerPassword** | **Boolean** | Specifies if the PDF is protected with a owner password. |  [optional] [readonly]
**encryption** | [**EncryptionAlgorithm**](EncryptionAlgorithm.md) |  |  [optional]
**canPrint** | **Boolean** | Specifies if the user is allowed to print the document, but possibly not at the highest quality level. |  [optional] [readonly]
**canCopy** | **Boolean** | Specifies if the user is allowed to copy or extract text and graphics from the document. |  [optional] [readonly]
**canModify** | **Boolean** | Specifies if the user is allowed to modify the document. |  [optional] [readonly]
**canAddNotes** | **Boolean** | Specifies if the user is allowed to add annotations. |  [optional] [readonly]
**canFillFields** | **Boolean** | Specifies if the user is allowed to fill-in form fields. |  [optional] [readonly]
**canCopyAccess** | **Boolean** | Specifies if the user is allowed for copying or extracting for use with accessibility features. |  [optional] [readonly]
**canAssemble** | **Boolean** | Specifies if the user is allowed to assemble the document. |  [optional] [readonly]
**canPrintFull** | **Boolean** | Specifies if the user is allowed to print the document with high resolution. |  [optional] [readonly]



