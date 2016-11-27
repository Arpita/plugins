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

#ifndef _SWG_SWGExchangeBankActionsApi_H_
#define _SWG_SWGExchangeBankActionsApi_H_

#include "SWGHttpRequest.h"

#include <QString>
#include "SWGSuccessResult.h"
#include "SWGFailResult.h"
#include "SWGSendCoin.h"
#include "SWGWithdrawID.h"
#include "SWGCode.h"
#include "SWGNewBankForm.h"
#include "SWGNewFiatBankDeposit.h"
#include "SWGWithdrawFiat.h"

#include <QObject>

namespace Swagger {

class SWGExchangeBankActionsApi: public QObject {
    Q_OBJECT

public:
    SWGExchangeBankActionsApi();
    SWGExchangeBankActionsApi(QString host, QString basePath);
    ~SWGExchangeBankActionsApi();

    QString host;
    QString basePath;

    void /v1/user/exchange/bank/coin/withdraw/initiate(SWGSendCoin body, QString* authorization, QString* accept);
    void /v1/user/exchange/bank/coin/withdraw/newVerifycode(SWGWithdrawID body, QString* authorization, QString* accept);
    void /v1/user/exchange/bank/coin/withdraw/unverified/cancel/WithdrawID(QString* withdraw_id, QString* authorization, QString* accept);
    void /v1/user/exchange/bank/coin/withdraw/verify(SWGCode body, QString* authorization, QString* accept);
    void /v1/user/exchange/bank/fiat/account/new(SWGNewBankForm body, QString* authorization, QString* accept);
    void /v1/user/exchange/bank/fiat/deposit/cancel/DepositID(QString* deposit_id, QString* authorization, QString* accept);
    void /v1/user/exchange/bank/fiat/deposit/new(SWGNewFiatBankDeposit body, QString* authorization, QString* accept);
    void /v1/user/exchange/bank/fiat/withdraw/initiate(SWGWithdrawFiat body, QString* authorization, QString* accept);
    void /v1/user/exchange/bank/fiat/withdraw/newVerifycode(SWGWithdrawID body, QString* authorization, QString* accept);
    void /v1/user/exchange/bank/fiat/withdraw/unverified/cancel/WithdrawID(QString* withdraw_id, QString* authorization, QString* accept);
    void /v1/user/exchange/bank/fiat/withdraw/verify(SWGCode body, QString* authorization, QString* accept);
    
private:
    void /v1/user/exchange/bank/coin/withdraw/initiateCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/coin/withdraw/newVerifycodeCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/coin/withdraw/unverified/cancel/WithdrawIDCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/coin/withdraw/verifyCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/fiat/account/newCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/fiat/deposit/cancel/DepositIDCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/fiat/deposit/newCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/fiat/withdraw/initiateCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/fiat/withdraw/newVerifycodeCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/fiat/withdraw/unverified/cancel/WithdrawIDCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/fiat/withdraw/verifyCallback (HttpRequestWorker * worker);
    
signals:
    void /v1/user/exchange/bank/coin/withdraw/initiateSignal(SWGSuccessResult* summary);
    void /v1/user/exchange/bank/coin/withdraw/newVerifycodeSignal(SWGSuccessResult* summary);
    void /v1/user/exchange/bank/coin/withdraw/unverified/cancel/WithdrawIDSignal(SWGSuccessResult* summary);
    void /v1/user/exchange/bank/coin/withdraw/verifySignal(SWGSuccessResult* summary);
    void /v1/user/exchange/bank/fiat/account/newSignal(SWGSuccessResult* summary);
    void /v1/user/exchange/bank/fiat/deposit/cancel/DepositIDSignal(SWGSuccessResult* summary);
    void /v1/user/exchange/bank/fiat/deposit/newSignal(SWGSuccessResult* summary);
    void /v1/user/exchange/bank/fiat/withdraw/initiateSignal(SWGSuccessResult* summary);
    void /v1/user/exchange/bank/fiat/withdraw/newVerifycodeSignal(SWGSuccessResult* summary);
    void /v1/user/exchange/bank/fiat/withdraw/unverified/cancel/WithdrawIDSignal(SWGSuccessResult* summary);
    void /v1/user/exchange/bank/fiat/withdraw/verifySignal(SWGSuccessResult* summary);
    
};
}
#endif
