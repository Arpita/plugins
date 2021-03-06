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


#include "SWGStandardLoginResultData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGStandardLoginResultData::SWGStandardLoginResultData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGStandardLoginResultData::SWGStandardLoginResultData() {
    init();
}

SWGStandardLoginResultData::~SWGStandardLoginResultData() {
    this->cleanup();
}

void
SWGStandardLoginResultData::init() {
    success = false;
    message = new SWGSuccessLoginResponse();
    method = new QString("");
    title = new QString("");
    time = NULL;
}

void
SWGStandardLoginResultData::cleanup() {
    

    if(message != nullptr) {
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

SWGStandardLoginResultData*
SWGStandardLoginResultData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGStandardLoginResultData::fromJsonObject(QJsonObject &pJson) {
    ::Swagger::setValue(&success, pJson["success"], "bool", "");
    ::Swagger::setValue(&message, pJson["message"], "SWGSuccessLoginResponse", "SWGSuccessLoginResponse");
    ::Swagger::setValue(&method, pJson["method"], "QString", "QString");
    ::Swagger::setValue(&title, pJson["title"], "QString", "QString");
    ::Swagger::setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGStandardLoginResultData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGStandardLoginResultData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    obj->insert("success", QJsonValue(success));

    toJsonValue(QString("message"), message, obj, QString("SWGSuccessLoginResponse"));

    toJsonValue(QString("method"), method, obj, QString("QString"));

    toJsonValue(QString("title"), title, obj, QString("QString"));

    toJsonValue(QString("time"), time, obj, QString("QDateTime"));

    return obj;
}

bool
SWGStandardLoginResultData::getSuccess() {
    return success;
}
void
SWGStandardLoginResultData::setSuccess(bool success) {
    this->success = success;
}

SWGSuccessLoginResponse*
SWGStandardLoginResultData::getMessage() {
    return message;
}
void
SWGStandardLoginResultData::setMessage(SWGSuccessLoginResponse* message) {
    this->message = message;
}

QString*
SWGStandardLoginResultData::getMethod() {
    return method;
}
void
SWGStandardLoginResultData::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGStandardLoginResultData::getTitle() {
    return title;
}
void
SWGStandardLoginResultData::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGStandardLoginResultData::getTime() {
    return time;
}
void
SWGStandardLoginResultData::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

