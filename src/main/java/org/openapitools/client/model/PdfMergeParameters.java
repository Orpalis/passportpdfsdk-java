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

/**
 * Represents the parameters for a merge action.
 */
@ApiModel(description = "Represents the parameters for a merge action.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-27T13:23:36.328+02:00[Europe/Paris]")
public class PdfMergeParameters {
  public static final String SERIALIZED_NAME_FILES_ID = "FilesId";
  @SerializedName(SERIALIZED_NAME_FILES_ID)
  private List<String> filesId = new ArrayList<String>();

  public static final String SERIALIZED_NAME_INCLUDE_ATTACHMENTS = "IncludeAttachments";
  @SerializedName(SERIALIZED_NAME_INCLUDE_ATTACHMENTS)
  private Boolean includeAttachments = true;


  public PdfMergeParameters filesId(List<String> filesId) {
    
    this.filesId = filesId;
    return this;
  }

  public PdfMergeParameters addFilesIdItem(String filesIdItem) {
    this.filesId.add(filesIdItem);
    return this;
  }

   /**
   * Specifies the identifiers of the documents to be merged.
   * @return filesId
  **/
  @ApiModelProperty(required = true, value = "Specifies the identifiers of the documents to be merged.")

  public List<String> getFilesId() {
    return filesId;
  }


  public void setFilesId(List<String> filesId) {
    this.filesId = filesId;
  }


  public PdfMergeParameters includeAttachments(Boolean includeAttachments) {
    
    this.includeAttachments = includeAttachments;
    return this;
  }

   /**
   * Specifies if file attachments should be included in merged document.
   * @return includeAttachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if file attachments should be included in merged document.")

  public Boolean getIncludeAttachments() {
    return includeAttachments;
  }


  public void setIncludeAttachments(Boolean includeAttachments) {
    this.includeAttachments = includeAttachments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfMergeParameters pdfMergeParameters = (PdfMergeParameters) o;
    return Objects.equals(this.filesId, pdfMergeParameters.filesId) &&
        Objects.equals(this.includeAttachments, pdfMergeParameters.includeAttachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filesId, includeAttachments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfMergeParameters {\n");
    sb.append("    filesId: ").append(toIndentedString(filesId)).append("\n");
    sb.append("    includeAttachments: ").append(toIndentedString(includeAttachments)).append("\n");
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

