

# PdfAutoDeskewParameters

Represents the parameters for an auto deskew action.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileId** | **String** | The identifier of the previously uploaded file to be processed. | 
**pageRange** | **String** | Specifies the page or the page range to be auto-deskewed. | 
**maxAngleOfResearch** | **Float** | Specifies the maximum skew angle to be detected. A value of below 15 is suggested. |  [optional]
**optimistic** | **Boolean** | Specifies whether the skew detection engine must be optimistic when detecting angles.  If you know the image is skewed, you should set this to true. |  [optional]



