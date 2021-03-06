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
public class BankSummaryData {
  
  @SerializedName("pendingCoinBalance")
  private Long pendingCoinBalance = null;
  @SerializedName("pendingFiatBalance")
  private Long pendingFiatBalance = null;
  @SerializedName("availableCoinBalance")
  private Long availableCoinBalance = null;
  @SerializedName("availableFiatBalance")
  private Long availableFiatBalance = null;
  @SerializedName("totalCoinBalance")
  private Long totalCoinBalance = null;
  @SerializedName("totalFiatBalance")
  private Long totalFiatBalance = null;
  @SerializedName("coinFeePercentage")
  private Double coinFeePercentage = null;
  @SerializedName("fiatFeePercentage")
  private Double fiatFeePercentage = null;
  @SerializedName("bankLinkStatus")
  private String bankLinkStatus = null;
  @SerializedName("hasTradeNetki")
  private Boolean hasTradeNetki = null;
  @SerializedName("tradeNetkiName")
  private String tradeNetkiName = null;
  @SerializedName("tradeNetkiAddress")
  private String tradeNetkiAddress = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getPendingCoinBalance() {
    return pendingCoinBalance;
  }
  public void setPendingCoinBalance(Long pendingCoinBalance) {
    this.pendingCoinBalance = pendingCoinBalance;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getPendingFiatBalance() {
    return pendingFiatBalance;
  }
  public void setPendingFiatBalance(Long pendingFiatBalance) {
    this.pendingFiatBalance = pendingFiatBalance;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getAvailableCoinBalance() {
    return availableCoinBalance;
  }
  public void setAvailableCoinBalance(Long availableCoinBalance) {
    this.availableCoinBalance = availableCoinBalance;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getAvailableFiatBalance() {
    return availableFiatBalance;
  }
  public void setAvailableFiatBalance(Long availableFiatBalance) {
    this.availableFiatBalance = availableFiatBalance;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getTotalCoinBalance() {
    return totalCoinBalance;
  }
  public void setTotalCoinBalance(Long totalCoinBalance) {
    this.totalCoinBalance = totalCoinBalance;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getTotalFiatBalance() {
    return totalFiatBalance;
  }
  public void setTotalFiatBalance(Long totalFiatBalance) {
    this.totalFiatBalance = totalFiatBalance;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getCoinFeePercentage() {
    return coinFeePercentage;
  }
  public void setCoinFeePercentage(Double coinFeePercentage) {
    this.coinFeePercentage = coinFeePercentage;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getFiatFeePercentage() {
    return fiatFeePercentage;
  }
  public void setFiatFeePercentage(Double fiatFeePercentage) {
    this.fiatFeePercentage = fiatFeePercentage;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getBankLinkStatus() {
    return bankLinkStatus;
  }
  public void setBankLinkStatus(String bankLinkStatus) {
    this.bankLinkStatus = bankLinkStatus;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getHasTradeNetki() {
    return hasTradeNetki;
  }
  public void setHasTradeNetki(Boolean hasTradeNetki) {
    this.hasTradeNetki = hasTradeNetki;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getTradeNetkiName() {
    return tradeNetkiName;
  }
  public void setTradeNetkiName(String tradeNetkiName) {
    this.tradeNetkiName = tradeNetkiName;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getTradeNetkiAddress() {
    return tradeNetkiAddress;
  }
  public void setTradeNetkiAddress(String tradeNetkiAddress) {
    this.tradeNetkiAddress = tradeNetkiAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankSummaryData bankSummaryData = (BankSummaryData) o;
    return (this.pendingCoinBalance == null ? bankSummaryData.pendingCoinBalance == null : this.pendingCoinBalance.equals(bankSummaryData.pendingCoinBalance)) &&
        (this.pendingFiatBalance == null ? bankSummaryData.pendingFiatBalance == null : this.pendingFiatBalance.equals(bankSummaryData.pendingFiatBalance)) &&
        (this.availableCoinBalance == null ? bankSummaryData.availableCoinBalance == null : this.availableCoinBalance.equals(bankSummaryData.availableCoinBalance)) &&
        (this.availableFiatBalance == null ? bankSummaryData.availableFiatBalance == null : this.availableFiatBalance.equals(bankSummaryData.availableFiatBalance)) &&
        (this.totalCoinBalance == null ? bankSummaryData.totalCoinBalance == null : this.totalCoinBalance.equals(bankSummaryData.totalCoinBalance)) &&
        (this.totalFiatBalance == null ? bankSummaryData.totalFiatBalance == null : this.totalFiatBalance.equals(bankSummaryData.totalFiatBalance)) &&
        (this.coinFeePercentage == null ? bankSummaryData.coinFeePercentage == null : this.coinFeePercentage.equals(bankSummaryData.coinFeePercentage)) &&
        (this.fiatFeePercentage == null ? bankSummaryData.fiatFeePercentage == null : this.fiatFeePercentage.equals(bankSummaryData.fiatFeePercentage)) &&
        (this.bankLinkStatus == null ? bankSummaryData.bankLinkStatus == null : this.bankLinkStatus.equals(bankSummaryData.bankLinkStatus)) &&
        (this.hasTradeNetki == null ? bankSummaryData.hasTradeNetki == null : this.hasTradeNetki.equals(bankSummaryData.hasTradeNetki)) &&
        (this.tradeNetkiName == null ? bankSummaryData.tradeNetkiName == null : this.tradeNetkiName.equals(bankSummaryData.tradeNetkiName)) &&
        (this.tradeNetkiAddress == null ? bankSummaryData.tradeNetkiAddress == null : this.tradeNetkiAddress.equals(bankSummaryData.tradeNetkiAddress));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pendingCoinBalance == null ? 0: this.pendingCoinBalance.hashCode());
    result = 31 * result + (this.pendingFiatBalance == null ? 0: this.pendingFiatBalance.hashCode());
    result = 31 * result + (this.availableCoinBalance == null ? 0: this.availableCoinBalance.hashCode());
    result = 31 * result + (this.availableFiatBalance == null ? 0: this.availableFiatBalance.hashCode());
    result = 31 * result + (this.totalCoinBalance == null ? 0: this.totalCoinBalance.hashCode());
    result = 31 * result + (this.totalFiatBalance == null ? 0: this.totalFiatBalance.hashCode());
    result = 31 * result + (this.coinFeePercentage == null ? 0: this.coinFeePercentage.hashCode());
    result = 31 * result + (this.fiatFeePercentage == null ? 0: this.fiatFeePercentage.hashCode());
    result = 31 * result + (this.bankLinkStatus == null ? 0: this.bankLinkStatus.hashCode());
    result = 31 * result + (this.hasTradeNetki == null ? 0: this.hasTradeNetki.hashCode());
    result = 31 * result + (this.tradeNetkiName == null ? 0: this.tradeNetkiName.hashCode());
    result = 31 * result + (this.tradeNetkiAddress == null ? 0: this.tradeNetkiAddress.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankSummaryData {\n");
    
    sb.append("  pendingCoinBalance: ").append(pendingCoinBalance).append("\n");
    sb.append("  pendingFiatBalance: ").append(pendingFiatBalance).append("\n");
    sb.append("  availableCoinBalance: ").append(availableCoinBalance).append("\n");
    sb.append("  availableFiatBalance: ").append(availableFiatBalance).append("\n");
    sb.append("  totalCoinBalance: ").append(totalCoinBalance).append("\n");
    sb.append("  totalFiatBalance: ").append(totalFiatBalance).append("\n");
    sb.append("  coinFeePercentage: ").append(coinFeePercentage).append("\n");
    sb.append("  fiatFeePercentage: ").append(fiatFeePercentage).append("\n");
    sb.append("  bankLinkStatus: ").append(bankLinkStatus).append("\n");
    sb.append("  hasTradeNetki: ").append(hasTradeNetki).append("\n");
    sb.append("  tradeNetkiName: ").append(tradeNetkiName).append("\n");
    sb.append("  tradeNetkiAddress: ").append(tradeNetkiAddress).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
