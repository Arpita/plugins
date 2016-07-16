package io.swagger.client.api

import io.swagger.client.model.TradeAddressDataResponse
import io.swagger.client.model.FailResult
import io.swagger.client.model.VolDataResponse
import io.swagger.client.model.CoinDepDataResponse
import io.swagger.client.model.TradeCoinWithdrawDataResponse
import io.swagger.client.ApiInvoker
import io.swagger.client.ApiException

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date

import scala.collection.mutable.HashMap

class ExchangeBankCoinDataApi(val defBasePath: String = "https://api.coinsecure.in/",
                        defApiInvoker: ApiInvoker = ApiInvoker) {
  var basePath = defBasePath
  var apiInvoker = defApiInvoker

  def addHeader(key: String, value: String) = apiInvoker.defaultHeaders += key -> value 

  /**
   * Exchange Coin Addresses
   * Gets a List of Users Exchange Bitcoin Deposit Addresses.
   * @param authorization API object to be added 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return TradeAddressDataResponse
   */
  def v1UserExchangeBankCoinAddresses (authorization: String, accept: String) : Option[TradeAddressDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/coin/addresses".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

        
    headerParams += "Authorization" -> authorization
headerParams += "accept" -> accept

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[TradeAddressDataResponse]).asInstanceOf[TradeAddressDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Available Exchange Coin Balance
   * Returns balance which is in Available for Trades. The response is in satoshis.
   * @param authorization API object to be added 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return VolDataResponse
   */
  def v1UserExchangeBankCoinBalanceAvailable (authorization: String, accept: String) : Option[VolDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/coin/balance/total".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

        
    headerParams += "Authorization" -> authorization
headerParams += "accept" -> accept

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[VolDataResponse]).asInstanceOf[VolDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * In Trade Coin Balance
   * Returns in-trade or pending coin balance in satoshi.
   * @param authorization API object to be added 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return VolDataResponse
   */
  def v1UserExchangeBankCoinBalancePending (authorization: String, accept: String) : Option[VolDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/coin/balance/pending".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

        
    headerParams += "Authorization" -> authorization
headerParams += "accept" -> accept

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[VolDataResponse]).asInstanceOf[VolDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Total Exchange Coin Balance
   * Returns users total coin balance in satoshis. Pending + Available
   * @param authorization API object to be added 
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return VolDataResponse
   */
  def v1UserExchangeBankCoinBalanceTotal (authorization: String, accept: String) : Option[VolDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/coin/balance/available".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

        
    headerParams += "Authorization" -> authorization
headerParams += "accept" -> accept

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[VolDataResponse]).asInstanceOf[VolDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Cancelled Exchange Coin Deposits
   * Gets a List of Cancelled Exchange Coin Deposits. The value and fees are in paisa.
   * @param authorization API object to be added 
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
   * @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return CoinDepDataResponse
   */
  def v1UserExchangeBankCoinDepositCancelled (authorization: String, from: Long /* = 0 */, to: Long /* = 9223372036854776000 */, max: Integer /* = 10 */, offset: Long /* = 0 */, accept: String) : Option[CoinDepDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/coin/deposit/cancelled".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if(String.valueOf(from) != "null") queryParams += "from" -> from.toString
if(String.valueOf(to) != "null") queryParams += "to" -> to.toString
if(String.valueOf(max) != "null") queryParams += "max" -> max.toString
if(String.valueOf(offset) != "null") queryParams += "offset" -> offset.toString
    
    headerParams += "Authorization" -> authorization
headerParams += "accept" -> accept

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[CoinDepDataResponse]).asInstanceOf[CoinDepDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Unverified Exchange Coin Deposits
   * Gets a List of Unverified Exchange Coin Deposits. The value and fees are in paisa.
   * @param authorization API object to be added 
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
   * @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return CoinDepDataResponse
   */
  def v1UserExchangeBankCoinDepositUnverified (authorization: String, from: Long /* = 0 */, to: Long /* = 9223372036854776000 */, max: Integer /* = 10 */, offset: Long /* = 0 */, accept: String) : Option[CoinDepDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/coin/deposit/unverified".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if(String.valueOf(from) != "null") queryParams += "from" -> from.toString
if(String.valueOf(to) != "null") queryParams += "to" -> to.toString
if(String.valueOf(max) != "null") queryParams += "max" -> max.toString
if(String.valueOf(offset) != "null") queryParams += "offset" -> offset.toString
    
    headerParams += "Authorization" -> authorization
headerParams += "accept" -> accept

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[CoinDepDataResponse]).asInstanceOf[CoinDepDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Verified Exchange Coin Deposits
   * Gets a List of Verified Exchange Coin Deposits. The value and fees are in paisa.
   * @param authorization API object to be added 
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
   * @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return CoinDepDataResponse
   */
  def v1UserExchangeBankCoinDepositVerified (authorization: String, from: Long /* = 0 */, to: Long /* = 9223372036854776000 */, max: Integer /* = 10 */, offset: Long /* = 0 */, accept: String) : Option[CoinDepDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/coin/deposit/verified".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if(String.valueOf(from) != "null") queryParams += "from" -> from.toString
if(String.valueOf(to) != "null") queryParams += "to" -> to.toString
if(String.valueOf(max) != "null") queryParams += "max" -> max.toString
if(String.valueOf(offset) != "null") queryParams += "offset" -> offset.toString
    
    headerParams += "Authorization" -> authorization
headerParams += "accept" -> accept

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[CoinDepDataResponse]).asInstanceOf[CoinDepDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Cancelled Exchange Coin Withdrawals
   * Gets a List of Cancelled Coin Withdrawals. The value and fees are in satoshis.
   * @param authorization API object to be added 
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
   * @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return TradeCoinWithdrawDataResponse
   */
  def v1UserExchangeBankCoinWithdrawCancelled (authorization: String, from: Long /* = 0 */, to: Long /* = 9223372036854776000 */, max: Integer /* = 10 */, offset: Long /* = 0 */, accept: String) : Option[TradeCoinWithdrawDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/coin/withdraw/cancelled".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if(String.valueOf(from) != "null") queryParams += "from" -> from.toString
if(String.valueOf(to) != "null") queryParams += "to" -> to.toString
if(String.valueOf(max) != "null") queryParams += "max" -> max.toString
if(String.valueOf(offset) != "null") queryParams += "offset" -> offset.toString
    
    headerParams += "Authorization" -> authorization
headerParams += "accept" -> accept

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[TradeCoinWithdrawDataResponse]).asInstanceOf[TradeCoinWithdrawDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Completed Exchange Coin Withdrawals
   * Gets a List of Completed Coin Withdrawals. The value and fees are in satoshis.
   * @param authorization API object to be added 
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
   * @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return TradeCoinWithdrawDataResponse
   */
  def v1UserExchangeBankCoinWithdrawCompleted (authorization: String, from: Long /* = 0 */, to: Long /* = 9223372036854776000 */, max: Integer /* = 10 */, offset: Long /* = 0 */, accept: String) : Option[TradeCoinWithdrawDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/coin/withdraw/completed".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if(String.valueOf(from) != "null") queryParams += "from" -> from.toString
if(String.valueOf(to) != "null") queryParams += "to" -> to.toString
if(String.valueOf(max) != "null") queryParams += "max" -> max.toString
if(String.valueOf(offset) != "null") queryParams += "offset" -> offset.toString
    
    headerParams += "Authorization" -> authorization
headerParams += "accept" -> accept

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[TradeCoinWithdrawDataResponse]).asInstanceOf[TradeCoinWithdrawDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Unverified Exchange Coin Withdrawals
   * Gets a List of Unverified Exchange Coin Withdrawals. The value and fees are in satoshis.
   * @param authorization API object to be added 
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
   * @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return TradeCoinWithdrawDataResponse
   */
  def v1UserExchangeBankCoinWithdrawUnverified (authorization: String, from: Long /* = 0 */, to: Long /* = 9223372036854776000 */, max: Integer /* = 10 */, offset: Long /* = 0 */, accept: String) : Option[TradeCoinWithdrawDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/coin/withdraw/unverified".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if(String.valueOf(from) != "null") queryParams += "from" -> from.toString
if(String.valueOf(to) != "null") queryParams += "to" -> to.toString
if(String.valueOf(max) != "null") queryParams += "max" -> max.toString
if(String.valueOf(offset) != "null") queryParams += "offset" -> offset.toString
    
    headerParams += "Authorization" -> authorization
headerParams += "accept" -> accept

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[TradeCoinWithdrawDataResponse]).asInstanceOf[TradeCoinWithdrawDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

  /**
   * Verified Exchange Coin Withdrawals
   * Gets a List of Verified Exchange Coin Withdrawals. The value and fees are in satoshis.
   * @param authorization API object to be added 
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
   * @param offset Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
   * @param accept JSON, XML or CSV can be returned (Optional) (optional)
   * @return TradeCoinWithdrawDataResponse
   */
  def v1UserExchangeBankCoinWithdrawVerified (authorization: String, from: Long /* = 0 */, to: Long /* = 9223372036854776000 */, max: Integer /* = 10 */, offset: Long /* = 0 */, accept: String) : Option[TradeCoinWithdrawDataResponse] = {
    // create path and map variables
    val path = "/v1/user/exchange/bank/coin/withdraw/verified".replaceAll("\\{format\\}","json")
    val contentTypes = List("application/json", "application/json")
    val contentType = contentTypes(0)

    // query params
    val queryParams = new HashMap[String, String]
    val headerParams = new HashMap[String, String]
    val formParams = new HashMap[String, String]

    if(String.valueOf(from) != "null") queryParams += "from" -> from.toString
if(String.valueOf(to) != "null") queryParams += "to" -> to.toString
if(String.valueOf(max) != "null") queryParams += "max" -> max.toString
if(String.valueOf(offset) != "null") queryParams += "offset" -> offset.toString
    
    headerParams += "Authorization" -> authorization
headerParams += "accept" -> accept

    var postBody: AnyRef = null

    if(contentType.startsWith("multipart/form-data")) {
      val mp = new FormDataMultiPart()
      
      postBody = mp
    }
    else {
    }

    try {
      apiInvoker.invokeApi(basePath, path, "GET", queryParams.toMap, formParams.toMap, postBody, headerParams.toMap, contentType) match {
        case s: String =>
           Some(ApiInvoker.deserialize(s, "", classOf[TradeCoinWithdrawDataResponse]).asInstanceOf[TradeCoinWithdrawDataResponse])
        case _ => None
      }
    } catch {
      case ex: ApiException if ex.code == 404 => None
      case ex: ApiException => throw ex
    }
  }

}