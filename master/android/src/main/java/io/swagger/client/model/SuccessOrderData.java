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
public class SuccessOrderData  {
  
  @SerializedName("time")
  private Long time = null;
  @SerializedName("vol")
  private Long vol = null;
  @SerializedName("rate")
  private Long rate = null;
  @SerializedName("orderID")
  private String orderID = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("human_time")
  private String humanTime = null;

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
  public Long getVol() {
    return vol;
  }
  public void setVol(Long vol) {
    this.vol = vol;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getRate() {
    return rate;
  }
  public void setRate(Long rate) {
    this.rate = rate;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getOrderID() {
    return orderID;
  }
  public void setOrderID(String orderID) {
    this.orderID = orderID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getHumanTime() {
    return humanTime;
  }
  public void setHumanTime(String humanTime) {
    this.humanTime = humanTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessOrderData successOrderData = (SuccessOrderData) o;
    return (time == null ? successOrderData.time == null : time.equals(successOrderData.time)) &&
        (vol == null ? successOrderData.vol == null : vol.equals(successOrderData.vol)) &&
        (rate == null ? successOrderData.rate == null : rate.equals(successOrderData.rate)) &&
        (orderID == null ? successOrderData.orderID == null : orderID.equals(successOrderData.orderID)) &&
        (status == null ? successOrderData.status == null : status.equals(successOrderData.status)) &&
        (humanTime == null ? successOrderData.humanTime == null : humanTime.equals(successOrderData.humanTime));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (time == null ? 0: time.hashCode());
    result = 31 * result + (vol == null ? 0: vol.hashCode());
    result = 31 * result + (rate == null ? 0: rate.hashCode());
    result = 31 * result + (orderID == null ? 0: orderID.hashCode());
    result = 31 * result + (status == null ? 0: status.hashCode());
    result = 31 * result + (humanTime == null ? 0: humanTime.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessOrderData {\n");
    
    sb.append("  time: ").append(time).append("\n");
    sb.append("  vol: ").append(vol).append("\n");
    sb.append("  rate: ").append(rate).append("\n");
    sb.append("  orderID: ").append(orderID).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  humanTime: ").append(humanTime).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}