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


#include "SWGWalletAddressData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGWalletAddressData::SWGWalletAddressData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGWalletAddressData::SWGWalletAddressData() {
    init();
}

SWGWalletAddressData::~SWGWalletAddressData() {
    this->cleanup();
}

void
SWGWalletAddressData::init() {
    wallet_id = new QString("");
    address = new QString("");
    time = 0L;
    info = new QString("");
    min_conf = 0;
    netki = new QString("");
}

void
SWGWalletAddressData::cleanup() {
    
    if(wallet_id != nullptr) {
        delete wallet_id;
    }

    if(address != nullptr) {
        delete address;
    }


    if(info != nullptr) {
        delete info;
    }


    if(netki != nullptr) {
        delete netki;
    }
}

SWGWalletAddressData*
SWGWalletAddressData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGWalletAddressData::fromJsonObject(QJsonObject &pJson) {
    ::Swagger::setValue(&wallet_id, pJson["wallet_id"], "QString", "QString");
    ::Swagger::setValue(&address, pJson["address"], "QString", "QString");
    ::Swagger::setValue(&time, pJson["time"], "qint64", "");
    ::Swagger::setValue(&info, pJson["info"], "QString", "QString");
    ::Swagger::setValue(&min_conf, pJson["min_conf"], "qint32", "");
    ::Swagger::setValue(&netki, pJson["netki"], "QString", "QString");
}

QString
SWGWalletAddressData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGWalletAddressData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    toJsonValue(QString("wallet_id"), wallet_id, obj, QString("QString"));

    toJsonValue(QString("address"), address, obj, QString("QString"));

    obj->insert("time", QJsonValue(time));

    toJsonValue(QString("info"), info, obj, QString("QString"));

    obj->insert("min_conf", QJsonValue(min_conf));

    toJsonValue(QString("netki"), netki, obj, QString("QString"));

    return obj;
}

QString*
SWGWalletAddressData::getWalletId() {
    return wallet_id;
}
void
SWGWalletAddressData::setWalletId(QString* wallet_id) {
    this->wallet_id = wallet_id;
}

QString*
SWGWalletAddressData::getAddress() {
    return address;
}
void
SWGWalletAddressData::setAddress(QString* address) {
    this->address = address;
}

qint64
SWGWalletAddressData::getTime() {
    return time;
}
void
SWGWalletAddressData::setTime(qint64 time) {
    this->time = time;
}

QString*
SWGWalletAddressData::getInfo() {
    return info;
}
void
SWGWalletAddressData::setInfo(QString* info) {
    this->info = info;
}

qint32
SWGWalletAddressData::getMinConf() {
    return min_conf;
}
void
SWGWalletAddressData::setMinConf(qint32 min_conf) {
    this->min_conf = min_conf;
}

QString*
SWGWalletAddressData::getNetki() {
    return netki;
}
void
SWGWalletAddressData::setNetki(QString* netki) {
    this->netki = netki;
}



} /* namespace Swagger */

