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
 * Represents the parameters for a set info action.
 */
@ApiModel(description = "Represents the parameters for a set info action.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-10T16:23:29.092+02:00[Europe/Paris]")
public class PdfSetInfoParameters {
  public static final String SERIALIZED_NAME_FILE_ID = "FileId";
  @SerializedName(SERIALIZED_NAME_FILE_ID)
  private String fileId;

  public static final String SERIALIZED_NAME_AUTHOR = "Author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private String author = "";

  public static final String SERIALIZED_NAME_TITLE = "Title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = "";

  public static final String SERIALIZED_NAME_SUBJECT = "Subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject = "";

  public static final String SERIALIZED_NAME_PRODUCER = "Producer";
  @SerializedName(SERIALIZED_NAME_PRODUCER)
  private String producer = "";

  public static final String SERIALIZED_NAME_METADATA = "Metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private String metadata = "";

  public static final String SERIALIZED_NAME_KEYWORDS = "Keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private String keywords = "";

  public static final String SERIALIZED_NAME_CLEAR_EMPTY_VALUES = "ClearEmptyValues";
  @SerializedName(SERIALIZED_NAME_CLEAR_EMPTY_VALUES)
  private Boolean clearEmptyValues = false;


  public PdfSetInfoParameters fileId(String fileId) {
    
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


  public PdfSetInfoParameters author(String author) {
    
    this.author = author;
    return this;
  }

   /**
   * Specifies the author name specified within the PDF, if any.
   * @return author
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the author name specified within the PDF, if any.")

  public String getAuthor() {
    return author;
  }


  public void setAuthor(String author) {
    this.author = author;
  }


  public PdfSetInfoParameters title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Specifies the document title specified within the PDF, if any.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the document title specified within the PDF, if any.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public PdfSetInfoParameters subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Specifies the document subject specified within the PDF, if any.
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the document subject specified within the PDF, if any.")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public PdfSetInfoParameters producer(String producer) {
    
    this.producer = producer;
    return this;
  }

   /**
   * Specifies the producer name specified within the PDF, if any.
   * @return producer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the producer name specified within the PDF, if any.")

  public String getProducer() {
    return producer;
  }


  public void setProducer(String producer) {
    this.producer = producer;
  }


  public PdfSetInfoParameters metadata(String metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Specifies the metadata contained within the PDF, if any.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the metadata contained within the PDF, if any.")

  public String getMetadata() {
    return metadata;
  }


  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }


  public PdfSetInfoParameters keywords(String keywords) {
    
    this.keywords = keywords;
    return this;
  }

   /**
   * Specifies the keywords associated with the PDF, if any.
   * @return keywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the keywords associated with the PDF, if any.")

  public String getKeywords() {
    return keywords;
  }


  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }


  public PdfSetInfoParameters clearEmptyValues(Boolean clearEmptyValues) {
    
    this.clearEmptyValues = clearEmptyValues;
    return this;
  }

   /**
   * Specifies whether the empty info values shall be cleared.
   * @return clearEmptyValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether the empty info values shall be cleared.")

  public Boolean getClearEmptyValues() {
    return clearEmptyValues;
  }


  public void setClearEmptyValues(Boolean clearEmptyValues) {
    this.clearEmptyValues = clearEmptyValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfSetInfoParameters pdfSetInfoParameters = (PdfSetInfoParameters) o;
    return Objects.equals(this.fileId, pdfSetInfoParameters.fileId) &&
        Objects.equals(this.author, pdfSetInfoParameters.author) &&
        Objects.equals(this.title, pdfSetInfoParameters.title) &&
        Objects.equals(this.subject, pdfSetInfoParameters.subject) &&
        Objects.equals(this.producer, pdfSetInfoParameters.producer) &&
        Objects.equals(this.metadata, pdfSetInfoParameters.metadata) &&
        Objects.equals(this.keywords, pdfSetInfoParameters.keywords) &&
        Objects.equals(this.clearEmptyValues, pdfSetInfoParameters.clearEmptyValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, author, title, subject, producer, metadata, keywords, clearEmptyValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfSetInfoParameters {\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    producer: ").append(toIndentedString(producer)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    clearEmptyValues: ").append(toIndentedString(clearEmptyValues)).append("\n");
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
