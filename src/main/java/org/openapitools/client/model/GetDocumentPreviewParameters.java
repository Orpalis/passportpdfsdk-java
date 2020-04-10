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

/**
 * Represents the parameters for a get document preview action.
 */
@ApiModel(description = "Represents the parameters for a get document preview action.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-10T16:23:29.092+02:00[Europe/Paris]")
public class GetDocumentPreviewParameters {
  public static final String SERIALIZED_NAME_FILE_ID = "FileId";
  @SerializedName(SERIALIZED_NAME_FILE_ID)
  private String fileId;

  public static final String SERIALIZED_NAME_FILE_DATA = "FileData";
  @SerializedName(SERIALIZED_NAME_FILE_DATA)
  private byte[] fileData;

  public static final String SERIALIZED_NAME_FILE_NAME = "FileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_THUMBNAIL_WIDTH = "ThumbnailWidth";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL_WIDTH)
  private Integer thumbnailWidth = 140;

  public static final String SERIALIZED_NAME_THUMBNAIL_HEIGHT = "ThumbnailHeight";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL_HEIGHT)
  private Integer thumbnailHeight = 220;

  public static final String SERIALIZED_NAME_THUMBNAIL_BACKGROUND_COLOR = "ThumbnailBackgroundColor";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL_BACKGROUND_COLOR)
  private String thumbnailBackgroundColor = "rgba(0,0,0,0)";

  public static final String SERIALIZED_NAME_THUMBNAIL_FIT_TO_PAGE_SIZE = "ThumbnailFitToPageSize";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL_FIT_TO_PAGE_SIZE)
  private Boolean thumbnailFitToPageSize = true;


  public GetDocumentPreviewParameters fileId(String fileId) {
    
    this.fileId = fileId;
    return this;
  }

   /**
   * Specifies the identifier of the file to be previewed.
   * @return fileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the identifier of the file to be previewed.")

  public String getFileId() {
    return fileId;
  }


  public void setFileId(String fileId) {
    this.fileId = fileId;
  }


  public GetDocumentPreviewParameters fileData(byte[] fileData) {
    
    this.fileData = fileData;
    return this;
  }

   /**
   * Specifies the data of the document to be previewed.
   * @return fileData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the data of the document to be previewed.")

  public byte[] getFileData() {
    return fileData;
  }


  public void setFileData(byte[] fileData) {
    this.fileData = fileData;
  }


  public GetDocumentPreviewParameters fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * Specifies the name of the file to be previewed.
   * @return fileName
  **/
  @ApiModelProperty(required = true, value = "Specifies the name of the file to be previewed.")

  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public GetDocumentPreviewParameters thumbnailWidth(Integer thumbnailWidth) {
    
    this.thumbnailWidth = thumbnailWidth;
    return this;
  }

   /**
   * Specifies, in pixels, the width of the thumbnail to be retrieved.
   * @return thumbnailWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies, in pixels, the width of the thumbnail to be retrieved.")

  public Integer getThumbnailWidth() {
    return thumbnailWidth;
  }


  public void setThumbnailWidth(Integer thumbnailWidth) {
    this.thumbnailWidth = thumbnailWidth;
  }


  public GetDocumentPreviewParameters thumbnailHeight(Integer thumbnailHeight) {
    
    this.thumbnailHeight = thumbnailHeight;
    return this;
  }

   /**
   * Specifies, in pixels, the height of the thumbnail to be retrieved.
   * @return thumbnailHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies, in pixels, the height of the thumbnail to be retrieved.")

  public Integer getThumbnailHeight() {
    return thumbnailHeight;
  }


  public void setThumbnailHeight(Integer thumbnailHeight) {
    this.thumbnailHeight = thumbnailHeight;
  }


  public GetDocumentPreviewParameters thumbnailBackgroundColor(String thumbnailBackgroundColor) {
    
    this.thumbnailBackgroundColor = thumbnailBackgroundColor;
    return this;
  }

   /**
   * Specifies the background color of the thumbnail, using the color name (ie: \&quot;red\&quot;) or its RGBa code (ie: \&quot;rgba(255,0,0,1)\&quot;).
   * @return thumbnailBackgroundColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the background color of the thumbnail, using the color name (ie: \"red\") or its RGBa code (ie: \"rgba(255,0,0,1)\").")

  public String getThumbnailBackgroundColor() {
    return thumbnailBackgroundColor;
  }


  public void setThumbnailBackgroundColor(String thumbnailBackgroundColor) {
    this.thumbnailBackgroundColor = thumbnailBackgroundColor;
  }


  public GetDocumentPreviewParameters thumbnailFitToPageSize(Boolean thumbnailFitToPageSize) {
    
    this.thumbnailFitToPageSize = thumbnailFitToPageSize;
    return this;
  }

   /**
   * Specifies if the size of the produced thumbnail is automatically adjusted to don&#39;t have any margin.
   * @return thumbnailFitToPageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if the size of the produced thumbnail is automatically adjusted to don't have any margin.")

  public Boolean getThumbnailFitToPageSize() {
    return thumbnailFitToPageSize;
  }


  public void setThumbnailFitToPageSize(Boolean thumbnailFitToPageSize) {
    this.thumbnailFitToPageSize = thumbnailFitToPageSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocumentPreviewParameters getDocumentPreviewParameters = (GetDocumentPreviewParameters) o;
    return Objects.equals(this.fileId, getDocumentPreviewParameters.fileId) &&
        Arrays.equals(this.fileData, getDocumentPreviewParameters.fileData) &&
        Objects.equals(this.fileName, getDocumentPreviewParameters.fileName) &&
        Objects.equals(this.thumbnailWidth, getDocumentPreviewParameters.thumbnailWidth) &&
        Objects.equals(this.thumbnailHeight, getDocumentPreviewParameters.thumbnailHeight) &&
        Objects.equals(this.thumbnailBackgroundColor, getDocumentPreviewParameters.thumbnailBackgroundColor) &&
        Objects.equals(this.thumbnailFitToPageSize, getDocumentPreviewParameters.thumbnailFitToPageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, Arrays.hashCode(fileData), fileName, thumbnailWidth, thumbnailHeight, thumbnailBackgroundColor, thumbnailFitToPageSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocumentPreviewParameters {\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    fileData: ").append(toIndentedString(fileData)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    thumbnailWidth: ").append(toIndentedString(thumbnailWidth)).append("\n");
    sb.append("    thumbnailHeight: ").append(toIndentedString(thumbnailHeight)).append("\n");
    sb.append("    thumbnailBackgroundColor: ").append(toIndentedString(thumbnailBackgroundColor)).append("\n");
    sb.append("    thumbnailFitToPageSize: ").append(toIndentedString(thumbnailFitToPageSize)).append("\n");
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
