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
 * Represents the parameters for a save as JPEG acion.
 */
@ApiModel(description = "Represents the parameters for a save as JPEG acion.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-27T13:23:36.328+02:00[Europe/Paris]")
public class PdfSaveAsJPEGParameters {
  public static final String SERIALIZED_NAME_FILE_ID = "FileId";
  @SerializedName(SERIALIZED_NAME_FILE_ID)
  private String fileId;

  public static final String SERIALIZED_NAME_PAGE_RANGE = "PageRange";
  @SerializedName(SERIALIZED_NAME_PAGE_RANGE)
  private String pageRange = "*";

  public static final String SERIALIZED_NAME_QUALITY = "Quality";
  @SerializedName(SERIALIZED_NAME_QUALITY)
  private Integer quality = 75;

  public static final String SERIALIZED_NAME_PROGRESSIVE = "Progressive";
  @SerializedName(SERIALIZED_NAME_PROGRESSIVE)
  private Boolean progressive = false;

  public static final String SERIALIZED_NAME_RESOLUTION = "Resolution";
  @SerializedName(SERIALIZED_NAME_RESOLUTION)
  private Float resolution = 200f;

  public static final String SERIALIZED_NAME_RENDER_FORM_FIELDS = "RenderFormFields";
  @SerializedName(SERIALIZED_NAME_RENDER_FORM_FIELDS)
  private Boolean renderFormFields = false;

  public static final String SERIALIZED_NAME_KEEP_RASTER_P_D_F_RESOLUTION = "KeepRasterPDFResolution";
  @SerializedName(SERIALIZED_NAME_KEEP_RASTER_P_D_F_RESOLUTION)
  private Boolean keepRasterPDFResolution = true;


  public PdfSaveAsJPEGParameters fileId(String fileId) {
    
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


  public PdfSaveAsJPEGParameters pageRange(String pageRange) {
    
    this.pageRange = pageRange;
    return this;
  }

   /**
   * Specifies the number of the page, or the range of pages to be saved as JPEG.
   * @return pageRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the number of the page, or the range of pages to be saved as JPEG.")

  public String getPageRange() {
    return pageRange;
  }


  public void setPageRange(String pageRange) {
    this.pageRange = pageRange;
  }


  public PdfSaveAsJPEGParameters quality(Integer quality) {
    
    this.quality = quality;
    return this;
  }

   /**
   * Specifies the level of quality to be used for the JPEG compression, from 1 (poorest) to 100 (greatest).
   * @return quality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the level of quality to be used for the JPEG compression, from 1 (poorest) to 100 (greatest).")

  public Integer getQuality() {
    return quality;
  }


  public void setQuality(Integer quality) {
    this.quality = quality;
  }


  public PdfSaveAsJPEGParameters progressive(Boolean progressive) {
    
    this.progressive = progressive;
    return this;
  }

   /**
   * Specifies if the encoded JPEG image must be progressive.
   * @return progressive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if the encoded JPEG image must be progressive.")

  public Boolean getProgressive() {
    return progressive;
  }


  public void setProgressive(Boolean progressive) {
    this.progressive = progressive;
  }


  public PdfSaveAsJPEGParameters resolution(Float resolution) {
    
    this.resolution = resolution;
    return this;
  }

   /**
   * Specifies the resolution to be used for the rendition process.
   * @return resolution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the resolution to be used for the rendition process.")

  public Float getResolution() {
    return resolution;
  }


  public void setResolution(Float resolution) {
    this.resolution = resolution;
  }


  public PdfSaveAsJPEGParameters renderFormFields(Boolean renderFormFields) {
    
    this.renderFormFields = renderFormFields;
    return this;
  }

   /**
   * Specifies whether the form fields of the PDF shall be rendered.
   * @return renderFormFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether the form fields of the PDF shall be rendered.")

  public Boolean getRenderFormFields() {
    return renderFormFields;
  }


  public void setRenderFormFields(Boolean renderFormFields) {
    this.renderFormFields = renderFormFields;
  }


  public PdfSaveAsJPEGParameters keepRasterPDFResolution(Boolean keepRasterPDFResolution) {
    
    this.keepRasterPDFResolution = keepRasterPDFResolution;
    return this;
  }

   /**
   * Specifies if the initial image resolution must be kept in case of raster-pdf processing.
   * @return keepRasterPDFResolution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if the initial image resolution must be kept in case of raster-pdf processing.")

  public Boolean getKeepRasterPDFResolution() {
    return keepRasterPDFResolution;
  }


  public void setKeepRasterPDFResolution(Boolean keepRasterPDFResolution) {
    this.keepRasterPDFResolution = keepRasterPDFResolution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfSaveAsJPEGParameters pdfSaveAsJPEGParameters = (PdfSaveAsJPEGParameters) o;
    return Objects.equals(this.fileId, pdfSaveAsJPEGParameters.fileId) &&
        Objects.equals(this.pageRange, pdfSaveAsJPEGParameters.pageRange) &&
        Objects.equals(this.quality, pdfSaveAsJPEGParameters.quality) &&
        Objects.equals(this.progressive, pdfSaveAsJPEGParameters.progressive) &&
        Objects.equals(this.resolution, pdfSaveAsJPEGParameters.resolution) &&
        Objects.equals(this.renderFormFields, pdfSaveAsJPEGParameters.renderFormFields) &&
        Objects.equals(this.keepRasterPDFResolution, pdfSaveAsJPEGParameters.keepRasterPDFResolution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, pageRange, quality, progressive, resolution, renderFormFields, keepRasterPDFResolution);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfSaveAsJPEGParameters {\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    pageRange: ").append(toIndentedString(pageRange)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    progressive: ").append(toIndentedString(progressive)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    renderFormFields: ").append(toIndentedString(renderFormFields)).append("\n");
    sb.append("    keepRasterPDFResolution: ").append(toIndentedString(keepRasterPDFResolution)).append("\n");
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

