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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ImageFilters;

/**
 * Represents the parameters for an image filtering action.
 */
@ApiModel(description = "Represents the parameters for an image filtering action.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-10T16:23:29.092+02:00[Europe/Paris]")
public class ImageFilterParameters {
  public static final String SERIALIZED_NAME_FILE_ID = "FileId";
  @SerializedName(SERIALIZED_NAME_FILE_ID)
  private String fileId;

  public static final String SERIALIZED_NAME_PAGE_RANGE = "PageRange";
  @SerializedName(SERIALIZED_NAME_PAGE_RANGE)
  private String pageRange;

  public static final String SERIALIZED_NAME_FILTERS = "Filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<ImageFilters> filters = new ArrayList<ImageFilters>();

  public static final String SERIALIZED_NAME_ROI_LEFT = "RoiLeft";
  @SerializedName(SERIALIZED_NAME_ROI_LEFT)
  private Integer roiLeft = 0;

  public static final String SERIALIZED_NAME_ROI_TOP = "RoiTop";
  @SerializedName(SERIALIZED_NAME_ROI_TOP)
  private Integer roiTop = 0;

  public static final String SERIALIZED_NAME_ROI_WIDTH = "RoiWidth";
  @SerializedName(SERIALIZED_NAME_ROI_WIDTH)
  private Integer roiWidth = 0;

  public static final String SERIALIZED_NAME_ROI_HEIGHT = "RoiHeight";
  @SerializedName(SERIALIZED_NAME_ROI_HEIGHT)
  private Integer roiHeight = 0;

  public static final String SERIALIZED_NAME_GAUSSIAN_KERNEL_SIZE = "GaussianKernelSize";
  @SerializedName(SERIALIZED_NAME_GAUSSIAN_KERNEL_SIZE)
  private Integer gaussianKernelSize = 3;

  public static final String SERIALIZED_NAME_UNSHARP_MASK_RADIUS = "UnsharpMaskRadius";
  @SerializedName(SERIALIZED_NAME_UNSHARP_MASK_RADIUS)
  private Integer unsharpMaskRadius = 5;

  public static final String SERIALIZED_NAME_UNSHARP_MASK_AMOUNT = "UnsharpMaskAmount";
  @SerializedName(SERIALIZED_NAME_UNSHARP_MASK_AMOUNT)
  private Double unsharpMaskAmount = 0.5d;

  public static final String SERIALIZED_NAME_UNSHARP_MASK_THRESHOLD = "UnsharpMaskThreshold";
  @SerializedName(SERIALIZED_NAME_UNSHARP_MASK_THRESHOLD)
  private Integer unsharpMaskThreshold = 40;

  public static final String SERIALIZED_NAME_SUBTRACT_BACKGROUND_ROLLING_BALL_SIZE = "SubtractBackgroundRollingBallSize";
  @SerializedName(SERIALIZED_NAME_SUBTRACT_BACKGROUND_ROLLING_BALL_SIZE)
  private Integer subtractBackgroundRollingBallSize = 50;

  public static final String SERIALIZED_NAME_SUBTRACT_BACKGROUND_LIGHT_BACKGROUND = "SubtractBackgroundLightBackground";
  @SerializedName(SERIALIZED_NAME_SUBTRACT_BACKGROUND_LIGHT_BACKGROUND)
  private Boolean subtractBackgroundLightBackground = true;

  public static final String SERIALIZED_NAME_MEDIAN_KERNEL_SIZE = "MedianKernelSize";
  @SerializedName(SERIALIZED_NAME_MEDIAN_KERNEL_SIZE)
  private Integer medianKernelSize = 4;

  public static final String SERIALIZED_NAME_MIN_KERNEL_SIZE = "MinKernelSize";
  @SerializedName(SERIALIZED_NAME_MIN_KERNEL_SIZE)
  private Integer minKernelSize = 2;

  public static final String SERIALIZED_NAME_MAX_KERNEL_SIZE = "MaxKernelSize";
  @SerializedName(SERIALIZED_NAME_MAX_KERNEL_SIZE)
  private Integer maxKernelSize = 2;

  public static final String SERIALIZED_NAME_SOFTEN_VALUE = "SoftenValue";
  @SerializedName(SERIALIZED_NAME_SOFTEN_VALUE)
  private Integer softenValue = 0;

  public static final String SERIALIZED_NAME_COLORIZE_HUE = "ColorizeHue";
  @SerializedName(SERIALIZED_NAME_COLORIZE_HUE)
  private Float colorizeHue = 0f;

  public static final String SERIALIZED_NAME_COLORIZE_SATURATION = "ColorizeSaturation";
  @SerializedName(SERIALIZED_NAME_COLORIZE_SATURATION)
  private Float colorizeSaturation = 0f;

  public static final String SERIALIZED_NAME_COLORIZE_LUMINOSITY = "ColorizeLuminosity";
  @SerializedName(SERIALIZED_NAME_COLORIZE_LUMINOSITY)
  private Float colorizeLuminosity = 0f;


  public ImageFilterParameters fileId(String fileId) {
    
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


  public ImageFilterParameters pageRange(String pageRange) {
    
    this.pageRange = pageRange;
    return this;
  }

   /**
   * Specifies the number of the page, or the range of pages to apply the filter(s) to.
   * @return pageRange
  **/
  @ApiModelProperty(required = true, value = "Specifies the number of the page, or the range of pages to apply the filter(s) to.")

  public String getPageRange() {
    return pageRange;
  }


  public void setPageRange(String pageRange) {
    this.pageRange = pageRange;
  }


  public ImageFilterParameters filters(List<ImageFilters> filters) {
    
    this.filters = filters;
    return this;
  }

  public ImageFilterParameters addFiltersItem(ImageFilters filtersItem) {
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Specifies an array of filters to be applied.  A maximum of 5 entries is supported.
   * @return filters
  **/
  @ApiModelProperty(required = true, value = "Specifies an array of filters to be applied.  A maximum of 5 entries is supported.")

  public List<ImageFilters> getFilters() {
    return filters;
  }


  public void setFilters(List<ImageFilters> filters) {
    this.filters = filters;
  }


  public ImageFilterParameters roiLeft(Integer roiLeft) {
    
    this.roiLeft = roiLeft;
    return this;
  }

   /**
   * Specifies the left coordinate, in pixel, of the region to process.
   * @return roiLeft
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the left coordinate, in pixel, of the region to process.")

  public Integer getRoiLeft() {
    return roiLeft;
  }


  public void setRoiLeft(Integer roiLeft) {
    this.roiLeft = roiLeft;
  }


  public ImageFilterParameters roiTop(Integer roiTop) {
    
    this.roiTop = roiTop;
    return this;
  }

   /**
   * Specifies the top coordinate, in pixel, of the region to process.
   * @return roiTop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the top coordinate, in pixel, of the region to process.")

  public Integer getRoiTop() {
    return roiTop;
  }


  public void setRoiTop(Integer roiTop) {
    this.roiTop = roiTop;
  }


  public ImageFilterParameters roiWidth(Integer roiWidth) {
    
    this.roiWidth = roiWidth;
    return this;
  }

   /**
   * Specifies the width, in pixel, of the region to process. 0 causes the entire image to be processed.
   * @return roiWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the width, in pixel, of the region to process. 0 causes the entire image to be processed.")

  public Integer getRoiWidth() {
    return roiWidth;
  }


  public void setRoiWidth(Integer roiWidth) {
    this.roiWidth = roiWidth;
  }


  public ImageFilterParameters roiHeight(Integer roiHeight) {
    
    this.roiHeight = roiHeight;
    return this;
  }

   /**
   * Specifies the height, in pixel, of the region to process. 0 causes the entire image to be processed.
   * @return roiHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the height, in pixel, of the region to process. 0 causes the entire image to be processed.")

  public Integer getRoiHeight() {
    return roiHeight;
  }


  public void setRoiHeight(Integer roiHeight) {
    this.roiHeight = roiHeight;
  }


  public ImageFilterParameters gaussianKernelSize(Integer gaussianKernelSize) {
    
    this.gaussianKernelSize = gaussianKernelSize;
    return this;
  }

   /**
   * Specifies the kernel size for the Gaussian filter (if enabled). The size of the square kernel to use. Should be a odd value. For example, a size of 3 will involve 3 * 3 pixels in each pass. The larger the value the more blur you get. The range is larger or equal than 3, and less than the Image&#39;s Smaller Dimension (Width, Height) divided by 2. Suggested value is 3 for a [96-120] DPI image and 5 for a [200-250] dpi bitmap.
   * @return gaussianKernelSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the kernel size for the Gaussian filter (if enabled). The size of the square kernel to use. Should be a odd value. For example, a size of 3 will involve 3 * 3 pixels in each pass. The larger the value the more blur you get. The range is larger or equal than 3, and less than the Image's Smaller Dimension (Width, Height) divided by 2. Suggested value is 3 for a [96-120] DPI image and 5 for a [200-250] dpi bitmap.")

  public Integer getGaussianKernelSize() {
    return gaussianKernelSize;
  }


  public void setGaussianKernelSize(Integer gaussianKernelSize) {
    this.gaussianKernelSize = gaussianKernelSize;
  }


  public ImageFilterParameters unsharpMaskRadius(Integer unsharpMaskRadius) {
    
    this.unsharpMaskRadius = unsharpMaskRadius;
    return this;
  }

   /**
   * Size of Edges to become after the unsharp mask effect is applied. It controls how wide they get after the filter is applied. Radius and Amount interact, reducing one, allows more of the other. Minimum Value of Radius should be 3 or more to allow for enough pixels surrounding the edge to be investigated. If value passed less than 3 is passed it will be ammended automatically to 3. Proper value is 5. Value &gt;&#x3D; 3.
   * @return unsharpMaskRadius
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Size of Edges to become after the unsharp mask effect is applied. It controls how wide they get after the filter is applied. Radius and Amount interact, reducing one, allows more of the other. Minimum Value of Radius should be 3 or more to allow for enough pixels surrounding the edge to be investigated. If value passed less than 3 is passed it will be ammended automatically to 3. Proper value is 5. Value >= 3.")

  public Integer getUnsharpMaskRadius() {
    return unsharpMaskRadius;
  }


  public void setUnsharpMaskRadius(Integer unsharpMaskRadius) {
    this.unsharpMaskRadius = unsharpMaskRadius;
  }


  public ImageFilterParameters unsharpMaskAmount(Double unsharpMaskAmount) {
    
    this.unsharpMaskAmount = unsharpMaskAmount;
    return this;
  }

   /**
   * Amount of Contrast to be added to areas of edges where filter will be applies. It controls how much darker and how much brighter the edges become. Proper value is 0.5, Value between 0.0-5.0.
   * @return unsharpMaskAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of Contrast to be added to areas of edges where filter will be applies. It controls how much darker and how much brighter the edges become. Proper value is 0.5, Value between 0.0-5.0.")

  public Double getUnsharpMaskAmount() {
    return unsharpMaskAmount;
  }


  public void setUnsharpMaskAmount(Double unsharpMaskAmount) {
    this.unsharpMaskAmount = unsharpMaskAmount;
  }


  public ImageFilterParameters unsharpMaskThreshold(Integer unsharpMaskThreshold) {
    
    this.unsharpMaskThreshold = unsharpMaskThreshold;
    return this;
  }

   /**
   * Specifies the amount of edges to be sharpened. Smaller values sharpen more, higher values exclude the subtle edges from being sharpened. Proper value is 40. Value between 0-255.
   * @return unsharpMaskThreshold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the amount of edges to be sharpened. Smaller values sharpen more, higher values exclude the subtle edges from being sharpened. Proper value is 40. Value between 0-255.")

  public Integer getUnsharpMaskThreshold() {
    return unsharpMaskThreshold;
  }


  public void setUnsharpMaskThreshold(Integer unsharpMaskThreshold) {
    this.unsharpMaskThreshold = unsharpMaskThreshold;
  }


  public ImageFilterParameters subtractBackgroundRollingBallSize(Integer subtractBackgroundRollingBallSize) {
    
    this.subtractBackgroundRollingBallSize = subtractBackgroundRollingBallSize;
    return this;
  }

   /**
   * Size of ball rolled under the image. Controlled the amount of subtraction. Value &gt;&#x3D; 50.
   * @return subtractBackgroundRollingBallSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Size of ball rolled under the image. Controlled the amount of subtraction. Value >= 50.")

  public Integer getSubtractBackgroundRollingBallSize() {
    return subtractBackgroundRollingBallSize;
  }


  public void setSubtractBackgroundRollingBallSize(Integer subtractBackgroundRollingBallSize) {
    this.subtractBackgroundRollingBallSize = subtractBackgroundRollingBallSize;
  }


  public ImageFilterParameters subtractBackgroundLightBackground(Boolean subtractBackgroundLightBackground) {
    
    this.subtractBackgroundLightBackground = subtractBackgroundLightBackground;
    return this;
  }

   /**
   * Whether a background is lighter or not than the foreground.Value &gt;&#x3D; true.
   * @return subtractBackgroundLightBackground
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether a background is lighter or not than the foreground.Value >= true.")

  public Boolean getSubtractBackgroundLightBackground() {
    return subtractBackgroundLightBackground;
  }


  public void setSubtractBackgroundLightBackground(Boolean subtractBackgroundLightBackground) {
    this.subtractBackgroundLightBackground = subtractBackgroundLightBackground;
  }


  public ImageFilterParameters medianKernelSize(Integer medianKernelSize) {
    
    this.medianKernelSize = medianKernelSize;
    return this;
  }

   /**
   * Specifies the kernel size for the median filter (if enabled). Level corresponding to number of pixels to include in the median operation, where Level &#x3D; n, corresponds to (n*2+1)^2 pixels to be included. For Example, KernelSize &#x3D; 1 includes 9 pixels in the median operation, KernelSize &#x3D; 2 includes 25 pixels in the median operation. Range from 1 to 60.
   * @return medianKernelSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the kernel size for the median filter (if enabled). Level corresponding to number of pixels to include in the median operation, where Level = n, corresponds to (n*2+1)^2 pixels to be included. For Example, KernelSize = 1 includes 9 pixels in the median operation, KernelSize = 2 includes 25 pixels in the median operation. Range from 1 to 60.")

  public Integer getMedianKernelSize() {
    return medianKernelSize;
  }


  public void setMedianKernelSize(Integer medianKernelSize) {
    this.medianKernelSize = medianKernelSize;
  }


  public ImageFilterParameters minKernelSize(Integer minKernelSize) {
    
    this.minKernelSize = minKernelSize;
    return this;
  }

   /**
   * Specifies the kernel size for the minimum filter (if enabled). How large should objects grow in each direction of the four directions, left, right, top, and bottom This value should be larger than 1 and smaller than Image&#39;s Smaller Dimension (Width or Height) divided by 2.
   * @return minKernelSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the kernel size for the minimum filter (if enabled). How large should objects grow in each direction of the four directions, left, right, top, and bottom This value should be larger than 1 and smaller than Image's Smaller Dimension (Width or Height) divided by 2.")

  public Integer getMinKernelSize() {
    return minKernelSize;
  }


  public void setMinKernelSize(Integer minKernelSize) {
    this.minKernelSize = minKernelSize;
  }


  public ImageFilterParameters maxKernelSize(Integer maxKernelSize) {
    
    this.maxKernelSize = maxKernelSize;
    return this;
  }

   /**
   * Specifies the kernel size for the maximum filter (if enabled). How much smaller should objects become in each direction of the four directions, left, right, top, and bottom. This value should be larger than 1 and smaller than Image&#39;s Smaller Dimension (Width or Height) divided by 2.
   * @return maxKernelSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the kernel size for the maximum filter (if enabled). How much smaller should objects become in each direction of the four directions, left, right, top, and bottom. This value should be larger than 1 and smaller than Image's Smaller Dimension (Width or Height) divided by 2.")

  public Integer getMaxKernelSize() {
    return maxKernelSize;
  }


  public void setMaxKernelSize(Integer maxKernelSize) {
    this.maxKernelSize = maxKernelSize;
  }


  public ImageFilterParameters softenValue(Integer softenValue) {
    
    this.softenValue = softenValue;
    return this;
  }

   /**
   * Specifies the value for the soften filter (if enabled). Factor between 1 and 100.
   * @return softenValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the value for the soften filter (if enabled). Factor between 1 and 100.")

  public Integer getSoftenValue() {
    return softenValue;
  }


  public void setSoftenValue(Integer softenValue) {
    this.softenValue = softenValue;
  }


  public ImageFilterParameters colorizeHue(Float colorizeHue) {
    
    this.colorizeHue = colorizeHue;
    return this;
  }

   /**
   * Hue for the colorization effect (if enabled) [0..100].
   * @return colorizeHue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hue for the colorization effect (if enabled) [0..100].")

  public Float getColorizeHue() {
    return colorizeHue;
  }


  public void setColorizeHue(Float colorizeHue) {
    this.colorizeHue = colorizeHue;
  }


  public ImageFilterParameters colorizeSaturation(Float colorizeSaturation) {
    
    this.colorizeSaturation = colorizeSaturation;
    return this;
  }

   /**
   * Saturation for the colorization effect (if enabled) [0..100].
   * @return colorizeSaturation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Saturation for the colorization effect (if enabled) [0..100].")

  public Float getColorizeSaturation() {
    return colorizeSaturation;
  }


  public void setColorizeSaturation(Float colorizeSaturation) {
    this.colorizeSaturation = colorizeSaturation;
  }


  public ImageFilterParameters colorizeLuminosity(Float colorizeLuminosity) {
    
    this.colorizeLuminosity = colorizeLuminosity;
    return this;
  }

   /**
   * Luminosity for the colorization effect  (if enabled) [0..100].
   * @return colorizeLuminosity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Luminosity for the colorization effect  (if enabled) [0..100].")

  public Float getColorizeLuminosity() {
    return colorizeLuminosity;
  }


  public void setColorizeLuminosity(Float colorizeLuminosity) {
    this.colorizeLuminosity = colorizeLuminosity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageFilterParameters imageFilterParameters = (ImageFilterParameters) o;
    return Objects.equals(this.fileId, imageFilterParameters.fileId) &&
        Objects.equals(this.pageRange, imageFilterParameters.pageRange) &&
        Objects.equals(this.filters, imageFilterParameters.filters) &&
        Objects.equals(this.roiLeft, imageFilterParameters.roiLeft) &&
        Objects.equals(this.roiTop, imageFilterParameters.roiTop) &&
        Objects.equals(this.roiWidth, imageFilterParameters.roiWidth) &&
        Objects.equals(this.roiHeight, imageFilterParameters.roiHeight) &&
        Objects.equals(this.gaussianKernelSize, imageFilterParameters.gaussianKernelSize) &&
        Objects.equals(this.unsharpMaskRadius, imageFilterParameters.unsharpMaskRadius) &&
        Objects.equals(this.unsharpMaskAmount, imageFilterParameters.unsharpMaskAmount) &&
        Objects.equals(this.unsharpMaskThreshold, imageFilterParameters.unsharpMaskThreshold) &&
        Objects.equals(this.subtractBackgroundRollingBallSize, imageFilterParameters.subtractBackgroundRollingBallSize) &&
        Objects.equals(this.subtractBackgroundLightBackground, imageFilterParameters.subtractBackgroundLightBackground) &&
        Objects.equals(this.medianKernelSize, imageFilterParameters.medianKernelSize) &&
        Objects.equals(this.minKernelSize, imageFilterParameters.minKernelSize) &&
        Objects.equals(this.maxKernelSize, imageFilterParameters.maxKernelSize) &&
        Objects.equals(this.softenValue, imageFilterParameters.softenValue) &&
        Objects.equals(this.colorizeHue, imageFilterParameters.colorizeHue) &&
        Objects.equals(this.colorizeSaturation, imageFilterParameters.colorizeSaturation) &&
        Objects.equals(this.colorizeLuminosity, imageFilterParameters.colorizeLuminosity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, pageRange, filters, roiLeft, roiTop, roiWidth, roiHeight, gaussianKernelSize, unsharpMaskRadius, unsharpMaskAmount, unsharpMaskThreshold, subtractBackgroundRollingBallSize, subtractBackgroundLightBackground, medianKernelSize, minKernelSize, maxKernelSize, softenValue, colorizeHue, colorizeSaturation, colorizeLuminosity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageFilterParameters {\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    pageRange: ").append(toIndentedString(pageRange)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    roiLeft: ").append(toIndentedString(roiLeft)).append("\n");
    sb.append("    roiTop: ").append(toIndentedString(roiTop)).append("\n");
    sb.append("    roiWidth: ").append(toIndentedString(roiWidth)).append("\n");
    sb.append("    roiHeight: ").append(toIndentedString(roiHeight)).append("\n");
    sb.append("    gaussianKernelSize: ").append(toIndentedString(gaussianKernelSize)).append("\n");
    sb.append("    unsharpMaskRadius: ").append(toIndentedString(unsharpMaskRadius)).append("\n");
    sb.append("    unsharpMaskAmount: ").append(toIndentedString(unsharpMaskAmount)).append("\n");
    sb.append("    unsharpMaskThreshold: ").append(toIndentedString(unsharpMaskThreshold)).append("\n");
    sb.append("    subtractBackgroundRollingBallSize: ").append(toIndentedString(subtractBackgroundRollingBallSize)).append("\n");
    sb.append("    subtractBackgroundLightBackground: ").append(toIndentedString(subtractBackgroundLightBackground)).append("\n");
    sb.append("    medianKernelSize: ").append(toIndentedString(medianKernelSize)).append("\n");
    sb.append("    minKernelSize: ").append(toIndentedString(minKernelSize)).append("\n");
    sb.append("    maxKernelSize: ").append(toIndentedString(maxKernelSize)).append("\n");
    sb.append("    softenValue: ").append(toIndentedString(softenValue)).append("\n");
    sb.append("    colorizeHue: ").append(toIndentedString(colorizeHue)).append("\n");
    sb.append("    colorizeSaturation: ").append(toIndentedString(colorizeSaturation)).append("\n");
    sb.append("    colorizeLuminosity: ").append(toIndentedString(colorizeLuminosity)).append("\n");
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
