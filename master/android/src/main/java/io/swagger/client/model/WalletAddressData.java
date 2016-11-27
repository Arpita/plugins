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
public class WalletAddressData {
  
  @SerializedName("walletID")
  private String walletID = null;
  @SerializedName("address")
  private String address = null;
  @SerializedName("time")
  private Long time = null;
  @SerializedName("info")
  private String info = null;
  @SerializedName("minConf")
  private Integer minConf = null;
  @SerializedName("netki")
  private String netki = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getWalletID() {
    return walletID;
  }
  public void setWalletID(String walletID) {
    this.walletID = walletID;
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
  public Long getTime() {
    return time;
  }
  public void setTime(Long time) {
    this.time = time;
  }

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
  public Integer getMinConf() {
    return minConf;
  }
  public void setMinConf(Integer minConf) {
    this.minConf = minConf;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getNetki() {
    return netki;
  }
  public void setNetki(String netki) {
    this.netki = netki;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletAddressData walletAddressData = (WalletAddressData) o;
    return (this.walletID == null ? walletAddressData.walletID == null : this.walletID.equals(walletAddressData.walletID)) &&
        (this.address == null ? walletAddressData.address == null : this.address.equals(walletAddressData.address)) &&
        (this.time == null ? walletAddressData.time == null : this.time.equals(walletAddressData.time)) &&
        (this.info == null ? walletAddressData.info == null : this.info.equals(walletAddressData.info)) &&
        (this.minConf == null ? walletAddressData.minConf == null : this.minConf.equals(walletAddressData.minConf)) &&
        (this.netki == null ? walletAddressData.netki == null : this.netki.equals(walletAddressData.netki));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.walletID == null ? 0: this.walletID.hashCode());
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    result = 31 * result + (this.time == null ? 0: this.time.hashCode());
    result = 31 * result + (this.info == null ? 0: this.info.hashCode());
    result = 31 * result + (this.minConf == null ? 0: this.minConf.hashCode());
    result = 31 * result + (this.netki == null ? 0: this.netki.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletAddressData {\n");
    
    sb.append("  walletID: ").append(walletID).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  time: ").append(time).append("\n");
    sb.append("  info: ").append(info).append("\n");
    sb.append("  minConf: ").append(minConf).append("\n");
    sb.append("  netki: ").append(netki).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
