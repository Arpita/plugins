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
 * WalletSummaryData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-27T22:11:57.435Z")
public class WalletSummaryData {
  @SerializedName("walletConfirmedBalance")
  private Long walletConfirmedBalance = null;

  @SerializedName("walletUncofirmedBalance")
  private Long walletUncofirmedBalance = null;

  @SerializedName("hasWalletNetki")
  private Boolean hasWalletNetki = false;

  @SerializedName("walletNetki")
  private String walletNetki = null;

  @SerializedName("walletNetkiAddress")
  private String walletNetkiAddress = null;

  @SerializedName("walletNetkiWalletId")
  private String walletNetkiWalletId = null;

  public WalletSummaryData walletConfirmedBalance(Long walletConfirmedBalance) {
    this.walletConfirmedBalance = walletConfirmedBalance;
    return this;
  }

   /**
   * Get walletConfirmedBalance
   * @return walletConfirmedBalance
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Long getWalletConfirmedBalance() {
    return walletConfirmedBalance;
  }

  public void setWalletConfirmedBalance(Long walletConfirmedBalance) {
    this.walletConfirmedBalance = walletConfirmedBalance;
  }

  public WalletSummaryData walletUncofirmedBalance(Long walletUncofirmedBalance) {
    this.walletUncofirmedBalance = walletUncofirmedBalance;
    return this;
  }

   /**
   * Get walletUncofirmedBalance
   * @return walletUncofirmedBalance
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Long getWalletUncofirmedBalance() {
    return walletUncofirmedBalance;
  }

  public void setWalletUncofirmedBalance(Long walletUncofirmedBalance) {
    this.walletUncofirmedBalance = walletUncofirmedBalance;
  }

  public WalletSummaryData hasWalletNetki(Boolean hasWalletNetki) {
    this.hasWalletNetki = hasWalletNetki;
    return this;
  }

   /**
   * Get hasWalletNetki
   * @return hasWalletNetki
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Boolean getHasWalletNetki() {
    return hasWalletNetki;
  }

  public void setHasWalletNetki(Boolean hasWalletNetki) {
    this.hasWalletNetki = hasWalletNetki;
  }

  public WalletSummaryData walletNetki(String walletNetki) {
    this.walletNetki = walletNetki;
    return this;
  }

   /**
   * Get walletNetki
   * @return walletNetki
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getWalletNetki() {
    return walletNetki;
  }

  public void setWalletNetki(String walletNetki) {
    this.walletNetki = walletNetki;
  }

  public WalletSummaryData walletNetkiAddress(String walletNetkiAddress) {
    this.walletNetkiAddress = walletNetkiAddress;
    return this;
  }

   /**
   * Get walletNetkiAddress
   * @return walletNetkiAddress
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getWalletNetkiAddress() {
    return walletNetkiAddress;
  }

  public void setWalletNetkiAddress(String walletNetkiAddress) {
    this.walletNetkiAddress = walletNetkiAddress;
  }

  public WalletSummaryData walletNetkiWalletId(String walletNetkiWalletId) {
    this.walletNetkiWalletId = walletNetkiWalletId;
    return this;
  }

   /**
   * Get walletNetkiWalletId
   * @return walletNetkiWalletId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getWalletNetkiWalletId() {
    return walletNetkiWalletId;
  }

  public void setWalletNetkiWalletId(String walletNetkiWalletId) {
    this.walletNetkiWalletId = walletNetkiWalletId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletSummaryData walletSummaryData = (WalletSummaryData) o;
    return Objects.equals(this.walletConfirmedBalance, walletSummaryData.walletConfirmedBalance) &&
        Objects.equals(this.walletUncofirmedBalance, walletSummaryData.walletUncofirmedBalance) &&
        Objects.equals(this.hasWalletNetki, walletSummaryData.hasWalletNetki) &&
        Objects.equals(this.walletNetki, walletSummaryData.walletNetki) &&
        Objects.equals(this.walletNetkiAddress, walletSummaryData.walletNetkiAddress) &&
        Objects.equals(this.walletNetkiWalletId, walletSummaryData.walletNetkiWalletId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(walletConfirmedBalance, walletUncofirmedBalance, hasWalletNetki, walletNetki, walletNetkiAddress, walletNetkiWalletId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletSummaryData {\n");
    
    sb.append("    walletConfirmedBalance: ").append(toIndentedString(walletConfirmedBalance)).append("\n");
    sb.append("    walletUncofirmedBalance: ").append(toIndentedString(walletUncofirmedBalance)).append("\n");
    sb.append("    hasWalletNetki: ").append(toIndentedString(hasWalletNetki)).append("\n");
    sb.append("    walletNetki: ").append(toIndentedString(walletNetki)).append("\n");
    sb.append("    walletNetkiAddress: ").append(toIndentedString(walletNetkiAddress)).append("\n");
    sb.append("    walletNetkiWalletId: ").append(toIndentedString(walletNetkiWalletId)).append("\n");
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

