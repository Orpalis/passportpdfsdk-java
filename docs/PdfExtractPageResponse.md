

# PdfExtractPageResponse

Represents the response to an extract page action request.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**Error**](Error.md) |  |  [optional]
**remainingTokens** | **Long** | Specifies the number of remaining tokens. |  [optional]
**fileIds** | **List&lt;String&gt;** | Specifies the identifier(s) of the file(s) created as a result of the action. |  [optional] [readonly]
**fileData** | **List&lt;byte[]&gt;** | Specifies the data of the file(s) created as a result of the action. |  [optional] [readonly]



