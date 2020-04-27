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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.PageImage;

/**
 * Represents the response to a save as PNG action request.
 */
@ApiModel(description = "Represents the response to a save as PNG action request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-27T13:23:36.328+02:00[Europe/Paris]")
public class ImageSaveAsPNGResponse {
  public static final String SERIALIZED_NAME_ERROR = "Error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Error error;

  public static final String SERIALIZED_NAME_REMAINING_TOKENS = "RemainingTokens";
  @SerializedName(SERIALIZED_NAME_REMAINING_TOKENS)
  private Long remainingTokens;

  public static final String SERIALIZED_NAME_PAGE_IMAGES = "PageImages";
  @SerializedName(SERIALIZED_NAME_PAGE_IMAGES)
  private List<PageImage> pageImages = null;


  public ImageSaveAsPNGResponse error(Error error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Error getError() {
    return error;
  }


  public void setError(Error error) {
    this.error = error;
  }


  public ImageSaveAsPNGResponse remainingTokens(Long remainingTokens) {
    
    this.remainingTokens = remainingTokens;
    return this;
  }

   /**
   * Specifies the number of remaining tokens.
   * @return remainingTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the number of remaining tokens.")

  public Long getRemainingTokens() {
    return remainingTokens;
  }


  public void setRemainingTokens(Long remainingTokens) {
    this.remainingTokens = remainingTokens;
  }


   /**
   * The image(s) saved as PNG.
   * @return pageImages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The image(s) saved as PNG.")

  public List<PageImage> getPageImages() {
    return pageImages;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageSaveAsPNGResponse imageSaveAsPNGResponse = (ImageSaveAsPNGResponse) o;
    return Objects.equals(this.error, imageSaveAsPNGResponse.error) &&
        Objects.equals(this.remainingTokens, imageSaveAsPNGResponse.remainingTokens) &&
        Objects.equals(this.pageImages, imageSaveAsPNGResponse.pageImages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, remainingTokens, pageImages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageSaveAsPNGResponse {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    remainingTokens: ").append(toIndentedString(remainingTokens)).append("\n");
    sb.append("    pageImages: ").append(toIndentedString(pageImages)).append("\n");
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

