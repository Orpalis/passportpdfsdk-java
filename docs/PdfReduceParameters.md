

# PdfReduceParameters

Represents the parameters for a reduce action.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileId** | **String** | The identifier of the previously uploaded file to be processed. | 
**outputVersion** | [**PdfVersion**](PdfVersion.md) |  |  [optional]
**imageQuality** | [**ImageQuality**](ImageQuality.md) |  |  [optional]
**recompressImages** | **Boolean** | Specifies whether the images from the PDF shall be recompressed. |  [optional]
**enableColorDetection** | **Boolean** | Specifies whether color detection must be performed on the images from the PDF. |  [optional]
**packDocument** | **Boolean** | Specifies whether the PDF shall be packed when saved in order to reduce its size. |  [optional]
**packFonts** | **Boolean** | Specifies whether the PDF fonts must be packed in order to reduce their size. |  [optional]
**downscaleImages** | **Boolean** | Specifies whether the images from the PDF shall be downscaled. |  [optional]
**downscaleResolution** | **Integer** | Specifies the resolution to be used to downscale images. |  [optional]
**fastWebView** | **Boolean** | Specifies whether the PDF shall be optimized for online distribution. |  [optional]
**removeFormFields** | **Boolean** | Specifies whether the form fields shall be removed from the PDF. |  [optional]
**removeAnnotations** | **Boolean** | Specifies whether the annotations shall be removed from the PDF. |  [optional]
**removeBookmarks** | **Boolean** | Specifies whether the bookmarks shall be removed from the PDF. |  [optional]
**removeHyperlinks** | **Boolean** | Specifies whether the hyperlinks shall be removed from the PDF. |  [optional]
**removeEmbeddedFiles** | **Boolean** | Specifies whether the embedded files shall be removed from the PDF. |  [optional]
**removeBlankPages** | **Boolean** | Specifies whether the blank pages shall be removed. |  [optional]
**removeJavaScript** | **Boolean** | Specifies whether the JavaScript shall be removed. |  [optional]
**enableJPEG2000** | **Boolean** | Specifies whether the JPEG2000 compression scheme shall be used to compress the images of the PDF. |  [optional]
**enableJBIG2** | **Boolean** | Specifies whether the JBIG2 compression scheme shall be used to compress the bitonal images of the PDF. |  [optional]
**enableCharRepair** | **Boolean** | Specifies whether characters repairing shall be performed during bitonal conversion. |  [optional]
**enableMRC** | **Boolean** | Specifies whether MRC shall be used for compressing the PDF contents. |  [optional]
**preserveSmoothing** | **Boolean** | Specifies if the MRC engine shall try to preserve smoothing between different layers. |  [optional]
**downscaleResolutionMRC** | **Integer** | Specifies the resolution for downscaling the background layer by the MRC engine, if any. |  [optional]
**removeMetadata** | **Boolean** | Specifies whether the metadata shall be removed. |  [optional]
**removePageThumbnails** | **Boolean** | Specifies whether the page thumbnails shall be removed. |  [optional]
**removePagePieceInfo** | **Boolean** | Specifies whether the page PieceInfo dictionary used to hold private application data shall be removed. |  [optional]
**jbIG2PMSThreshold** | **Float** | Specifies the threshold value for the JBIG2 encoder pattern matching and substitution between 0 and 1. Any number lower than 1 may lead to lossy compression. |  [optional]



