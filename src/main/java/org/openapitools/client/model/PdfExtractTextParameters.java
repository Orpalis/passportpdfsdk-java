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
import org.openapitools.client.model.PdfExtractTextMode;

/**
 * Represents the parameters for an extract text action.
 */
@ApiModel(description = "Represents the parameters for an extract text action.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-27T13:23:36.328+02:00[Europe/Paris]")
public class PdfExtractTextParameters {
  public static final String SERIALIZED_NAME_FILE_ID = "FileId";
  @SerializedName(SERIALIZED_NAME_FILE_ID)
  private String fileId;

  public static final String SERIALIZED_NAME_PAGE_RANGE = "PageRange";
  @SerializedName(SERIALIZED_NAME_PAGE_RANGE)
  private String pageRange;

  public static final String SERIALIZED_NAME_TEXT_EXTRACTION_MODE = "TextExtractionMode";
  @SerializedName(SERIALIZED_NAME_TEXT_EXTRACTION_MODE)
  private PdfExtractTextMode textExtractionMode;

  public static final String SERIALIZED_NAME_TEXT_EXTRACTION_AREA_LEFT = "TextExtractionAreaLeft";
  @SerializedName(SERIALIZED_NAME_TEXT_EXTRACTION_AREA_LEFT)
  private Float textExtractionAreaLeft = 0f;

  public static final String SERIALIZED_NAME_TEXT_EXTRACTION_AREA_TOP = "TextExtractionAreaTop";
  @SerializedName(SERIALIZED_NAME_TEXT_EXTRACTION_AREA_TOP)
  private Float textExtractionAreaTop = 0f;

  public static final String SERIALIZED_NAME_TEXT_EXTRACTION_AREA_WIDTH = "TextExtractionAreaWidth";
  @SerializedName(SERIALIZED_NAME_TEXT_EXTRACTION_AREA_WIDTH)
  private Float textExtractionAreaWidth = 0f;

  public static final String SERIALIZED_NAME_TEXT_EXTRACTION_AREA_HEIGHT = "TextExtractionAreaHeight";
  @SerializedName(SERIALIZED_NAME_TEXT_EXTRACTION_AREA_HEIGHT)
  private Float textExtractionAreaHeight = 0f;

  public static final String SERIALIZED_NAME_INCLUDE_HEADER = "IncludeHeader";
  @SerializedName(SERIALIZED_NAME_INCLUDE_HEADER)
  private Boolean includeHeader = false;


  public PdfExtractTextParameters fileId(String fileId) {
    
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


  public PdfExtractTextParameters pageRange(String pageRange) {
    
    this.pageRange = pageRange;
    return this;
  }

   /**
   * Specifies the number of the page, or the range of pages to extract text from.
   * @return pageRange
  **/
  @ApiModelProperty(required = true, value = "Specifies the number of the page, or the range of pages to extract text from.")

  public String getPageRange() {
    return pageRange;
  }


  public void setPageRange(String pageRange) {
    this.pageRange = pageRange;
  }


  public PdfExtractTextParameters textExtractionMode(PdfExtractTextMode textExtractionMode) {
    
    this.textExtractionMode = textExtractionMode;
    return this;
  }

   /**
   * Get textExtractionMode
   * @return textExtractionMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PdfExtractTextMode getTextExtractionMode() {
    return textExtractionMode;
  }


  public void setTextExtractionMode(PdfExtractTextMode textExtractionMode) {
    this.textExtractionMode = textExtractionMode;
  }


  public PdfExtractTextParameters textExtractionAreaLeft(Float textExtractionAreaLeft) {
    
    this.textExtractionAreaLeft = textExtractionAreaLeft;
    return this;
  }

   /**
   * Specifies the left coordinate of the text extraction area for the PageAreaFormated extract mode.
   * @return textExtractionAreaLeft
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the left coordinate of the text extraction area for the PageAreaFormated extract mode.")

  public Float getTextExtractionAreaLeft() {
    return textExtractionAreaLeft;
  }


  public void setTextExtractionAreaLeft(Float textExtractionAreaLeft) {
    this.textExtractionAreaLeft = textExtractionAreaLeft;
  }


  public PdfExtractTextParameters textExtractionAreaTop(Float textExtractionAreaTop) {
    
    this.textExtractionAreaTop = textExtractionAreaTop;
    return this;
  }

   /**
   * Specifies the top coordinate of the text extraction area for the PageAreaFormated extract mode.
   * @return textExtractionAreaTop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the top coordinate of the text extraction area for the PageAreaFormated extract mode.")

  public Float getTextExtractionAreaTop() {
    return textExtractionAreaTop;
  }


  public void setTextExtractionAreaTop(Float textExtractionAreaTop) {
    this.textExtractionAreaTop = textExtractionAreaTop;
  }


  public PdfExtractTextParameters textExtractionAreaWidth(Float textExtractionAreaWidth) {
    
    this.textExtractionAreaWidth = textExtractionAreaWidth;
    return this;
  }

   /**
   * Specifies the width of the text extraction area for the PageAreaFormated extract mode.
   * @return textExtractionAreaWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the width of the text extraction area for the PageAreaFormated extract mode.")

  public Float getTextExtractionAreaWidth() {
    return textExtractionAreaWidth;
  }


  public void setTextExtractionAreaWidth(Float textExtractionAreaWidth) {
    this.textExtractionAreaWidth = textExtractionAreaWidth;
  }


  public PdfExtractTextParameters textExtractionAreaHeight(Float textExtractionAreaHeight) {
    
    this.textExtractionAreaHeight = textExtractionAreaHeight;
    return this;
  }

   /**
   * Specifies the height of the text extraction area for the PageAreaFormated extract mode.
   * @return textExtractionAreaHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the height of the text extraction area for the PageAreaFormated extract mode.")

  public Float getTextExtractionAreaHeight() {
    return textExtractionAreaHeight;
  }


  public void setTextExtractionAreaHeight(Float textExtractionAreaHeight) {
    this.textExtractionAreaHeight = textExtractionAreaHeight;
  }


  public PdfExtractTextParameters includeHeader(Boolean includeHeader) {
    
    this.includeHeader = includeHeader;
    return this;
  }

   /**
   * Specifies whether the CSV output should include header information.
   * @return includeHeader
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether the CSV output should include header information.")

  public Boolean getIncludeHeader() {
    return includeHeader;
  }


  public void setIncludeHeader(Boolean includeHeader) {
    this.includeHeader = includeHeader;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfExtractTextParameters pdfExtractTextParameters = (PdfExtractTextParameters) o;
    return Objects.equals(this.fileId, pdfExtractTextParameters.fileId) &&
        Objects.equals(this.pageRange, pdfExtractTextParameters.pageRange) &&
        Objects.equals(this.textExtractionMode, pdfExtractTextParameters.textExtractionMode) &&
        Objects.equals(this.textExtractionAreaLeft, pdfExtractTextParameters.textExtractionAreaLeft) &&
        Objects.equals(this.textExtractionAreaTop, pdfExtractTextParameters.textExtractionAreaTop) &&
        Objects.equals(this.textExtractionAreaWidth, pdfExtractTextParameters.textExtractionAreaWidth) &&
        Objects.equals(this.textExtractionAreaHeight, pdfExtractTextParameters.textExtractionAreaHeight) &&
        Objects.equals(this.includeHeader, pdfExtractTextParameters.includeHeader);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, pageRange, textExtractionMode, textExtractionAreaLeft, textExtractionAreaTop, textExtractionAreaWidth, textExtractionAreaHeight, includeHeader);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfExtractTextParameters {\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    pageRange: ").append(toIndentedString(pageRange)).append("\n");
    sb.append("    textExtractionMode: ").append(toIndentedString(textExtractionMode)).append("\n");
    sb.append("    textExtractionAreaLeft: ").append(toIndentedString(textExtractionAreaLeft)).append("\n");
    sb.append("    textExtractionAreaTop: ").append(toIndentedString(textExtractionAreaTop)).append("\n");
    sb.append("    textExtractionAreaWidth: ").append(toIndentedString(textExtractionAreaWidth)).append("\n");
    sb.append("    textExtractionAreaHeight: ").append(toIndentedString(textExtractionAreaHeight)).append("\n");
    sb.append("    includeHeader: ").append(toIndentedString(includeHeader)).append("\n");
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

