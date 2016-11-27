/*
 * Coinsecure Api Documentation
 * To generate an API key, please visit <a href='https://coinsecure.in/api' target='_new' class='homeapi'>https://coinsecure.in/api</a>.<br>Guidelines for use can be accessed at <a href='https://api.coinsecure.in/v1/guidelines'>https://api.coinsecure.in/v1/guidelines</a>.<br>Programming Language Libraries for use can be accessed at <a href='https://api.coinsecure.in/v1/code-libraries'>https://api.coinsecure.in/v1/code-libraries</a>.
 *
 * OpenAPI spec version: beta
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.SuccCoinRefData;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * SuccCoinRefDataResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-27T22:11:57.435Z")
public class SuccCoinRefDataResponse {
  @SerializedName("success")
  private Boolean success = false;

  @SerializedName("message")
  private List<SuccCoinRefData> message = new ArrayList<SuccCoinRefData>();

  @SerializedName("method")
  private String method = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("time")
  private DateTime time = null;

  public SuccCoinRefDataResponse success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * true
   * @return success
  **/
  @ApiModelProperty(example = "true", required = true, value = "true")
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public SuccCoinRefDataResponse message(List<SuccCoinRefData> message) {
    this.message = message;
    return this;
  }

  public SuccCoinRefDataResponse addMessageItem(SuccCoinRefData messageItem) {
    this.message.add(messageItem);
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<SuccCoinRefData> getMessage() {
    return message;
  }

  public void setMessage(List<SuccCoinRefData> message) {
    this.message = message;
  }

  public SuccCoinRefDataResponse method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public SuccCoinRefDataResponse title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public SuccCoinRefDataResponse time(DateTime time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public DateTime getTime() {
    return time;
  }

  public void setTime(DateTime time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccCoinRefDataResponse succCoinRefDataResponse = (SuccCoinRefDataResponse) o;
    return Objects.equals(this.success, succCoinRefDataResponse.success) &&
        Objects.equals(this.message, succCoinRefDataResponse.message) &&
        Objects.equals(this.method, succCoinRefDataResponse.method) &&
        Objects.equals(this.title, succCoinRefDataResponse.title) &&
        Objects.equals(this.time, succCoinRefDataResponse.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, message, method, title, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccCoinRefDataResponse {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

