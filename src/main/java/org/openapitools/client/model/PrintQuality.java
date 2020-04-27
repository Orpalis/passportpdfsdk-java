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
 * Specifies the quality level to be used to print documents.
 */
@JsonAdapter(PrintQuality.Adapter.class)
public enum PrintQuality {
  
  LOW("Low"),
  
  MEDIUM("Medium"),
  
  HIGH("High"),
  
  VERYHIGH("VeryHigh");

  private String value;

  PrintQuality(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PrintQuality fromValue(String value) {
    for (PrintQuality b : PrintQuality.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PrintQuality> {
    @Override
    public void write(final JsonWriter jsonWriter, final PrintQuality enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PrintQuality read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PrintQuality.fromValue(value);
    }
  }
}

