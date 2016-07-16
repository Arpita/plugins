package io.swagger.client.model;

import io.swagger.client.model.TimeData;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class TradeCoinWithdrawData  {
  
  @SerializedName("timeDetails")
  private TimeData timeDetails = null;
  @SerializedName("address")
  private String address = null;
  @SerializedName("value")
  private Long value = null;
  @SerializedName("fees")
  private Long fees = null;
  @SerializedName("withdrawID")
  private String withdrawID = null;
  @SerializedName("txHash")
  private String txHash = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public TimeData getTimeDetails() {
    return timeDetails;
  }
  public void setTimeDetails(TimeData timeDetails) {
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
  public Long getFees() {
    return fees;
  }
  public void setFees(Long fees) {
    this.fees = fees;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getWithdrawID() {
    return withdrawID;
  }
  public void setWithdrawID(String withdrawID) {
    this.withdrawID = withdrawID;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradeCoinWithdrawData tradeCoinWithdrawData = (TradeCoinWithdrawData) o;
    return (timeDetails == null ? tradeCoinWithdrawData.timeDetails == null : timeDetails.equals(tradeCoinWithdrawData.timeDetails)) &&
        (address == null ? tradeCoinWithdrawData.address == null : address.equals(tradeCoinWithdrawData.address)) &&
        (value == null ? tradeCoinWithdrawData.value == null : value.equals(tradeCoinWithdrawData.value)) &&
        (fees == null ? tradeCoinWithdrawData.fees == null : fees.equals(tradeCoinWithdrawData.fees)) &&
        (withdrawID == null ? tradeCoinWithdrawData.withdrawID == null : withdrawID.equals(tradeCoinWithdrawData.withdrawID)) &&
        (txHash == null ? tradeCoinWithdrawData.txHash == null : txHash.equals(tradeCoinWithdrawData.txHash));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (timeDetails == null ? 0: timeDetails.hashCode());
    result = 31 * result + (address == null ? 0: address.hashCode());
    result = 31 * result + (value == null ? 0: value.hashCode());
    result = 31 * result + (fees == null ? 0: fees.hashCode());
    result = 31 * result + (withdrawID == null ? 0: withdrawID.hashCode());
    result = 31 * result + (txHash == null ? 0: txHash.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeCoinWithdrawData {\n");
    
    sb.append("  timeDetails: ").append(timeDetails).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("  fees: ").append(fees).append("\n");
    sb.append("  withdrawID: ").append(withdrawID).append("\n");
    sb.append("  txHash: ").append(txHash).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
