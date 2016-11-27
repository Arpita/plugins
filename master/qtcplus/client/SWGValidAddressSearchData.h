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
 * SWGValidAddressSearchData.h
 * 
 * 
 */

#ifndef SWGValidAddressSearchData_H_
#define SWGValidAddressSearchData_H_

#include <QJsonObject>


#include <QList>
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGValidAddressSearchData: public SWGObject {
public:
    SWGValidAddressSearchData();
    SWGValidAddressSearchData(QString* json);
    virtual ~SWGValidAddressSearchData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGValidAddressSearchData* fromJson(QString &jsonString);

    QString* getAddress();
    void setAddress(QString* address);

    qint64 getBalance();
    void setBalance(qint64 balance);

    qint64 getTotalReceived();
    void setTotalReceived(qint64 total_received);

    qint64 getUnconfirmedBalance();
    void setUnconfirmedBalance(qint64 unconfirmed_balance);

    qint32 getUnconfirmedTxApperances();
    void setUnconfirmedTxApperances(qint32 unconfirmed_tx_apperances);

    qint32 getTxApperances();
    void setTxApperances(qint32 tx_apperances);

    QList<QString*>* getTransactions();
    void setTransactions(QList<QString*>* transactions);


private:
    QString* address;
    qint64 balance;
    qint64 total_received;
    qint64 unconfirmed_balance;
    qint32 unconfirmed_tx_apperances;
    qint32 tx_apperances;
    QList<QString*>* transactions;
};

} /* namespace Swagger */

#endif /* SWGValidAddressSearchData_H_ */
