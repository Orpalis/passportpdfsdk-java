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
 * Represents the parameters for a Save action.
 */
@ApiModel(description = "Represents the parameters for a Save action.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-27T13:23:36.328+02:00[Europe/Paris]")
public class DocuViewareSaveParameters {
  public static final String SERIALIZED_NAME_SESSION_ID = "SessionId";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private String sessionId;

  public static final String SERIALIZED_NAME_CONTROL_ID = "ControlId";
  @SerializedName(SERIALIZED_NAME_CONTROL_ID)
  private String controlId;

  public static final String SERIALIZED_NAME_FILE_NAME = "FileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_FORMAT = "Format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format;

  public static final String SERIALIZED_NAME_PAGE_RANGE = "PageRange";
  @SerializedName(SERIALIZED_NAME_PAGE_RANGE)
  private String pageRange = "*";


  public DocuViewareSaveParameters sessionId(String sessionId) {
    
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Specifies the unique identifier used to identify the user session.
   * @return sessionId
  **/
  @ApiModelProperty(required = true, value = "Specifies the unique identifier used to identify the user session.")

  public String getSessionId() {
    return sessionId;
  }


  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  public DocuViewareSaveParameters controlId(String controlId) {
    
    this.controlId = controlId;
    return this;
  }

   /**
   * Specifies the identifier associated with the control.
   * @return controlId
  **/
  @ApiModelProperty(required = true, value = "Specifies the identifier associated with the control.")

  public String getControlId() {
    return controlId;
  }


  public void setControlId(String controlId) {
    this.controlId = controlId;
  }


  public DocuViewareSaveParameters fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * Specifies the name of the file to create.
   * @return fileName
  **/
  @ApiModelProperty(required = true, value = "Specifies the name of the file to create.")

  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public DocuViewareSaveParameters format(String format) {
    
    this.format = format;
    return this;
  }

   /**
   * Specifies the format of the document to save.  Supported values are tiff, pdf, pdf/a, pdf/a1a, pdf/a1b, pdf/a2a, pdf/a2b, pdf/a2u, pdf/a3a, pdf/a3b, pdf/a3u.
   * @return format
  **/
  @ApiModelProperty(required = true, value = "Specifies the format of the document to save.  Supported values are tiff, pdf, pdf/a, pdf/a1a, pdf/a1b, pdf/a2a, pdf/a2b, pdf/a2u, pdf/a3a, pdf/a3b, pdf/a3u.")

  public String getFormat() {
    return format;
  }


  public void setFormat(String format) {
    this.format = format;
  }


  public DocuViewareSaveParameters pageRange(String pageRange) {
    
    this.pageRange = pageRange;
    return this;
  }

   /**
   * Specifies the number of the page, or the range of pages to be saved into the new file.
   * @return pageRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the number of the page, or the range of pages to be saved into the new file.")

  public String getPageRange() {
    return pageRange;
  }


  public void setPageRange(String pageRange) {
    this.pageRange = pageRange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocuViewareSaveParameters docuViewareSaveParameters = (DocuViewareSaveParameters) o;
    return Objects.equals(this.sessionId, docuViewareSaveParameters.sessionId) &&
        Objects.equals(this.controlId, docuViewareSaveParameters.controlId) &&
        Objects.equals(this.fileName, docuViewareSaveParameters.fileName) &&
        Objects.equals(this.format, docuViewareSaveParameters.format) &&
        Objects.equals(this.pageRange, docuViewareSaveParameters.pageRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, controlId, fileName, format, pageRange);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocuViewareSaveParameters {\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    controlId: ").append(toIndentedString(controlId)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    pageRange: ").append(toIndentedString(pageRange)).append("\n");
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

