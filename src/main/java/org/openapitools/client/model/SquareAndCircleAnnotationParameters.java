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
import org.openapitools.client.model.ContentSize;
import org.openapitools.client.model.DrawableContentLayoutParameters;

/**
 * Represents information about the Square / Circle Annotation.
 */
@ApiModel(description = "Represents information about the Square / Circle Annotation.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-27T13:23:36.328+02:00[Europe/Paris]")
public class SquareAndCircleAnnotationParameters {
  public static final String SERIALIZED_NAME_ANNOTATION_LAYOUT = "AnnotationLayout";
  @SerializedName(SERIALIZED_NAME_ANNOTATION_LAYOUT)
  private DrawableContentLayoutParameters annotationLayout;

  public static final String SERIALIZED_NAME_TITLE = "Title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_CONTENT = "Content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_LINE_WIDTH = "LineWidth";
  @SerializedName(SERIALIZED_NAME_LINE_WIDTH)
  private ContentSize lineWidth;

  public static final String SERIALIZED_NAME_ABSOLUTE_ANNOTATION_LINE_WIDTH = "AbsoluteAnnotationLineWidth";
  @SerializedName(SERIALIZED_NAME_ABSOLUTE_ANNOTATION_LINE_WIDTH)
  private Float absoluteAnnotationLineWidth;

  public static final String SERIALIZED_NAME_COLOR = "Color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color = "red";


  public SquareAndCircleAnnotationParameters annotationLayout(DrawableContentLayoutParameters annotationLayout) {
    
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


  public SquareAndCircleAnnotationParameters title(String title) {
    
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


  public SquareAndCircleAnnotationParameters content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * Specify the content of the annotation, if any.
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify the content of the annotation, if any.")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public SquareAndCircleAnnotationParameters lineWidth(ContentSize lineWidth) {
    
    this.lineWidth = lineWidth;
    return this;
  }

   /**
   * Get lineWidth
   * @return lineWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContentSize getLineWidth() {
    return lineWidth;
  }


  public void setLineWidth(ContentSize lineWidth) {
    this.lineWidth = lineWidth;
  }


  public SquareAndCircleAnnotationParameters absoluteAnnotationLineWidth(Float absoluteAnnotationLineWidth) {
    
    this.absoluteAnnotationLineWidth = absoluteAnnotationLineWidth;
    return this;
  }

   /**
   * Specifies the absolute thickness of the annotation, in points.
   * @return absoluteAnnotationLineWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the absolute thickness of the annotation, in points.")

  public Float getAbsoluteAnnotationLineWidth() {
    return absoluteAnnotationLineWidth;
  }


  public void setAbsoluteAnnotationLineWidth(Float absoluteAnnotationLineWidth) {
    this.absoluteAnnotationLineWidth = absoluteAnnotationLineWidth;
  }


  public SquareAndCircleAnnotationParameters color(String color) {
    
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
    SquareAndCircleAnnotationParameters squareAndCircleAnnotationParameters = (SquareAndCircleAnnotationParameters) o;
    return Objects.equals(this.annotationLayout, squareAndCircleAnnotationParameters.annotationLayout) &&
        Objects.equals(this.title, squareAndCircleAnnotationParameters.title) &&
        Objects.equals(this.content, squareAndCircleAnnotationParameters.content) &&
        Objects.equals(this.lineWidth, squareAndCircleAnnotationParameters.lineWidth) &&
        Objects.equals(this.absoluteAnnotationLineWidth, squareAndCircleAnnotationParameters.absoluteAnnotationLineWidth) &&
        Objects.equals(this.color, squareAndCircleAnnotationParameters.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotationLayout, title, content, lineWidth, absoluteAnnotationLineWidth, color);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SquareAndCircleAnnotationParameters {\n");
    sb.append("    annotationLayout: ").append(toIndentedString(annotationLayout)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    lineWidth: ").append(toIndentedString(lineWidth)).append("\n");
    sb.append("    absoluteAnnotationLineWidth: ").append(toIndentedString(absoluteAnnotationLineWidth)).append("\n");
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

