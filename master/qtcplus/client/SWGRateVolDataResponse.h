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

/*
 * SWGRateVolDataResponse.h
 * 
 * 
 */

#ifndef SWGRateVolDataResponse_H_
#define SWGRateVolDataResponse_H_

#include <QJsonObject>


#include "SWGRateVolData.h"
#include <QDateTime>
#include <QList>
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGRateVolDataResponse: public SWGObject {
public:
    SWGRateVolDataResponse();
    SWGRateVolDataResponse(QString* json);
    virtual ~SWGRateVolDataResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGRateVolDataResponse* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);

    QList<SWGRateVolData*>* getMessage();
    void setMessage(QList<SWGRateVolData*>* message);

    QString* getMethod();
    void setMethod(QString* method);

    QString* getTitle();
    void setTitle(QString* title);

    QDateTime* getTime();
    void setTime(QDateTime* time);


private:
    bool success;
    QList<SWGRateVolData*>* message;
    QString* method;
    QString* title;
    QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGRateVolDataResponse_H_ */
