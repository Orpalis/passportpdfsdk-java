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
 * Represents the parameters for a flatten action.
 */
@ApiModel(description = "Represents the parameters for a flatten action.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-27T13:23:36.328+02:00[Europe/Paris]")
public class PdfFlattenParameters {
  public static final String SERIALIZED_NAME_FILE_ID = "FileId";
  @SerializedName(SERIALIZED_NAME_FILE_ID)
  private String fileId;

  public static final String SERIALIZED_NAME_FLATTEN_ANNOTATIONS = "FlattenAnnotations";
  @SerializedName(SERIALIZED_NAME_FLATTEN_ANNOTATIONS)
  private Boolean flattenAnnotations = false;

  public static final String SERIALIZED_NAME_FLATTEN_FORM_FIELDS = "FlattenFormFields";
  @SerializedName(SERIALIZED_NAME_FLATTEN_FORM_FIELDS)
  private Boolean flattenFormFields = false;

  public static final String SERIALIZED_NAME_FLATTEN_LAYERS = "FlattenLayers";
  @SerializedName(SERIALIZED_NAME_FLATTEN_LAYERS)
  private Boolean flattenLayers = false;

  public static final String SERIALIZED_NAME_PAGE_RANGE = "PageRange";
  @SerializedName(SERIALIZED_NAME_PAGE_RANGE)
  private String pageRange = "*";


  public PdfFlattenParameters fileId(String fileId) {
    
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


  public PdfFlattenParameters flattenAnnotations(Boolean flattenAnnotations) {
    
    this.flattenAnnotations = flattenAnnotations;
    return this;
  }

   /**
   * Specifies whether the annotations shall be flattened.
   * @return flattenAnnotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether the annotations shall be flattened.")

  public Boolean getFlattenAnnotations() {
    return flattenAnnotations;
  }


  public void setFlattenAnnotations(Boolean flattenAnnotations) {
    this.flattenAnnotations = flattenAnnotations;
  }


  public PdfFlattenParameters flattenFormFields(Boolean flattenFormFields) {
    
    this.flattenFormFields = flattenFormFields;
    return this;
  }

   /**
   * Specifies whether the form-fields shall be flattened.
   * @return flattenFormFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether the form-fields shall be flattened.")

  public Boolean getFlattenFormFields() {
    return flattenFormFields;
  }


  public void setFlattenFormFields(Boolean flattenFormFields) {
    this.flattenFormFields = flattenFormFields;
  }


  public PdfFlattenParameters flattenLayers(Boolean flattenLayers) {
    
    this.flattenLayers = flattenLayers;
    return this;
  }

   /**
   * Specifies whether the layers shall be flattened.
   * @return flattenLayers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether the layers shall be flattened.")

  public Boolean getFlattenLayers() {
    return flattenLayers;
  }


  public void setFlattenLayers(Boolean flattenLayers) {
    this.flattenLayers = flattenLayers;
  }


  public PdfFlattenParameters pageRange(String pageRange) {
    
    this.pageRange = pageRange;
    return this;
  }

   /**
   * Specifies the range of page whose form-fields and annotations shall be flattened, if any.
   * @return pageRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the range of page whose form-fields and annotations shall be flattened, if any.")

  public String getPageRange() {
    return pageRange;
  }


  public void setPageRange(String pageRange) {
    this.pageRange = pageRange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfFlattenParameters pdfFlattenParameters = (PdfFlattenParameters) o;
    return Objects.equals(this.fileId, pdfFlattenParameters.fileId) &&
        Objects.equals(this.flattenAnnotations, pdfFlattenParameters.flattenAnnotations) &&
        Objects.equals(this.flattenFormFields, pdfFlattenParameters.flattenFormFields) &&
        Objects.equals(this.flattenLayers, pdfFlattenParameters.flattenLayers) &&
        Objects.equals(this.pageRange, pdfFlattenParameters.pageRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, flattenAnnotations, flattenFormFields, flattenLayers, pageRange);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfFlattenParameters {\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    flattenAnnotations: ").append(toIndentedString(flattenAnnotations)).append("\n");
    sb.append("    flattenFormFields: ").append(toIndentedString(flattenFormFields)).append("\n");
    sb.append("    flattenLayers: ").append(toIndentedString(flattenLayers)).append("\n");
    sb.append("    pageRange: ").append(toIndentedString(pageRange)).append("\n");
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

