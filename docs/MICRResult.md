

# MICRResult

Represents the result of a MICR operation run on a document given page.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pageNumber** | **Integer** | Specifies the number of the page on which the symbols have been detected. |  [optional]
**data** | **String** | The detected data. |  [optional]
**detectedSymbols** | [**List&lt;MICRSymbolInfo&gt;**](MICRSymbolInfo.md) | Holds detailed information about every single symbol which has been detected. |  [optional]



