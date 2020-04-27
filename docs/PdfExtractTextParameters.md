

# PdfExtractTextParameters

Represents the parameters for an extract text action.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileId** | **String** | The identifier of the previously uploaded file to be processed. | 
**pageRange** | **String** | Specifies the number of the page, or the range of pages to extract text from. | 
**textExtractionMode** | [**PdfExtractTextMode**](PdfExtractTextMode.md) |  |  [optional]
**textExtractionAreaLeft** | **Float** | Specifies the left coordinate of the text extraction area for the PageAreaFormated extract mode. |  [optional]
**textExtractionAreaTop** | **Float** | Specifies the top coordinate of the text extraction area for the PageAreaFormated extract mode. |  [optional]
**textExtractionAreaWidth** | **Float** | Specifies the width of the text extraction area for the PageAreaFormated extract mode. |  [optional]
**textExtractionAreaHeight** | **Float** | Specifies the height of the text extraction area for the PageAreaFormated extract mode. |  [optional]
**includeHeader** | **Boolean** | Specifies whether the CSV output should include header information. |  [optional]



