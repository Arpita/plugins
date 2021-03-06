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


#include "SWGWalletCoinWithdrawData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGWalletCoinWithdrawData::SWGWalletCoinWithdrawData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGWalletCoinWithdrawData::SWGWalletCoinWithdrawData() {
    init();
}

SWGWalletCoinWithdrawData::~SWGWalletCoinWithdrawData() {
    this->cleanup();
}

void
SWGWalletCoinWithdrawData::init() {
    time_details = new SWGTimeData();
    tx_id = new QString("");
    message = new QString("");
    satoshis = 0L;
    wallet_id = new QString("");
    withdraw_id = new QString("");
    sent_to = new QString("");
}

void
SWGWalletCoinWithdrawData::cleanup() {
    
    if(time_details != nullptr) {
        delete time_details;
    }

    if(tx_id != nullptr) {
        delete tx_id;
    }

    if(message != nullptr) {
        delete message;
    }


    if(wallet_id != nullptr) {
        delete wallet_id;
    }

    if(withdraw_id != nullptr) {
        delete withdraw_id;
    }

    if(sent_to != nullptr) {
        delete sent_to;
    }
}

SWGWalletCoinWithdrawData*
SWGWalletCoinWithdrawData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGWalletCoinWithdrawData::fromJsonObject(QJsonObject &pJson) {
    ::Swagger::setValue(&time_details, pJson["time_details"], "SWGTimeData", "SWGTimeData");
    ::Swagger::setValue(&tx_id, pJson["tx_id"], "QString", "QString");
    ::Swagger::setValue(&message, pJson["message"], "QString", "QString");
    ::Swagger::setValue(&satoshis, pJson["satoshis"], "qint64", "");
    ::Swagger::setValue(&wallet_id, pJson["wallet_id"], "QString", "QString");
    ::Swagger::setValue(&withdraw_id, pJson["withdraw_id"], "QString", "QString");
    ::Swagger::setValue(&sent_to, pJson["sent_to"], "QString", "QString");
}

QString
SWGWalletCoinWithdrawData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGWalletCoinWithdrawData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    toJsonValue(QString("time_details"), time_details, obj, QString("SWGTimeData"));

    toJsonValue(QString("tx_id"), tx_id, obj, QString("QString"));

    toJsonValue(QString("message"), message, obj, QString("QString"));

    obj->insert("satoshis", QJsonValue(satoshis));

    toJsonValue(QString("wallet_id"), wallet_id, obj, QString("QString"));

    toJsonValue(QString("withdraw_id"), withdraw_id, obj, QString("QString"));

    toJsonValue(QString("sent_to"), sent_to, obj, QString("QString"));

    return obj;
}

SWGTimeData*
SWGWalletCoinWithdrawData::getTimeDetails() {
    return time_details;
}
void
SWGWalletCoinWithdrawData::setTimeDetails(SWGTimeData* time_details) {
    this->time_details = time_details;
}

QString*
SWGWalletCoinWithdrawData::getTxId() {
    return tx_id;
}
void
SWGWalletCoinWithdrawData::setTxId(QString* tx_id) {
    this->tx_id = tx_id;
}

QString*
SWGWalletCoinWithdrawData::getMessage() {
    return message;
}
void
SWGWalletCoinWithdrawData::setMessage(QString* message) {
    this->message = message;
}

qint64
SWGWalletCoinWithdrawData::getSatoshis() {
    return satoshis;
}
void
SWGWalletCoinWithdrawData::setSatoshis(qint64 satoshis) {
    this->satoshis = satoshis;
}

QString*
SWGWalletCoinWithdrawData::getWalletId() {
    return wallet_id;
}
void
SWGWalletCoinWithdrawData::setWalletId(QString* wallet_id) {
    this->wallet_id = wallet_id;
}

QString*
SWGWalletCoinWithdrawData::getWithdrawId() {
    return withdraw_id;
}
void
SWGWalletCoinWithdrawData::setWithdrawId(QString* withdraw_id) {
    this->withdraw_id = withdraw_id;
}

QString*
SWGWalletCoinWithdrawData::getSentTo() {
    return sent_to;
}
void
SWGWalletCoinWithdrawData::setSentTo(QString* sent_to) {
    this->sent_to = sent_to;
}



} /* namespace Swagger */

