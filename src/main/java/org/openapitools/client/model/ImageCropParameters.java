/*
 * PassportPDF API
 *       Introduction:    PassportPDF API is a REST API that lets you perform complex operations on documents and images easily.  You may consume the API by using our.NET SDK (other platforms / languages are soon to come), or any REST client by sending your requests to the appropriate endpoints.   A list of all the available endpoints can be found on the API reference page at https://passportpdfapi.com/references/api/index.html        Authentication:    Each available operation has a predefined cost, expressed as a number of tokens.  These tokens are deducted from your \"passport,\" which has a unique identifier that acts as an API key. This key is, therefore, required to be provided with each request for the latter to be honored(except if the operation does not have a cost, typically when you request a simple data with a GET).  Your key must be included in the header of the request, under the name \"X-PassportPdf-API-Key.\"  If you are using the.NET SDK, you can either set your key in the ApiKey property of your API instance(PdfApi or ImageApi, for example) or set it globally in the GlobalConfiguration instance if you want to set it once for the whole life cycle of your application.          Communication with the API:    All the available actions are listed on the API reference page, as previously mentioned.  There are several different controllers, i.e., routes, which categorize the actions.For example, you may use the PDF controller(\"/api/pdf\" route) to perform PDF - related operations, and the Image controller(\"/api/image\") for images.  Each action defines what kind of parameters(if any) is expected, and what kind of response is served.Parameters and responses are represented using data models, or \"schemas,\" and are listed in the \"Schemas\" section of the reference.   Parameters and response models of a given action are both prefixed by the controller name, the action name, and \"Parameters\" / \"Response,\" e.g. \"api/pdf/reduce\" respectively receives and serves a PdfReduceParameters and PdfReduceResponse models.  Using the .NET SDK, you will find the objects to interact with the different controllers in the PassportPDF.Api namespace and all the schemas in the PassportPDF.Model namespace.        Processing documents:    Each document manipulation starts with importing the file onto the API.  The LoadDocument action of the PDF controller lets you import your document as a PDF.  Note that the GetPDFImportSupportedFileExtensions action of the same controller will let you know all the different types of files that you may import as a PDF. LoadDocument responds with a JSON-serialized PdfLoadDocumentResponse model, which contains a \"FileId\" property.This identifier is required for the API to know about your document for further manipulations, hence the presence of a \"FileId\" property in the PdfReduceParameters schema (and many other parameters schemas). To download the changes made to a file, you need, of course, to download the new version of the file from the API.  To save your document as a PDF, you will need to use the SaveDocument action of the PDF controller and provide a PdfSaveDocumentParameters data model that contains the identifier of your file.        Errors:    Conventional HTTP response codes are used to indicate the success or failure of an API request.   The Error data model also defines some information about an error that occurred on the API.   Each response model has an Error in its definition, and its sole existence in the serialized response - which should thus always be checked - indicates that something went wrong.  Among the information given by the Error schema, \"ResultCode\" specifies a value of the \"PassportPDFStatus\" enumeration, that defines a first level of error information. \"InternalErrorId\" defines a unique identifier for the error, which comes very handy for us to troubleshoot any issue you may encounter quickly.        Efficiency considerations:    Multipart upload/download is available and lets you directly stream a file to/from the API.  In the PDF controller, LoadDocument/LoadDocumentMultipart and SaveDocument/SaveDocumentToFile may be used to upload/download a document using respectively binary data serialization and streaming multipart HTTP requests.  The second approach should be favored when dealing with large files, as it will be much more efficient in that context.  
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.CropUnit;

/**
 * Represents the parameters for an image crop action.
 */
@ApiModel(description = "Represents the parameters for an image crop action.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-10T16:23:29.092+02:00[Europe/Paris]")
public class ImageCropParameters {
  public static final String SERIALIZED_NAME_FILE_ID = "FileId";
  @SerializedName(SERIALIZED_NAME_FILE_ID)
  private String fileId;

  public static final String SERIALIZED_NAME_PAGE_RANGE = "PageRange";
  @SerializedName(SERIALIZED_NAME_PAGE_RANGE)
  private String pageRange;

  public static final String SERIALIZED_NAME_CROP_BOX_LEFT = "CropBoxLeft";
  @SerializedName(SERIALIZED_NAME_CROP_BOX_LEFT)
  private Integer cropBoxLeft;

  public static final String SERIALIZED_NAME_CROP_BOX_TOP = "CropBoxTop";
  @SerializedName(SERIALIZED_NAME_CROP_BOX_TOP)
  private Integer cropBoxTop;

  public static final String SERIALIZED_NAME_CROP_BOX_WIDTH = "CropBoxWidth";
  @SerializedName(SERIALIZED_NAME_CROP_BOX_WIDTH)
  private Integer cropBoxWidth;

  public static final String SERIALIZED_NAME_CROP_BOX_HEIGHT = "CropBoxHeight";
  @SerializedName(SERIALIZED_NAME_CROP_BOX_HEIGHT)
  private Integer cropBoxHeight;

  public static final String SERIALIZED_NAME_CROP_UNIT = "CropUnit";
  @SerializedName(SERIALIZED_NAME_CROP_UNIT)
  private CropUnit cropUnit;


  public ImageCropParameters fileId(String fileId) {
    
    this.fileId = fileId;
    return this;
  }

   /**
   * The identifier of the previously uploaded file to be processed.
   * @return fileId
  **/
  @ApiModelProperty(required = true, value = "The identifier of the previously uploaded file to be processed.")

  public String getFileId() {
    return fileId;
  }


  public void setFileId(String fileId) {
    this.fileId = fileId;
  }


  public ImageCropParameters pageRange(String pageRange) {
    
    this.pageRange = pageRange;
    return this;
  }

   /**
   * Specifies the number of the page, or the range of pages to crop.
   * @return pageRange
  **/
  @ApiModelProperty(required = true, value = "Specifies the number of the page, or the range of pages to crop.")

  public String getPageRange() {
    return pageRange;
  }


  public void setPageRange(String pageRange) {
    this.pageRange = pageRange;
  }


  public ImageCropParameters cropBoxLeft(Integer cropBoxLeft) {
    
    this.cropBoxLeft = cropBoxLeft;
    return this;
  }

   /**
   * Specifies the crop box left coordinate.
   * @return cropBoxLeft
  **/
  @ApiModelProperty(required = true, value = "Specifies the crop box left coordinate.")

  public Integer getCropBoxLeft() {
    return cropBoxLeft;
  }


  public void setCropBoxLeft(Integer cropBoxLeft) {
    this.cropBoxLeft = cropBoxLeft;
  }


  public ImageCropParameters cropBoxTop(Integer cropBoxTop) {
    
    this.cropBoxTop = cropBoxTop;
    return this;
  }

   /**
   * Specifies the crop box top coordinate.
   * @return cropBoxTop
  **/
  @ApiModelProperty(required = true, value = "Specifies the crop box top coordinate.")

  public Integer getCropBoxTop() {
    return cropBoxTop;
  }


  public void setCropBoxTop(Integer cropBoxTop) {
    this.cropBoxTop = cropBoxTop;
  }


  public ImageCropParameters cropBoxWidth(Integer cropBoxWidth) {
    
    this.cropBoxWidth = cropBoxWidth;
    return this;
  }

   /**
   * Specifies the crop box width.
   * @return cropBoxWidth
  **/
  @ApiModelProperty(required = true, value = "Specifies the crop box width.")

  public Integer getCropBoxWidth() {
    return cropBoxWidth;
  }


  public void setCropBoxWidth(Integer cropBoxWidth) {
    this.cropBoxWidth = cropBoxWidth;
  }


  public ImageCropParameters cropBoxHeight(Integer cropBoxHeight) {
    
    this.cropBoxHeight = cropBoxHeight;
    return this;
  }

   /**
   * Specifies the crop box height.
   * @return cropBoxHeight
  **/
  @ApiModelProperty(required = true, value = "Specifies the crop box height.")

  public Integer getCropBoxHeight() {
    return cropBoxHeight;
  }


  public void setCropBoxHeight(Integer cropBoxHeight) {
    this.cropBoxHeight = cropBoxHeight;
  }


  public ImageCropParameters cropUnit(CropUnit cropUnit) {
    
    this.cropUnit = cropUnit;
    return this;
  }

   /**
   * Get cropUnit
   * @return cropUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CropUnit getCropUnit() {
    return cropUnit;
  }


  public void setCropUnit(CropUnit cropUnit) {
    this.cropUnit = cropUnit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageCropParameters imageCropParameters = (ImageCropParameters) o;
    return Objects.equals(this.fileId, imageCropParameters.fileId) &&
        Objects.equals(this.pageRange, imageCropParameters.pageRange) &&
        Objects.equals(this.cropBoxLeft, imageCropParameters.cropBoxLeft) &&
        Objects.equals(this.cropBoxTop, imageCropParameters.cropBoxTop) &&
        Objects.equals(this.cropBoxWidth, imageCropParameters.cropBoxWidth) &&
        Objects.equals(this.cropBoxHeight, imageCropParameters.cropBoxHeight) &&
        Objects.equals(this.cropUnit, imageCropParameters.cropUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, pageRange, cropBoxLeft, cropBoxTop, cropBoxWidth, cropBoxHeight, cropUnit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageCropParameters {\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    pageRange: ").append(toIndentedString(pageRange)).append("\n");
    sb.append("    cropBoxLeft: ").append(toIndentedString(cropBoxLeft)).append("\n");
    sb.append("    cropBoxTop: ").append(toIndentedString(cropBoxTop)).append("\n");
    sb.append("    cropBoxWidth: ").append(toIndentedString(cropBoxWidth)).append("\n");
    sb.append("    cropBoxHeight: ").append(toIndentedString(cropBoxHeight)).append("\n");
    sb.append("    cropUnit: ").append(toIndentedString(cropUnit)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

