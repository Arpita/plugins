#import <Foundation/Foundation.h>
#import "SWGSuccessResult.h"
#import "SWGFailResult.h"
#import "SWGSendCoin.h"
#import "SWGWithdrawID.h"
#import "SWGCode.h"
#import "SWGNewBankForm.h"
#import "SWGNewFiatBankDeposit.h"
#import "SWGWithdrawFiat.h"
#import "SWGApi.h"

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


@interface SWGExchangeBankActionsApi: NSObject <SWGApi>

extern NSString* kSWGExchangeBankActionsApiErrorDomain;
extern NSInteger kSWGExchangeBankActionsApiMissingParamErrorCode;

+(instancetype) sharedAPI;

/// Initiate Bitcoin Withdrawal
/// The code for verifying the withdrawal can be called from /v1/exchange/bank/coin/withdrawVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.
///
/// @param body Please send the form with valid inputs.
/// @param authorization Enter a valid Api Key. (optional)
/// @param accept JSON, XML or CSV can be returned (Optional) (optional)
/// 
///  code:200 message:"Successful Request",
///  code:400 message:"Bad Request"
///
/// @return SWGSuccessResult*
-(NSNumber*) v1userexchangebankcoinwithdrawinitiateWithBody: (SWGSendCoin*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;


/// Gets a Verification Code.
/// Gets Coin Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/coin/withdraw/verify.
///
/// @param body You can get unverified withdraw ID&#39;s from /v1/user/exchange/bank/coin/withdraw/unverified
/// @param authorization API object to be added (optional)
/// @param accept JSON, XML or CSV can be returned (Optional) (optional)
/// 
///  code:200 message:"Successful Request",
///  code:400 message:"Bad Request"
///
/// @return SWGSuccessResult*
-(NSNumber*) v1userexchangebankcoinwithdrawnewVerifycodeWithBody: (SWGWithdrawID*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;


/// Cancel Bitcoin Withdrawal
/// Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/coin/withdraw/unverified.
///
/// @param withdrawID 
/// @param authorization Enter a valid Api Key. (optional)
/// @param accept JSON, XML or CSV can be returned (Optional) (optional)
/// 
///  code:200 message:"Successful Request",
///  code:400 message:"Bad Request"
///
/// @return SWGSuccessResult*
-(NSNumber*) v1userexchangebankcoinwithdrawunverifiedcancelWithdrawIDWithWithdrawID: (NSString*) withdrawID
    authorization: (NSString*) authorization
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;


/// Verify Bitcoin Withdrawal
/// Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode.
///
/// @param body You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode.
/// @param authorization Enter a valid Api Key. (optional)
/// @param accept JSON, XML or CSV can be returned (Optional) (optional)
/// 
///  code:200 message:"Successful Request",
///  code:400 message:"Bad Request"
///
/// @return SWGSuccessResult*
-(NSNumber*) v1userexchangebankcoinwithdrawverifyWithBody: (SWGCode*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;


/// New Bank Link
/// Submits a New Bank Link on KYC Verified Accounts.
///
/// @param body Please send the form with valid inputs.
/// @param authorization Enter a valid Api Key. (optional)
/// @param accept JSON, XML or CSV can be returned (Optional) (optional)
/// 
///  code:200 message:"Successful Request",
///  code:400 message:"Bad Request"
///
/// @return SWGSuccessResult*
-(NSNumber*) v1userexchangebankfiataccountnewWithBody: (SWGNewBankForm*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;


/// Cancel Unverified Exchange Fiat Deposit
/// Cancels an unverified Exchange Fiat Deposit.
///
/// @param depositID 
/// @param authorization Enter a valid Api Key. (optional)
/// @param accept JSON, XML or CSV can be returned (Optional) (optional)
/// 
///  code:200 message:"Successful Request",
///  code:400 message:"Bad Request"
///
/// @return SWGSuccessResult*
-(NSNumber*) v1userexchangebankfiatdepositcancelDepositIDWithDepositID: (NSString*) depositID
    authorization: (NSString*) authorization
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;


/// New Exchange Fiat Deposit
/// Submits an unverified fiat deposit. No action will occur unless user cancels or bank notifies us of the payment.
///
/// @param body Please send the form with valid inputs.
/// @param authorization Enter a valid Api Key. (optional)
/// @param accept JSON, XML or CSV can be returned (Optional) (optional)
/// 
///  code:200 message:"Successful Request",
///  code:400 message:"Bad Request"
///
/// @return SWGSuccessResult*
-(NSNumber*) v1userexchangebankfiatdepositnewWithBody: (SWGNewFiatBankDeposit*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;


/// Initiate Fiat Withdrawal
/// The code for verifying the withdrawal can be called from /v1/user/exchange/bank/fiat/withdraw/newVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.
///
/// @param body Please send the form with valid inputs.
/// @param authorization Enter a valid Api Key. (optional)
/// @param accept JSON, XML or CSV can be returned (Optional) (optional)
/// 
///  code:200 message:"Successful Request",
///  code:400 message:"Bad Request"
///
/// @return SWGSuccessResult*
-(NSNumber*) v1userexchangebankfiatwithdrawinitiateWithBody: (SWGWithdrawFiat*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;


/// Gets a Fiat Verification Code.
/// Gets Fiat Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/fiat/withdraw/verify.
///
/// @param body You can get unverified withdraw ID&#39;s from /v1/user/exchange/bank/fiat/withdraw/unverified
/// @param authorization API object to be added (optional)
/// @param accept JSON, XML or CSV can be returned (Optional) (optional)
/// 
///  code:200 message:"Successful Request",
///  code:400 message:"Bad Request"
///
/// @return SWGSuccessResult*
-(NSNumber*) v1userexchangebankfiatwithdrawnewVerifycodeWithBody: (SWGWithdrawID*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;


/// Cancel Fiat Withdrawal
/// Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/fiat/withdraw/unverified.
///
/// @param withdrawID 
/// @param authorization Enter a valid Api Key. (optional)
/// @param accept JSON, XML or CSV can be returned (Optional) (optional)
/// 
///  code:200 message:"Successful Request",
///  code:400 message:"Bad Request"
///
/// @return SWGSuccessResult*
-(NSNumber*) v1userexchangebankfiatwithdrawunverifiedcancelWithdrawIDWithWithdrawID: (NSString*) withdrawID
    authorization: (NSString*) authorization
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;


/// Verify Fiat Withdrawal
/// Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode.
///
/// @param body You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode
/// @param authorization Enter a valid Api Key. (optional)
/// @param accept JSON, XML or CSV can be returned (Optional) (optional)
/// 
///  code:200 message:"Successful Request",
///  code:400 message:"Bad Request"
///
/// @return SWGSuccessResult*
-(NSNumber*) v1userexchangebankfiatwithdrawverifyWithBody: (SWGCode*) body
    authorization: (NSString*) authorization
    accept: (NSString*) accept
    completionHandler: (void (^)(SWGSuccessResult* output, NSError* error)) handler;



@end
