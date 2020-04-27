/*
 * PassportPDF API
 * Another brick in the cloud
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import java.io.File;
import org.openapitools.client.model.PdfAnnotateParameters;
import org.openapitools.client.model.PdfAnnotateResponse;
import org.openapitools.client.model.PdfAutoDeskewParameters;
import org.openapitools.client.model.PdfAutoDeskewResponse;
import org.openapitools.client.model.PdfClearPageParameters;
import org.openapitools.client.model.PdfClearPageResponse;
import org.openapitools.client.model.PdfClonePageParameters;
import org.openapitools.client.model.PdfClonePageResponse;
import org.openapitools.client.model.PdfCloseDocumentParameters;
import org.openapitools.client.model.PdfCloseDocumentResponse;
import org.openapitools.client.model.PdfConvertToPDFAParameters;
import org.openapitools.client.model.PdfConvertToPDFAResponse;
import org.openapitools.client.model.PdfDeletePageParameters;
import org.openapitools.client.model.PdfDeletePageResponse;
import org.openapitools.client.model.PdfDetectPageOrientationParameters;
import org.openapitools.client.model.PdfDetectPageOrientationResponse;
import org.openapitools.client.model.PdfDigiSignParameters;
import org.openapitools.client.model.PdfDigiSignResponse;
import org.openapitools.client.model.PdfDrawImageParameters;
import org.openapitools.client.model.PdfDrawImageResponse;
import org.openapitools.client.model.PdfExtractPageParameters;
import org.openapitools.client.model.PdfExtractPageResponse;
import org.openapitools.client.model.PdfExtractTextParameters;
import org.openapitools.client.model.PdfExtractTextResponse;
import org.openapitools.client.model.PdfFlattenParameters;
import org.openapitools.client.model.PdfFlattenResponse;
import org.openapitools.client.model.PdfGetInfoParameters;
import org.openapitools.client.model.PdfGetInfoResponse;
import org.openapitools.client.model.PdfGetPageThumbnailParameters;
import org.openapitools.client.model.PdfGetPageThumbnailResponse;
import org.openapitools.client.model.PdfInsertImageParameters;
import org.openapitools.client.model.PdfInsertImageResponse;
import org.openapitools.client.model.PdfInsertNewPageParameters;
import org.openapitools.client.model.PdfInsertNewPageResponse;
import org.openapitools.client.model.PdfInsertPageNumberParameters;
import org.openapitools.client.model.PdfInsertPageNumberResponse;
import org.openapitools.client.model.PdfInsertTextParameters;
import org.openapitools.client.model.PdfInsertTextResponse;
import org.openapitools.client.model.PdfLinearizeParameters;
import org.openapitools.client.model.PdfLinearizeResponse;
import org.openapitools.client.model.PdfLoadDocumentFromByteArrayParameters;
import org.openapitools.client.model.PdfLoadDocumentParameters;
import org.openapitools.client.model.PdfLoadDocumentResponse;
import org.openapitools.client.model.PdfMergePagesParameters;
import org.openapitools.client.model.PdfMergePagesResponse;
import org.openapitools.client.model.PdfMergeParameters;
import org.openapitools.client.model.PdfMergeResponse;
import org.openapitools.client.model.PdfMovePageParameters;
import org.openapitools.client.model.PdfMovePageResponse;
import org.openapitools.client.model.PdfOCRParameters;
import org.openapitools.client.model.PdfOCRResponse;
import org.openapitools.client.model.PdfProtectParameters;
import org.openapitools.client.model.PdfProtectResponse;
import org.openapitools.client.model.PdfReadBarcodesParameters;
import org.openapitools.client.model.PdfReduceParameters;
import org.openapitools.client.model.PdfReduceResponse;
import org.openapitools.client.model.PdfRemovePageFormFieldsParameters;
import org.openapitools.client.model.PdfRemovePageFormFieldsResponse;
import org.openapitools.client.model.PdfRemoveTextParameters;
import org.openapitools.client.model.PdfRemoveTextResponse;
import org.openapitools.client.model.PdfReorderPagesParameters;
import org.openapitools.client.model.PdfReorderPagesResponse;
import org.openapitools.client.model.PdfRepairDocumentParameters;
import org.openapitools.client.model.PdfRepairDocumentResponse;
import org.openapitools.client.model.PdfRotatePageStandardParameters;
import org.openapitools.client.model.PdfRotatePageStandardResponse;
import org.openapitools.client.model.PdfSaveAsJPEGParameters;
import org.openapitools.client.model.PdfSaveAsJPEGResponse;
import org.openapitools.client.model.PdfSaveAsPNGParameters;
import org.openapitools.client.model.PdfSaveAsPNGResponse;
import org.openapitools.client.model.PdfSaveAsTIFFMultipageParameters;
import org.openapitools.client.model.PdfSaveAsTIFFMultipageResponse;
import org.openapitools.client.model.PdfSaveAsTIFFParameters;
import org.openapitools.client.model.PdfSaveAsTIFFResponse;
import org.openapitools.client.model.PdfSaveDocumentParameters;
import org.openapitools.client.model.PdfSaveDocumentResponse;
import org.openapitools.client.model.PdfScalePageParameters;
import org.openapitools.client.model.PdfScalePageResponse;
import org.openapitools.client.model.PdfSetInfoParameters;
import org.openapitools.client.model.PdfSetInfoResponse;
import org.openapitools.client.model.PdfSetInitialViewParameters;
import org.openapitools.client.model.PdfSetInitialViewResponse;
import org.openapitools.client.model.PdfSetPageBoxParameters;
import org.openapitools.client.model.PdfSetPageBoxResponse;
import org.openapitools.client.model.PdfSetPasswordParameters;
import org.openapitools.client.model.PdfSetPasswordResponse;
import org.openapitools.client.model.PdfSplitParameters;
import org.openapitools.client.model.PdfSplitResponse;
import org.openapitools.client.model.PdfSwapPagesParameters;
import org.openapitools.client.model.PdfSwapPagesResponse;
import org.openapitools.client.model.PdfUnprotectParameters;
import org.openapitools.client.model.PdfUnprotectResponse;
import org.openapitools.client.model.ReadBarcodesResponse;
import org.openapitools.client.model.StringArrayResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PdfApi
 */
@Ignore
public class PdfApiTest {

    private final PdfApi api = new PdfApi();

    
    /**
     * Annotates a previously uploaded document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void annotateTest() throws ApiException {
        PdfAnnotateParameters pdfAnnotateParameters = null;
        PdfAnnotateResponse response = api.annotate(pdfAnnotateParameters);

        // TODO: test validations
    }
    
    /**
     * Performs auto deskew on a page range of a previously uploaded document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void autoDeskewTest() throws ApiException {
        PdfAutoDeskewParameters pdfAutoDeskewParameters = null;
        PdfAutoDeskewResponse response = api.autoDeskew(pdfAutoDeskewParameters);

        // TODO: test validations
    }
    
    /**
     * Clears a page range from a previously uploaded document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clearPageTest() throws ApiException {
        PdfClearPageParameters pdfClearPageParameters = null;
        PdfClearPageResponse response = api.clearPage(pdfClearPageParameters);

        // TODO: test validations
    }
    
    /**
     * Clones specific pages from a previously uploaded document to another previously uploaded document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clonePageTest() throws ApiException {
        PdfClonePageParameters pdfClonePageParameters = null;
        PdfClonePageResponse response = api.clonePage(pdfClonePageParameters);

        // TODO: test validations
    }
    
    /**
     * Closes a previously uploaded document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void closePDFTest() throws ApiException {
        PdfCloseDocumentParameters pdfCloseDocumentParameters = null;
        PdfCloseDocumentResponse response = api.closePDF(pdfCloseDocumentParameters);

        // TODO: test validations
    }
    
    /**
     * Converts a previously uploaded document to PDF/A.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertToPDFATest() throws ApiException {
        PdfConvertToPDFAParameters pdfConvertToPDFAParameters = null;
        PdfConvertToPDFAResponse response = api.convertToPDFA(pdfConvertToPDFAParameters);

        // TODO: test validations
    }
    
    /**
     * Deletes a page range from a previously uploaded document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePageTest() throws ApiException {
        PdfDeletePageParameters pdfDeletePageParameters = null;
        PdfDeletePageResponse response = api.deletePage(pdfDeletePageParameters);

        // TODO: test validations
    }
    
    /**
     * Detects the orientation of the page(s) of a previously uploaded document and offers to automatically rotate them.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void detectPageOrientationTest() throws ApiException {
        PdfDetectPageOrientationParameters pdfDetectPageOrientationParameters = null;
        PdfDetectPageOrientationResponse response = api.detectPageOrientation(pdfDetectPageOrientationParameters);

        // TODO: test validations
    }
    
    /**
     * Signs a previously uploaded document digitally.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void digiSignTest() throws ApiException {
        PdfDigiSignParameters pdfDigiSignParameters = null;
        PdfDigiSignResponse response = api.digiSign(pdfDigiSignParameters);

        // TODO: test validations
    }
    
    /**
     * Draws an image on a page range of a previously uploaded document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void drawImageTest() throws ApiException {
        PdfDrawImageParameters pdfDrawImageParameters = null;
        PdfDrawImageResponse response = api.drawImage(pdfDrawImageParameters);

        // TODO: test validations
    }
    
    /**
     * Extracts a page range from a previously uploaded document into one or several new documents.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void extractPageTest() throws ApiException {
        PdfExtractPageParameters pdfExtractPageParameters = null;
        PdfExtractPageResponse response = api.extractPage(pdfExtractPageParameters);

        // TODO: test validations
    }
    
    /**
     * Extracts text from the document pages.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void extractTextTest() throws ApiException {
        PdfExtractTextParameters pdfExtractTextParameters = null;
        PdfExtractTextResponse response = api.extractText(pdfExtractTextParameters);

        // TODO: test validations
    }
    
    /**
     * Flattens the form-fields, annotations, and/or the layers of a previously uploaded document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void flattenTest() throws ApiException {
        PdfFlattenParameters pdfFlattenParameters = null;
        PdfFlattenResponse response = api.flatten(pdfFlattenParameters);

        // TODO: test validations
    }
    
    /**
     * Gets information about a previously uploaded document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInfoTest() throws ApiException {
        PdfGetInfoParameters pdfGetInfoParameters = null;
        PdfGetInfoResponse response = api.getInfo(pdfGetInfoParameters);

        // TODO: test validations
    }
    
    /**
     * Gets the supported file extensions by the LoadDocumentAsPDF action.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPDFImportSupportedFileExtensionsTest() throws ApiException {
        StringArrayResponse response = api.getPDFImportSupportedFileExtensions();

        // TODO: test validations
    }
    
    /**
     * Gets a thumbnail of each page within the provided page range from a previously uploaded document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPageThumbnailTest() throws ApiException {
        PdfGetPageThumbnailParameters pdfGetPageThumbnailParameters = null;
        PdfGetPageThumbnailResponse response = api.getPageThumbnail(pdfGetPageThumbnailParameters);

        // TODO: test validations
    }
    
    /**
     * Inserts an image on a new page of a previously uploaded document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void insertImageTest() throws ApiException {
        PdfInsertImageParameters pdfInsertImageParameters = null;
        PdfInsertImageResponse response = api.insertImage(pdfInsertImageParameters);

        // TODO: test validations
    }
    
    /**
     * Inserts one or more new blank pages to a specific position in a previously uploaded document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void insertNewPageTest() throws ApiException {
        PdfInsertNewPageParameters pdfInsertNewPageParameters = null;
        PdfInsertNewPageResponse response = api.insertNewPage(pdfInsertNewPageParameters);

        // TODO: test validations
    }
    
    /**
     * Inserts page number(s) on a document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void insertPageNumberTest() throws ApiException {
        PdfInsertPageNumberParameters pdfInsertPageNumberParameters = null;
        PdfInsertPageNumberResponse response = api.insertPageNumber(pdfInsertPageNumberParameters);

        // TODO: test validations
    }
    
    /**
     * Inserts text on a document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void insertTextTest() throws ApiException {
        PdfInsertTextParameters pdfInsertTextParameters = null;
        PdfInsertTextResponse response = api.insertText(pdfInsertTextParameters);

        // TODO: test validations
    }
    
    /**
     * Linearizes a previously uploaded document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void linearizeTest() throws ApiException {
        PdfLinearizeParameters pdfLinearizeParameters = null;
        PdfLinearizeResponse response = api.linearize(pdfLinearizeParameters);

        // TODO: test validations
    }
    
    /**
     * Imports the provided document as PDF.  Supported document formats can be retrieved by the GetPDFImportSupportedFileExtensions action.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void loadDocumentAsPDFTest() throws ApiException {
        PdfLoadDocumentFromByteArrayParameters pdfLoadDocumentFromByteArrayParameters = null;
        PdfLoadDocumentResponse response = api.loadDocumentAsPDF(pdfLoadDocumentFromByteArrayParameters);

        // TODO: test validations
    }
    
    /**
     * Imports the provided document as PDF using Multipart Upload.  Supported document formats can be retrieved by the GetPDFImportSupportedFileExtensions action.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void loadDocumentAsPDFMultipartTest() throws ApiException {
        File fileData = null;
        PdfLoadDocumentParameters loadDocumentParameters = null;
        PdfLoadDocumentResponse response = api.loadDocumentAsPDFMultipart(fileData, loadDocumentParameters);

        // TODO: test validations
    }
    
    /**
     * Merges several previously uploaded documents into a new PDF.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergeTest() throws ApiException {
        PdfMergeParameters pdfMergeParameters = null;
        PdfMergeResponse response = api.merge(pdfMergeParameters);

        // TODO: test validations
    }
    
    /**
     * Merges multiple pages, vertically, within a previously uploaded document into one single page.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergePagesTest() throws ApiException {
        PdfMergePagesParameters pdfMergePagesParameters = null;
        PdfMergePagesResponse response = api.mergePages(pdfMergePagesParameters);

        // TODO: test validations
    }
    
    /**
     * Moves a page range from a previously uploaded document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void movePageTest() throws ApiException {
        PdfMovePageParameters pdfMovePageParameters = null;
        PdfMovePageResponse response = api.movePage(pdfMovePageParameters);

        // TODO: test validations
    }
    
    /**
     * Performs optical character recognition on a page range of a previously uploaded document.  The recognized text is added as invisible text on each processed page.  No token is charged for blank pages.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oCRTest() throws ApiException {
        PdfOCRParameters pdfOCRParameters = null;
        PdfOCRResponse response = api.oCR(pdfOCRParameters);

        // TODO: test validations
    }
    
    /**
     * Protects a previously uploaded document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void protectTest() throws ApiException {
        PdfProtectParameters pdfProtectParameters = null;
        PdfProtectResponse response = api.protect(pdfProtectParameters);

        // TODO: test validations
    }
    
    /**
     * Reads barcodes from a previously uploaded document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readBarcodesTest() throws ApiException {
        PdfReadBarcodesParameters pdfReadBarcodesParameters = null;
        ReadBarcodesResponse response = api.readBarcodes(pdfReadBarcodesParameters);

        // TODO: test validations
    }
    
    /**
     * Reduces the size of a previously uploaded document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reduceTest() throws ApiException {
        PdfReduceParameters pdfReduceParameters = null;
        PdfReduceResponse response = api.reduce(pdfReduceParameters);

        // TODO: test validations
    }
    
    /**
     * Removes the form fields from a page range of a previously uploaded document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removePageFormFieldsTest() throws ApiException {
        PdfRemovePageFormFieldsParameters pdfRemovePageFormFieldsParameters = null;
        PdfRemovePageFormFieldsResponse response = api.removePageFormFields(pdfRemovePageFormFieldsParameters);

        // TODO: test validations
    }
    
    /**
     * Removes text (all text or only invisible one) from a previously uploaded PDF.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeTextTest() throws ApiException {
        PdfRemoveTextParameters pdfRemoveTextParameters = null;
        PdfRemoveTextResponse response = api.removeText(pdfRemoveTextParameters);

        // TODO: test validations
    }
    
    /**
     * Reorders pages of a previously uploaded document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reorderPagesTest() throws ApiException {
        PdfReorderPagesParameters pdfReorderPagesParameters = null;
        PdfReorderPagesResponse response = api.reorderPages(pdfReorderPagesParameters);

        // TODO: test validations
    }
    
    /**
     * Repairs a previously uploaded PDF document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void repairDocumentTest() throws ApiException {
        PdfRepairDocumentParameters pdfRepairDocumentParameters = null;
        PdfRepairDocumentResponse response = api.repairDocument(pdfRepairDocumentParameters);

        // TODO: test validations
    }
    
    /**
     * Rotates (standardly) a page range from a previously uploaded document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rotatePageStandardTest() throws ApiException {
        PdfRotatePageStandardParameters pdfRotatePageStandardParameters = null;
        PdfRotatePageStandardResponse response = api.rotatePageStandard(pdfRotatePageStandardParameters);

        // TODO: test validations
    }
    
    /**
     * Saves a previously uploaded document as JPEG, and sends the file data in a JSON-serialized object.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveAsJPEGTest() throws ApiException {
        PdfSaveAsJPEGParameters pdfSaveAsJPEGParameters = null;
        PdfSaveAsJPEGResponse response = api.saveAsJPEG(pdfSaveAsJPEGParameters);

        // TODO: test validations
    }
    
    /**
     * Saves a previously uploaded document as JPEG, and streams the file binary data to the response (this is the most efficient download method).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveAsJPEGFileTest() throws ApiException {
        PdfSaveAsJPEGParameters pdfSaveAsJPEGParameters = null;
        File response = api.saveAsJPEGFile(pdfSaveAsJPEGParameters);

        // TODO: test validations
    }
    
    /**
     * Saves a previously uploaded document as PNG, and sends the file data in a JSON-serialized object.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveAsPNGTest() throws ApiException {
        PdfSaveAsPNGParameters pdfSaveAsPNGParameters = null;
        PdfSaveAsPNGResponse response = api.saveAsPNG(pdfSaveAsPNGParameters);

        // TODO: test validations
    }
    
    /**
     * Saves a previously uploaded document as PNG, and streams the file binary data to the response (this is the most efficient download method).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveAsPNGFileTest() throws ApiException {
        PdfSaveAsPNGParameters pdfSaveAsPNGParameters = null;
        File response = api.saveAsPNGFile(pdfSaveAsPNGParameters);

        // TODO: test validations
    }
    
    /**
     * Saves a previously uploaded document as TIFF, and sends the file data in a JSON-serialized object.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveAsTIFFTest() throws ApiException {
        PdfSaveAsTIFFParameters pdfSaveAsTIFFParameters = null;
        PdfSaveAsTIFFResponse response = api.saveAsTIFF(pdfSaveAsTIFFParameters);

        // TODO: test validations
    }
    
    /**
     * Saves a previously uploaded document as TIFF, and streams the file binary data to the response (this is the most efficient download method).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveAsTIFFFileTest() throws ApiException {
        PdfSaveAsTIFFParameters pdfSaveAsTIFFParameters = null;
        File response = api.saveAsTIFFFile(pdfSaveAsTIFFParameters);

        // TODO: test validations
    }
    
    /**
     * Saves a previously uploaded document as multipage TIFF, and sends the file data in a JSON-serialized object.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveAsTIFFMultipageTest() throws ApiException {
        PdfSaveAsTIFFMultipageParameters pdfSaveAsTIFFMultipageParameters = null;
        PdfSaveAsTIFFMultipageResponse response = api.saveAsTIFFMultipage(pdfSaveAsTIFFMultipageParameters);

        // TODO: test validations
    }
    
    /**
     * Saves a previously uploaded document as multipage TIFF, and streams the file binary data to the response (this is the most efficient download method).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveAsTIFFMultipageFileTest() throws ApiException {
        PdfSaveAsTIFFMultipageParameters pdfSaveAsTIFFMultipageParameters = null;
        File response = api.saveAsTIFFMultipageFile(pdfSaveAsTIFFMultipageParameters);

        // TODO: test validations
    }
    
    /**
     * Saves a previously uploaded document as PDF, and sends the file data in a JSON-serialized object.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveDocumentTest() throws ApiException {
        PdfSaveDocumentParameters pdfSaveDocumentParameters = null;
        PdfSaveDocumentResponse response = api.saveDocument(pdfSaveDocumentParameters);

        // TODO: test validations
    }
    
    /**
     * Saves a previously uploaded document as PDF, and streams the file binary data to the response (this is the most efficient download method).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveDocumentToFileTest() throws ApiException {
        PdfSaveDocumentParameters pdfSaveDocumentParameters = null;
        File response = api.saveDocumentToFile(pdfSaveDocumentParameters);

        // TODO: test validations
    }
    
    /**
     * Scales a page range from a previously uploaded document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void scalePageTest() throws ApiException {
        PdfScalePageParameters pdfScalePageParameters = null;
        PdfScalePageResponse response = api.scalePage(pdfScalePageParameters);

        // TODO: test validations
    }
    
    /**
     * Sets information to a previously uploaded document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setInfoTest() throws ApiException {
        PdfSetInfoParameters pdfSetInfoParameters = null;
        PdfSetInfoResponse response = api.setInfo(pdfSetInfoParameters);

        // TODO: test validations
    }
    
    /**
     * Sets various document level initial view options to a previously uploaded document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setInitialViewTest() throws ApiException {
        PdfSetInitialViewParameters pdfSetInitialViewParameters = null;
        PdfSetInitialViewResponse response = api.setInitialView(pdfSetInitialViewParameters);

        // TODO: test validations
    }
    
    /**
     * Sets pagebox to a page range from previously uploaded document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setPageBoxTest() throws ApiException {
        PdfSetPageBoxParameters pdfSetPageBoxParameters = null;
        PdfSetPageBoxResponse response = api.setPageBox(pdfSetPageBoxParameters);

        // TODO: test validations
    }
    
    /**
     * Unprotects a previously uploaded document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setPasswordTest() throws ApiException {
        PdfSetPasswordParameters pdfSetPasswordParameters = null;
        PdfSetPasswordResponse response = api.setPassword(pdfSetPasswordParameters);

        // TODO: test validations
    }
    
    /**
     * Splits a previously uploaded document into new ones.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void splitTest() throws ApiException {
        PdfSplitParameters pdfSplitParameters = null;
        PdfSplitResponse response = api.split(pdfSplitParameters);

        // TODO: test validations
    }
    
    /**
     * Swaps two pages from a previously uploaded document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void swapPagesTest() throws ApiException {
        PdfSwapPagesParameters pdfSwapPagesParameters = null;
        PdfSwapPagesResponse response = api.swapPages(pdfSwapPagesParameters);

        // TODO: test validations
    }
    
    /**
     * Unprotects a previously uploaded document.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void unprotectTest() throws ApiException {
        PdfUnprotectParameters pdfUnprotectParameters = null;
        PdfUnprotectResponse response = api.unprotect(pdfUnprotectParameters);

        // TODO: test validations
    }
    
}