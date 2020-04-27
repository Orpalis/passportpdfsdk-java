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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Specifies a PassportPDF status.
 */
@JsonAdapter(PassportPDFStatus.Adapter.class)
public enum PassportPDFStatus {
  
  OK("OK"),
  
  ACTIONTIMEDOUT("ActionTimedOut"),
  
  EMPTYPARAMETER("EmptyParameter"),
  
  INVALIDAPIKEY("InvalidAPIKey"),
  
  NOTENOUGHTOKENS("NotEnoughTokens"),
  
  GENERICERROR("GenericError"),
  
  INVALIDPARAMETER("InvalidParameter"),
  
  INVALIDCOLOR("InvalidColor"),
  
  OUTOFMEMORY("OutOfMemory"),
  
  NOTIMPLEMENTED("NotImplemented"),
  
  FILENOTFOUND("FileNotFound"),
  
  ACCESSDENIED("AccessDenied"),
  
  CANNOTIMPORTFILETOPDF("CanNotImportFileToPDF"),
  
  PDFCANNOTBEDECRYPTED("PdfCanNotBeDecrypted"),
  
  PDFOPERATIONNOTALLOWED("PdfOperationNotAllowed"),
  
  PDFCANNOTOPENFILE("PdfCanNotOpenFile"),
  
  PDFCANNOTSAVEFILE("PdfCanNotSaveFile"),
  
  CANNOTCREATEFILE("CanNotCreateFile"),
  
  NODOCUMENTPROVIDED("NoDocumentProvided"),
  
  CANNOTREMOVEPAGE("CanNotRemovePage"),
  
  CANNOTSWAPPAGES("CanNotSwapPages"),
  
  CANNOTMOVEPAGE("CanNotMovePage"),
  
  CANNOTROTATEPAGE("CanNotRotatePage"),
  
  CANNOTFLIPPAGE("CanNotFlipPage"),
  
  INVALIDPAGERANGE("InvalidPageRange"),
  
  CANNOTREDUCEPDF("CanNotReducePDF"),
  
  CANNOTAUTODESKEW("CanNotAutoDeskew"),
  
  CANNOTSPLIT("CanNotSplit"),
  
  CANNOTSAVEASJPEG("CanNotSaveAsJPEG"),
  
  CANNOTDIGISIGN("CanNotDigiSign"),
  
  CANNOTPROTECT("CanNotProtect"),
  
  CANNOTCONVERTTOPDFA("CanNotConvertToPDFA"),
  
  CANNOTANNOTATE("CanNotAnnotate"),
  
  CANNOTCLEARPAGE("CanNotClearPage"),
  
  CANNOTMERGE("CanNotMerge"),
  
  CANNOTGETPAGETHUMBNAIL("CanNotGetPageThumbnail"),
  
  CANNOTGETDOCUMENTPREVIEW("CanNotGetDocumentPreview"),
  
  CANNOTREMOVEPAGEFORMFIELDS("CanNotRemovePageFormFields"),
  
  CANNOTINSERTIMAGE("CanNotInsertImage"),
  
  CANNOTDRAWIMAGE("CanNotDrawImage"),
  
  CANNOTINSERTPAGENUMBER("CanNotInsertPageNumber"),
  
  CANNOTINSERTTEXT("CanNotInsertText"),
  
  CANNOTREADBARCODE("CanNotReadBarcode"),
  
  CANNOTFLATTEN("CanNotFlatten"),
  
  CANNOTEXPORTMORETHAN2GIGABYTEFILE("CanNotExportMoreThan2GigabyteFile"),
  
  CANNOTOPENSESSION("CanNotOpenSession"),
  
  UNKNOWNOREXPIREDSESSION("UnknownOrExpiredSession"),
  
  CANNOTSAVEFILE("CanNotSaveFile"),
  
  CANNOTREPAIRPDF("CanNotRepairPDF"),
  
  UNSUPPORTEDIMAGEFORMAT("UnsupportedImageFormat"),
  
  CANNOTOCR("CanNotOCR"),
  
  CANNOTOPENIMAGE("CanNotOpenImage"),
  
  CANNOTSAVEASPNG("CanNotSaveAsPNG"),
  
  CANNOTSAVEASTIFF("CanNotSaveAsTIFF"),
  
  CANNOTSAVEASTIFFMULTIPAGE("CanNotSaveAsTIFFMultipage"),
  
  CANNOTSETINFO("CanNotSetInfo"),
  
  CANNOTSETPAGEBOX("CanNotSetPageBox"),
  
  CANNOTEXTRACTPAGE("CanNotExtractPage"),
  
  CANNOTINSERTNEWPAGE("CanNotInsertNewPage"),
  
  CANNOTCLONEPAGE("CanNotClonePage"),
  
  CANNOTSETINITIALVIEW("CanNotSetInitialView"),
  
  CANNOTADJUST("CanNotAdjust"),
  
  CANNOTRESIZE("CanNotResize"),
  
  CANNOTFILTER("CanNotFilter"),
  
  CANNOTCLEANUPDOCUMENT("CanNotCleanupDocument"),
  
  UNKNOWNDOCUMENTFORMAT("UnknownDocumentFormat"),
  
  CANNOTCROP("CanNotCrop"),
  
  CANNOTROTATE("CanNotRotate"),
  
  CANNOTDETECTCOLOR("CanNotDetectColor"),
  
  CANNOTCONVERTCOLORDEPTH("CanNotConvertColorDepth"),
  
  PDFCANNOTADDFONT("PdfCanNotAddFont"),
  
  ACTIONEXECUTIONREJECTED("ActionExecutionRejected"),
  
  CANNOTEXTRACTTEXT("CanNotExtractText"),
  
  CANNOTDETECTBLANKPAGES("CanNotDetectBlankPages"),
  
  CANNOTMICR("CanNotMICR"),
  
  CANNOTDETECTPAGEORIENTATION("CanNotDetectPageOrientation"),
  
  CANNOTDELETEPAGE("CanNotDeletePage"),
  
  CANNOTSAVEASPDF("CanNotSaveAsPDF"),
  
  CANNOTEXTRACTIMAGE("CanNotExtractImage"),
  
  CANNOTCLONEIMAGEREGION("CanNotCloneImageRegion"),
  
  CANNOTREORDERPAGES("CanNotReorderPages"),
  
  CANNOTAUTOCROP("CanNotAutoCrop"),
  
  CANNOTSCALEPAGE("CanNotScalePage"),
  
  CANNOTMERGEPAGES("CanNotMergePages"),
  
  CANNOTGETMETADATA("CanNotGetMetaData"),
  
  CANNOTSETMETADATA("CanNotSetMetadata"),
  
  CANNOTREMOVETEXT("CanNotRemoveText"),
  
  CANNOTDOWNLOADDOCUMENT("CanNotDownloadDocument");

  private String value;

  PassportPDFStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PassportPDFStatus fromValue(String value) {
    for (PassportPDFStatus b : PassportPDFStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PassportPDFStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final PassportPDFStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PassportPDFStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PassportPDFStatus.fromValue(value);
    }
  }
}

