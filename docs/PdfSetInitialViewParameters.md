

# PdfSetInitialViewParameters

Represents the parameters for a set initial view action.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileId** | **String** | The identifier of the previously uploaded file to be processed. | 
**pageMode** | [**PdfInitViewPageMode**](PdfInitViewPageMode.md) |  |  [optional]
**layoutMode** | [**PdfInitViewLayoutMode**](PdfInitViewLayoutMode.md) |  |  [optional]
**nonFullScreenPageMode** | [**PdfInitViewNonFullScreenPageMode**](PdfInitViewNonFullScreenPageMode.md) |  |  [optional]
**openPage** | **Integer** | Specifies which page should be displayed when the document is opened. |  [optional]
**openZoom** | **Float** | Specifies the default zoom factor to be used when the document is opened. Value of 1 to represent the 100% zoom, 2 means 200%, 0,5 means 50%, etc. |  [optional]
**hideToolbar** | **Boolean** | A flag specifying whether to hide the viewer application’s tool bars when the document is active. Default value: false. |  [optional]
**hideMenubar** | **Boolean** | (Optional) A flag specifying whether to hide the viewer application’s menu bar when the document is active. Default value: false. |  [optional]
**hideWindowUI** | **Boolean** | (Optional) A flag specifying whether to hide user interface elements in the document’s window (such as scroll bars and navigation controls),  leaving only the document’s contents displayed. Default value: false. |  [optional]
**fitWindow** | **Boolean** | (Optional) A flag specifying whether to resize the document’s window to fit the size of the first displayed page. Default value: false. |  [optional]
**centerWindow** | **Boolean** | (Optional) A flag specifying whether to position the document’s window in the center of the screen. Default value: false. |  [optional]
**displayDocTitle** | **Boolean** | (Optional; PDF 1.4) A flag specifying whether the window’s title bar should display the document title taken from the Title entry of the document information dictionary.  If false, the title bar should instead display the name of the PDF file containing the document. Default value: false. |  [optional]



