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


#include "SWGFiatWithData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGFiatWithData::SWGFiatWithData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGFiatWithData::SWGFiatWithData() {
    init();
}

SWGFiatWithData::~SWGFiatWithData() {
    this->cleanup();
}

void
SWGFiatWithData::init() {
    time_details = new SWGTimeDataCoin();
    withdraw_id = new QString("");
    value = 0L;
    account = new QString("");
    reason = new QString("");
}

void
SWGFiatWithData::cleanup() {
    
    if(time_details != nullptr) {
        delete time_details;
    }

    if(withdraw_id != nullptr) {
        delete withdraw_id;
    }


    if(account != nullptr) {
        delete account;
    }

    if(reason != nullptr) {
        delete reason;
    }
}

SWGFiatWithData*
SWGFiatWithData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGFiatWithData::fromJsonObject(QJsonObject &pJson) {
    ::Swagger::setValue(&time_details, pJson["time_details"], "SWGTimeDataCoin", "SWGTimeDataCoin");
    ::Swagger::setValue(&withdraw_id, pJson["withdraw_id"], "QString", "QString");
    ::Swagger::setValue(&value, pJson["value"], "qint64", "");
    ::Swagger::setValue(&account, pJson["account"], "QString", "QString");
    ::Swagger::setValue(&reason, pJson["reason"], "QString", "QString");
}

QString
SWGFiatWithData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGFiatWithData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    toJsonValue(QString("time_details"), time_details, obj, QString("SWGTimeDataCoin"));

    toJsonValue(QString("withdraw_id"), withdraw_id, obj, QString("QString"));

    obj->insert("value", QJsonValue(value));

    toJsonValue(QString("account"), account, obj, QString("QString"));

    toJsonValue(QString("reason"), reason, obj, QString("QString"));

    return obj;
}

SWGTimeDataCoin*
SWGFiatWithData::getTimeDetails() {
    return time_details;
}
void
SWGFiatWithData::setTimeDetails(SWGTimeDataCoin* time_details) {
    this->time_details = time_details;
}

QString*
SWGFiatWithData::getWithdrawId() {
    return withdraw_id;
}
void
SWGFiatWithData::setWithdrawId(QString* withdraw_id) {
    this->withdraw_id = withdraw_id;
}

qint64
SWGFiatWithData::getValue() {
    return value;
}
void
SWGFiatWithData::setValue(qint64 value) {
    this->value = value;
}

QString*
SWGFiatWithData::getAccount() {
    return account;
}
void
SWGFiatWithData::setAccount(QString* account) {
    this->account = account;
}

QString*
SWGFiatWithData::getReason() {
    return reason;
}
void
SWGFiatWithData::setReason(QString* reason) {
    this->reason = reason;
}



} /* namespace Swagger */

