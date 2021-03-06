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
import org.openapitools.client.model.PdfTextParameters;

/**
 * Represents information about the FreeText Annotation.
 */
@ApiModel(description = "Represents information about the FreeText Annotation.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-27T13:23:36.328+02:00[Europe/Paris]")
public class FreeTextAnnotationParameters {
  public static final String SERIALIZED_NAME_ANNOTATION_LAYOUT = "AnnotationLayout";
  @SerializedName(SERIALIZED_NAME_ANNOTATION_LAYOUT)
  private DrawableContentLayoutParameters annotationLayout;

  public static final String SERIALIZED_NAME_TEXT_PARAMETERS = "TextParameters";
  @SerializedName(SERIALIZED_NAME_TEXT_PARAMETERS)
  private PdfTextParameters textParameters;

  public static final String SERIALIZED_NAME_TITLE = "Title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_SUBJECT = "Subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_SHOW_BORDER = "ShowBorder";
  @SerializedName(SERIALIZED_NAME_SHOW_BORDER)
  private Boolean showBorder;

  public static final String SERIALIZED_NAME_COLOR = "Color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color = "red";


  public FreeTextAnnotationParameters annotationLayout(DrawableContentLayoutParameters annotationLayout) {
    
    this.annotationLayout = annotationLayout;
    return this;
  }

   /**
   * Get annotationLayout
   * @return annotationLayout
  **/
  @ApiModelProperty(required = true, value = "")

  public DrawableContentLayoutParameters getAnnotationLayout() {
    return annotationLayout;
  }


  public void setAnnotationLayout(DrawableContentLayoutParameters annotationLayout) {
    this.annotationLayout = annotationLayout;
  }


  public FreeTextAnnotationParameters textParameters(PdfTextParameters textParameters) {
    
    this.textParameters = textParameters;
    return this;
  }

   /**
   * Get textParameters
   * @return textParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PdfTextParameters getTextParameters() {
    return textParameters;
  }


  public void setTextParameters(PdfTextParameters textParameters) {
    this.textParameters = textParameters;
  }


  public FreeTextAnnotationParameters title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Specifies the title of the annotation, if any.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the title of the annotation, if any.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public FreeTextAnnotationParameters subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Specify the subject of the annotation, if any.
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify the subject of the annotation, if any.")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public FreeTextAnnotationParameters showBorder(Boolean showBorder) {
    
    this.showBorder = showBorder;
    return this;
  }

   /**
   * Specifies if the annotation border shall be drawn.
   * @return showBorder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if the annotation border shall be drawn.")

  public Boolean getShowBorder() {
    return showBorder;
  }


  public void setShowBorder(Boolean showBorder) {
    this.showBorder = showBorder;
  }


  public FreeTextAnnotationParameters color(String color) {
    
    this.color = color;
    return this;
  }

   /**
   * Specifies the color of the annotation, using the color name (ie: \&quot;red\&quot;) or its RGBa code (ie: \&quot;rgba(255,0,0,1)\&quot;).
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the color of the annotation, using the color name (ie: \"red\") or its RGBa code (ie: \"rgba(255,0,0,1)\").")

  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    this.color = color;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreeTextAnnotationParameters freeTextAnnotationParameters = (FreeTextAnnotationParameters) o;
    return Objects.equals(this.annotationLayout, freeTextAnnotationParameters.annotationLayout) &&
        Objects.equals(this.textParameters, freeTextAnnotationParameters.textParameters) &&
        Objects.equals(this.title, freeTextAnnotationParameters.title) &&
        Objects.equals(this.subject, freeTextAnnotationParameters.subject) &&
        Objects.equals(this.showBorder, freeTextAnnotationParameters.showBorder) &&
        Objects.equals(this.color, freeTextAnnotationParameters.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotationLayout, textParameters, title, subject, showBorder, color);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeTextAnnotationParameters {\n");
    sb.append("    annotationLayout: ").append(toIndentedString(annotationLayout)).append("\n");
    sb.append("    textParameters: ").append(toIndentedString(textParameters)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    showBorder: ").append(toIndentedString(showBorder)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

