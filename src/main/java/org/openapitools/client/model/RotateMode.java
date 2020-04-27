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
 * Specifies the rotation mode.
 */
@JsonAdapter(RotateMode.Adapter.class)
public enum RotateMode {
  
  VIEW("View"),
  
  CURRENTPAGE("CurrentPage");

  private String value;

  RotateMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RotateMode fromValue(String value) {
    for (RotateMode b : RotateMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<RotateMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final RotateMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RotateMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RotateMode.fromValue(value);
    }
  }
}

