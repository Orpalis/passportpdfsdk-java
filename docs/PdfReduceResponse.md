

# PdfReduceResponse

Represents the response to a reduce action request.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**Error**](Error.md) |  |  [optional]
**remainingTokens** | **Long** | Specifies the number of remaining tokens. |  [optional]
**errorInfo** | [**ReduceErrorInfo**](ReduceErrorInfo.md) |  |  [optional]
**warningsInfo** | [**List&lt;ReduceWarningInfo&gt;**](ReduceWarningInfo.md) | Specifies the different warnings that occured during the process of the reduce action. |  [optional] [readonly]
**contentRemoved** | **Boolean** | Specifies whether content has been removed from the PDF during the process of the reduce action. |  [optional] [readonly]
**versionChanged** | **Boolean** | Specifies whether the version of the PDF has changed during the process of the reduce action. |  [optional] [readonly]
**newFileSize** | **Long** | Specify the size of the new created document. |  [optional] [readonly]



