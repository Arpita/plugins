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
 * AllRefData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-27T22:11:57.435Z")
public class AllRefData {
  @SerializedName("refPercent")
  private Double refPercent = null;

  @SerializedName("time")
  private Long time = null;

  @SerializedName("refID")
  private String refID = null;

  public AllRefData refPercent(Double refPercent) {
    this.refPercent = refPercent;
    return this;
  }

   /**
   * Get refPercent
   * @return refPercent
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Double getRefPercent() {
    return refPercent;
  }

  public void setRefPercent(Double refPercent) {
    this.refPercent = refPercent;
  }

  public AllRefData time(Long time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public AllRefData refID(String refID) {
    this.refID = refID;
    return this;
  }

   /**
   * Get refID
   * @return refID
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getRefID() {
    return refID;
  }

  public void setRefID(String refID) {
    this.refID = refID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllRefData allRefData = (AllRefData) o;
    return Objects.equals(this.refPercent, allRefData.refPercent) &&
        Objects.equals(this.time, allRefData.time) &&
        Objects.equals(this.refID, allRefData.refID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refPercent, time, refID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllRefData {\n");
    
    sb.append("    refPercent: ").append(toIndentedString(refPercent)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    refID: ").append(toIndentedString(refID)).append("\n");
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

