

# DocumentLoadResponse

Represents the response to a document loading action request.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**Error**](Error.md) |  |  [optional]
**remainingTokens** | **Long** | Specifies the number of remaining tokens. |  [optional]
**fileId** | **String** | Specifies the file identifier of the loaded document. |  [optional] [readonly]
**documentFormat** | [**DocumentFormat**](DocumentFormat.md) |  |  [optional]
**pageCount** | **Integer** | Specifies the number of pages into the loaded document. |  [optional] [readonly]
**thumbnailData** | **byte[]** | Specifies the data of a thumbnail from the first page of the document, in PNG format. Only applicable if the GetPreview field of the request has been set to true. |  [optional] [readonly]



