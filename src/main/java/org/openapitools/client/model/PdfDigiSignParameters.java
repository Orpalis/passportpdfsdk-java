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
import org.openapitools.client.model.PdfAlignedTextParameters;
import org.openapitools.client.model.SignatureCertificationLevel;
import org.openapitools.client.model.SignatureHash;
import org.openapitools.client.model.SignatureMode;

/**
 * Represents the parameters for a digital signature action.
 */
@ApiModel(description = "Represents the parameters for a digital signature action.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-27T13:23:36.328+02:00[Europe/Paris]")
public class PdfDigiSignParameters {
  public static final String SERIALIZED_NAME_FILE_ID = "FileId";
  @SerializedName(SERIALIZED_NAME_FILE_ID)
  private String fileId;

  public static final String SERIALIZED_NAME_CERTIFICATE_DATA = "CertificateData";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_DATA)
  private byte[] certificateData;

  public static final String SERIALIZED_NAME_CERTIFICATE_PASSWORD = "CertificatePassword";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_PASSWORD)
  private String certificatePassword;

  public static final String SERIALIZED_NAME_SIGNATURE_MODE = "SignatureMode";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_MODE)
  private SignatureMode signatureMode;

  public static final String SERIALIZED_NAME_SIGNATURE_CERTIFICATION_LEVEL = "SignatureCertificationLevel";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_CERTIFICATION_LEVEL)
  private SignatureCertificationLevel signatureCertificationLevel;

  public static final String SERIALIZED_NAME_SIGNATURE_HASH_ALGORITHM = "SignatureHashAlgorithm";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_HASH_ALGORITHM)
  private SignatureHash signatureHashAlgorithm;

  public static final String SERIALIZED_NAME_SIGNER_NAME = "SignerName";
  @SerializedName(SERIALIZED_NAME_SIGNER_NAME)
  private String signerName = "PassportPDF";

  public static final String SERIALIZED_NAME_REASON = "Reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason = "";

  public static final String SERIALIZED_NAME_LOCATION = "Location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location = "";

  public static final String SERIALIZED_NAME_CONTACT_INFO = "ContactInfo";
  @SerializedName(SERIALIZED_NAME_CONTACT_INFO)
  private String contactInfo = "";

  public static final String SERIALIZED_NAME_TIME_STAMP_U_R_L = "TimeStampURL";
  @SerializedName(SERIALIZED_NAME_TIME_STAMP_U_R_L)
  private String timeStampURL = "";

  public static final String SERIALIZED_NAME_TIME_STAMP_USER_NAME = "TimeStampUserName";
  @SerializedName(SERIALIZED_NAME_TIME_STAMP_USER_NAME)
  private String timeStampUserName = "";

  public static final String SERIALIZED_NAME_TIME_STAMP_PASSWORD = "TimeStampPassword";
  @SerializedName(SERIALIZED_NAME_TIME_STAMP_PASSWORD)
  private String timeStampPassword = "";

  public static final String SERIALIZED_NAME_LINEARIZE = "Linearize";
  @SerializedName(SERIALIZED_NAME_LINEARIZE)
  private Boolean linearize = false;

  public static final String SERIALIZED_NAME_DRAW_SIGNATURE = "DrawSignature";
  @SerializedName(SERIALIZED_NAME_DRAW_SIGNATURE)
  private Boolean drawSignature = false;

  public static final String SERIALIZED_NAME_PAGE_NUMBER = "PageNumber";
  @SerializedName(SERIALIZED_NAME_PAGE_NUMBER)
  private Integer pageNumber = 1;

  public static final String SERIALIZED_NAME_SHOW_VALIDATION_MARK = "ShowValidationMark";
  @SerializedName(SERIALIZED_NAME_SHOW_VALIDATION_MARK)
  private Boolean showValidationMark = false;

  public static final String SERIALIZED_NAME_IMAGE_DATA = "ImageData";
  @SerializedName(SERIALIZED_NAME_IMAGE_DATA)
  private byte[] imageData;

  public static final String SERIALIZED_NAME_SIGNATURE_LAYOUT = "SignatureLayout";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_LAYOUT)
  private DrawableContentLayoutParameters signatureLayout;

  public static final String SERIALIZED_NAME_SIGNATURE_TEXT = "SignatureText";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_TEXT)
  private PdfAlignedTextParameters signatureText;


  public PdfDigiSignParameters fileId(String fileId) {
    
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


  public PdfDigiSignParameters certificateData(byte[] certificateData) {
    
    this.certificateData = certificateData;
    return this;
  }

   /**
   * Specifies the data of the digital PKCS#12 certificate file.
   * @return certificateData
  **/
  @ApiModelProperty(required = true, value = "Specifies the data of the digital PKCS#12 certificate file.")

  public byte[] getCertificateData() {
    return certificateData;
  }


  public void setCertificateData(byte[] certificateData) {
    this.certificateData = certificateData;
  }


  public PdfDigiSignParameters certificatePassword(String certificatePassword) {
    
    this.certificatePassword = certificatePassword;
    return this;
  }

   /**
   * Specifies the certificate password.
   * @return certificatePassword
  **/
  @ApiModelProperty(required = true, value = "Specifies the certificate password.")

  public String getCertificatePassword() {
    return certificatePassword;
  }


  public void setCertificatePassword(String certificatePassword) {
    this.certificatePassword = certificatePassword;
  }


  public PdfDigiSignParameters signatureMode(SignatureMode signatureMode) {
    
    this.signatureMode = signatureMode;
    return this;
  }

   /**
   * Get signatureMode
   * @return signatureMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SignatureMode getSignatureMode() {
    return signatureMode;
  }


  public void setSignatureMode(SignatureMode signatureMode) {
    this.signatureMode = signatureMode;
  }


  public PdfDigiSignParameters signatureCertificationLevel(SignatureCertificationLevel signatureCertificationLevel) {
    
    this.signatureCertificationLevel = signatureCertificationLevel;
    return this;
  }

   /**
   * Get signatureCertificationLevel
   * @return signatureCertificationLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SignatureCertificationLevel getSignatureCertificationLevel() {
    return signatureCertificationLevel;
  }


  public void setSignatureCertificationLevel(SignatureCertificationLevel signatureCertificationLevel) {
    this.signatureCertificationLevel = signatureCertificationLevel;
  }


  public PdfDigiSignParameters signatureHashAlgorithm(SignatureHash signatureHashAlgorithm) {
    
    this.signatureHashAlgorithm = signatureHashAlgorithm;
    return this;
  }

   /**
   * Get signatureHashAlgorithm
   * @return signatureHashAlgorithm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SignatureHash getSignatureHashAlgorithm() {
    return signatureHashAlgorithm;
  }


  public void setSignatureHashAlgorithm(SignatureHash signatureHashAlgorithm) {
    this.signatureHashAlgorithm = signatureHashAlgorithm;
  }


  public PdfDigiSignParameters signerName(String signerName) {
    
    this.signerName = signerName;
    return this;
  }

   /**
   * Specifies the name of the signer.
   * @return signerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the name of the signer.")

  public String getSignerName() {
    return signerName;
  }


  public void setSignerName(String signerName) {
    this.signerName = signerName;
  }


  public PdfDigiSignParameters reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Specifies the reason of the signature.
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the reason of the signature.")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public PdfDigiSignParameters location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * Specifies the location where the signature is applied.
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the location where the signature is applied.")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public PdfDigiSignParameters contactInfo(String contactInfo) {
    
    this.contactInfo = contactInfo;
    return this;
  }

   /**
   * Specifies contact information about the signer.
   * @return contactInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies contact information about the signer.")

  public String getContactInfo() {
    return contactInfo;
  }


  public void setContactInfo(String contactInfo) {
    this.contactInfo = contactInfo;
  }


  public PdfDigiSignParameters timeStampURL(String timeStampURL) {
    
    this.timeStampURL = timeStampURL;
    return this;
  }

   /**
   * Specifies the URL of the server responsible of providing a time stamp.
   * @return timeStampURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the URL of the server responsible of providing a time stamp.")

  public String getTimeStampURL() {
    return timeStampURL;
  }


  public void setTimeStampURL(String timeStampURL) {
    this.timeStampURL = timeStampURL;
  }


  public PdfDigiSignParameters timeStampUserName(String timeStampUserName) {
    
    this.timeStampUserName = timeStampUserName;
    return this;
  }

   /**
   * Specifies the optional user name associated with the time stamp server.
   * @return timeStampUserName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the optional user name associated with the time stamp server.")

  public String getTimeStampUserName() {
    return timeStampUserName;
  }


  public void setTimeStampUserName(String timeStampUserName) {
    this.timeStampUserName = timeStampUserName;
  }


  public PdfDigiSignParameters timeStampPassword(String timeStampPassword) {
    
    this.timeStampPassword = timeStampPassword;
    return this;
  }

   /**
   * Specifies the optional password associated with the time stamp server.
   * @return timeStampPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the optional password associated with the time stamp server.")

  public String getTimeStampPassword() {
    return timeStampPassword;
  }


  public void setTimeStampPassword(String timeStampPassword) {
    this.timeStampPassword = timeStampPassword;
  }


  public PdfDigiSignParameters linearize(Boolean linearize) {
    
    this.linearize = linearize;
    return this;
  }

   /**
   * Specifies whether the signed PDF shall be linearized.
   * @return linearize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether the signed PDF shall be linearized.")

  public Boolean getLinearize() {
    return linearize;
  }


  public void setLinearize(Boolean linearize) {
    this.linearize = linearize;
  }


  public PdfDigiSignParameters drawSignature(Boolean drawSignature) {
    
    this.drawSignature = drawSignature;
    return this;
  }

   /**
   * Specifies whether the signature shall be drawn on the document.
   * @return drawSignature
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether the signature shall be drawn on the document.")

  public Boolean getDrawSignature() {
    return drawSignature;
  }


  public void setDrawSignature(Boolean drawSignature) {
    this.drawSignature = drawSignature;
  }


  public PdfDigiSignParameters pageNumber(Integer pageNumber) {
    
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Specifies the number of the page on which the signature shall be drawn.
   * @return pageNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the number of the page on which the signature shall be drawn.")

  public Integer getPageNumber() {
    return pageNumber;
  }


  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  public PdfDigiSignParameters showValidationMark(Boolean showValidationMark) {
    
    this.showValidationMark = showValidationMark;
    return this;
  }

   /**
   * Specifies whether a validation mark shall be drawn with the signature.
   * @return showValidationMark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether a validation mark shall be drawn with the signature.")

  public Boolean getShowValidationMark() {
    return showValidationMark;
  }


  public void setShowValidationMark(Boolean showValidationMark) {
    this.showValidationMark = showValidationMark;
  }


  public PdfDigiSignParameters imageData(byte[] imageData) {
    
    this.imageData = imageData;
    return this;
  }

   /**
   * Specifies the data of the image to be drawn at the signature location.
   * @return imageData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the data of the image to be drawn at the signature location.")

  public byte[] getImageData() {
    return imageData;
  }


  public void setImageData(byte[] imageData) {
    this.imageData = imageData;
  }


  public PdfDigiSignParameters signatureLayout(DrawableContentLayoutParameters signatureLayout) {
    
    this.signatureLayout = signatureLayout;
    return this;
  }

   /**
   * Get signatureLayout
   * @return signatureLayout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DrawableContentLayoutParameters getSignatureLayout() {
    return signatureLayout;
  }


  public void setSignatureLayout(DrawableContentLayoutParameters signatureLayout) {
    this.signatureLayout = signatureLayout;
  }


  public PdfDigiSignParameters signatureText(PdfAlignedTextParameters signatureText) {
    
    this.signatureText = signatureText;
    return this;
  }

   /**
   * Get signatureText
   * @return signatureText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PdfAlignedTextParameters getSignatureText() {
    return signatureText;
  }


  public void setSignatureText(PdfAlignedTextParameters signatureText) {
    this.signatureText = signatureText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfDigiSignParameters pdfDigiSignParameters = (PdfDigiSignParameters) o;
    return Objects.equals(this.fileId, pdfDigiSignParameters.fileId) &&
        Arrays.equals(this.certificateData, pdfDigiSignParameters.certificateData) &&
        Objects.equals(this.certificatePassword, pdfDigiSignParameters.certificatePassword) &&
        Objects.equals(this.signatureMode, pdfDigiSignParameters.signatureMode) &&
        Objects.equals(this.signatureCertificationLevel, pdfDigiSignParameters.signatureCertificationLevel) &&
        Objects.equals(this.signatureHashAlgorithm, pdfDigiSignParameters.signatureHashAlgorithm) &&
        Objects.equals(this.signerName, pdfDigiSignParameters.signerName) &&
        Objects.equals(this.reason, pdfDigiSignParameters.reason) &&
        Objects.equals(this.location, pdfDigiSignParameters.location) &&
        Objects.equals(this.contactInfo, pdfDigiSignParameters.contactInfo) &&
        Objects.equals(this.timeStampURL, pdfDigiSignParameters.timeStampURL) &&
        Objects.equals(this.timeStampUserName, pdfDigiSignParameters.timeStampUserName) &&
        Objects.equals(this.timeStampPassword, pdfDigiSignParameters.timeStampPassword) &&
        Objects.equals(this.linearize, pdfDigiSignParameters.linearize) &&
        Objects.equals(this.drawSignature, pdfDigiSignParameters.drawSignature) &&
        Objects.equals(this.pageNumber, pdfDigiSignParameters.pageNumber) &&
        Objects.equals(this.showValidationMark, pdfDigiSignParameters.showValidationMark) &&
        Arrays.equals(this.imageData, pdfDigiSignParameters.imageData) &&
        Objects.equals(this.signatureLayout, pdfDigiSignParameters.signatureLayout) &&
        Objects.equals(this.signatureText, pdfDigiSignParameters.signatureText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, Arrays.hashCode(certificateData), certificatePassword, signatureMode, signatureCertificationLevel, signatureHashAlgorithm, signerName, reason, location, contactInfo, timeStampURL, timeStampUserName, timeStampPassword, linearize, drawSignature, pageNumber, showValidationMark, Arrays.hashCode(imageData), signatureLayout, signatureText);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfDigiSignParameters {\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    certificateData: ").append(toIndentedString(certificateData)).append("\n");
    sb.append("    certificatePassword: ").append(toIndentedString(certificatePassword)).append("\n");
    sb.append("    signatureMode: ").append(toIndentedString(signatureMode)).append("\n");
    sb.append("    signatureCertificationLevel: ").append(toIndentedString(signatureCertificationLevel)).append("\n");
    sb.append("    signatureHashAlgorithm: ").append(toIndentedString(signatureHashAlgorithm)).append("\n");
    sb.append("    signerName: ").append(toIndentedString(signerName)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    contactInfo: ").append(toIndentedString(contactInfo)).append("\n");
    sb.append("    timeStampURL: ").append(toIndentedString(timeStampURL)).append("\n");
    sb.append("    timeStampUserName: ").append(toIndentedString(timeStampUserName)).append("\n");
    sb.append("    timeStampPassword: ").append(toIndentedString(timeStampPassword)).append("\n");
    sb.append("    linearize: ").append(toIndentedString(linearize)).append("\n");
    sb.append("    drawSignature: ").append(toIndentedString(drawSignature)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    showValidationMark: ").append(toIndentedString(showValidationMark)).append("\n");
    sb.append("    imageData: ").append(toIndentedString(imageData)).append("\n");
    sb.append("    signatureLayout: ").append(toIndentedString(signatureLayout)).append("\n");
    sb.append("    signatureText: ").append(toIndentedString(signatureText)).append("\n");
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

