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
import org.openapitools.client.model.ImageAdjustParameters;
import org.openapitools.client.model.ImageAdjustResponse;
import org.openapitools.client.model.ImageAutoCropParameters;
import org.openapitools.client.model.ImageAutoCropResponse;
import org.openapitools.client.model.ImageCleanupDocumentParameters;
import org.openapitools.client.model.ImageCleanupDocumentResponse;
import org.openapitools.client.model.ImageCloneRegionsParameters;
import org.openapitools.client.model.ImageCloneRegionsResponse;
import org.openapitools.client.model.ImageCloseParameters;
import org.openapitools.client.model.ImageCloseResponse;
import org.openapitools.client.model.ImageConvertColorDepthParameters;
import org.openapitools.client.model.ImageConvertColorDepthResponse;
import org.openapitools.client.model.ImageCropParameters;
import org.openapitools.client.model.ImageCropResponse;
import org.openapitools.client.model.ImageDeletePageParameters;
import org.openapitools.client.model.ImageDeletePageResponse;
import org.openapitools.client.model.ImageDetectBlankPagesParameters;
import org.openapitools.client.model.ImageDetectBlankPagesResponse;
import org.openapitools.client.model.ImageDetectColorParameters;
import org.openapitools.client.model.ImageDetectColorResponse;
import org.openapitools.client.model.ImageDetectPageOrientationParameters;
import org.openapitools.client.model.ImageDetectPageOrientationResponse;
import org.openapitools.client.model.ImageFilterParameters;
import org.openapitools.client.model.ImageFilterResponse;
import org.openapitools.client.model.ImageGetPageThumbnailParameters;
import org.openapitools.client.model.ImageGetPageThumbnailResponse;
import org.openapitools.client.model.ImageLoadResponse;
import org.openapitools.client.model.ImageMICRParameters;
import org.openapitools.client.model.ImageMICRResponse;
import org.openapitools.client.model.ImageReadBarcodesParameters;
import org.openapitools.client.model.ImageResizeParameters;
import org.openapitools.client.model.ImageResizeResponse;
import org.openapitools.client.model.ImageRotateParameters;
import org.openapitools.client.model.ImageRotateResponse;
import org.openapitools.client.model.ImageSaveAsJPEGParameters;
import org.openapitools.client.model.ImageSaveAsJPEGResponse;
import org.openapitools.client.model.ImageSaveAsPDFMRCParameters;
import org.openapitools.client.model.ImageSaveAsPDFMRCResponse;
import org.openapitools.client.model.ImageSaveAsPDFParameters;
import org.openapitools.client.model.ImageSaveAsPDFResponse;
import org.openapitools.client.model.ImageSaveAsPNGParameters;
import org.openapitools.client.model.ImageSaveAsPNGResponse;
import org.openapitools.client.model.ImageSaveAsTIFFMultipageParameters;
import org.openapitools.client.model.ImageSaveAsTIFFMultipageResponse;
import org.openapitools.client.model.ImageSaveAsTIFFParameters;
import org.openapitools.client.model.ImageSaveAsTIFFResponse;
import org.openapitools.client.model.ImageSwapPagesParameters;
import org.openapitools.client.model.ImageSwapPagesResponse;
import org.openapitools.client.model.LoadImageFromByteArrayParameters;
import org.openapitools.client.model.LoadImageParameters;
import org.openapitools.client.model.ReadBarcodesResponse;
import org.openapitools.client.model.StringArrayResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ImageApi
 */
@Ignore
public class ImageApiTest {

    private final ImageApi api = new ImageApi();

    
    /**
     * Adjusts a previously uploaded image.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageAdjustTest() throws ApiException {
        ImageAdjustParameters imageAdjustParameters = null;
        ImageAdjustResponse response = api.imageAdjust(imageAdjustParameters);

        // TODO: test validations
    }
    
    /**
     * Automatically crops a previously uploaded image.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageAutoCropTest() throws ApiException {
        ImageAutoCropParameters imageAutoCropParameters = null;
        ImageAutoCropResponse response = api.imageAutoCrop(imageAutoCropParameters);

        // TODO: test validations
    }
    
    /**
     * Cleanup a previously uploaded image.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageCleanupDocumentTest() throws ApiException {
        ImageCleanupDocumentParameters imageCleanupDocumentParameters = null;
        ImageCleanupDocumentResponse response = api.imageCleanupDocument(imageCleanupDocumentParameters);

        // TODO: test validations
    }
    
    /**
     * Clones regions from a previously uploaded image into new images.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageCloneRegionsTest() throws ApiException {
        ImageCloneRegionsParameters imageCloneRegionsParameters = null;
        ImageCloneRegionsResponse response = api.imageCloneRegions(imageCloneRegionsParameters);

        // TODO: test validations
    }
    
    /**
     * Closes a previously uploaded image.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageCloseTest() throws ApiException {
        ImageCloseParameters imageCloseParameters = null;
        ImageCloseResponse response = api.imageClose(imageCloseParameters);

        // TODO: test validations
    }
    
    /**
     * Converts the color depth of a previously uploaded image.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageConvertColorDepthTest() throws ApiException {
        ImageConvertColorDepthParameters imageConvertColorDepthParameters = null;
        ImageConvertColorDepthResponse response = api.imageConvertColorDepth(imageConvertColorDepthParameters);

        // TODO: test validations
    }
    
    /**
     * Crops a previously uploaded image.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageCropTest() throws ApiException {
        ImageCropParameters imageCropParameters = null;
        ImageCropResponse response = api.imageCrop(imageCropParameters);

        // TODO: test validations
    }
    
    /**
     * Deletes a page range from a previously uploaded image.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageDeletePageTest() throws ApiException {
        ImageDeletePageParameters imageDeletePageParameters = null;
        ImageDeletePageResponse response = api.imageDeletePage(imageDeletePageParameters);

        // TODO: test validations
    }
    
    /**
     * Detects the blank page(s) from a previously uploaded image and offers to remove them.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageDetectBlankPagesTest() throws ApiException {
        ImageDetectBlankPagesParameters imageDetectBlankPagesParameters = null;
        ImageDetectBlankPagesResponse response = api.imageDetectBlankPages(imageDetectBlankPagesParameters);

        // TODO: test validations
    }
    
    /**
     * Performs color detection  on a previously uploaded image.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageDetectColorTest() throws ApiException {
        ImageDetectColorParameters imageDetectColorParameters = null;
        ImageDetectColorResponse response = api.imageDetectColor(imageDetectColorParameters);

        // TODO: test validations
    }
    
    /**
     * Detects the orientation of the page(s) of a previously uploaded image and offers to automatically rotate them.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageDetectPageOrientationTest() throws ApiException {
        ImageDetectPageOrientationParameters imageDetectPageOrientationParameters = null;
        ImageDetectPageOrientationResponse response = api.imageDetectPageOrientation(imageDetectPageOrientationParameters);

        // TODO: test validations
    }
    
    /**
     * Applies filters to a previously uploaded image.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageFilterTest() throws ApiException {
        ImageFilterParameters imageFilterParameters = null;
        ImageFilterResponse response = api.imageFilter(imageFilterParameters);

        // TODO: test validations
    }
    
    /**
     * Gets a thumbnail of each page within the provided page range from a previously uploaded image.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageGetPageThumbnailTest() throws ApiException {
        ImageGetPageThumbnailParameters imageGetPageThumbnailParameters = null;
        ImageGetPageThumbnailResponse response = api.imageGetPageThumbnail(imageGetPageThumbnailParameters);

        // TODO: test validations
    }
    
    /**
     * Gets the supported file extensions by the image loading actions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageGetSupportedFileExtensionsTest() throws ApiException {
        StringArrayResponse response = api.imageGetSupportedFileExtensions();

        // TODO: test validations
    }
    
    /**
     * Loads the provided image file.  Supported image formats can be retrieved by the GetSupportedImageFileExtensions action.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageLoadTest() throws ApiException {
        LoadImageFromByteArrayParameters loadImageFromByteArrayParameters = null;
        ImageLoadResponse response = api.imageLoad(loadImageFromByteArrayParameters);

        // TODO: test validations
    }
    
    /**
     * Loads the provided image file using Multipart Upload.  Supported image formats can be retrieved by the GetSupportedImageFileExtensions action.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageLoadMultipartTest() throws ApiException {
        File fileData = null;
        LoadImageParameters loadImageParameters = null;
        ImageLoadResponse response = api.imageLoadMultipart(fileData, loadImageParameters);

        // TODO: test validations
    }
    
    /**
     * Performs MICR (Magnetic Ink Character Recognition) on a previously uploaded image.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageMICRTest() throws ApiException {
        ImageMICRParameters imageMICRParameters = null;
        ImageMICRResponse response = api.imageMICR(imageMICRParameters);

        // TODO: test validations
    }
    
    /**
     * Reads barcodes from a previously uploaded image.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageReadBarcodesTest() throws ApiException {
        ImageReadBarcodesParameters imageReadBarcodesParameters = null;
        ReadBarcodesResponse response = api.imageReadBarcodes(imageReadBarcodesParameters);

        // TODO: test validations
    }
    
    /**
     * Resizes a previously uploaded image.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageResizeTest() throws ApiException {
        ImageResizeParameters imageResizeParameters = null;
        ImageResizeResponse response = api.imageResize(imageResizeParameters);

        // TODO: test validations
    }
    
    /**
     * Rotates and/or flips a previously uploaded image.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageRotateTest() throws ApiException {
        ImageRotateParameters imageRotateParameters = null;
        ImageRotateResponse response = api.imageRotate(imageRotateParameters);

        // TODO: test validations
    }
    
    /**
     * Saves a previously uploaded image as JPEG, and sends the file data in a JSON-serialized object.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageSaveAsJPEGTest() throws ApiException {
        ImageSaveAsJPEGParameters imageSaveAsJPEGParameters = null;
        ImageSaveAsJPEGResponse response = api.imageSaveAsJPEG(imageSaveAsJPEGParameters);

        // TODO: test validations
    }
    
    /**
     * Saves a previously uploaded image as JPEG, and streams the file binary data to the response (this is the most efficient download method).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageSaveAsJPEGFileTest() throws ApiException {
        ImageSaveAsJPEGParameters imageSaveAsJPEGParameters = null;
        File response = api.imageSaveAsJPEGFile(imageSaveAsJPEGParameters);

        // TODO: test validations
    }
    
    /**
     * Saves a previously uploaded image as PDF, and sends the file data in a JSON-serialized object.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageSaveAsPDFTest() throws ApiException {
        ImageSaveAsPDFParameters imageSaveAsPDFParameters = null;
        ImageSaveAsPDFResponse response = api.imageSaveAsPDF(imageSaveAsPDFParameters);

        // TODO: test validations
    }
    
    /**
     * Saves a previously uploaded image as PDF, and streams the file binary data to the response (this is the most efficient download method).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageSaveAsPDFFileTest() throws ApiException {
        ImageSaveAsPDFParameters imageSaveAsPDFParameters = null;
        File response = api.imageSaveAsPDFFile(imageSaveAsPDFParameters);

        // TODO: test validations
    }
    
    /**
     * Saves a previously uploaded image as PDF using MRC compression, and sends the file data in a JSON-serialized object.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageSaveAsPDFMRCTest() throws ApiException {
        ImageSaveAsPDFMRCParameters imageSaveAsPDFMRCParameters = null;
        ImageSaveAsPDFMRCResponse response = api.imageSaveAsPDFMRC(imageSaveAsPDFMRCParameters);

        // TODO: test validations
    }
    
    /**
     * Saves a previously uploaded image as PDF using MRC compression, and streams the file binary data to the response (this is the most efficient download method).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageSaveAsPDFMRCFileTest() throws ApiException {
        ImageSaveAsPDFMRCParameters imageSaveAsPDFMRCParameters = null;
        File response = api.imageSaveAsPDFMRCFile(imageSaveAsPDFMRCParameters);

        // TODO: test validations
    }
    
    /**
     * Saves a previously uploaded image as PNG, and sends the file data in a JSON-serialized object.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageSaveAsPNGTest() throws ApiException {
        ImageSaveAsPNGParameters imageSaveAsPNGParameters = null;
        ImageSaveAsPNGResponse response = api.imageSaveAsPNG(imageSaveAsPNGParameters);

        // TODO: test validations
    }
    
    /**
     * Saves a previously uploaded image as PNG, and streams the file binary data to the response (this is the most efficient download method).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageSaveAsPNGFileTest() throws ApiException {
        ImageSaveAsPNGParameters imageSaveAsPNGParameters = null;
        File response = api.imageSaveAsPNGFile(imageSaveAsPNGParameters);

        // TODO: test validations
    }
    
    /**
     * Saves a previously uploaded image as TIFF, and sends the file data in a JSON-serialized object.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageSaveAsTIFFTest() throws ApiException {
        ImageSaveAsTIFFParameters imageSaveAsTIFFParameters = null;
        ImageSaveAsTIFFResponse response = api.imageSaveAsTIFF(imageSaveAsTIFFParameters);

        // TODO: test validations
    }
    
    /**
     * Saves a previously uploaded image as TIFF, and streams the file binary data to the response (this is the most efficient download method).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageSaveAsTIFFFileTest() throws ApiException {
        ImageSaveAsTIFFParameters imageSaveAsTIFFParameters = null;
        File response = api.imageSaveAsTIFFFile(imageSaveAsTIFFParameters);

        // TODO: test validations
    }
    
    /**
     * Saves a previously uploaded image as multipage TIFF, and sends the file data in a JSON-serialized object.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageSaveAsTIFFMultipageTest() throws ApiException {
        ImageSaveAsTIFFMultipageParameters imageSaveAsTIFFMultipageParameters = null;
        ImageSaveAsTIFFMultipageResponse response = api.imageSaveAsTIFFMultipage(imageSaveAsTIFFMultipageParameters);

        // TODO: test validations
    }
    
    /**
     * Saves a previously uploaded image as multipage TIFF, and streams the file binary data to the response (this is the most efficient download method).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageSaveAsTIFFMultipageFileTest() throws ApiException {
        ImageSaveAsTIFFMultipageParameters imageSaveAsTIFFMultipageParameters = null;
        File response = api.imageSaveAsTIFFMultipageFile(imageSaveAsTIFFMultipageParameters);

        // TODO: test validations
    }
    
    /**
     * Swaps two pages from a previously uploaded image.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageSwapPagesTest() throws ApiException {
        ImageSwapPagesParameters imageSwapPagesParameters = null;
        ImageSwapPagesResponse response = api.imageSwapPages(imageSwapPagesParameters);

        // TODO: test validations
    }
    
}
