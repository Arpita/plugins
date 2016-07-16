#include "SWGWalletDataApi.h"
#include "SWGHelpers.h"
#include "SWGModelFactory.h"

#include <QJsonArray>
#include <QJsonDocument>

namespace Swagger {
SWGWalletDataApi::SWGWalletDataApi() {}

SWGWalletDataApi::~SWGWalletDataApi() {}

SWGWalletDataApi::SWGWalletDataApi(QString host, QString basePath) {
    this->host = host;
    this->basePath = basePath;
}

void
SWGWalletDataApi::/v1/user/wallet/coin/address/WalletID(QString* walletID, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/wallet/coin/address/{walletID}");

    QString walletIDPathParam("{"); walletIDPathParam.append("walletID").append("}");
    fullPath.replace(walletIDPathParam, stringValue(walletID));


    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGWalletDataApi::/v1/user/wallet/coin/address/WalletIDCallback);

    worker->execute(&input);
}

void
SWGWalletDataApi::/v1/user/wallet/coin/address/WalletIDCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/wallet/coin/address/WalletIDSignal(output);
    
}
void
SWGWalletDataApi::/v1/user/wallet/coin/deposit/confirmed/WalletID(QString* walletID, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/wallet/coin/deposit/confirmed/{walletID}");

    QString walletIDPathParam("{"); walletIDPathParam.append("walletID").append("}");
    fullPath.replace(walletIDPathParam, stringValue(walletID));


    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGWalletDataApi::/v1/user/wallet/coin/deposit/confirmed/WalletIDCallback);

    worker->execute(&input);
}

void
SWGWalletDataApi::/v1/user/wallet/coin/deposit/confirmed/WalletIDCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/wallet/coin/deposit/confirmed/WalletIDSignal(output);
    
}
void
SWGWalletDataApi::/v1/user/wallet/coin/deposit/confirmed/all(QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/wallet/coin/deposit/confirmed/all");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGWalletDataApi::/v1/user/wallet/coin/deposit/confirmed/allCallback);

    worker->execute(&input);
}

void
SWGWalletDataApi::/v1/user/wallet/coin/deposit/confirmed/allCallback(HttpRequestWorker * worker) {
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

    emit /v1/user/wallet/coin/deposit/confirmed/allSignal(output);
    
}
void
SWGWalletDataApi::/v1/user/wallet/coin/deposit/unconfirmed/WalletID(QString* walletID, QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/wallet/coin/deposit/unconfirmed/{walletID}");

    QString walletIDPathParam("{"); walletIDPathParam.append("walletID").append("}");
    fullPath.replace(walletIDPathParam, stringValue(walletID));


    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGWalletDataApi::/v1/user/wallet/coin/deposit/unconfirmed/WalletIDCallback);

    worker->execute(&input);
}

void
SWGWalletDataApi::/v1/user/wallet/coin/deposit/unconfirmed/WalletIDCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    

    worker->deleteLater();

    
    emit /v1/user/wallet/coin/deposit/unconfirmed/WalletIDSignal();
}
void
SWGWalletDataApi::/v1/user/wallet/coin/deposit/unconfirmed/all(QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/wallet/coin/deposit/unconfirmed/all");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGWalletDataApi::/v1/user/wallet/coin/deposit/unconfirmed/allCallback);

    worker->execute(&input);
}

void
SWGWalletDataApi::/v1/user/wallet/coin/deposit/unconfirmed/allCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    

    worker->deleteLater();

    
    emit /v1/user/wallet/coin/deposit/unconfirmed/allSignal();
}
void
SWGWalletDataApi::/v1/user/wallet/coin/wallets(QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/user/wallet/coin/wallets");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGWalletDataApi::/v1/user/wallet/coin/walletsCallback);

    worker->execute(&input);
}

void
SWGWalletDataApi::/v1/user/wallet/coin/walletsCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGWalletsDataResponse* output = static_cast<SWGWalletsDataResponse*>(create(json, QString("SWGWalletsDataResponse")));
    

    worker->deleteLater();

    emit /v1/user/wallet/coin/walletsSignal(output);
    
}
void
SWGWalletDataApi::/v1/wallet/withdraw/cancelled(QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/wallet/coin/withdraw/cancelled");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGWalletDataApi::/v1/wallet/withdraw/cancelledCallback);

    worker->execute(&input);
}

void
SWGWalletDataApi::/v1/wallet/withdraw/cancelledCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGWalletCoinWithdrawDataResponse* output = static_cast<SWGWalletCoinWithdrawDataResponse*>(create(json, QString("SWGWalletCoinWithdrawDataResponse")));
    

    worker->deleteLater();

    emit /v1/wallet/withdraw/cancelledSignal(output);
    
}
void
SWGWalletDataApi::/v1/wallet/withdraw/completed(QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/wallet/coin/withdraw/completed");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGWalletDataApi::/v1/wallet/withdraw/completedCallback);

    worker->execute(&input);
}

void
SWGWalletDataApi::/v1/wallet/withdraw/completedCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGWalletCoinWithdrawDataResponse* output = static_cast<SWGWalletCoinWithdrawDataResponse*>(create(json, QString("SWGWalletCoinWithdrawDataResponse")));
    

    worker->deleteLater();

    emit /v1/wallet/withdraw/completedSignal(output);
    
}
void
SWGWalletDataApi::/v1/wallet/withdraw/unverified(QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/wallet/coin/withdraw/unverified");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGWalletDataApi::/v1/wallet/withdraw/unverifiedCallback);

    worker->execute(&input);
}

void
SWGWalletDataApi::/v1/wallet/withdraw/unverifiedCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGWalletCoinWithdrawDataResponse* output = static_cast<SWGWalletCoinWithdrawDataResponse*>(create(json, QString("SWGWalletCoinWithdrawDataResponse")));
    

    worker->deleteLater();

    emit /v1/wallet/withdraw/unverifiedSignal(output);
    
}
void
SWGWalletDataApi::/v1/wallet/withdraw/verified(QString* authorization, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/wallet/coin/withdraw/verified");



    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support
    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGWalletDataApi::/v1/wallet/withdraw/verifiedCallback);

    worker->execute(&input);
}

void
SWGWalletDataApi::/v1/wallet/withdraw/verifiedCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGWalletCoinWithdrawDataResponse* output = static_cast<SWGWalletCoinWithdrawDataResponse*>(create(json, QString("SWGWalletCoinWithdrawDataResponse")));
    

    worker->deleteLater();

    emit /v1/wallet/withdraw/verifiedSignal(output);
    
}
} /* namespace Swagger */