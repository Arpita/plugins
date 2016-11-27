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


#include "SWGKYCData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGKYCData::SWGKYCData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGKYCData::SWGKYCData() {
    init();
}

SWGKYCData::~SWGKYCData() {
    this->cleanup();
}

void
SWGKYCData::init() {
    time_details = new SWGTimeKYCData();
    kyc_id = new QString("");
    first_name = new QString("");
    last_name = new QString("");
    status = new QString("");
    user_type = new QString("");
    info = new QString("");
}

void
SWGKYCData::cleanup() {
    
    if(time_details != nullptr) {
        delete time_details;
    }

    if(kyc_id != nullptr) {
        delete kyc_id;
    }

    if(first_name != nullptr) {
        delete first_name;
    }

    if(last_name != nullptr) {
        delete last_name;
    }

    if(status != nullptr) {
        delete status;
    }

    if(user_type != nullptr) {
        delete user_type;
    }

    if(info != nullptr) {
        delete info;
    }
}

SWGKYCData*
SWGKYCData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGKYCData::fromJsonObject(QJsonObject &pJson) {
    ::Swagger::setValue(&time_details, pJson["time_details"], "SWGTimeKYCData", "SWGTimeKYCData");
    ::Swagger::setValue(&kyc_id, pJson["kyc_id"], "QString", "QString");
    ::Swagger::setValue(&first_name, pJson["first_name"], "QString", "QString");
    ::Swagger::setValue(&last_name, pJson["last_name"], "QString", "QString");
    ::Swagger::setValue(&status, pJson["status"], "QString", "QString");
    ::Swagger::setValue(&user_type, pJson["user_type"], "QString", "QString");
    ::Swagger::setValue(&info, pJson["info"], "QString", "QString");
}

QString
SWGKYCData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGKYCData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    toJsonValue(QString("time_details"), time_details, obj, QString("SWGTimeKYCData"));

    toJsonValue(QString("kyc_id"), kyc_id, obj, QString("QString"));

    toJsonValue(QString("first_name"), first_name, obj, QString("QString"));

    toJsonValue(QString("last_name"), last_name, obj, QString("QString"));

    toJsonValue(QString("status"), status, obj, QString("QString"));

    toJsonValue(QString("user_type"), user_type, obj, QString("QString"));

    toJsonValue(QString("info"), info, obj, QString("QString"));

    return obj;
}

SWGTimeKYCData*
SWGKYCData::getTimeDetails() {
    return time_details;
}
void
SWGKYCData::setTimeDetails(SWGTimeKYCData* time_details) {
    this->time_details = time_details;
}

QString*
SWGKYCData::getKycId() {
    return kyc_id;
}
void
SWGKYCData::setKycId(QString* kyc_id) {
    this->kyc_id = kyc_id;
}

QString*
SWGKYCData::getFirstName() {
    return first_name;
}
void
SWGKYCData::setFirstName(QString* first_name) {
    this->first_name = first_name;
}

QString*
SWGKYCData::getLastName() {
    return last_name;
}
void
SWGKYCData::setLastName(QString* last_name) {
    this->last_name = last_name;
}

QString*
SWGKYCData::getStatus() {
    return status;
}
void
SWGKYCData::setStatus(QString* status) {
    this->status = status;
}

QString*
SWGKYCData::getUserType() {
    return user_type;
}
void
SWGKYCData::setUserType(QString* user_type) {
    this->user_type = user_type;
}

QString*
SWGKYCData::getInfo() {
    return info;
}
void
SWGKYCData::setInfo(QString* info) {
    this->info = info;
}



} /* namespace Swagger */

