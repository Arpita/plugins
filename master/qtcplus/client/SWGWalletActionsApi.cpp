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

#include "SWGWalletActionsApi.h"
#include "SWGHelpers.h"
#include "SWGModelFactory.h"

#include <QJsonArray>
#include <QJsonDocument>

namespace Swagger {
SWGWalletActionsApi::SWGWalletActionsApi() {}

SWGWalletActionsApi::~SWGWalletActionsApi() {}

SWGWalletActionsApi::SWGWalletActionsApi(QString host, QString basePath) {
    this->host = host;
    this->basePath = basePath;
}

void
SWGWalletActionsApi::/v1/user/wallet/coin/address/new(SWGNewAddress body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/wallet/coin/address/new");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "PUT");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGWalletActionsApi::/v1/user/wallet/coin/address/newCallback);

    worker->execute(&input);
}

void
SWGWalletActionsApi::/v1/user/wallet/coin/address/newCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGWalletAddressDataResponse* output = static_cast<SWGWalletAddressDataResponse*>(create(json, QString("SWGWalletAddressDataResponse")));
    

    worker->deleteLater();

    emit /v1/user/wallet/coin/address/newSignal(output);
    
}
void
SWGWalletActionsApi::/v1/user/wallet/coin/new(SWGNewWallet body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/wallet/coin/new");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "PUT");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGWalletActionsApi::/v1/user/wallet/coin/newCallback);

    worker->execute(&input);
}

void
SWGWalletActionsApi::/v1/user/wallet/coin/newCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGWalletAddressDataResponse* output = static_cast<SWGWalletAddressDataResponse*>(create(json, QString("SWGWalletAddressDataResponse")));
    

    worker->deleteLater();

    emit /v1/user/wallet/coin/newSignal(output);
    
}
void
SWGWalletActionsApi::/v1/user/wallet/coin/withdraw/initiate(SWGSendCoinWallet body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/wallet/coin/withdraw/initiate");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "POST");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGWalletActionsApi::/v1/user/wallet/coin/withdraw/initiateCallback);

    worker->execute(&input);
}

void
SWGWalletActionsApi::/v1/user/wallet/coin/withdraw/initiateCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGSuccessResult* output = static_cast<SWGSuccessResult*>(create(json, QString("SWGSuccessResult")));
    

    worker->deleteLater();

    emit /v1/user/wallet/coin/withdraw/initiateSignal(output);
    
}
void
SWGWalletActionsApi::/v1/user/wallet/coin/withdraw/sendToExchange(SWGSendExchange body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/wallet/coin/withdraw/sendToExchange");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "PUT");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGWalletActionsApi::/v1/user/wallet/coin/withdraw/sendToExchangeCallback);

    worker->execute(&input);
}

void
SWGWalletActionsApi::/v1/user/wallet/coin/withdraw/sendToExchangeCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGSuccessResult* output = static_cast<SWGSuccessResult*>(create(json, QString("SWGSuccessResult")));
    

    worker->deleteLater();

    emit /v1/user/wallet/coin/withdraw/sendToExchangeSignal(output);
    
}
void
SWGWalletActionsApi::/v1/user/wallet/coin/withdraw/unverified/cancel/WithdrawID(QString* withdraw_id, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/wallet/coin/withdraw/unverified/cancel/{withdrawID}");

    QString withdraw_idPathParam("{"); withdraw_idPathParam.append("withdrawID").append("}");
    fullPath.replace(withdraw_idPathParam, stringValue(withdraw_id));


    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "DELETE");

    


    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGWalletActionsApi::/v1/user/wallet/coin/withdraw/unverified/cancel/WithdrawIDCallback);

    worker->execute(&input);
}

void
SWGWalletActionsApi::/v1/user/wallet/coin/withdraw/unverified/cancel/WithdrawIDCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGSuccessResult* output = static_cast<SWGSuccessResult*>(create(json, QString("SWGSuccessResult")));
    

    worker->deleteLater();

    emit /v1/user/wallet/coin/withdraw/unverified/cancel/WithdrawIDSignal(output);
    
}
void
SWGWalletActionsApi::/v1/user/wallet/coin/withdraw/verify(QString* authorization, SWGCode body, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/wallet/coin/withdraw/verify");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "PUT");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGWalletActionsApi::/v1/user/wallet/coin/withdraw/verifyCallback);

    worker->execute(&input);
}

void
SWGWalletActionsApi::/v1/user/wallet/coin/withdraw/verifyCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGSuccessResult* output = static_cast<SWGSuccessResult*>(create(json, QString("SWGSuccessResult")));
    

    worker->deleteLater();

    emit /v1/user/wallet/coin/withdraw/verifySignal(output);
    
}
void
SWGWalletActionsApi::/v1/wallet/coin/withdraw/newVerifycode(SWGWithdrawID body, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/wallet/coin/withdraw/newVerifycode");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "POST");

    
    QString output = body.asJson();
    input.request_body.append(output);
    

    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGWalletActionsApi::/v1/wallet/coin/withdraw/newVerifycodeCallback);

    worker->execute(&input);
}

void
SWGWalletActionsApi::/v1/wallet/coin/withdraw/newVerifycodeCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGSuccessResult* output = static_cast<SWGSuccessResult*>(create(json, QString("SWGSuccessResult")));
    

    worker->deleteLater();

    emit /v1/wallet/coin/withdraw/newVerifycodeSignal(output);
    
}
} /* namespace Swagger */
