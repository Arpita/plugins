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


#include "SWGNewBankForm.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGNewBankForm::SWGNewBankForm(QString* json) {
    init();
    this->fromJson(*json);
}

SWGNewBankForm::SWGNewBankForm() {
    init();
}

SWGNewBankForm::~SWGNewBankForm() {
    this->cleanup();
}

void
SWGNewBankForm::init() {
    acct_nick = new QString("");
    name = new QString("");
    ban = new QString("");
    ifsc = new QString("");
    message = new QString("");
    ban_type = new QString("");
    phone = new QString("");
    otp = new QString("");
}

void
SWGNewBankForm::cleanup() {
    
    if(acct_nick != nullptr) {
        delete acct_nick;
    }

    if(name != nullptr) {
        delete name;
    }

    if(ban != nullptr) {
        delete ban;
    }

    if(ifsc != nullptr) {
        delete ifsc;
    }

    if(message != nullptr) {
        delete message;
    }

    if(ban_type != nullptr) {
        delete ban_type;
    }

    if(phone != nullptr) {
        delete phone;
    }

    if(otp != nullptr) {
        delete otp;
    }
}

SWGNewBankForm*
SWGNewBankForm::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGNewBankForm::fromJsonObject(QJsonObject &pJson) {
    ::Swagger::setValue(&acct_nick, pJson["acct_nick"], "QString", "QString");
    ::Swagger::setValue(&name, pJson["name"], "QString", "QString");
    ::Swagger::setValue(&ban, pJson["ban"], "QString", "QString");
    ::Swagger::setValue(&ifsc, pJson["ifsc"], "QString", "QString");
    ::Swagger::setValue(&message, pJson["message"], "QString", "QString");
    ::Swagger::setValue(&ban_type, pJson["ban_type"], "QString", "QString");
    ::Swagger::setValue(&phone, pJson["phone"], "QString", "QString");
    ::Swagger::setValue(&otp, pJson["otp"], "QString", "QString");
}

QString
SWGNewBankForm::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGNewBankForm::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    toJsonValue(QString("acct_nick"), acct_nick, obj, QString("QString"));

    toJsonValue(QString("name"), name, obj, QString("QString"));

    toJsonValue(QString("ban"), ban, obj, QString("QString"));

    toJsonValue(QString("ifsc"), ifsc, obj, QString("QString"));

    toJsonValue(QString("message"), message, obj, QString("QString"));

    toJsonValue(QString("ban_type"), ban_type, obj, QString("QString"));

    toJsonValue(QString("phone"), phone, obj, QString("QString"));

    toJsonValue(QString("otp"), otp, obj, QString("QString"));

    return obj;
}

QString*
SWGNewBankForm::getAcctNick() {
    return acct_nick;
}
void
SWGNewBankForm::setAcctNick(QString* acct_nick) {
    this->acct_nick = acct_nick;
}

QString*
SWGNewBankForm::getName() {
    return name;
}
void
SWGNewBankForm::setName(QString* name) {
    this->name = name;
}

QString*
SWGNewBankForm::getBan() {
    return ban;
}
void
SWGNewBankForm::setBan(QString* ban) {
    this->ban = ban;
}

QString*
SWGNewBankForm::getIfsc() {
    return ifsc;
}
void
SWGNewBankForm::setIfsc(QString* ifsc) {
    this->ifsc = ifsc;
}

QString*
SWGNewBankForm::getMessage() {
    return message;
}
void
SWGNewBankForm::setMessage(QString* message) {
    this->message = message;
}

QString*
SWGNewBankForm::getBanType() {
    return ban_type;
}
void
SWGNewBankForm::setBanType(QString* ban_type) {
    this->ban_type = ban_type;
}

QString*
SWGNewBankForm::getPhone() {
    return phone;
}
void
SWGNewBankForm::setPhone(QString* phone) {
    this->phone = phone;
}

QString*
SWGNewBankForm::getOtp() {
    return otp;
}
void
SWGNewBankForm::setOtp(QString* otp) {
    this->otp = otp;
}



} /* namespace Swagger */

