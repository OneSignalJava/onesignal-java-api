/*
 * OneSignal
 * A powerful way to send personalized messages at scale and build effective customer engagement strategies. Learn more at onesignal.com
 *
 * The version of the OpenAPI document: 1.0.2
 * Contact: devrel@onesignal.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.onesignal.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.onesignal.client.model.DeliveryData;
import com.onesignal.client.model.PlatformDeliveryDataEmailAllOf;
import com.onesignal.client.model.PlatformDeliveryDataSmsAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.onesignal.client.JSON;

/**
 * Hash of delivery statistics broken out by target device platform.
 */
@ApiModel(description = "Hash of delivery statistics broken out by target device platform.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-20T21:16:30.715Z[Etc/UTC]")
public class PlatformDeliveryData {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_EDGE_WEB_PUSH = "edge_web_push";
  @SerializedName(SERIALIZED_NAME_EDGE_WEB_PUSH)
  private DeliveryData edgeWebPush;

  public static final String SERIALIZED_NAME_CHROME_WEB_PUSH = "chrome_web_push";
  @SerializedName(SERIALIZED_NAME_CHROME_WEB_PUSH)
  private DeliveryData chromeWebPush;

  public static final String SERIALIZED_NAME_FIREFOX_WEB_PUSH = "firefox_web_push";
  @SerializedName(SERIALIZED_NAME_FIREFOX_WEB_PUSH)
  private DeliveryData firefoxWebPush;

  public static final String SERIALIZED_NAME_SAFARI_WEB_PUSH = "safari_web_push";
  @SerializedName(SERIALIZED_NAME_SAFARI_WEB_PUSH)
  private DeliveryData safariWebPush;

  public static final String SERIALIZED_NAME_ANDROID = "android";
  @SerializedName(SERIALIZED_NAME_ANDROID)
  private DeliveryData android;

  public static final String SERIALIZED_NAME_IOS = "ios";
  @SerializedName(SERIALIZED_NAME_IOS)
  private DeliveryData ios;

  public static final String SERIALIZED_NAME_SMS = "sms";
  @SerializedName(SERIALIZED_NAME_SMS)
  private DeliveryData sms;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private DeliveryData email;

  public PlatformDeliveryData() { 
  }

  public PlatformDeliveryData edgeWebPush(DeliveryData edgeWebPush) {
    
    this.edgeWebPush = edgeWebPush;
    return this;
  }

   /**
   * Get edgeWebPush
   * @return edgeWebPush
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeliveryData getEdgeWebPush() {
    return edgeWebPush;
  }


  public void setEdgeWebPush(DeliveryData edgeWebPush) {
    this.edgeWebPush = edgeWebPush;
  }


  public PlatformDeliveryData chromeWebPush(DeliveryData chromeWebPush) {
    
    this.chromeWebPush = chromeWebPush;
    return this;
  }

   /**
   * Get chromeWebPush
   * @return chromeWebPush
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeliveryData getChromeWebPush() {
    return chromeWebPush;
  }


  public void setChromeWebPush(DeliveryData chromeWebPush) {
    this.chromeWebPush = chromeWebPush;
  }


  public PlatformDeliveryData firefoxWebPush(DeliveryData firefoxWebPush) {
    
    this.firefoxWebPush = firefoxWebPush;
    return this;
  }

   /**
   * Get firefoxWebPush
   * @return firefoxWebPush
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeliveryData getFirefoxWebPush() {
    return firefoxWebPush;
  }


  public void setFirefoxWebPush(DeliveryData firefoxWebPush) {
    this.firefoxWebPush = firefoxWebPush;
  }


  public PlatformDeliveryData safariWebPush(DeliveryData safariWebPush) {
    
    this.safariWebPush = safariWebPush;
    return this;
  }

   /**
   * Get safariWebPush
   * @return safariWebPush
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeliveryData getSafariWebPush() {
    return safariWebPush;
  }


  public void setSafariWebPush(DeliveryData safariWebPush) {
    this.safariWebPush = safariWebPush;
  }


  public PlatformDeliveryData android(DeliveryData android) {
    
    this.android = android;
    return this;
  }

   /**
   * Get android
   * @return android
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeliveryData getAndroid() {
    return android;
  }


  public void setAndroid(DeliveryData android) {
    this.android = android;
  }


  public PlatformDeliveryData ios(DeliveryData ios) {
    
    this.ios = ios;
    return this;
  }

   /**
   * Get ios
   * @return ios
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeliveryData getIos() {
    return ios;
  }


  public void setIos(DeliveryData ios) {
    this.ios = ios;
  }


  public PlatformDeliveryData sms(DeliveryData sms) {
    
    this.sms = sms;
    return this;
  }

   /**
   * Get sms
   * @return sms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeliveryData getSms() {
    return sms;
  }


  public void setSms(DeliveryData sms) {
    this.sms = sms;
  }


  public PlatformDeliveryData email(DeliveryData email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeliveryData getEmail() {
    return email;
  }


  public void setEmail(DeliveryData email) {
    this.email = email;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatformDeliveryData platformDeliveryData = (PlatformDeliveryData) o;
    return Objects.equals(this.edgeWebPush, platformDeliveryData.edgeWebPush) &&
        Objects.equals(this.chromeWebPush, platformDeliveryData.chromeWebPush) &&
        Objects.equals(this.firefoxWebPush, platformDeliveryData.firefoxWebPush) &&
        Objects.equals(this.safariWebPush, platformDeliveryData.safariWebPush) &&
        Objects.equals(this.android, platformDeliveryData.android) &&
        Objects.equals(this.ios, platformDeliveryData.ios) &&
        Objects.equals(this.sms, platformDeliveryData.sms) &&
        Objects.equals(this.email, platformDeliveryData.email);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(edgeWebPush, chromeWebPush, firefoxWebPush, safariWebPush, android, ios, sms, email);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatformDeliveryData {\n");
    sb.append("    edgeWebPush: ").append(toIndentedString(edgeWebPush)).append("\n");
    sb.append("    chromeWebPush: ").append(toIndentedString(chromeWebPush)).append("\n");
    sb.append("    firefoxWebPush: ").append(toIndentedString(firefoxWebPush)).append("\n");
    sb.append("    safariWebPush: ").append(toIndentedString(safariWebPush)).append("\n");
    sb.append("    android: ").append(toIndentedString(android)).append("\n");
    sb.append("    ios: ").append(toIndentedString(ios)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("edge_web_push");
    openapiFields.add("chrome_web_push");
    openapiFields.add("firefox_web_push");
    openapiFields.add("safari_web_push");
    openapiFields.add("android");
    openapiFields.add("ios");
    openapiFields.add("sms");
    openapiFields.add("email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlatformDeliveryData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlatformDeliveryData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlatformDeliveryData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlatformDeliveryData.class));

       return (TypeAdapter<T>) new TypeAdapter<PlatformDeliveryData>() {
           @Override
           public void write(JsonWriter out, PlatformDeliveryData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PlatformDeliveryData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();

             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PlatformDeliveryData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PlatformDeliveryData
  * @throws IOException if the JSON string is invalid with respect to PlatformDeliveryData
  */
  public static PlatformDeliveryData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlatformDeliveryData.class);
  }

 /**
  * Convert an instance of PlatformDeliveryData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

