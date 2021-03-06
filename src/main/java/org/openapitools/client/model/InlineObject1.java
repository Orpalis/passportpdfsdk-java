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
import java.io.File;
import java.io.IOException;
import org.openapitools.client.model.LoadImageParameters;

/**
 * InlineObject1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-27T13:23:36.328+02:00[Europe/Paris]")
public class InlineObject1 {
  public static final String SERIALIZED_NAME_FILE_DATA = "fileData";
  @SerializedName(SERIALIZED_NAME_FILE_DATA)
  private File fileData;

  public static final String SERIALIZED_NAME_LOAD_IMAGE_PARAMETERS = "loadImageParameters";
  @SerializedName(SERIALIZED_NAME_LOAD_IMAGE_PARAMETERS)
  private LoadImageParameters loadImageParameters;


  public InlineObject1 fileData(File fileData) {
    
    this.fileData = fileData;
    return this;
  }

   /**
   * The data of the document.
   * @return fileData
  **/
  @ApiModelProperty(required = true, value = "The data of the document.")

  public File getFileData() {
    return fileData;
  }


  public void setFileData(File fileData) {
    this.fileData = fileData;
  }


  public InlineObject1 loadImageParameters(LoadImageParameters loadImageParameters) {
    
    this.loadImageParameters = loadImageParameters;
    return this;
  }

   /**
   * Get loadImageParameters
   * @return loadImageParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LoadImageParameters getLoadImageParameters() {
    return loadImageParameters;
  }


  public void setLoadImageParameters(LoadImageParameters loadImageParameters) {
    this.loadImageParameters = loadImageParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject1 inlineObject1 = (InlineObject1) o;
    return Objects.equals(this.fileData, inlineObject1.fileData) &&
        Objects.equals(this.loadImageParameters, inlineObject1.loadImageParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileData, loadImageParameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject1 {\n");
    sb.append("    fileData: ").append(toIndentedString(fileData)).append("\n");
    sb.append("    loadImageParameters: ").append(toIndentedString(loadImageParameters)).append("\n");
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

