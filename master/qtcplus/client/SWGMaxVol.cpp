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


#include "SWGMaxVol.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGMaxVol::SWGMaxVol(QString* json) {
    init();
    this->fromJson(*json);
}

SWGMaxVol::SWGMaxVol() {
    init();
}

SWGMaxVol::~SWGMaxVol() {
    this->cleanup();
}

void
SWGMaxVol::init() {
    max_vol = 0L;
}

void
SWGMaxVol::cleanup() {
    
}

SWGMaxVol*
SWGMaxVol::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGMaxVol::fromJsonObject(QJsonObject &pJson) {
    ::Swagger::setValue(&max_vol, pJson["max_vol"], "qint64", "");
}

QString
SWGMaxVol::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGMaxVol::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    obj->insert("max_vol", QJsonValue(max_vol));

    return obj;
}

qint64
SWGMaxVol::getMaxVol() {
    return max_vol;
}
void
SWGMaxVol::setMaxVol(qint64 max_vol) {
    this->max_vol = max_vol;
}



} /* namespace Swagger */

