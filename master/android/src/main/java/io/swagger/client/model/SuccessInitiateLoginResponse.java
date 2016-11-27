/**
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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SuccessInitiateLoginResponse {
  
  @SerializedName("info")
  private String info = null;
  @SerializedName("validTill")
  private Long validTill = null;
  @SerializedName("mfa")
  private String mfa = null;
  @SerializedName("token")
  private String token = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getInfo() {
    return info;
  }
  public void setInfo(String info) {
    this.info = info;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getValidTill() {
    return validTill;
  }
  public void setValidTill(Long validTill) {
    this.validTill = validTill;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getMfa() {
    return mfa;
  }
  public void setMfa(String mfa) {
    this.mfa = mfa;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessInitiateLoginResponse successInitiateLoginResponse = (SuccessInitiateLoginResponse) o;
    return (this.info == null ? successInitiateLoginResponse.info == null : this.info.equals(successInitiateLoginResponse.info)) &&
        (this.validTill == null ? successInitiateLoginResponse.validTill == null : this.validTill.equals(successInitiateLoginResponse.validTill)) &&
        (this.mfa == null ? successInitiateLoginResponse.mfa == null : this.mfa.equals(successInitiateLoginResponse.mfa)) &&
        (this.token == null ? successInitiateLoginResponse.token == null : this.token.equals(successInitiateLoginResponse.token));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.info == null ? 0: this.info.hashCode());
    result = 31 * result + (this.validTill == null ? 0: this.validTill.hashCode());
    result = 31 * result + (this.mfa == null ? 0: this.mfa.hashCode());
    result = 31 * result + (this.token == null ? 0: this.token.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessInitiateLoginResponse {\n");
    
    sb.append("  info: ").append(info).append("\n");
    sb.append("  validTill: ").append(validTill).append("\n");
    sb.append("  mfa: ").append(mfa).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
