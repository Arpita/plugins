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
 * WalletAddressData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-27T22:11:57.435Z")
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

  public WalletAddressData walletID(String walletID) {
    this.walletID = walletID;
    return this;
  }

   /**
   * Get walletID
   * @return walletID
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getWalletID() {
    return walletID;
  }

  public void setWalletID(String walletID) {
    this.walletID = walletID;
  }

  public WalletAddressData address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public WalletAddressData time(Long time) {
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

  public WalletAddressData info(String info) {
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

  public WalletAddressData minConf(Integer minConf) {
    this.minConf = minConf;
    return this;
  }

   /**
   * Get minConf
   * @return minConf
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getMinConf() {
    return minConf;
  }

  public void setMinConf(Integer minConf) {
    this.minConf = minConf;
  }

  public WalletAddressData netki(String netki) {
    this.netki = netki;
    return this;
  }

   /**
   * Get netki
   * @return netki
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getNetki() {
    return netki;
  }

  public void setNetki(String netki) {
    this.netki = netki;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletAddressData walletAddressData = (WalletAddressData) o;
    return Objects.equals(this.walletID, walletAddressData.walletID) &&
        Objects.equals(this.address, walletAddressData.address) &&
        Objects.equals(this.time, walletAddressData.time) &&
        Objects.equals(this.info, walletAddressData.info) &&
        Objects.equals(this.minConf, walletAddressData.minConf) &&
        Objects.equals(this.netki, walletAddressData.netki);
  }

  @Override
  public int hashCode() {
    return Objects.hash(walletID, address, time, info, minConf, netki);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletAddressData {\n");
    
    sb.append("    walletID: ").append(toIndentedString(walletID)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    minConf: ").append(toIndentedString(minConf)).append("\n");
    sb.append("    netki: ").append(toIndentedString(netki)).append("\n");
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

