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
import org.openapitools.client.model.PdfInitViewLayoutMode;
import org.openapitools.client.model.PdfInitViewNonFullScreenPageMode;
import org.openapitools.client.model.PdfInitViewPageMode;

/**
 * Represents the parameters for a set initial view action.
 */
@ApiModel(description = "Represents the parameters for a set initial view action.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-10T16:23:29.092+02:00[Europe/Paris]")
public class PdfSetInitialViewParameters {
  public static final String SERIALIZED_NAME_FILE_ID = "FileId";
  @SerializedName(SERIALIZED_NAME_FILE_ID)
  private String fileId;

  public static final String SERIALIZED_NAME_PAGE_MODE = "PageMode";
  @SerializedName(SERIALIZED_NAME_PAGE_MODE)
  private PdfInitViewPageMode pageMode;

  public static final String SERIALIZED_NAME_LAYOUT_MODE = "LayoutMode";
  @SerializedName(SERIALIZED_NAME_LAYOUT_MODE)
  private PdfInitViewLayoutMode layoutMode;

  public static final String SERIALIZED_NAME_NON_FULL_SCREEN_PAGE_MODE = "NonFullScreenPageMode";
  @SerializedName(SERIALIZED_NAME_NON_FULL_SCREEN_PAGE_MODE)
  private PdfInitViewNonFullScreenPageMode nonFullScreenPageMode;

  public static final String SERIALIZED_NAME_OPEN_PAGE = "OpenPage";
  @SerializedName(SERIALIZED_NAME_OPEN_PAGE)
  private Integer openPage = 1;

  public static final String SERIALIZED_NAME_OPEN_ZOOM = "OpenZoom";
  @SerializedName(SERIALIZED_NAME_OPEN_ZOOM)
  private Float openZoom = 1f;

  public static final String SERIALIZED_NAME_HIDE_TOOLBAR = "HideToolbar";
  @SerializedName(SERIALIZED_NAME_HIDE_TOOLBAR)
  private Boolean hideToolbar = false;

  public static final String SERIALIZED_NAME_HIDE_MENUBAR = "HideMenubar";
  @SerializedName(SERIALIZED_NAME_HIDE_MENUBAR)
  private Boolean hideMenubar = false;

  public static final String SERIALIZED_NAME_HIDE_WINDOW_U_I = "HideWindowUI";
  @SerializedName(SERIALIZED_NAME_HIDE_WINDOW_U_I)
  private Boolean hideWindowUI = false;

  public static final String SERIALIZED_NAME_FIT_WINDOW = "FitWindow";
  @SerializedName(SERIALIZED_NAME_FIT_WINDOW)
  private Boolean fitWindow = false;

  public static final String SERIALIZED_NAME_CENTER_WINDOW = "CenterWindow";
  @SerializedName(SERIALIZED_NAME_CENTER_WINDOW)
  private Boolean centerWindow = false;

  public static final String SERIALIZED_NAME_DISPLAY_DOC_TITLE = "DisplayDocTitle";
  @SerializedName(SERIALIZED_NAME_DISPLAY_DOC_TITLE)
  private Boolean displayDocTitle = false;


  public PdfSetInitialViewParameters fileId(String fileId) {
    
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


  public PdfSetInitialViewParameters pageMode(PdfInitViewPageMode pageMode) {
    
    this.pageMode = pageMode;
    return this;
  }

   /**
   * Get pageMode
   * @return pageMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PdfInitViewPageMode getPageMode() {
    return pageMode;
  }


  public void setPageMode(PdfInitViewPageMode pageMode) {
    this.pageMode = pageMode;
  }


  public PdfSetInitialViewParameters layoutMode(PdfInitViewLayoutMode layoutMode) {
    
    this.layoutMode = layoutMode;
    return this;
  }

   /**
   * Get layoutMode
   * @return layoutMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PdfInitViewLayoutMode getLayoutMode() {
    return layoutMode;
  }


  public void setLayoutMode(PdfInitViewLayoutMode layoutMode) {
    this.layoutMode = layoutMode;
  }


  public PdfSetInitialViewParameters nonFullScreenPageMode(PdfInitViewNonFullScreenPageMode nonFullScreenPageMode) {
    
    this.nonFullScreenPageMode = nonFullScreenPageMode;
    return this;
  }

   /**
   * Get nonFullScreenPageMode
   * @return nonFullScreenPageMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PdfInitViewNonFullScreenPageMode getNonFullScreenPageMode() {
    return nonFullScreenPageMode;
  }


  public void setNonFullScreenPageMode(PdfInitViewNonFullScreenPageMode nonFullScreenPageMode) {
    this.nonFullScreenPageMode = nonFullScreenPageMode;
  }


  public PdfSetInitialViewParameters openPage(Integer openPage) {
    
    this.openPage = openPage;
    return this;
  }

   /**
   * Specifies which page should be displayed when the document is opened.
   * @return openPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies which page should be displayed when the document is opened.")

  public Integer getOpenPage() {
    return openPage;
  }


  public void setOpenPage(Integer openPage) {
    this.openPage = openPage;
  }


  public PdfSetInitialViewParameters openZoom(Float openZoom) {
    
    this.openZoom = openZoom;
    return this;
  }

   /**
   * Specifies the default zoom factor to be used when the document is opened. Value of 1 to represent the 100% zoom, 2 means 200%, 0,5 means 50%, etc.
   * @return openZoom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the default zoom factor to be used when the document is opened. Value of 1 to represent the 100% zoom, 2 means 200%, 0,5 means 50%, etc.")

  public Float getOpenZoom() {
    return openZoom;
  }


  public void setOpenZoom(Float openZoom) {
    this.openZoom = openZoom;
  }


  public PdfSetInitialViewParameters hideToolbar(Boolean hideToolbar) {
    
    this.hideToolbar = hideToolbar;
    return this;
  }

   /**
   * A flag specifying whether to hide the viewer application’s tool bars when the document is active. Default value: false.
   * @return hideToolbar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flag specifying whether to hide the viewer application’s tool bars when the document is active. Default value: false.")

  public Boolean getHideToolbar() {
    return hideToolbar;
  }


  public void setHideToolbar(Boolean hideToolbar) {
    this.hideToolbar = hideToolbar;
  }


  public PdfSetInitialViewParameters hideMenubar(Boolean hideMenubar) {
    
    this.hideMenubar = hideMenubar;
    return this;
  }

   /**
   * (Optional) A flag specifying whether to hide the viewer application’s menu bar when the document is active. Default value: false.
   * @return hideMenubar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "(Optional) A flag specifying whether to hide the viewer application’s menu bar when the document is active. Default value: false.")

  public Boolean getHideMenubar() {
    return hideMenubar;
  }


  public void setHideMenubar(Boolean hideMenubar) {
    this.hideMenubar = hideMenubar;
  }


  public PdfSetInitialViewParameters hideWindowUI(Boolean hideWindowUI) {
    
    this.hideWindowUI = hideWindowUI;
    return this;
  }

   /**
   * (Optional) A flag specifying whether to hide user interface elements in the document’s window (such as scroll bars and navigation controls),  leaving only the document’s contents displayed. Default value: false.
   * @return hideWindowUI
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "(Optional) A flag specifying whether to hide user interface elements in the document’s window (such as scroll bars and navigation controls),  leaving only the document’s contents displayed. Default value: false.")

  public Boolean getHideWindowUI() {
    return hideWindowUI;
  }


  public void setHideWindowUI(Boolean hideWindowUI) {
    this.hideWindowUI = hideWindowUI;
  }


  public PdfSetInitialViewParameters fitWindow(Boolean fitWindow) {
    
    this.fitWindow = fitWindow;
    return this;
  }

   /**
   * (Optional) A flag specifying whether to resize the document’s window to fit the size of the first displayed page. Default value: false.
   * @return fitWindow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "(Optional) A flag specifying whether to resize the document’s window to fit the size of the first displayed page. Default value: false.")

  public Boolean getFitWindow() {
    return fitWindow;
  }


  public void setFitWindow(Boolean fitWindow) {
    this.fitWindow = fitWindow;
  }


  public PdfSetInitialViewParameters centerWindow(Boolean centerWindow) {
    
    this.centerWindow = centerWindow;
    return this;
  }

   /**
   * (Optional) A flag specifying whether to position the document’s window in the center of the screen. Default value: false.
   * @return centerWindow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "(Optional) A flag specifying whether to position the document’s window in the center of the screen. Default value: false.")

  public Boolean getCenterWindow() {
    return centerWindow;
  }


  public void setCenterWindow(Boolean centerWindow) {
    this.centerWindow = centerWindow;
  }


  public PdfSetInitialViewParameters displayDocTitle(Boolean displayDocTitle) {
    
    this.displayDocTitle = displayDocTitle;
    return this;
  }

   /**
   * (Optional; PDF 1.4) A flag specifying whether the window’s title bar should display the document title taken from the Title entry of the document information dictionary.  If false, the title bar should instead display the name of the PDF file containing the document. Default value: false.
   * @return displayDocTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "(Optional; PDF 1.4) A flag specifying whether the window’s title bar should display the document title taken from the Title entry of the document information dictionary.  If false, the title bar should instead display the name of the PDF file containing the document. Default value: false.")

  public Boolean getDisplayDocTitle() {
    return displayDocTitle;
  }


  public void setDisplayDocTitle(Boolean displayDocTitle) {
    this.displayDocTitle = displayDocTitle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfSetInitialViewParameters pdfSetInitialViewParameters = (PdfSetInitialViewParameters) o;
    return Objects.equals(this.fileId, pdfSetInitialViewParameters.fileId) &&
        Objects.equals(this.pageMode, pdfSetInitialViewParameters.pageMode) &&
        Objects.equals(this.layoutMode, pdfSetInitialViewParameters.layoutMode) &&
        Objects.equals(this.nonFullScreenPageMode, pdfSetInitialViewParameters.nonFullScreenPageMode) &&
        Objects.equals(this.openPage, pdfSetInitialViewParameters.openPage) &&
        Objects.equals(this.openZoom, pdfSetInitialViewParameters.openZoom) &&
        Objects.equals(this.hideToolbar, pdfSetInitialViewParameters.hideToolbar) &&
        Objects.equals(this.hideMenubar, pdfSetInitialViewParameters.hideMenubar) &&
        Objects.equals(this.hideWindowUI, pdfSetInitialViewParameters.hideWindowUI) &&
        Objects.equals(this.fitWindow, pdfSetInitialViewParameters.fitWindow) &&
        Objects.equals(this.centerWindow, pdfSetInitialViewParameters.centerWindow) &&
        Objects.equals(this.displayDocTitle, pdfSetInitialViewParameters.displayDocTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, pageMode, layoutMode, nonFullScreenPageMode, openPage, openZoom, hideToolbar, hideMenubar, hideWindowUI, fitWindow, centerWindow, displayDocTitle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfSetInitialViewParameters {\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    pageMode: ").append(toIndentedString(pageMode)).append("\n");
    sb.append("    layoutMode: ").append(toIndentedString(layoutMode)).append("\n");
    sb.append("    nonFullScreenPageMode: ").append(toIndentedString(nonFullScreenPageMode)).append("\n");
    sb.append("    openPage: ").append(toIndentedString(openPage)).append("\n");
    sb.append("    openZoom: ").append(toIndentedString(openZoom)).append("\n");
    sb.append("    hideToolbar: ").append(toIndentedString(hideToolbar)).append("\n");
    sb.append("    hideMenubar: ").append(toIndentedString(hideMenubar)).append("\n");
    sb.append("    hideWindowUI: ").append(toIndentedString(hideWindowUI)).append("\n");
    sb.append("    fitWindow: ").append(toIndentedString(fitWindow)).append("\n");
    sb.append("    centerWindow: ").append(toIndentedString(centerWindow)).append("\n");
    sb.append("    displayDocTitle: ").append(toIndentedString(displayDocTitle)).append("\n");
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

