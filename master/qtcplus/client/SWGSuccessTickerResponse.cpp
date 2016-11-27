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


#include "SWGSuccessTickerResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGSuccessTickerResponse::SWGSuccessTickerResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGSuccessTickerResponse::SWGSuccessTickerResponse() {
    init();
}

SWGSuccessTickerResponse::~SWGSuccessTickerResponse() {
    this->cleanup();
}

void
SWGSuccessTickerResponse::init() {
    last_price = 0L;
    timestamp = 0L;
    bid = 0L;
    ask = 0L;
    fiat_volume = 0L;
    coin_volume = 0L;
    open = 0L;
    high = 0L;
    low = 0L;
}

void
SWGSuccessTickerResponse::cleanup() {
    








}

SWGSuccessTickerResponse*
SWGSuccessTickerResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGSuccessTickerResponse::fromJsonObject(QJsonObject &pJson) {
    ::Swagger::setValue(&last_price, pJson["last_price"], "qint64", "");
    ::Swagger::setValue(&timestamp, pJson["timestamp"], "qint64", "");
    ::Swagger::setValue(&bid, pJson["bid"], "qint64", "");
    ::Swagger::setValue(&ask, pJson["ask"], "qint64", "");
    ::Swagger::setValue(&fiat_volume, pJson["fiat_volume"], "qint64", "");
    ::Swagger::setValue(&coin_volume, pJson["coin_volume"], "qint64", "");
    ::Swagger::setValue(&open, pJson["open"], "qint64", "");
    ::Swagger::setValue(&high, pJson["high"], "qint64", "");
    ::Swagger::setValue(&low, pJson["low"], "qint64", "");
}

QString
SWGSuccessTickerResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGSuccessTickerResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    obj->insert("last_price", QJsonValue(last_price));

    obj->insert("timestamp", QJsonValue(timestamp));

    obj->insert("bid", QJsonValue(bid));

    obj->insert("ask", QJsonValue(ask));

    obj->insert("fiat_volume", QJsonValue(fiat_volume));

    obj->insert("coin_volume", QJsonValue(coin_volume));

    obj->insert("open", QJsonValue(open));

    obj->insert("high", QJsonValue(high));

    obj->insert("low", QJsonValue(low));

    return obj;
}

qint64
SWGSuccessTickerResponse::getLastPrice() {
    return last_price;
}
void
SWGSuccessTickerResponse::setLastPrice(qint64 last_price) {
    this->last_price = last_price;
}

qint64
SWGSuccessTickerResponse::getTimestamp() {
    return timestamp;
}
void
SWGSuccessTickerResponse::setTimestamp(qint64 timestamp) {
    this->timestamp = timestamp;
}

qint64
SWGSuccessTickerResponse::getBid() {
    return bid;
}
void
SWGSuccessTickerResponse::setBid(qint64 bid) {
    this->bid = bid;
}

qint64
SWGSuccessTickerResponse::getAsk() {
    return ask;
}
void
SWGSuccessTickerResponse::setAsk(qint64 ask) {
    this->ask = ask;
}

qint64
SWGSuccessTickerResponse::getFiatVolume() {
    return fiat_volume;
}
void
SWGSuccessTickerResponse::setFiatVolume(qint64 fiat_volume) {
    this->fiat_volume = fiat_volume;
}

qint64
SWGSuccessTickerResponse::getCoinVolume() {
    return coin_volume;
}
void
SWGSuccessTickerResponse::setCoinVolume(qint64 coin_volume) {
    this->coin_volume = coin_volume;
}

qint64
SWGSuccessTickerResponse::getOpen() {
    return open;
}
void
SWGSuccessTickerResponse::setOpen(qint64 open) {
    this->open = open;
}

qint64
SWGSuccessTickerResponse::getHigh() {
    return high;
}
void
SWGSuccessTickerResponse::setHigh(qint64 high) {
    this->high = high;
}

qint64
SWGSuccessTickerResponse::getLow() {
    return low;
}
void
SWGSuccessTickerResponse::setLow(qint64 low) {
    this->low = low;
}



} /* namespace Swagger */

