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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets DocumentPosition
 */
@JsonAdapter(DocumentPosition.Adapter.class)
public enum DocumentPosition {
  
  MIDDLELEFT("MiddleLeft"),
  
  MIDDLERIGHT("MiddleRight"),
  
  MIDDLECENTER("MiddleCenter"),
  
  TOPLEFT("TopLeft"),
  
  TOPRIGHT("TopRight"),
  
  TOPCENTER("TopCenter"),
  
  BOTTOMLEFT("BottomLeft"),
  
  BOTTOMRIGHT("BottomRight"),
  
  BOTTOMCENTER("BottomCenter");

  private String value;

  DocumentPosition(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DocumentPosition fromValue(String value) {
    for (DocumentPosition b : DocumentPosition.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DocumentPosition> {
    @Override
    public void write(final JsonWriter jsonWriter, final DocumentPosition enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DocumentPosition read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DocumentPosition.fromValue(value);
    }
  }
}

