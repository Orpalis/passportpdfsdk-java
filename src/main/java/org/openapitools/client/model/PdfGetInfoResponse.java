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
import org.openapitools.client.model.EncryptionAlgorithm;
import org.openapitools.client.model.Error;

/**
 * Represents the response to a get info action request.
 */
@ApiModel(description = "Represents the response to a get info action request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-10T16:23:29.092+02:00[Europe/Paris]")
public class PdfGetInfoResponse {
  public static final String SERIALIZED_NAME_ERROR = "Error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Error error;

  public static final String SERIALIZED_NAME_REMAINING_TOKENS = "RemainingTokens";
  @SerializedName(SERIALIZED_NAME_REMAINING_TOKENS)
  private Long remainingTokens;

  public static final String SERIALIZED_NAME_PAGE_COUNT = "PageCount";
  @SerializedName(SERIALIZED_NAME_PAGE_COUNT)
  private Integer pageCount;

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_AUTHOR = "Author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private String author;

  public static final String SERIALIZED_NAME_TITLE = "Title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_SUBJECT = "Subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_PRODUCER = "Producer";
  @SerializedName(SERIALIZED_NAME_PRODUCER)
  private String producer;

  public static final String SERIALIZED_NAME_METADATA = "Metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private String metadata;

  public static final String SERIALIZED_NAME_KEYWORDS = "Keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private String keywords;

  public static final String SERIALIZED_NAME_HAS_USER_PASSWORD = "HasUserPassword";
  @SerializedName(SERIALIZED_NAME_HAS_USER_PASSWORD)
  private Boolean hasUserPassword;

  public static final String SERIALIZED_NAME_HAS_OWNER_PASSWORD = "HasOwnerPassword";
  @SerializedName(SERIALIZED_NAME_HAS_OWNER_PASSWORD)
  private Boolean hasOwnerPassword;

  public static final String SERIALIZED_NAME_ENCRYPTION = "Encryption";
  @SerializedName(SERIALIZED_NAME_ENCRYPTION)
  private EncryptionAlgorithm encryption;

  public static final String SERIALIZED_NAME_CAN_PRINT = "CanPrint";
  @SerializedName(SERIALIZED_NAME_CAN_PRINT)
  private Boolean canPrint;

  public static final String SERIALIZED_NAME_CAN_COPY = "CanCopy";
  @SerializedName(SERIALIZED_NAME_CAN_COPY)
  private Boolean canCopy;

  public static final String SERIALIZED_NAME_CAN_MODIFY = "CanModify";
  @SerializedName(SERIALIZED_NAME_CAN_MODIFY)
  private Boolean canModify;

  public static final String SERIALIZED_NAME_CAN_ADD_NOTES = "CanAddNotes";
  @SerializedName(SERIALIZED_NAME_CAN_ADD_NOTES)
  private Boolean canAddNotes;

  public static final String SERIALIZED_NAME_CAN_FILL_FIELDS = "CanFillFields";
  @SerializedName(SERIALIZED_NAME_CAN_FILL_FIELDS)
  private Boolean canFillFields;

  public static final String SERIALIZED_NAME_CAN_COPY_ACCESS = "CanCopyAccess";
  @SerializedName(SERIALIZED_NAME_CAN_COPY_ACCESS)
  private Boolean canCopyAccess;

  public static final String SERIALIZED_NAME_CAN_ASSEMBLE = "CanAssemble";
  @SerializedName(SERIALIZED_NAME_CAN_ASSEMBLE)
  private Boolean canAssemble;

  public static final String SERIALIZED_NAME_CAN_PRINT_FULL = "CanPrintFull";
  @SerializedName(SERIALIZED_NAME_CAN_PRINT_FULL)
  private Boolean canPrintFull;


  public PdfGetInfoResponse error(Error error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Error getError() {
    return error;
  }


  public void setError(Error error) {
    this.error = error;
  }


  public PdfGetInfoResponse remainingTokens(Long remainingTokens) {
    
    this.remainingTokens = remainingTokens;
    return this;
  }

   /**
   * Specifies the number of remaining tokens.
   * @return remainingTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the number of remaining tokens.")

  public Long getRemainingTokens() {
    return remainingTokens;
  }


  public void setRemainingTokens(Long remainingTokens) {
    this.remainingTokens = remainingTokens;
  }


   /**
   * Specifies the number of pages of the PDF.
   * @return pageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the number of pages of the PDF.")

  public Integer getPageCount() {
    return pageCount;
  }




   /**
   * Specifies the version of the PDF.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the version of the PDF.")

  public String getVersion() {
    return version;
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




   /**
   * Specifies the document title specified within the PDF, if any.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the document title specified within the PDF, if any.")

  public String getTitle() {
    return title;
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




   /**
   * Specifies the producer name specified within the PDF, if any.
   * @return producer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the producer name specified within the PDF, if any.")

  public String getProducer() {
    return producer;
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




   /**
   * Specifies the keywords associated with the PDF, if any.
   * @return keywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the keywords associated with the PDF, if any.")

  public String getKeywords() {
    return keywords;
  }




   /**
   * Specifies if the PDF is protected with a user password.
   * @return hasUserPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if the PDF is protected with a user password.")

  public Boolean getHasUserPassword() {
    return hasUserPassword;
  }




   /**
   * Specifies if the PDF is protected with a owner password.
   * @return hasOwnerPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if the PDF is protected with a owner password.")

  public Boolean getHasOwnerPassword() {
    return hasOwnerPassword;
  }




  public PdfGetInfoResponse encryption(EncryptionAlgorithm encryption) {
    
    this.encryption = encryption;
    return this;
  }

   /**
   * Get encryption
   * @return encryption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EncryptionAlgorithm getEncryption() {
    return encryption;
  }


  public void setEncryption(EncryptionAlgorithm encryption) {
    this.encryption = encryption;
  }


   /**
   * Specifies if the user is allowed to print the document, but possibly not at the highest quality level.
   * @return canPrint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if the user is allowed to print the document, but possibly not at the highest quality level.")

  public Boolean getCanPrint() {
    return canPrint;
  }




   /**
   * Specifies if the user is allowed to copy or extract text and graphics from the document.
   * @return canCopy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if the user is allowed to copy or extract text and graphics from the document.")

  public Boolean getCanCopy() {
    return canCopy;
  }




   /**
   * Specifies if the user is allowed to modify the document.
   * @return canModify
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if the user is allowed to modify the document.")

  public Boolean getCanModify() {
    return canModify;
  }




   /**
   * Specifies if the user is allowed to add annotations.
   * @return canAddNotes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if the user is allowed to add annotations.")

  public Boolean getCanAddNotes() {
    return canAddNotes;
  }




   /**
   * Specifies if the user is allowed to fill-in form fields.
   * @return canFillFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if the user is allowed to fill-in form fields.")

  public Boolean getCanFillFields() {
    return canFillFields;
  }




   /**
   * Specifies if the user is allowed for copying or extracting for use with accessibility features.
   * @return canCopyAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if the user is allowed for copying or extracting for use with accessibility features.")

  public Boolean getCanCopyAccess() {
    return canCopyAccess;
  }




   /**
   * Specifies if the user is allowed to assemble the document.
   * @return canAssemble
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if the user is allowed to assemble the document.")

  public Boolean getCanAssemble() {
    return canAssemble;
  }




   /**
   * Specifies if the user is allowed to print the document with high resolution.
   * @return canPrintFull
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if the user is allowed to print the document with high resolution.")

  public Boolean getCanPrintFull() {
    return canPrintFull;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfGetInfoResponse pdfGetInfoResponse = (PdfGetInfoResponse) o;
    return Objects.equals(this.error, pdfGetInfoResponse.error) &&
        Objects.equals(this.remainingTokens, pdfGetInfoResponse.remainingTokens) &&
        Objects.equals(this.pageCount, pdfGetInfoResponse.pageCount) &&
        Objects.equals(this.version, pdfGetInfoResponse.version) &&
        Objects.equals(this.author, pdfGetInfoResponse.author) &&
        Objects.equals(this.title, pdfGetInfoResponse.title) &&
        Objects.equals(this.subject, pdfGetInfoResponse.subject) &&
        Objects.equals(this.producer, pdfGetInfoResponse.producer) &&
        Objects.equals(this.metadata, pdfGetInfoResponse.metadata) &&
        Objects.equals(this.keywords, pdfGetInfoResponse.keywords) &&
        Objects.equals(this.hasUserPassword, pdfGetInfoResponse.hasUserPassword) &&
        Objects.equals(this.hasOwnerPassword, pdfGetInfoResponse.hasOwnerPassword) &&
        Objects.equals(this.encryption, pdfGetInfoResponse.encryption) &&
        Objects.equals(this.canPrint, pdfGetInfoResponse.canPrint) &&
        Objects.equals(this.canCopy, pdfGetInfoResponse.canCopy) &&
        Objects.equals(this.canModify, pdfGetInfoResponse.canModify) &&
        Objects.equals(this.canAddNotes, pdfGetInfoResponse.canAddNotes) &&
        Objects.equals(this.canFillFields, pdfGetInfoResponse.canFillFields) &&
        Objects.equals(this.canCopyAccess, pdfGetInfoResponse.canCopyAccess) &&
        Objects.equals(this.canAssemble, pdfGetInfoResponse.canAssemble) &&
        Objects.equals(this.canPrintFull, pdfGetInfoResponse.canPrintFull);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, remainingTokens, pageCount, version, author, title, subject, producer, metadata, keywords, hasUserPassword, hasOwnerPassword, encryption, canPrint, canCopy, canModify, canAddNotes, canFillFields, canCopyAccess, canAssemble, canPrintFull);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfGetInfoResponse {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    remainingTokens: ").append(toIndentedString(remainingTokens)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    producer: ").append(toIndentedString(producer)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    hasUserPassword: ").append(toIndentedString(hasUserPassword)).append("\n");
    sb.append("    hasOwnerPassword: ").append(toIndentedString(hasOwnerPassword)).append("\n");
    sb.append("    encryption: ").append(toIndentedString(encryption)).append("\n");
    sb.append("    canPrint: ").append(toIndentedString(canPrint)).append("\n");
    sb.append("    canCopy: ").append(toIndentedString(canCopy)).append("\n");
    sb.append("    canModify: ").append(toIndentedString(canModify)).append("\n");
    sb.append("    canAddNotes: ").append(toIndentedString(canAddNotes)).append("\n");
    sb.append("    canFillFields: ").append(toIndentedString(canFillFields)).append("\n");
    sb.append("    canCopyAccess: ").append(toIndentedString(canCopyAccess)).append("\n");
    sb.append("    canAssemble: ").append(toIndentedString(canAssemble)).append("\n");
    sb.append("    canPrintFull: ").append(toIndentedString(canPrintFull)).append("\n");
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

