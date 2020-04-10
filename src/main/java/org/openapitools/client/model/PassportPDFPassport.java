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
import org.threeten.bp.OffsetDateTime;

/**
 * PassportPDFPassport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-10T16:23:29.092+02:00[Europe/Paris]")
public class PassportPDFPassport {
  public static final String SERIALIZED_NAME_PASSPORT_ID = "PassportId";
  @SerializedName(SERIALIZED_NAME_PASSPORT_ID)
  private String passportId;

  public static final String SERIALIZED_NAME_PLAN_ID = "PlanId";
  @SerializedName(SERIALIZED_NAME_PLAN_ID)
  private Integer planId;

  public static final String SERIALIZED_NAME_OPTIONAL_LINKED_SUBSCRIPTION_ID = "OptionalLinkedSubscriptionId";
  @SerializedName(SERIALIZED_NAME_OPTIONAL_LINKED_SUBSCRIPTION_ID)
  private String optionalLinkedSubscriptionId;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_DATE = "SubscriptionDate";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_DATE)
  private OffsetDateTime subscriptionDate;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "ExpirationDate";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private OffsetDateTime expirationDate;

  public static final String SERIALIZED_NAME_CURRENT_TOKENS_USED = "CurrentTokensUsed";
  @SerializedName(SERIALIZED_NAME_CURRENT_TOKENS_USED)
  private Long currentTokensUsed;

  public static final String SERIALIZED_NAME_EXTRA_TOKENS = "ExtraTokens";
  @SerializedName(SERIALIZED_NAME_EXTRA_TOKENS)
  private Long extraTokens;

  public static final String SERIALIZED_NAME_EXTRA_TOKENS_END_DATE = "ExtraTokensEndDate";
  @SerializedName(SERIALIZED_NAME_EXTRA_TOKENS_END_DATE)
  private OffsetDateTime extraTokensEndDate;

  public static final String SERIALIZED_NAME_IS_YEARLY_PAID = "IsYearlyPaid";
  @SerializedName(SERIALIZED_NAME_IS_YEARLY_PAID)
  private Boolean isYearlyPaid;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "IsActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_TOKENS_PERCENT_USAGE_ALERT = "TokensPercentUsageAlert";
  @SerializedName(SERIALIZED_NAME_TOKENS_PERCENT_USAGE_ALERT)
  private Integer tokensPercentUsageAlert;

  public static final String SERIALIZED_NAME_TOKENS_PERCENT_USAGE_ALERT_SENT = "TokensPercentUsageAlertSent";
  @SerializedName(SERIALIZED_NAME_TOKENS_PERCENT_USAGE_ALERT_SENT)
  private Boolean tokensPercentUsageAlertSent;

  public static final String SERIALIZED_NAME_NEXT_MONTHLY_TERM = "NextMonthlyTerm";
  @SerializedName(SERIALIZED_NAME_NEXT_MONTHLY_TERM)
  private OffsetDateTime nextMonthlyTerm;

  public static final String SERIALIZED_NAME_REMAINING_TOKENS = "RemainingTokens";
  @SerializedName(SERIALIZED_NAME_REMAINING_TOKENS)
  private Long remainingTokens;


  public PassportPDFPassport passportId(String passportId) {
    
    this.passportId = passportId;
    return this;
  }

   /**
   * Get passportId
   * @return passportId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPassportId() {
    return passportId;
  }


  public void setPassportId(String passportId) {
    this.passportId = passportId;
  }


  public PassportPDFPassport planId(Integer planId) {
    
    this.planId = planId;
    return this;
  }

   /**
   * Get planId
   * @return planId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPlanId() {
    return planId;
  }


  public void setPlanId(Integer planId) {
    this.planId = planId;
  }


  public PassportPDFPassport optionalLinkedSubscriptionId(String optionalLinkedSubscriptionId) {
    
    this.optionalLinkedSubscriptionId = optionalLinkedSubscriptionId;
    return this;
  }

   /**
   * Get optionalLinkedSubscriptionId
   * @return optionalLinkedSubscriptionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOptionalLinkedSubscriptionId() {
    return optionalLinkedSubscriptionId;
  }


  public void setOptionalLinkedSubscriptionId(String optionalLinkedSubscriptionId) {
    this.optionalLinkedSubscriptionId = optionalLinkedSubscriptionId;
  }


  public PassportPDFPassport subscriptionDate(OffsetDateTime subscriptionDate) {
    
    this.subscriptionDate = subscriptionDate;
    return this;
  }

   /**
   * Get subscriptionDate
   * @return subscriptionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getSubscriptionDate() {
    return subscriptionDate;
  }


  public void setSubscriptionDate(OffsetDateTime subscriptionDate) {
    this.subscriptionDate = subscriptionDate;
  }


  public PassportPDFPassport expirationDate(OffsetDateTime expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }


  public PassportPDFPassport currentTokensUsed(Long currentTokensUsed) {
    
    this.currentTokensUsed = currentTokensUsed;
    return this;
  }

   /**
   * Get currentTokensUsed
   * @return currentTokensUsed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCurrentTokensUsed() {
    return currentTokensUsed;
  }


  public void setCurrentTokensUsed(Long currentTokensUsed) {
    this.currentTokensUsed = currentTokensUsed;
  }


  public PassportPDFPassport extraTokens(Long extraTokens) {
    
    this.extraTokens = extraTokens;
    return this;
  }

   /**
   * Get extraTokens
   * @return extraTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getExtraTokens() {
    return extraTokens;
  }


  public void setExtraTokens(Long extraTokens) {
    this.extraTokens = extraTokens;
  }


  public PassportPDFPassport extraTokensEndDate(OffsetDateTime extraTokensEndDate) {
    
    this.extraTokensEndDate = extraTokensEndDate;
    return this;
  }

   /**
   * Get extraTokensEndDate
   * @return extraTokensEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getExtraTokensEndDate() {
    return extraTokensEndDate;
  }


  public void setExtraTokensEndDate(OffsetDateTime extraTokensEndDate) {
    this.extraTokensEndDate = extraTokensEndDate;
  }


  public PassportPDFPassport isYearlyPaid(Boolean isYearlyPaid) {
    
    this.isYearlyPaid = isYearlyPaid;
    return this;
  }

   /**
   * Get isYearlyPaid
   * @return isYearlyPaid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsYearlyPaid() {
    return isYearlyPaid;
  }


  public void setIsYearlyPaid(Boolean isYearlyPaid) {
    this.isYearlyPaid = isYearlyPaid;
  }


  public PassportPDFPassport isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public PassportPDFPassport tokensPercentUsageAlert(Integer tokensPercentUsageAlert) {
    
    this.tokensPercentUsageAlert = tokensPercentUsageAlert;
    return this;
  }

   /**
   * Get tokensPercentUsageAlert
   * @return tokensPercentUsageAlert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTokensPercentUsageAlert() {
    return tokensPercentUsageAlert;
  }


  public void setTokensPercentUsageAlert(Integer tokensPercentUsageAlert) {
    this.tokensPercentUsageAlert = tokensPercentUsageAlert;
  }


  public PassportPDFPassport tokensPercentUsageAlertSent(Boolean tokensPercentUsageAlertSent) {
    
    this.tokensPercentUsageAlertSent = tokensPercentUsageAlertSent;
    return this;
  }

   /**
   * Get tokensPercentUsageAlertSent
   * @return tokensPercentUsageAlertSent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTokensPercentUsageAlertSent() {
    return tokensPercentUsageAlertSent;
  }


  public void setTokensPercentUsageAlertSent(Boolean tokensPercentUsageAlertSent) {
    this.tokensPercentUsageAlertSent = tokensPercentUsageAlertSent;
  }


   /**
   * Get nextMonthlyTerm
   * @return nextMonthlyTerm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getNextMonthlyTerm() {
    return nextMonthlyTerm;
  }




   /**
   * Get remainingTokens
   * @return remainingTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getRemainingTokens() {
    return remainingTokens;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PassportPDFPassport passportPDFPassport = (PassportPDFPassport) o;
    return Objects.equals(this.passportId, passportPDFPassport.passportId) &&
        Objects.equals(this.planId, passportPDFPassport.planId) &&
        Objects.equals(this.optionalLinkedSubscriptionId, passportPDFPassport.optionalLinkedSubscriptionId) &&
        Objects.equals(this.subscriptionDate, passportPDFPassport.subscriptionDate) &&
        Objects.equals(this.expirationDate, passportPDFPassport.expirationDate) &&
        Objects.equals(this.currentTokensUsed, passportPDFPassport.currentTokensUsed) &&
        Objects.equals(this.extraTokens, passportPDFPassport.extraTokens) &&
        Objects.equals(this.extraTokensEndDate, passportPDFPassport.extraTokensEndDate) &&
        Objects.equals(this.isYearlyPaid, passportPDFPassport.isYearlyPaid) &&
        Objects.equals(this.isActive, passportPDFPassport.isActive) &&
        Objects.equals(this.tokensPercentUsageAlert, passportPDFPassport.tokensPercentUsageAlert) &&
        Objects.equals(this.tokensPercentUsageAlertSent, passportPDFPassport.tokensPercentUsageAlertSent) &&
        Objects.equals(this.nextMonthlyTerm, passportPDFPassport.nextMonthlyTerm) &&
        Objects.equals(this.remainingTokens, passportPDFPassport.remainingTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passportId, planId, optionalLinkedSubscriptionId, subscriptionDate, expirationDate, currentTokensUsed, extraTokens, extraTokensEndDate, isYearlyPaid, isActive, tokensPercentUsageAlert, tokensPercentUsageAlertSent, nextMonthlyTerm, remainingTokens);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PassportPDFPassport {\n");
    sb.append("    passportId: ").append(toIndentedString(passportId)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    optionalLinkedSubscriptionId: ").append(toIndentedString(optionalLinkedSubscriptionId)).append("\n");
    sb.append("    subscriptionDate: ").append(toIndentedString(subscriptionDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    currentTokensUsed: ").append(toIndentedString(currentTokensUsed)).append("\n");
    sb.append("    extraTokens: ").append(toIndentedString(extraTokens)).append("\n");
    sb.append("    extraTokensEndDate: ").append(toIndentedString(extraTokensEndDate)).append("\n");
    sb.append("    isYearlyPaid: ").append(toIndentedString(isYearlyPaid)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    tokensPercentUsageAlert: ").append(toIndentedString(tokensPercentUsageAlert)).append("\n");
    sb.append("    tokensPercentUsageAlertSent: ").append(toIndentedString(tokensPercentUsageAlertSent)).append("\n");
    sb.append("    nextMonthlyTerm: ").append(toIndentedString(nextMonthlyTerm)).append("\n");
    sb.append("    remainingTokens: ").append(toIndentedString(remainingTokens)).append("\n");
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
