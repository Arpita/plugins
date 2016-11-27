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


#include "SWGAllRefDataResponse.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGAllRefDataResponse::SWGAllRefDataResponse(QString* json) {
    init();
    this->fromJson(*json);
}

SWGAllRefDataResponse::SWGAllRefDataResponse() {
    init();
}

SWGAllRefDataResponse::~SWGAllRefDataResponse() {
    this->cleanup();
}

void
SWGAllRefDataResponse::init() {
    success = false;
    message = new QList<SWGAllRefData*>();
    method = new QString("");
    title = new QString("");
    time = NULL;
}

void
SWGAllRefDataResponse::cleanup() {
    

    if(message != nullptr) {
        QList<SWGAllRefData*>* arr = message;
        foreach(SWGAllRefData* o, *arr) {
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

SWGAllRefDataResponse*
SWGAllRefDataResponse::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGAllRefDataResponse::fromJsonObject(QJsonObject &pJson) {
    ::Swagger::setValue(&success, pJson["success"], "bool", "");
    
    ::Swagger::setValue(&message, pJson["message"], "QList", "SWGAllRefData");
    
    ::Swagger::setValue(&method, pJson["method"], "QString", "QString");
    ::Swagger::setValue(&title, pJson["title"], "QString", "QString");
    ::Swagger::setValue(&time, pJson["time"], "QDateTime", "QDateTime");
}

QString
SWGAllRefDataResponse::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGAllRefDataResponse::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    obj->insert("success", QJsonValue(success));

    QJsonArray messageJsonArray;
    toJsonArray((QList<void*>*)message, &messageJsonArray, "message", "SWGAllRefData");
    obj->insert("message", messageJsonArray);

    toJsonValue(QString("method"), method, obj, QString("QString"));

    toJsonValue(QString("title"), title, obj, QString("QString"));

    toJsonValue(QString("time"), time, obj, QString("QDateTime"));

    return obj;
}

bool
SWGAllRefDataResponse::getSuccess() {
    return success;
}
void
SWGAllRefDataResponse::setSuccess(bool success) {
    this->success = success;
}

QList<SWGAllRefData*>*
SWGAllRefDataResponse::getMessage() {
    return message;
}
void
SWGAllRefDataResponse::setMessage(QList<SWGAllRefData*>* message) {
    this->message = message;
}

QString*
SWGAllRefDataResponse::getMethod() {
    return method;
}
void
SWGAllRefDataResponse::setMethod(QString* method) {
    this->method = method;
}

QString*
SWGAllRefDataResponse::getTitle() {
    return title;
}
void
SWGAllRefDataResponse::setTitle(QString* title) {
    this->title = title;
}

QDateTime*
SWGAllRefDataResponse::getTime() {
    return time;
}
void
SWGAllRefDataResponse::setTime(QDateTime* time) {
    this->time = time;
}



} /* namespace Swagger */

