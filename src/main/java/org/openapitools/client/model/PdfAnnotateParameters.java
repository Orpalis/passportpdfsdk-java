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
import org.openapitools.client.model.AnnotationType;
import org.openapitools.client.model.FreeTextAnnotationParameters;
import org.openapitools.client.model.LineAnnotationParameters;
import org.openapitools.client.model.LinkAnnotationParameters;
import org.openapitools.client.model.RubberStampAnnotationParameters;
import org.openapitools.client.model.SquareAndCircleAnnotationParameters;
import org.openapitools.client.model.StickyNoteAnnotationParameters;

/**
 * Represents the parameters for an annotate action.
 */
@ApiModel(description = "Represents the parameters for an annotate action.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-10T16:23:29.092+02:00[Europe/Paris]")
public class PdfAnnotateParameters {
  public static final String SERIALIZED_NAME_FILE_ID = "FileId";
  @SerializedName(SERIALIZED_NAME_FILE_ID)
  private String fileId;

  public static final String SERIALIZED_NAME_PAGE_RANGE = "PageRange";
  @SerializedName(SERIALIZED_NAME_PAGE_RANGE)
  private String pageRange;

  public static final String SERIALIZED_NAME_ANNOTATION_TYPE = "AnnotationType";
  @SerializedName(SERIALIZED_NAME_ANNOTATION_TYPE)
  private AnnotationType annotationType;

  public static final String SERIALIZED_NAME_STICKY_NOTE_ANNOTATION_PARAMETERS = "StickyNoteAnnotationParameters";
  @SerializedName(SERIALIZED_NAME_STICKY_NOTE_ANNOTATION_PARAMETERS)
  private StickyNoteAnnotationParameters stickyNoteAnnotationParameters;

  public static final String SERIALIZED_NAME_LINK_ANNOTATION_PARAMETERS = "LinkAnnotationParameters";
  @SerializedName(SERIALIZED_NAME_LINK_ANNOTATION_PARAMETERS)
  private LinkAnnotationParameters linkAnnotationParameters;

  public static final String SERIALIZED_NAME_FREE_TEXT_ANNOTATION_PARAMETERS = "FreeTextAnnotationParameters";
  @SerializedName(SERIALIZED_NAME_FREE_TEXT_ANNOTATION_PARAMETERS)
  private FreeTextAnnotationParameters freeTextAnnotationParameters;

  public static final String SERIALIZED_NAME_LINE_ANNOTATION_PARAMETERS = "LineAnnotationParameters";
  @SerializedName(SERIALIZED_NAME_LINE_ANNOTATION_PARAMETERS)
  private LineAnnotationParameters lineAnnotationParameters;

  public static final String SERIALIZED_NAME_SQUARE_AND_CIRCLE_ANNOTATION_PARAMETERS = "SquareAndCircleAnnotationParameters";
  @SerializedName(SERIALIZED_NAME_SQUARE_AND_CIRCLE_ANNOTATION_PARAMETERS)
  private SquareAndCircleAnnotationParameters squareAndCircleAnnotationParameters;

  public static final String SERIALIZED_NAME_RUBBER_STAMP_ANNOTATION_PARAMETERS = "RubberStampAnnotationParameters";
  @SerializedName(SERIALIZED_NAME_RUBBER_STAMP_ANNOTATION_PARAMETERS)
  private RubberStampAnnotationParameters rubberStampAnnotationParameters;


  public PdfAnnotateParameters fileId(String fileId) {
    
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


  public PdfAnnotateParameters pageRange(String pageRange) {
    
    this.pageRange = pageRange;
    return this;
  }

   /**
   * Specifies the page or the range of page to be annotated.
   * @return pageRange
  **/
  @ApiModelProperty(required = true, value = "Specifies the page or the range of page to be annotated.")

  public String getPageRange() {
    return pageRange;
  }


  public void setPageRange(String pageRange) {
    this.pageRange = pageRange;
  }


  public PdfAnnotateParameters annotationType(AnnotationType annotationType) {
    
    this.annotationType = annotationType;
    return this;
  }

   /**
   * Get annotationType
   * @return annotationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AnnotationType getAnnotationType() {
    return annotationType;
  }


  public void setAnnotationType(AnnotationType annotationType) {
    this.annotationType = annotationType;
  }


  public PdfAnnotateParameters stickyNoteAnnotationParameters(StickyNoteAnnotationParameters stickyNoteAnnotationParameters) {
    
    this.stickyNoteAnnotationParameters = stickyNoteAnnotationParameters;
    return this;
  }

   /**
   * Get stickyNoteAnnotationParameters
   * @return stickyNoteAnnotationParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StickyNoteAnnotationParameters getStickyNoteAnnotationParameters() {
    return stickyNoteAnnotationParameters;
  }


  public void setStickyNoteAnnotationParameters(StickyNoteAnnotationParameters stickyNoteAnnotationParameters) {
    this.stickyNoteAnnotationParameters = stickyNoteAnnotationParameters;
  }


  public PdfAnnotateParameters linkAnnotationParameters(LinkAnnotationParameters linkAnnotationParameters) {
    
    this.linkAnnotationParameters = linkAnnotationParameters;
    return this;
  }

   /**
   * Get linkAnnotationParameters
   * @return linkAnnotationParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkAnnotationParameters getLinkAnnotationParameters() {
    return linkAnnotationParameters;
  }


  public void setLinkAnnotationParameters(LinkAnnotationParameters linkAnnotationParameters) {
    this.linkAnnotationParameters = linkAnnotationParameters;
  }


  public PdfAnnotateParameters freeTextAnnotationParameters(FreeTextAnnotationParameters freeTextAnnotationParameters) {
    
    this.freeTextAnnotationParameters = freeTextAnnotationParameters;
    return this;
  }

   /**
   * Get freeTextAnnotationParameters
   * @return freeTextAnnotationParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FreeTextAnnotationParameters getFreeTextAnnotationParameters() {
    return freeTextAnnotationParameters;
  }


  public void setFreeTextAnnotationParameters(FreeTextAnnotationParameters freeTextAnnotationParameters) {
    this.freeTextAnnotationParameters = freeTextAnnotationParameters;
  }


  public PdfAnnotateParameters lineAnnotationParameters(LineAnnotationParameters lineAnnotationParameters) {
    
    this.lineAnnotationParameters = lineAnnotationParameters;
    return this;
  }

   /**
   * Get lineAnnotationParameters
   * @return lineAnnotationParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LineAnnotationParameters getLineAnnotationParameters() {
    return lineAnnotationParameters;
  }


  public void setLineAnnotationParameters(LineAnnotationParameters lineAnnotationParameters) {
    this.lineAnnotationParameters = lineAnnotationParameters;
  }


  public PdfAnnotateParameters squareAndCircleAnnotationParameters(SquareAndCircleAnnotationParameters squareAndCircleAnnotationParameters) {
    
    this.squareAndCircleAnnotationParameters = squareAndCircleAnnotationParameters;
    return this;
  }

   /**
   * Get squareAndCircleAnnotationParameters
   * @return squareAndCircleAnnotationParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SquareAndCircleAnnotationParameters getSquareAndCircleAnnotationParameters() {
    return squareAndCircleAnnotationParameters;
  }


  public void setSquareAndCircleAnnotationParameters(SquareAndCircleAnnotationParameters squareAndCircleAnnotationParameters) {
    this.squareAndCircleAnnotationParameters = squareAndCircleAnnotationParameters;
  }


  public PdfAnnotateParameters rubberStampAnnotationParameters(RubberStampAnnotationParameters rubberStampAnnotationParameters) {
    
    this.rubberStampAnnotationParameters = rubberStampAnnotationParameters;
    return this;
  }

   /**
   * Get rubberStampAnnotationParameters
   * @return rubberStampAnnotationParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RubberStampAnnotationParameters getRubberStampAnnotationParameters() {
    return rubberStampAnnotationParameters;
  }


  public void setRubberStampAnnotationParameters(RubberStampAnnotationParameters rubberStampAnnotationParameters) {
    this.rubberStampAnnotationParameters = rubberStampAnnotationParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfAnnotateParameters pdfAnnotateParameters = (PdfAnnotateParameters) o;
    return Objects.equals(this.fileId, pdfAnnotateParameters.fileId) &&
        Objects.equals(this.pageRange, pdfAnnotateParameters.pageRange) &&
        Objects.equals(this.annotationType, pdfAnnotateParameters.annotationType) &&
        Objects.equals(this.stickyNoteAnnotationParameters, pdfAnnotateParameters.stickyNoteAnnotationParameters) &&
        Objects.equals(this.linkAnnotationParameters, pdfAnnotateParameters.linkAnnotationParameters) &&
        Objects.equals(this.freeTextAnnotationParameters, pdfAnnotateParameters.freeTextAnnotationParameters) &&
        Objects.equals(this.lineAnnotationParameters, pdfAnnotateParameters.lineAnnotationParameters) &&
        Objects.equals(this.squareAndCircleAnnotationParameters, pdfAnnotateParameters.squareAndCircleAnnotationParameters) &&
        Objects.equals(this.rubberStampAnnotationParameters, pdfAnnotateParameters.rubberStampAnnotationParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, pageRange, annotationType, stickyNoteAnnotationParameters, linkAnnotationParameters, freeTextAnnotationParameters, lineAnnotationParameters, squareAndCircleAnnotationParameters, rubberStampAnnotationParameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfAnnotateParameters {\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    pageRange: ").append(toIndentedString(pageRange)).append("\n");
    sb.append("    annotationType: ").append(toIndentedString(annotationType)).append("\n");
    sb.append("    stickyNoteAnnotationParameters: ").append(toIndentedString(stickyNoteAnnotationParameters)).append("\n");
    sb.append("    linkAnnotationParameters: ").append(toIndentedString(linkAnnotationParameters)).append("\n");
    sb.append("    freeTextAnnotationParameters: ").append(toIndentedString(freeTextAnnotationParameters)).append("\n");
    sb.append("    lineAnnotationParameters: ").append(toIndentedString(lineAnnotationParameters)).append("\n");
    sb.append("    squareAndCircleAnnotationParameters: ").append(toIndentedString(squareAndCircleAnnotationParameters)).append("\n");
    sb.append("    rubberStampAnnotationParameters: ").append(toIndentedString(rubberStampAnnotationParameters)).append("\n");
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
