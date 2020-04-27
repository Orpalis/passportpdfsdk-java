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
import org.openapitools.client.model.EncryptionAlgorithm;
import org.openapitools.client.model.Error;

/**
 * Represents the response to a load document action request.
 */
@ApiModel(description = "Represents the response to a load document action request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-27T13:23:36.328+02:00[Europe/Paris]")
public class PdfLoadDocumentResponse {
  public static final String SERIALIZED_NAME_ERROR = "Error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Error error;

  public static final String SERIALIZED_NAME_REMAINING_TOKENS = "RemainingTokens";
  @SerializedName(SERIALIZED_NAME_REMAINING_TOKENS)
  private Long remainingTokens;

  public static final String SERIALIZED_NAME_FILE_ID = "FileId";
  @SerializedName(SERIALIZED_NAME_FILE_ID)
  private String fileId;

  public static final String SERIALIZED_NAME_PAGE_COUNT = "PageCount";
  @SerializedName(SERIALIZED_NAME_PAGE_COUNT)
  private Integer pageCount;

  public static final String SERIALIZED_NAME_ENCRYPTION = "Encryption";
  @SerializedName(SERIALIZED_NAME_ENCRYPTION)
  private EncryptionAlgorithm encryption;

  public static final String SERIALIZED_NAME_PASSWORD_IS_REQUIRED = "PasswordIsRequired";
  @SerializedName(SERIALIZED_NAME_PASSWORD_IS_REQUIRED)
  private Boolean passwordIsRequired;

  public static final String SERIALIZED_NAME_THUMBNAIL_DATA = "ThumbnailData";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL_DATA)
  private byte[] thumbnailData;


  public PdfLoadDocumentResponse error(Error error) {
    
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


  public PdfLoadDocumentResponse remainingTokens(Long remainingTokens) {
    
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
   * Specifies the file identifier of the loaded document.
   * @return fileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the file identifier of the loaded document.")

  public String getFileId() {
    return fileId;
  }




   /**
   * Specifies the number of pages into the loaded document.
   * @return pageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the number of pages into the loaded document.")

  public Integer getPageCount() {
    return pageCount;
  }




  public PdfLoadDocumentResponse encryption(EncryptionAlgorithm encryption) {
    
    this.encryption = encryption;
    return this;
  }

   /**
   * Get encryption
   * @return encryption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EncryptionAlgorithm getEncryption() {
    return encryption;
  }


  public void setEncryption(EncryptionAlgorithm encryption) {
    this.encryption = encryption;
  }


   /**
   * Specifies if a password will be subsequently required to open the document.  Password can be provided using the SetPassword action / method.
   * @return passwordIsRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if a password will be subsequently required to open the document.  Password can be provided using the SetPassword action / method.")

  public Boolean getPasswordIsRequired() {
    return passwordIsRequired;
  }




   /**
   * Specifies the data of a thumbnail from the first page of the document, in PNG format. Only applicable if the GetPreview field of the request has been set to true.
   * @return thumbnailData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the data of a thumbnail from the first page of the document, in PNG format. Only applicable if the GetPreview field of the request has been set to true.")

  public byte[] getThumbnailData() {
    return thumbnailData;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfLoadDocumentResponse pdfLoadDocumentResponse = (PdfLoadDocumentResponse) o;
    return Objects.equals(this.error, pdfLoadDocumentResponse.error) &&
        Objects.equals(this.remainingTokens, pdfLoadDocumentResponse.remainingTokens) &&
        Objects.equals(this.fileId, pdfLoadDocumentResponse.fileId) &&
        Objects.equals(this.pageCount, pdfLoadDocumentResponse.pageCount) &&
        Objects.equals(this.encryption, pdfLoadDocumentResponse.encryption) &&
        Objects.equals(this.passwordIsRequired, pdfLoadDocumentResponse.passwordIsRequired) &&
        Arrays.equals(this.thumbnailData, pdfLoadDocumentResponse.thumbnailData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, remainingTokens, fileId, pageCount, encryption, passwordIsRequired, Arrays.hashCode(thumbnailData));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfLoadDocumentResponse {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    remainingTokens: ").append(toIndentedString(remainingTokens)).append("\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    encryption: ").append(toIndentedString(encryption)).append("\n");
    sb.append("    passwordIsRequired: ").append(toIndentedString(passwordIsRequired)).append("\n");
    sb.append("    thumbnailData: ").append(toIndentedString(thumbnailData)).append("\n");
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

