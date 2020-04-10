/*
 * PassportPDF API
 *       Introduction:    PassportPDF API is a REST API that lets you perform complex operations on documents and images easily.  You may consume the API by using our.NET SDK (other platforms / languages are soon to come), or any REST client by sending your requests to the appropriate endpoints.   A list of all the available endpoints can be found on the API reference page at https://passportpdfapi.com/references/api/index.html        Authentication:    Each available operation has a predefined cost, expressed as a number of tokens.  These tokens are deducted from your \"passport,\" which has a unique identifier that acts as an API key. This key is, therefore, required to be provided with each request for the latter to be honored(except if the operation does not have a cost, typically when you request a simple data with a GET).  Your key must be included in the header of the request, under the name \"X-PassportPdf-API-Key.\"  If you are using the.NET SDK, you can either set your key in the ApiKey property of your API instance(PdfApi or ImageApi, for example) or set it globally in the GlobalConfiguration instance if you want to set it once for the whole life cycle of your application.          Communication with the API:    All the available actions are listed on the API reference page, as previously mentioned.  There are several different controllers, i.e., routes, which categorize the actions.For example, you may use the PDF controller(\"/api/pdf\" route) to perform PDF - related operations, and the Image controller(\"/api/image\") for images.  Each action defines what kind of parameters(if any) is expected, and what kind of response is served.Parameters and responses are represented using data models, or \"schemas,\" and are listed in the \"Schemas\" section of the reference.   Parameters and response models of a given action are both prefixed by the controller name, the action name, and \"Parameters\" / \"Response,\" e.g. \"api/pdf/reduce\" respectively receives and serves a PdfReduceParameters and PdfReduceResponse models.  Using the .NET SDK, you will find the objects to interact with the different controllers in the PassportPDF.Api namespace and all the schemas in the PassportPDF.Model namespace.        Processing documents:    Each document manipulation starts with importing the file onto the API.  The LoadDocument action of the PDF controller lets you import your document as a PDF.  Note that the GetPDFImportSupportedFileExtensions action of the same controller will let you know all the different types of files that you may import as a PDF. LoadDocument responds with a JSON-serialized PdfLoadDocumentResponse model, which contains a \"FileId\" property.This identifier is required for the API to know about your document for further manipulations, hence the presence of a \"FileId\" property in the PdfReduceParameters schema (and many other parameters schemas). To download the changes made to a file, you need, of course, to download the new version of the file from the API.  To save your document as a PDF, you will need to use the SaveDocument action of the PDF controller and provide a PdfSaveDocumentParameters data model that contains the identifier of your file.        Errors:    Conventional HTTP response codes are used to indicate the success or failure of an API request.   The Error data model also defines some information about an error that occurred on the API.   Each response model has an Error in its definition, and its sole existence in the serialized response - which should thus always be checked - indicates that something went wrong.  Among the information given by the Error schema, \"ResultCode\" specifies a value of the \"PassportPDFStatus\" enumeration, that defines a first level of error information. \"InternalErrorId\" defines a unique identifier for the error, which comes very handy for us to troubleshoot any issue you may encounter quickly.        Efficiency considerations:    Multipart upload/download is available and lets you directly stream a file to/from the API.  In the PDF controller, LoadDocument/LoadDocumentMultipart and SaveDocument/SaveDocumentToFile may be used to upload/download a document using respectively binary data serialization and streaming multipart HTTP requests.  The second approach should be favored when dealing with large files, as it will be much more efficient in that context.  
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
import org.openapitools.client.model.FontStyle;
import org.openapitools.client.model.StandardFontName;
import org.openapitools.client.model.TextAlignment;

/**
 * Represents the parameters for aligned text content.
 */
@ApiModel(description = "Represents the parameters for aligned text content.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-10T16:23:29.092+02:00[Europe/Paris]")
public class PdfAlignedTextParameters {
  public static final String SERIALIZED_NAME_TEXT_VERTICAL_ALIGNMENT = "TextVerticalAlignment";
  @SerializedName(SERIALIZED_NAME_TEXT_VERTICAL_ALIGNMENT)
  private TextAlignment textVerticalAlignment;

  public static final String SERIALIZED_NAME_TEXT_HORIZONTAL_ALIGNMENT = "TextHorizontalAlignment";
  @SerializedName(SERIALIZED_NAME_TEXT_HORIZONTAL_ALIGNMENT)
  private TextAlignment textHorizontalAlignment;

  public static final String SERIALIZED_NAME_TEXT = "Text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_TEXT_COLOR = "TextColor";
  @SerializedName(SERIALIZED_NAME_TEXT_COLOR)
  private String textColor = "black";

  public static final String SERIALIZED_NAME_FONT_NAME = "FontName";
  @SerializedName(SERIALIZED_NAME_FONT_NAME)
  private String fontName;

  public static final String SERIALIZED_NAME_STANDARD_FONT_NAME = "StandardFontName";
  @SerializedName(SERIALIZED_NAME_STANDARD_FONT_NAME)
  private StandardFontName standardFontName;

  public static final String SERIALIZED_NAME_FONT_STYLE = "FontStyle";
  @SerializedName(SERIALIZED_NAME_FONT_STYLE)
  private FontStyle fontStyle;

  public static final String SERIALIZED_NAME_FONT_SIZE = "FontSize";
  @SerializedName(SERIALIZED_NAME_FONT_SIZE)
  private Integer fontSize = 11;


  public PdfAlignedTextParameters textVerticalAlignment(TextAlignment textVerticalAlignment) {
    
    this.textVerticalAlignment = textVerticalAlignment;
    return this;
  }

   /**
   * Get textVerticalAlignment
   * @return textVerticalAlignment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TextAlignment getTextVerticalAlignment() {
    return textVerticalAlignment;
  }


  public void setTextVerticalAlignment(TextAlignment textVerticalAlignment) {
    this.textVerticalAlignment = textVerticalAlignment;
  }


  public PdfAlignedTextParameters textHorizontalAlignment(TextAlignment textHorizontalAlignment) {
    
    this.textHorizontalAlignment = textHorizontalAlignment;
    return this;
  }

   /**
   * Get textHorizontalAlignment
   * @return textHorizontalAlignment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TextAlignment getTextHorizontalAlignment() {
    return textHorizontalAlignment;
  }


  public void setTextHorizontalAlignment(TextAlignment textHorizontalAlignment) {
    this.textHorizontalAlignment = textHorizontalAlignment;
  }


  public PdfAlignedTextParameters text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Specifies the text.
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the text.")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public PdfAlignedTextParameters textColor(String textColor) {
    
    this.textColor = textColor;
    return this;
  }

   /**
   * Specifies the color of the text, using the color name (ie: \&quot;red\&quot;) or its RGBa code (ie: \&quot;rgba(255,0,0,1)\&quot;).
   * @return textColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the color of the text, using the color name (ie: \"red\") or its RGBa code (ie: \"rgba(255,0,0,1)\").")

  public String getTextColor() {
    return textColor;
  }


  public void setTextColor(String textColor) {
    this.textColor = textColor;
  }


  public PdfAlignedTextParameters fontName(String fontName) {
    
    this.fontName = fontName;
    return this;
  }

   /**
   * Specifies the name of the font to be used.
   * @return fontName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the name of the font to be used.")

  public String getFontName() {
    return fontName;
  }


  public void setFontName(String fontName) {
    this.fontName = fontName;
  }


  public PdfAlignedTextParameters standardFontName(StandardFontName standardFontName) {
    
    this.standardFontName = standardFontName;
    return this;
  }

   /**
   * Get standardFontName
   * @return standardFontName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StandardFontName getStandardFontName() {
    return standardFontName;
  }


  public void setStandardFontName(StandardFontName standardFontName) {
    this.standardFontName = standardFontName;
  }


  public PdfAlignedTextParameters fontStyle(FontStyle fontStyle) {
    
    this.fontStyle = fontStyle;
    return this;
  }

   /**
   * Get fontStyle
   * @return fontStyle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FontStyle getFontStyle() {
    return fontStyle;
  }


  public void setFontStyle(FontStyle fontStyle) {
    this.fontStyle = fontStyle;
  }


  public PdfAlignedTextParameters fontSize(Integer fontSize) {
    
    this.fontSize = fontSize;
    return this;
  }

   /**
   * Specifies the size of the font.
   * @return fontSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the size of the font.")

  public Integer getFontSize() {
    return fontSize;
  }


  public void setFontSize(Integer fontSize) {
    this.fontSize = fontSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfAlignedTextParameters pdfAlignedTextParameters = (PdfAlignedTextParameters) o;
    return Objects.equals(this.textVerticalAlignment, pdfAlignedTextParameters.textVerticalAlignment) &&
        Objects.equals(this.textHorizontalAlignment, pdfAlignedTextParameters.textHorizontalAlignment) &&
        Objects.equals(this.text, pdfAlignedTextParameters.text) &&
        Objects.equals(this.textColor, pdfAlignedTextParameters.textColor) &&
        Objects.equals(this.fontName, pdfAlignedTextParameters.fontName) &&
        Objects.equals(this.standardFontName, pdfAlignedTextParameters.standardFontName) &&
        Objects.equals(this.fontStyle, pdfAlignedTextParameters.fontStyle) &&
        Objects.equals(this.fontSize, pdfAlignedTextParameters.fontSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textVerticalAlignment, textHorizontalAlignment, text, textColor, fontName, standardFontName, fontStyle, fontSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfAlignedTextParameters {\n");
    sb.append("    textVerticalAlignment: ").append(toIndentedString(textVerticalAlignment)).append("\n");
    sb.append("    textHorizontalAlignment: ").append(toIndentedString(textHorizontalAlignment)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    textColor: ").append(toIndentedString(textColor)).append("\n");
    sb.append("    fontName: ").append(toIndentedString(fontName)).append("\n");
    sb.append("    standardFontName: ").append(toIndentedString(standardFontName)).append("\n");
    sb.append("    fontStyle: ").append(toIndentedString(fontStyle)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
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

