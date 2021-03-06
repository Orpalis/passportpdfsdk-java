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
 * Represents the parameters for a merge pages action request.
 */
@ApiModel(description = "Represents the parameters for a merge pages action request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-27T13:23:36.328+02:00[Europe/Paris]")
public class PdfMergePagesParameters {
  public static final String SERIALIZED_NAME_FILE_ID = "FileId";
  @SerializedName(SERIALIZED_NAME_FILE_ID)
  private String fileId;

  public static final String SERIALIZED_NAME_PAGE_RANGE = "PageRange";
  @SerializedName(SERIALIZED_NAME_PAGE_RANGE)
  private String pageRange;

  public static final String SERIALIZED_NAME_REMOVE_PAGES = "RemovePages";
  @SerializedName(SERIALIZED_NAME_REMOVE_PAGES)
  private Boolean removePages;


  public PdfMergePagesParameters fileId(String fileId) {
    
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


  public PdfMergePagesParameters pageRange(String pageRange) {
    
    this.pageRange = pageRange;
    return this;
  }

   /**
   * Specifies the range of pages to be combined.
   * @return pageRange
  **/
  @ApiModelProperty(required = true, value = "Specifies the range of pages to be combined.")

  public String getPageRange() {
    return pageRange;
  }


  public void setPageRange(String pageRange) {
    this.pageRange = pageRange;
  }


  public PdfMergePagesParameters removePages(Boolean removePages) {
    
    this.removePages = removePages;
    return this;
  }

   /**
   * Specifies whether the merged pages shall be removed from the document.
   * @return removePages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether the merged pages shall be removed from the document.")

  public Boolean getRemovePages() {
    return removePages;
  }


  public void setRemovePages(Boolean removePages) {
    this.removePages = removePages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfMergePagesParameters pdfMergePagesParameters = (PdfMergePagesParameters) o;
    return Objects.equals(this.fileId, pdfMergePagesParameters.fileId) &&
        Objects.equals(this.pageRange, pdfMergePagesParameters.pageRange) &&
        Objects.equals(this.removePages, pdfMergePagesParameters.removePages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, pageRange, removePages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfMergePagesParameters {\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    pageRange: ").append(toIndentedString(pageRange)).append("\n");
    sb.append("    removePages: ").append(toIndentedString(removePages)).append("\n");
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

