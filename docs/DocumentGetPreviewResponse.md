

# DocumentGetPreviewResponse

Represents the response to a get document preview action request.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**Error**](Error.md) |  |  [optional]
**remainingTokens** | **Long** | Specifies the number of remaining tokens. |  [optional]
**pageCount** | **Integer** | Specifies the page count of the document. |  [optional] [readonly]
**thumbnailData** | **byte[]** | Specifies the data of a thumbnail from the first page of the document, in PNG format. |  [optional] [readonly]
**documentFormat** | [**DocumentFormat**](DocumentFormat.md) |  |  [optional]



