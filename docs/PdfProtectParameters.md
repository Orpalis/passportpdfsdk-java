

# PdfProtectParameters

Represents the parameters for a protect action.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileId** | **String** | The identifier of the previously uploaded file to be processed. | 
**ownerPassword** | **String** | Specifies the owner password to be set. |  [optional]
**userPassword** | **String** | Specifies the user password to be set. |  [optional]
**encryption** | [**EncryptionAlgorithm**](EncryptionAlgorithm.md) |  |  [optional]
**canPrint** | **Boolean** | Allows the user to print the document, but possibly not at the highest quality level. Ignored if no encryption algorithm is set. |  [optional]
**canCopy** | **Boolean** | Allows the user to copy or extract text and graphics from the document. Ignored if the no encryption scheme is set. |  [optional]
**canModify** | **Boolean** | Allows the user to modify the document. Ignored if the no encryption scheme is set. |  [optional]
**canAddNotes** | **Boolean** | Allows the user to add annotations. Ignored if the no encryption scheme is set. |  [optional]
**canFillFields** | **Boolean** | Allows the user to fill-in form fields. Only works with 128-bit encryption. |  [optional]
**canCopyAccess** | **Boolean** | Enables copying or extracting for use with accessibility features. Only works with 128-bit encryption. |  [optional]
**canAssemble** | **Boolean** | Allows the user to assemble the document. Only works with 128-bit encryption. |  [optional]
**canPrintFull** | **Boolean** | Allows high resolution printing of the document. Only works with 128-bit encryption. |  [optional]



