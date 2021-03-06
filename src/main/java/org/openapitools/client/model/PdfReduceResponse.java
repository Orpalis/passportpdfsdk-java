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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ReduceErrorInfo;
import org.openapitools.client.model.ReduceWarningInfo;

/**
 * Represents the response to a reduce action request.
 */
@ApiModel(description = "Represents the response to a reduce action request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-27T13:23:36.328+02:00[Europe/Paris]")
public class PdfReduceResponse {
  public static final String SERIALIZED_NAME_ERROR = "Error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Error error;

  public static final String SERIALIZED_NAME_REMAINING_TOKENS = "RemainingTokens";
  @SerializedName(SERIALIZED_NAME_REMAINING_TOKENS)
  private Long remainingTokens;

  public static final String SERIALIZED_NAME_ERROR_INFO = "ErrorInfo";
  @SerializedName(SERIALIZED_NAME_ERROR_INFO)
  private ReduceErrorInfo errorInfo;

  public static final String SERIALIZED_NAME_WARNINGS_INFO = "WarningsInfo";
  @SerializedName(SERIALIZED_NAME_WARNINGS_INFO)
  private List<ReduceWarningInfo> warningsInfo = null;

  public static final String SERIALIZED_NAME_CONTENT_REMOVED = "ContentRemoved";
  @SerializedName(SERIALIZED_NAME_CONTENT_REMOVED)
  private Boolean contentRemoved;

  public static final String SERIALIZED_NAME_VERSION_CHANGED = "VersionChanged";
  @SerializedName(SERIALIZED_NAME_VERSION_CHANGED)
  private Boolean versionChanged;

  public static final String SERIALIZED_NAME_NEW_FILE_SIZE = "NewFileSize";
  @SerializedName(SERIALIZED_NAME_NEW_FILE_SIZE)
  private Long newFileSize;


  public PdfReduceResponse error(Error error) {
    
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


  public PdfReduceResponse remainingTokens(Long remainingTokens) {
    
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


  public PdfReduceResponse errorInfo(ReduceErrorInfo errorInfo) {
    
    this.errorInfo = errorInfo;
    return this;
  }

   /**
   * Get errorInfo
   * @return errorInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReduceErrorInfo getErrorInfo() {
    return errorInfo;
  }


  public void setErrorInfo(ReduceErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
  }


   /**
   * Specifies the different warnings that occured during the process of the reduce action.
   * @return warningsInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the different warnings that occured during the process of the reduce action.")

  public List<ReduceWarningInfo> getWarningsInfo() {
    return warningsInfo;
  }




   /**
   * Specifies whether content has been removed from the PDF during the process of the reduce action.
   * @return contentRemoved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether content has been removed from the PDF during the process of the reduce action.")

  public Boolean getContentRemoved() {
    return contentRemoved;
  }




   /**
   * Specifies whether the version of the PDF has changed during the process of the reduce action.
   * @return versionChanged
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether the version of the PDF has changed during the process of the reduce action.")

  public Boolean getVersionChanged() {
    return versionChanged;
  }




   /**
   * Specify the size of the new created document.
   * @return newFileSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify the size of the new created document.")

  public Long getNewFileSize() {
    return newFileSize;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfReduceResponse pdfReduceResponse = (PdfReduceResponse) o;
    return Objects.equals(this.error, pdfReduceResponse.error) &&
        Objects.equals(this.remainingTokens, pdfReduceResponse.remainingTokens) &&
        Objects.equals(this.errorInfo, pdfReduceResponse.errorInfo) &&
        Objects.equals(this.warningsInfo, pdfReduceResponse.warningsInfo) &&
        Objects.equals(this.contentRemoved, pdfReduceResponse.contentRemoved) &&
        Objects.equals(this.versionChanged, pdfReduceResponse.versionChanged) &&
        Objects.equals(this.newFileSize, pdfReduceResponse.newFileSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, remainingTokens, errorInfo, warningsInfo, contentRemoved, versionChanged, newFileSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfReduceResponse {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    remainingTokens: ").append(toIndentedString(remainingTokens)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    warningsInfo: ").append(toIndentedString(warningsInfo)).append("\n");
    sb.append("    contentRemoved: ").append(toIndentedString(contentRemoved)).append("\n");
    sb.append("    versionChanged: ").append(toIndentedString(versionChanged)).append("\n");
    sb.append("    newFileSize: ").append(toIndentedString(newFileSize)).append("\n");
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

