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
 * Represents the parameters for a detect blank pages action.
 */
@ApiModel(description = "Represents the parameters for a detect blank pages action.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-27T13:23:36.328+02:00[Europe/Paris]")
public class ImageDetectBlankPagesParameters {
  public static final String SERIALIZED_NAME_FILE_ID = "FileId";
  @SerializedName(SERIALIZED_NAME_FILE_ID)
  private String fileId;

  public static final String SERIALIZED_NAME_PAGE_RANGE = "PageRange";
  @SerializedName(SERIALIZED_NAME_PAGE_RANGE)
  private String pageRange;

  public static final String SERIALIZED_NAME_REMOVE_DETECTED_BLANK_PAGES = "RemoveDetectedBlankPages";
  @SerializedName(SERIALIZED_NAME_REMOVE_DETECTED_BLANK_PAGES)
  private Boolean removeDetectedBlankPages = true;


  public ImageDetectBlankPagesParameters fileId(String fileId) {
    
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


  public ImageDetectBlankPagesParameters pageRange(String pageRange) {
    
    this.pageRange = pageRange;
    return this;
  }

   /**
   * Specifies the number of the page, or the range of page to be processed.
   * @return pageRange
  **/
  @ApiModelProperty(required = true, value = "Specifies the number of the page, or the range of page to be processed.")

  public String getPageRange() {
    return pageRange;
  }


  public void setPageRange(String pageRange) {
    this.pageRange = pageRange;
  }


  public ImageDetectBlankPagesParameters removeDetectedBlankPages(Boolean removeDetectedBlankPages) {
    
    this.removeDetectedBlankPages = removeDetectedBlankPages;
    return this;
  }

   /**
   * Specifies whether the detected blank page(s) shall be removed.
   * @return removeDetectedBlankPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether the detected blank page(s) shall be removed.")

  public Boolean getRemoveDetectedBlankPages() {
    return removeDetectedBlankPages;
  }


  public void setRemoveDetectedBlankPages(Boolean removeDetectedBlankPages) {
    this.removeDetectedBlankPages = removeDetectedBlankPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageDetectBlankPagesParameters imageDetectBlankPagesParameters = (ImageDetectBlankPagesParameters) o;
    return Objects.equals(this.fileId, imageDetectBlankPagesParameters.fileId) &&
        Objects.equals(this.pageRange, imageDetectBlankPagesParameters.pageRange) &&
        Objects.equals(this.removeDetectedBlankPages, imageDetectBlankPagesParameters.removeDetectedBlankPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, pageRange, removeDetectedBlankPages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageDetectBlankPagesParameters {\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    pageRange: ").append(toIndentedString(pageRange)).append("\n");
    sb.append("    removeDetectedBlankPages: ").append(toIndentedString(removeDetectedBlankPages)).append("\n");
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

