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

import io.swagger.client.model.TimeDataCoin;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CoinDepData {
  
  @SerializedName("timeDetails")
  private TimeDataCoin timeDetails = null;
  @SerializedName("address")
  private String address = null;
  @SerializedName("value")
  private Long value = null;
  @SerializedName("txHash")
  private String txHash = null;
  @SerializedName("depositID")
  private String depositID = null;
  @SerializedName("reason")
  private String reason = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public TimeDataCoin getTimeDetails() {
    return timeDetails;
  }
  public void setTimeDetails(TimeDataCoin timeDetails) {
    this.timeDetails = timeDetails;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getValue() {
    return value;
  }
  public void setValue(Long value) {
    this.value = value;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getTxHash() {
    return txHash;
  }
  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getDepositID() {
    return depositID;
  }
  public void setDepositID(String depositID) {
    this.depositID = depositID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getReason() {
    return reason;
  }
  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinDepData coinDepData = (CoinDepData) o;
    return (this.timeDetails == null ? coinDepData.timeDetails == null : this.timeDetails.equals(coinDepData.timeDetails)) &&
        (this.address == null ? coinDepData.address == null : this.address.equals(coinDepData.address)) &&
        (this.value == null ? coinDepData.value == null : this.value.equals(coinDepData.value)) &&
        (this.txHash == null ? coinDepData.txHash == null : this.txHash.equals(coinDepData.txHash)) &&
        (this.depositID == null ? coinDepData.depositID == null : this.depositID.equals(coinDepData.depositID)) &&
        (this.reason == null ? coinDepData.reason == null : this.reason.equals(coinDepData.reason));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.timeDetails == null ? 0: this.timeDetails.hashCode());
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    result = 31 * result + (this.value == null ? 0: this.value.hashCode());
    result = 31 * result + (this.txHash == null ? 0: this.txHash.hashCode());
    result = 31 * result + (this.depositID == null ? 0: this.depositID.hashCode());
    result = 31 * result + (this.reason == null ? 0: this.reason.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinDepData {\n");
    
    sb.append("  timeDetails: ").append(timeDetails).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("  txHash: ").append(txHash).append("\n");
    sb.append("  depositID: ").append(depositID).append("\n");
    sb.append("  reason: ").append(reason).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
