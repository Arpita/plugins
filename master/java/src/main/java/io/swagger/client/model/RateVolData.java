package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * RateVolData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-16T19:11:03.227Z")
public class RateVolData   {
  
  private Long rate = null;
  private Long vol = null;

  
  /**
   **/
  public RateVolData rate(Long rate) {
    this.rate = rate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("rate")
  public Long getRate() {
    return rate;
  }
  public void setRate(Long rate) {
    this.rate = rate;
  }


  /**
   **/
  public RateVolData vol(Long vol) {
    this.vol = vol;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("vol")
  public Long getVol() {
    return vol;
  }
  public void setVol(Long vol) {
    this.vol = vol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateVolData rateVolData = (RateVolData) o;
    return Objects.equals(this.rate, rateVolData.rate) &&
        Objects.equals(this.vol, rateVolData.vol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, vol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateVolData {\n");
    
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    vol: ").append(toIndentedString(vol)).append("\n");
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

