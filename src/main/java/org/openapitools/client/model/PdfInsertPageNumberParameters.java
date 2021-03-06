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
import org.openapitools.client.model.DrawableContentLayoutParameters;
import org.openapitools.client.model.PageNumberFormat;
import org.openapitools.client.model.PdfAlignedTextParameters;

/**
 * Represents the parameters for an insert page number action.
 */
@ApiModel(description = "Represents the parameters for an insert page number action.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-27T13:23:36.328+02:00[Europe/Paris]")
public class PdfInsertPageNumberParameters {
  public static final String SERIALIZED_NAME_FILE_ID = "FileId";
  @SerializedName(SERIALIZED_NAME_FILE_ID)
  private String fileId;

  public static final String SERIALIZED_NAME_PAGE_RANGE = "PageRange";
  @SerializedName(SERIALIZED_NAME_PAGE_RANGE)
  private String pageRange;

  public static final String SERIALIZED_NAME_FORMAT = "Format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private PageNumberFormat format;

  public static final String SERIALIZED_NAME_LAYOUT = "Layout";
  @SerializedName(SERIALIZED_NAME_LAYOUT)
  private DrawableContentLayoutParameters layout;

  public static final String SERIALIZED_NAME_TEXT_PARAMETERS = "TextParameters";
  @SerializedName(SERIALIZED_NAME_TEXT_PARAMETERS)
  private PdfAlignedTextParameters textParameters;


  public PdfInsertPageNumberParameters fileId(String fileId) {
    
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


  public PdfInsertPageNumberParameters pageRange(String pageRange) {
    
    this.pageRange = pageRange;
    return this;
  }

   /**
   * Specifies the page or the range of pages on which the page number shall be inserted.
   * @return pageRange
  **/
  @ApiModelProperty(required = true, value = "Specifies the page or the range of pages on which the page number shall be inserted.")

  public String getPageRange() {
    return pageRange;
  }


  public void setPageRange(String pageRange) {
    this.pageRange = pageRange;
  }


  public PdfInsertPageNumberParameters format(PageNumberFormat format) {
    
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PageNumberFormat getFormat() {
    return format;
  }


  public void setFormat(PageNumberFormat format) {
    this.format = format;
  }


  public PdfInsertPageNumberParameters layout(DrawableContentLayoutParameters layout) {
    
    this.layout = layout;
    return this;
  }

   /**
   * Get layout
   * @return layout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DrawableContentLayoutParameters getLayout() {
    return layout;
  }


  public void setLayout(DrawableContentLayoutParameters layout) {
    this.layout = layout;
  }


  public PdfInsertPageNumberParameters textParameters(PdfAlignedTextParameters textParameters) {
    
    this.textParameters = textParameters;
    return this;
  }

   /**
   * Get textParameters
   * @return textParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PdfAlignedTextParameters getTextParameters() {
    return textParameters;
  }


  public void setTextParameters(PdfAlignedTextParameters textParameters) {
    this.textParameters = textParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfInsertPageNumberParameters pdfInsertPageNumberParameters = (PdfInsertPageNumberParameters) o;
    return Objects.equals(this.fileId, pdfInsertPageNumberParameters.fileId) &&
        Objects.equals(this.pageRange, pdfInsertPageNumberParameters.pageRange) &&
        Objects.equals(this.format, pdfInsertPageNumberParameters.format) &&
        Objects.equals(this.layout, pdfInsertPageNumberParameters.layout) &&
        Objects.equals(this.textParameters, pdfInsertPageNumberParameters.textParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, pageRange, format, layout, textParameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfInsertPageNumberParameters {\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    pageRange: ").append(toIndentedString(pageRange)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
    sb.append("    textParameters: ").append(toIndentedString(textParameters)).append("\n");
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

