

# ImageFilterParameters

Represents the parameters for an image filtering action.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileId** | **String** | The identifier of the previously uploaded file to be processed. | 
**pageRange** | **String** | Specifies the number of the page, or the range of pages to apply the filter(s) to. | 
**filters** | [**List&lt;ImageFilters&gt;**](ImageFilters.md) | Specifies an array of filters to be applied.  A maximum of 5 entries is supported. | 
**roiLeft** | **Integer** | Specifies the left coordinate, in pixel, of the region to process. |  [optional]
**roiTop** | **Integer** | Specifies the top coordinate, in pixel, of the region to process. |  [optional]
**roiWidth** | **Integer** | Specifies the width, in pixel, of the region to process. 0 causes the entire image to be processed. |  [optional]
**roiHeight** | **Integer** | Specifies the height, in pixel, of the region to process. 0 causes the entire image to be processed. |  [optional]
**gaussianKernelSize** | **Integer** | Specifies the kernel size for the Gaussian filter (if enabled). The size of the square kernel to use. Should be a odd value. For example, a size of 3 will involve 3 * 3 pixels in each pass. The larger the value the more blur you get. The range is larger or equal than 3, and less than the Image&#39;s Smaller Dimension (Width, Height) divided by 2. Suggested value is 3 for a [96-120] DPI image and 5 for a [200-250] dpi bitmap. |  [optional]
**unsharpMaskRadius** | **Integer** | Size of Edges to become after the unsharp mask effect is applied. It controls how wide they get after the filter is applied. Radius and Amount interact, reducing one, allows more of the other. Minimum Value of Radius should be 3 or more to allow for enough pixels surrounding the edge to be investigated. If value passed less than 3 is passed it will be ammended automatically to 3. Proper value is 5. Value &gt;&#x3D; 3. |  [optional]
**unsharpMaskAmount** | **Double** | Amount of Contrast to be added to areas of edges where filter will be applies. It controls how much darker and how much brighter the edges become. Proper value is 0.5, Value between 0.0-5.0. |  [optional]
**unsharpMaskThreshold** | **Integer** | Specifies the amount of edges to be sharpened. Smaller values sharpen more, higher values exclude the subtle edges from being sharpened. Proper value is 40. Value between 0-255. |  [optional]
**subtractBackgroundRollingBallSize** | **Integer** | Size of ball rolled under the image. Controlled the amount of subtraction. Value &gt;&#x3D; 50. |  [optional]
**subtractBackgroundLightBackground** | **Boolean** | Whether a background is lighter or not than the foreground.Value &gt;&#x3D; true. |  [optional]
**medianKernelSize** | **Integer** | Specifies the kernel size for the median filter (if enabled). Level corresponding to number of pixels to include in the median operation, where Level &#x3D; n, corresponds to (n*2+1)^2 pixels to be included. For Example, KernelSize &#x3D; 1 includes 9 pixels in the median operation, KernelSize &#x3D; 2 includes 25 pixels in the median operation. Range from 1 to 60. |  [optional]
**minKernelSize** | **Integer** | Specifies the kernel size for the minimum filter (if enabled). How large should objects grow in each direction of the four directions, left, right, top, and bottom This value should be larger than 1 and smaller than Image&#39;s Smaller Dimension (Width or Height) divided by 2. |  [optional]
**maxKernelSize** | **Integer** | Specifies the kernel size for the maximum filter (if enabled). How much smaller should objects become in each direction of the four directions, left, right, top, and bottom. This value should be larger than 1 and smaller than Image&#39;s Smaller Dimension (Width or Height) divided by 2. |  [optional]
**softenValue** | **Integer** | Specifies the value for the soften filter (if enabled). Factor between 1 and 100. |  [optional]
**colorizeHue** | **Float** | Hue for the colorization effect (if enabled) [0..100]. |  [optional]
**colorizeSaturation** | **Float** | Saturation for the colorization effect (if enabled) [0..100]. |  [optional]
**colorizeLuminosity** | **Float** | Luminosity for the colorization effect  (if enabled) [0..100]. |  [optional]



