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


#include "SWGTradeAddressDataResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGTradeAddressDataResponse::SWGTradeAddressDataResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGTradeAddressDataResponse::SWGTradeAddressDataResponse() {
    init();
}

SWGTradeAddressDataResponse::~SWGTradeAddressDataResponse() {
    this->cleanup();
}

void
SWGTradeAddressDataResponse::init() {
    success = false;
    message = new QList<SWGTradeAddressData*>();
    method = new QString("");
    title = new QString("");
    time = NULL;
}

void
SWGTradeAddressDataResponse::cleanup() {
    

    if(message != nullptr) {
        QList<SWGTradeAddressData*>* arr = message;
        foreach(SWGTradeAddressData* o, *arr) {
            delete o;
        }
        delete message;
    }

    if(method != nullptr) {
        delete method;
    }

    if(title != nullptr) {
        delete title;
    }

    if(time != nullptr) {
        delete time;
    }
}

SWGTradeAddressDataResponse*
SWGTradeAddressDataResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGTradeAddressDataResponse::fromJsonObject(QJsonObject &pJson) {
    ::Swagger::setValue(&success, pJson["success"], "bool", "");
    
    ::Swagger::setValue(&message, pJson["message"], "QList", "SWGTradeAddressData");
    
    ::Swagger::setValue(&method, pJson["method"], "QString", "QString");
    ::Swagger::setValue(&title, pJson["title"], "QString", "QString");
    ::Swagger::setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGTradeAddressDataResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGTradeAddressDataResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    obj->insert("success", QJsonValue(success));

    QJsonArray messageJsonArray;
    toJsonArray((QList<void*>*)message, &messageJsonArray, "message", "SWGTradeAddressData");
    obj->insert("message", messageJsonArray);

    toJsonValue(QString("method"), method, obj, QString("QString"));

    toJsonValue(QString("title"), title, obj, QString("QString"));

    toJsonValue(QString("time"), time, obj, QString("QDateTime"));

    return obj;
}

bool
SWGTradeAddressDataResponse::getSuccess() {
    return success;
}
void
SWGTradeAddressDataResponse::setSuccess(bool success) {
    this->success = success;
}

QList<SWGTradeAddressData*>*
SWGTradeAddressDataResponse::getMessage() {
    return message;
}
void
SWGTradeAddressDataResponse::setMessage(QList<SWGTradeAddressData*>* message) {
    this->message = message;
}

QString*
SWGTradeAddressDataResponse::getMethod() {
    return method;
}
void
SWGTradeAddressDataResponse::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGTradeAddressDataResponse::getTitle() {
    return title;
}
void
SWGTradeAddressDataResponse::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGTradeAddressDataResponse::getTime() {
    return time;
}
void
SWGTradeAddressDataResponse::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

