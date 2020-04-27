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
import org.openapitools.client.model.PdfConformance;
import org.openapitools.client.model.TextAlignment;

/**
 * Represents the parameters for importing a document as PDF.
 */
@ApiModel(description = "Represents the parameters for importing a document as PDF.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-27T13:23:36.328+02:00[Europe/Paris]")
public class PdfLoadDocumentParameters {
  public static final String SERIALIZED_NAME_FILE_NAME = "FileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_PASSWORD = "Password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_CONFORMANCE = "Conformance";
  @SerializedName(SERIALIZED_NAME_CONFORMANCE)
  private PdfConformance conformance;

  public static final String SERIALIZED_NAME_CONTENT_ENCODING = "ContentEncoding";
  @SerializedName(SERIALIZED_NAME_CONTENT_ENCODING)
  private ContentEncoding contentEncoding;

  public static final String SERIALIZED_NAME_ENABLE_COLOR_DETECTION = "EnableColorDetection";
  @SerializedName(SERIALIZED_NAME_ENABLE_COLOR_DETECTION)
  private Boolean enableColorDetection = false;

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

  public static final String SERIALIZED_NAME_TXT_PAGE_WIDTH = "TxtPageWidth";
  @SerializedName(SERIALIZED_NAME_TXT_PAGE_WIDTH)
  private Float txtPageWidth = 595f;

  public static final String SERIALIZED_NAME_TXT_PAGE_HEIGHT = "TxtPageHeight";
  @SerializedName(SERIALIZED_NAME_TXT_PAGE_HEIGHT)
  private Float txtPageHeight = 842f;

  public static final String SERIALIZED_NAME_TXT_PAGE_MARGIN_LEFT = "TxtPageMarginLeft";
  @SerializedName(SERIALIZED_NAME_TXT_PAGE_MARGIN_LEFT)
  private Float txtPageMarginLeft = 10f;

  public static final String SERIALIZED_NAME_TXT_PAGE_MARGIN_TOP = "TxtPageMarginTop";
  @SerializedName(SERIALIZED_NAME_TXT_PAGE_MARGIN_TOP)
  private Float txtPageMarginTop = 10f;

  public static final String SERIALIZED_NAME_TXT_PAGE_MARGIN_RIGHT = "TxtPageMarginRight";
  @SerializedName(SERIALIZED_NAME_TXT_PAGE_MARGIN_RIGHT)
  private Float txtPageMarginRight = 10f;

  public static final String SERIALIZED_NAME_TXT_PAGE_MARGIN_BOTTOM = "TxtPageMarginBottom";
  @SerializedName(SERIALIZED_NAME_TXT_PAGE_MARGIN_BOTTOM)
  private Float txtPageMarginBottom = 10f;

  public static final String SERIALIZED_NAME_TXT_HORIZONTAL_TEXT_ALIGNMENT = "TxtHorizontalTextAlignment";
  @SerializedName(SERIALIZED_NAME_TXT_HORIZONTAL_TEXT_ALIGNMENT)
  private TextAlignment txtHorizontalTextAlignment;

  public static final String SERIALIZED_NAME_TXT_FONT_SIZE = "TxtFontSize";
  @SerializedName(SERIALIZED_NAME_TXT_FONT_SIZE)
  private Float txtFontSize = 12f;

  public static final String SERIALIZED_NAME_TXT_FONT_FAMILY = "TxtFontFamily";
  @SerializedName(SERIALIZED_NAME_TXT_FONT_FAMILY)
  private String txtFontFamily = "Arial Unicode MS";

  public static final String SERIALIZED_NAME_TXT_FONT_BOLD = "TxtFontBold";
  @SerializedName(SERIALIZED_NAME_TXT_FONT_BOLD)
  private Boolean txtFontBold = false;

  public static final String SERIALIZED_NAME_TXT_FONT_ITALIC = "TxtFontItalic";
  @SerializedName(SERIALIZED_NAME_TXT_FONT_ITALIC)
  private Boolean txtFontItalic = false;


  public PdfLoadDocumentParameters fileName(String fileName) {
    
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


  public PdfLoadDocumentParameters password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Specifies the password of the document.
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the password of the document.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public PdfLoadDocumentParameters conformance(PdfConformance conformance) {
    
    this.conformance = conformance;
    return this;
  }

   /**
   * Get conformance
   * @return conformance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PdfConformance getConformance() {
    return conformance;
  }


  public void setConformance(PdfConformance conformance) {
    this.conformance = conformance;
  }


  public PdfLoadDocumentParameters contentEncoding(ContentEncoding contentEncoding) {
    
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


  public PdfLoadDocumentParameters enableColorDetection(Boolean enableColorDetection) {
    
    this.enableColorDetection = enableColorDetection;
    return this;
  }

   /**
   * Specifies whether color detection must be used while importing a raster format to PDF.
   * @return enableColorDetection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether color detection must be used while importing a raster format to PDF.")

  public Boolean getEnableColorDetection() {
    return enableColorDetection;
  }


  public void setEnableColorDetection(Boolean enableColorDetection) {
    this.enableColorDetection = enableColorDetection;
  }


  public PdfLoadDocumentParameters getPreview(Boolean getPreview) {
    
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


  public PdfLoadDocumentParameters thumbnailWidth(Integer thumbnailWidth) {
    
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


  public PdfLoadDocumentParameters thumbnailHeight(Integer thumbnailHeight) {
    
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


  public PdfLoadDocumentParameters thumbnailBackgroundColor(String thumbnailBackgroundColor) {
    
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


  public PdfLoadDocumentParameters thumbnailFitToPageSize(Boolean thumbnailFitToPageSize) {
    
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


  public PdfLoadDocumentParameters txtPageWidth(Float txtPageWidth) {
    
    this.txtPageWidth = txtPageWidth;
    return this;
  }

   /**
   * Specifies the page width, in points, of produced documents from txt files.
   * @return txtPageWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the page width, in points, of produced documents from txt files.")

  public Float getTxtPageWidth() {
    return txtPageWidth;
  }


  public void setTxtPageWidth(Float txtPageWidth) {
    this.txtPageWidth = txtPageWidth;
  }


  public PdfLoadDocumentParameters txtPageHeight(Float txtPageHeight) {
    
    this.txtPageHeight = txtPageHeight;
    return this;
  }

   /**
   * Specifies the page height, in points, of produced documents from txt files.
   * @return txtPageHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the page height, in points, of produced documents from txt files.")

  public Float getTxtPageHeight() {
    return txtPageHeight;
  }


  public void setTxtPageHeight(Float txtPageHeight) {
    this.txtPageHeight = txtPageHeight;
  }


  public PdfLoadDocumentParameters txtPageMarginLeft(Float txtPageMarginLeft) {
    
    this.txtPageMarginLeft = txtPageMarginLeft;
    return this;
  }

   /**
   * Specifies the page margin left, in points, of produced documents from txt files.
   * @return txtPageMarginLeft
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the page margin left, in points, of produced documents from txt files.")

  public Float getTxtPageMarginLeft() {
    return txtPageMarginLeft;
  }


  public void setTxtPageMarginLeft(Float txtPageMarginLeft) {
    this.txtPageMarginLeft = txtPageMarginLeft;
  }


  public PdfLoadDocumentParameters txtPageMarginTop(Float txtPageMarginTop) {
    
    this.txtPageMarginTop = txtPageMarginTop;
    return this;
  }

   /**
   * Specifies the page margin top, in points, of produced documents from txt files.
   * @return txtPageMarginTop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the page margin top, in points, of produced documents from txt files.")

  public Float getTxtPageMarginTop() {
    return txtPageMarginTop;
  }


  public void setTxtPageMarginTop(Float txtPageMarginTop) {
    this.txtPageMarginTop = txtPageMarginTop;
  }


  public PdfLoadDocumentParameters txtPageMarginRight(Float txtPageMarginRight) {
    
    this.txtPageMarginRight = txtPageMarginRight;
    return this;
  }

   /**
   * Specifies the page margin right, in points, of produced documents from txt files.
   * @return txtPageMarginRight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the page margin right, in points, of produced documents from txt files.")

  public Float getTxtPageMarginRight() {
    return txtPageMarginRight;
  }


  public void setTxtPageMarginRight(Float txtPageMarginRight) {
    this.txtPageMarginRight = txtPageMarginRight;
  }


  public PdfLoadDocumentParameters txtPageMarginBottom(Float txtPageMarginBottom) {
    
    this.txtPageMarginBottom = txtPageMarginBottom;
    return this;
  }

   /**
   * Specifies the page margin bottom, in points, of produced documents from txt files.
   * @return txtPageMarginBottom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the page margin bottom, in points, of produced documents from txt files.")

  public Float getTxtPageMarginBottom() {
    return txtPageMarginBottom;
  }


  public void setTxtPageMarginBottom(Float txtPageMarginBottom) {
    this.txtPageMarginBottom = txtPageMarginBottom;
  }


  public PdfLoadDocumentParameters txtHorizontalTextAlignment(TextAlignment txtHorizontalTextAlignment) {
    
    this.txtHorizontalTextAlignment = txtHorizontalTextAlignment;
    return this;
  }

   /**
   * Get txtHorizontalTextAlignment
   * @return txtHorizontalTextAlignment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TextAlignment getTxtHorizontalTextAlignment() {
    return txtHorizontalTextAlignment;
  }


  public void setTxtHorizontalTextAlignment(TextAlignment txtHorizontalTextAlignment) {
    this.txtHorizontalTextAlignment = txtHorizontalTextAlignment;
  }


  public PdfLoadDocumentParameters txtFontSize(Float txtFontSize) {
    
    this.txtFontSize = txtFontSize;
    return this;
  }

   /**
   * Specifies the text size, in points, to be used for producing documents from txt files.
   * @return txtFontSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the text size, in points, to be used for producing documents from txt files.")

  public Float getTxtFontSize() {
    return txtFontSize;
  }


  public void setTxtFontSize(Float txtFontSize) {
    this.txtFontSize = txtFontSize;
  }


  public PdfLoadDocumentParameters txtFontFamily(String txtFontFamily) {
    
    this.txtFontFamily = txtFontFamily;
    return this;
  }

   /**
   * Specifies the name of the font to be used for producing documents from txt files.
   * @return txtFontFamily
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the name of the font to be used for producing documents from txt files.")

  public String getTxtFontFamily() {
    return txtFontFamily;
  }


  public void setTxtFontFamily(String txtFontFamily) {
    this.txtFontFamily = txtFontFamily;
  }


  public PdfLoadDocumentParameters txtFontBold(Boolean txtFontBold) {
    
    this.txtFontBold = txtFontBold;
    return this;
  }

   /**
   * Specifies whether the font to be used for producing documents from txt files must have a bold style.
   * @return txtFontBold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether the font to be used for producing documents from txt files must have a bold style.")

  public Boolean getTxtFontBold() {
    return txtFontBold;
  }


  public void setTxtFontBold(Boolean txtFontBold) {
    this.txtFontBold = txtFontBold;
  }


  public PdfLoadDocumentParameters txtFontItalic(Boolean txtFontItalic) {
    
    this.txtFontItalic = txtFontItalic;
    return this;
  }

   /**
   * Specifies whether the font to be used for producing documents from txt files must have an italic style.
   * @return txtFontItalic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether the font to be used for producing documents from txt files must have an italic style.")

  public Boolean getTxtFontItalic() {
    return txtFontItalic;
  }


  public void setTxtFontItalic(Boolean txtFontItalic) {
    this.txtFontItalic = txtFontItalic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfLoadDocumentParameters pdfLoadDocumentParameters = (PdfLoadDocumentParameters) o;
    return Objects.equals(this.fileName, pdfLoadDocumentParameters.fileName) &&
        Objects.equals(this.password, pdfLoadDocumentParameters.password) &&
        Objects.equals(this.conformance, pdfLoadDocumentParameters.conformance) &&
        Objects.equals(this.contentEncoding, pdfLoadDocumentParameters.contentEncoding) &&
        Objects.equals(this.enableColorDetection, pdfLoadDocumentParameters.enableColorDetection) &&
        Objects.equals(this.getPreview, pdfLoadDocumentParameters.getPreview) &&
        Objects.equals(this.thumbnailWidth, pdfLoadDocumentParameters.thumbnailWidth) &&
        Objects.equals(this.thumbnailHeight, pdfLoadDocumentParameters.thumbnailHeight) &&
        Objects.equals(this.thumbnailBackgroundColor, pdfLoadDocumentParameters.thumbnailBackgroundColor) &&
        Objects.equals(this.thumbnailFitToPageSize, pdfLoadDocumentParameters.thumbnailFitToPageSize) &&
        Objects.equals(this.txtPageWidth, pdfLoadDocumentParameters.txtPageWidth) &&
        Objects.equals(this.txtPageHeight, pdfLoadDocumentParameters.txtPageHeight) &&
        Objects.equals(this.txtPageMarginLeft, pdfLoadDocumentParameters.txtPageMarginLeft) &&
        Objects.equals(this.txtPageMarginTop, pdfLoadDocumentParameters.txtPageMarginTop) &&
        Objects.equals(this.txtPageMarginRight, pdfLoadDocumentParameters.txtPageMarginRight) &&
        Objects.equals(this.txtPageMarginBottom, pdfLoadDocumentParameters.txtPageMarginBottom) &&
        Objects.equals(this.txtHorizontalTextAlignment, pdfLoadDocumentParameters.txtHorizontalTextAlignment) &&
        Objects.equals(this.txtFontSize, pdfLoadDocumentParameters.txtFontSize) &&
        Objects.equals(this.txtFontFamily, pdfLoadDocumentParameters.txtFontFamily) &&
        Objects.equals(this.txtFontBold, pdfLoadDocumentParameters.txtFontBold) &&
        Objects.equals(this.txtFontItalic, pdfLoadDocumentParameters.txtFontItalic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, password, conformance, contentEncoding, enableColorDetection, getPreview, thumbnailWidth, thumbnailHeight, thumbnailBackgroundColor, thumbnailFitToPageSize, txtPageWidth, txtPageHeight, txtPageMarginLeft, txtPageMarginTop, txtPageMarginRight, txtPageMarginBottom, txtHorizontalTextAlignment, txtFontSize, txtFontFamily, txtFontBold, txtFontItalic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfLoadDocumentParameters {\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    conformance: ").append(toIndentedString(conformance)).append("\n");
    sb.append("    contentEncoding: ").append(toIndentedString(contentEncoding)).append("\n");
    sb.append("    enableColorDetection: ").append(toIndentedString(enableColorDetection)).append("\n");
    sb.append("    getPreview: ").append(toIndentedString(getPreview)).append("\n");
    sb.append("    thumbnailWidth: ").append(toIndentedString(thumbnailWidth)).append("\n");
    sb.append("    thumbnailHeight: ").append(toIndentedString(thumbnailHeight)).append("\n");
    sb.append("    thumbnailBackgroundColor: ").append(toIndentedString(thumbnailBackgroundColor)).append("\n");
    sb.append("    thumbnailFitToPageSize: ").append(toIndentedString(thumbnailFitToPageSize)).append("\n");
    sb.append("    txtPageWidth: ").append(toIndentedString(txtPageWidth)).append("\n");
    sb.append("    txtPageHeight: ").append(toIndentedString(txtPageHeight)).append("\n");
    sb.append("    txtPageMarginLeft: ").append(toIndentedString(txtPageMarginLeft)).append("\n");
    sb.append("    txtPageMarginTop: ").append(toIndentedString(txtPageMarginTop)).append("\n");
    sb.append("    txtPageMarginRight: ").append(toIndentedString(txtPageMarginRight)).append("\n");
    sb.append("    txtPageMarginBottom: ").append(toIndentedString(txtPageMarginBottom)).append("\n");
    sb.append("    txtHorizontalTextAlignment: ").append(toIndentedString(txtHorizontalTextAlignment)).append("\n");
    sb.append("    txtFontSize: ").append(toIndentedString(txtFontSize)).append("\n");
    sb.append("    txtFontFamily: ").append(toIndentedString(txtFontFamily)).append("\n");
    sb.append("    txtFontBold: ").append(toIndentedString(txtFontBold)).append("\n");
    sb.append("    txtFontItalic: ").append(toIndentedString(txtFontItalic)).append("\n");
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

