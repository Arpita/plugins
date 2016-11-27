package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class SendCoinWallet {

    String walletID = null

    Long amt = null

    String toAddr = null

    String msg = null

    String pin = null

    Object fees = null
  

}

