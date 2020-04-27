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
import org.openapitools.client.model.TiffSaveCompression;

/**
 * Represents the parameters for a save as TIFF action.
 */
@ApiModel(description = "Represents the parameters for a save as TIFF action.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-27T13:23:36.328+02:00[Europe/Paris]")
public class ImageSaveAsTIFFParameters {
  public static final String SERIALIZED_NAME_FILE_ID = "FileId";
  @SerializedName(SERIALIZED_NAME_FILE_ID)
  private String fileId;

  public static final String SERIALIZED_NAME_PAGE_RANGE = "PageRange";
  @SerializedName(SERIALIZED_NAME_PAGE_RANGE)
  private String pageRange = "*";

  public static final String SERIALIZED_NAME_COMPRESSION = "Compression";
  @SerializedName(SERIALIZED_NAME_COMPRESSION)
  private TiffSaveCompression compression;

  public static final String SERIALIZED_NAME_JPEG_QUALITY = "JpegQuality";
  @SerializedName(SERIALIZED_NAME_JPEG_QUALITY)
  private Integer jpegQuality = 75;

  public static final String SERIALIZED_NAME_USE_C_M_Y_K = "UseCMYK";
  @SerializedName(SERIALIZED_NAME_USE_C_M_Y_K)
  private Boolean useCMYK = false;


  public ImageSaveAsTIFFParameters fileId(String fileId) {
    
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


  public ImageSaveAsTIFFParameters pageRange(String pageRange) {
    
    this.pageRange = pageRange;
    return this;
  }

   /**
   * Specifies the number of the page, or the range of pages to be saved as TIFF.
   * @return pageRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the number of the page, or the range of pages to be saved as TIFF.")

  public String getPageRange() {
    return pageRange;
  }


  public void setPageRange(String pageRange) {
    this.pageRange = pageRange;
  }


  public ImageSaveAsTIFFParameters compression(TiffSaveCompression compression) {
    
    this.compression = compression;
    return this;
  }

   /**
   * Get compression
   * @return compression
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TiffSaveCompression getCompression() {
    return compression;
  }


  public void setCompression(TiffSaveCompression compression) {
    this.compression = compression;
  }


  public ImageSaveAsTIFFParameters jpegQuality(Integer jpegQuality) {
    
    this.jpegQuality = jpegQuality;
    return this;
  }

   /**
   * Specifies the level of quality to be used if JPEG compression is used, from 1 (poorest) to 100 (greatest).
   * @return jpegQuality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the level of quality to be used if JPEG compression is used, from 1 (poorest) to 100 (greatest).")

  public Integer getJpegQuality() {
    return jpegQuality;
  }


  public void setJpegQuality(Integer jpegQuality) {
    this.jpegQuality = jpegQuality;
  }


  public ImageSaveAsTIFFParameters useCMYK(Boolean useCMYK) {
    
    this.useCMYK = useCMYK;
    return this;
  }

   /**
   * Specifies whether the TIFF shall be saved in CMYK color space or not.
   * @return useCMYK
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether the TIFF shall be saved in CMYK color space or not.")

  public Boolean getUseCMYK() {
    return useCMYK;
  }


  public void setUseCMYK(Boolean useCMYK) {
    this.useCMYK = useCMYK;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageSaveAsTIFFParameters imageSaveAsTIFFParameters = (ImageSaveAsTIFFParameters) o;
    return Objects.equals(this.fileId, imageSaveAsTIFFParameters.fileId) &&
        Objects.equals(this.pageRange, imageSaveAsTIFFParameters.pageRange) &&
        Objects.equals(this.compression, imageSaveAsTIFFParameters.compression) &&
        Objects.equals(this.jpegQuality, imageSaveAsTIFFParameters.jpegQuality) &&
        Objects.equals(this.useCMYK, imageSaveAsTIFFParameters.useCMYK);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, pageRange, compression, jpegQuality, useCMYK);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageSaveAsTIFFParameters {\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    pageRange: ").append(toIndentedString(pageRange)).append("\n");
    sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
    sb.append("    jpegQuality: ").append(toIndentedString(jpegQuality)).append("\n");
    sb.append("    useCMYK: ").append(toIndentedString(useCMYK)).append("\n");
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

