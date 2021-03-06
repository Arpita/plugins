/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class Invoice (
  address: String,
  buyerEmail: String,
  cancelURL: String,
  expireTime: String,
  succURL: String,
  invoiceID: String,
  bitpayInvoiceID: String,
  notifyEmail: String,
  status: String,
  time: String,
  fiatCents: String,
  satoshis: String,
  info: String)
   extends ApiModel


