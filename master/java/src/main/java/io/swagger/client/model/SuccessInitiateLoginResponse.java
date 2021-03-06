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

/**
 * SuccessInitiateLoginResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-27T22:11:57.435Z")
public class SuccessInitiateLoginResponse {
  @SerializedName("info")
  private String info = null;

  @SerializedName("validTill")
  private Long validTill = null;

  @SerializedName("mfa")
  private String mfa = null;

  @SerializedName("token")
  private String token = null;

  public SuccessInitiateLoginResponse info(String info) {
    this.info = info;
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public SuccessInitiateLoginResponse validTill(Long validTill) {
    this.validTill = validTill;
    return this;
  }

   /**
   * Get validTill
   * @return validTill
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Long getValidTill() {
    return validTill;
  }

  public void setValidTill(Long validTill) {
    this.validTill = validTill;
  }

  public SuccessInitiateLoginResponse mfa(String mfa) {
    this.mfa = mfa;
    return this;
  }

   /**
   * Get mfa
   * @return mfa
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getMfa() {
    return mfa;
  }

  public void setMfa(String mfa) {
    this.mfa = mfa;
  }

  public SuccessInitiateLoginResponse token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessInitiateLoginResponse successInitiateLoginResponse = (SuccessInitiateLoginResponse) o;
    return Objects.equals(this.info, successInitiateLoginResponse.info) &&
        Objects.equals(this.validTill, successInitiateLoginResponse.validTill) &&
        Objects.equals(this.mfa, successInitiateLoginResponse.mfa) &&
        Objects.equals(this.token, successInitiateLoginResponse.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(info, validTill, mfa, token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessInitiateLoginResponse {\n");
    
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    validTill: ").append(toIndentedString(validTill)).append("\n");
    sb.append("    mfa: ").append(toIndentedString(mfa)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

