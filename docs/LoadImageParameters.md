

# LoadImageParameters

Represents the parameters for importing an image.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileName** | **String** | Specifies the name of the document. |  [optional]
**contentEncoding** | [**ContentEncoding**](ContentEncoding.md) |  |  [optional]
**getPreview** | **Boolean** | Specifies whether the response must contain a thumbnail of the first page of the document. |  [optional]
**thumbnailWidth** | **Integer** | Specifies, in pixels, the width of the thumbnail to be retrieved. Only applicable if GetPreview has been set to true. |  [optional]
**thumbnailHeight** | **Integer** | Specifies, in pixels, the height of the thumbnail to be retrieved.  Only applicable if GetPreview has been set to true. |  [optional]
**thumbnailBackgroundColor** | **String** | Specifies the background color of the thumbnail, using the color name (ie: \&quot;red\&quot;) or its RGBa code (ie: \&quot;rgba(255,0,0,1)\&quot;).   Only applicable if GetPreview has been set to true. |  [optional]
**thumbnailFitToPageSize** | **Boolean** | Specifies if the size of the produced thumbnail is automatically adjusted to don&#39;t have any margin.  Only applicable if GetPreview has been set to true. |  [optional]



