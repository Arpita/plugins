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
public class TimeDataCoin {
  
  @SerializedName("time")
  private Long time = null;
  @SerializedName("verifiedTime")
  private Long verifiedTime = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getTime() {
    return time;
  }
  public void setTime(Long time) {
    this.time = time;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getVerifiedTime() {
    return verifiedTime;
  }
  public void setVerifiedTime(Long verifiedTime) {
    this.verifiedTime = verifiedTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeDataCoin timeDataCoin = (TimeDataCoin) o;
    return (this.time == null ? timeDataCoin.time == null : this.time.equals(timeDataCoin.time)) &&
        (this.verifiedTime == null ? timeDataCoin.verifiedTime == null : this.verifiedTime.equals(timeDataCoin.verifiedTime));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.time == null ? 0: this.time.hashCode());
    result = 31 * result + (this.verifiedTime == null ? 0: this.verifiedTime.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeDataCoin {\n");
    
    sb.append("  time: ").append(time).append("\n");
    sb.append("  verifiedTime: ").append(verifiedTime).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
