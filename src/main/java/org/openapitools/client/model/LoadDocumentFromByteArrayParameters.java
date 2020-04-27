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
import org.openapitools.client.model.ContentEncoding;

/**
 * Represents the parameters for an image loading request.
 */
@ApiModel(description = "Represents the parameters for an image loading request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-27T13:23:36.328+02:00[Europe/Paris]")
public class LoadDocumentFromByteArrayParameters {
  public static final String SERIALIZED_NAME_CONTENT = "Content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private byte[] content;

  public static final String SERIALIZED_NAME_FILE_NAME = "FileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_CONTENT_ENCODING = "ContentEncoding";
  @SerializedName(SERIALIZED_NAME_CONTENT_ENCODING)
  private ContentEncoding contentEncoding;

  public static final String SERIALIZED_NAME_GET_PREVIEW = "GetPreview";
  @SerializedName(SERIALIZED_NAME_GET_PREVIEW)
  private Boolean getPreview = false;

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


  public LoadDocumentFromByteArrayParameters content(byte[] content) {
    
    this.content = content;
    return this;
  }

   /**
   * Specifies the data of the document.
   * @return content
  **/
  @ApiModelProperty(required = true, value = "Specifies the data of the document.")

  public byte[] getContent() {
    return content;
  }


  public void setContent(byte[] content) {
    this.content = content;
  }


  public LoadDocumentFromByteArrayParameters fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * Specifies the name of the document.
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the name of the document.")

  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public LoadDocumentFromByteArrayParameters contentEncoding(ContentEncoding contentEncoding) {
    
    this.contentEncoding = contentEncoding;
    return this;
  }

   /**
   * Get contentEncoding
   * @return contentEncoding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContentEncoding getContentEncoding() {
    return contentEncoding;
  }


  public void setContentEncoding(ContentEncoding contentEncoding) {
    this.contentEncoding = contentEncoding;
  }


  public LoadDocumentFromByteArrayParameters getPreview(Boolean getPreview) {
    
    this.getPreview = getPreview;
    return this;
  }

   /**
   * Specifies whether the response must contain a thumbnail of the first page of the document.
   * @return getPreview
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether the response must contain a thumbnail of the first page of the document.")

  public Boolean getGetPreview() {
    return getPreview;
  }


  public void setGetPreview(Boolean getPreview) {
    this.getPreview = getPreview;
  }


  public LoadDocumentFromByteArrayParameters thumbnailWidth(Integer thumbnailWidth) {
    
    this.thumbnailWidth = thumbnailWidth;
    return this;
  }

   /**
   * Specifies, in pixels, the width of the thumbnail to be retrieved. Only applicable if GetPreview has been set to true.
   * @return thumbnailWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies, in pixels, the width of the thumbnail to be retrieved. Only applicable if GetPreview has been set to true.")

  public Integer getThumbnailWidth() {
    return thumbnailWidth;
  }


  public void setThumbnailWidth(Integer thumbnailWidth) {
    this.thumbnailWidth = thumbnailWidth;
  }


  public LoadDocumentFromByteArrayParameters thumbnailHeight(Integer thumbnailHeight) {
    
    this.thumbnailHeight = thumbnailHeight;
    return this;
  }

   /**
   * Specifies, in pixels, the height of the thumbnail to be retrieved.  Only applicable if GetPreview has been set to true.
   * @return thumbnailHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies, in pixels, the height of the thumbnail to be retrieved.  Only applicable if GetPreview has been set to true.")

  public Integer getThumbnailHeight() {
    return thumbnailHeight;
  }


  public void setThumbnailHeight(Integer thumbnailHeight) {
    this.thumbnailHeight = thumbnailHeight;
  }


  public LoadDocumentFromByteArrayParameters thumbnailBackgroundColor(String thumbnailBackgroundColor) {
    
    this.thumbnailBackgroundColor = thumbnailBackgroundColor;
    return this;
  }

   /**
   * Specifies the background color of the thumbnail, using the color name (ie: \&quot;red\&quot;) or its RGBa code (ie: \&quot;rgba(255,0,0,1)\&quot;).   Only applicable if GetPreview has been set to true.
   * @return thumbnailBackgroundColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the background color of the thumbnail, using the color name (ie: \"red\") or its RGBa code (ie: \"rgba(255,0,0,1)\").   Only applicable if GetPreview has been set to true.")

  public String getThumbnailBackgroundColor() {
    return thumbnailBackgroundColor;
  }


  public void setThumbnailBackgroundColor(String thumbnailBackgroundColor) {
    this.thumbnailBackgroundColor = thumbnailBackgroundColor;
  }


  public LoadDocumentFromByteArrayParameters thumbnailFitToPageSize(Boolean thumbnailFitToPageSize) {
    
    this.thumbnailFitToPageSize = thumbnailFitToPageSize;
    return this;
  }

   /**
   * Specifies if the size of the produced thumbnail is automatically adjusted to don&#39;t have any margin.  Only applicable if GetPreview has been set to true.
   * @return thumbnailFitToPageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if the size of the produced thumbnail is automatically adjusted to don't have any margin.  Only applicable if GetPreview has been set to true.")

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
    LoadDocumentFromByteArrayParameters loadDocumentFromByteArrayParameters = (LoadDocumentFromByteArrayParameters) o;
    return Arrays.equals(this.content, loadDocumentFromByteArrayParameters.content) &&
        Objects.equals(this.fileName, loadDocumentFromByteArrayParameters.fileName) &&
        Objects.equals(this.contentEncoding, loadDocumentFromByteArrayParameters.contentEncoding) &&
        Objects.equals(this.getPreview, loadDocumentFromByteArrayParameters.getPreview) &&
        Objects.equals(this.thumbnailWidth, loadDocumentFromByteArrayParameters.thumbnailWidth) &&
        Objects.equals(this.thumbnailHeight, loadDocumentFromByteArrayParameters.thumbnailHeight) &&
        Objects.equals(this.thumbnailBackgroundColor, loadDocumentFromByteArrayParameters.thumbnailBackgroundColor) &&
        Objects.equals(this.thumbnailFitToPageSize, loadDocumentFromByteArrayParameters.thumbnailFitToPageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(content), fileName, contentEncoding, getPreview, thumbnailWidth, thumbnailHeight, thumbnailBackgroundColor, thumbnailFitToPageSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadDocumentFromByteArrayParameters {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    contentEncoding: ").append(toIndentedString(contentEncoding)).append("\n");
    sb.append("    getPreview: ").append(toIndentedString(getPreview)).append("\n");
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

