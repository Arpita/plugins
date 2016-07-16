/* 
 * Coinsecure Api Documentation
 *
 * To generate an API key, please visit <a href='https://coinsecure.in/api' target='_new' class='homeapi'>https://coinsecure.in/api</a>.<br>Guidelines for use can be accessed at <a href='https://api.coinsecure.in/v1/guidelines'>https://api.coinsecure.in/v1/guidelines</a>.<br>Programming Language Libraries for use can be accessed at <a href='https://api.coinsecure.in/v1/code-libraries'>https://api.coinsecure.in/v1/code-libraries</a>.
 *
 * OpenAPI spec version: 1.0b
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package swagger

import (
	"strings"
	"fmt"
	"errors"
	"net/url"
	"encoding/json"
)

type ExchangeBankActionsApi struct {
	Configuration Configuration
}

func NewExchangeBankActionsApi() *ExchangeBankActionsApi {
	configuration := NewConfiguration()
	return &ExchangeBankActionsApi{
		Configuration: *configuration,
	}
}

func NewExchangeBankActionsApiWithBasePath(basePath string) *ExchangeBankActionsApi {
	configuration := NewConfiguration()
	configuration.BasePath = basePath

	return &ExchangeBankActionsApi{
		Configuration: *configuration,
	}
}

/**
 * Initiate Bitcoin Withdrawal
 * The code for verifying the withdrawal can be called from /v1/exchange/bank/coin/withdrawVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.
 *
 * @param body Please send the form with valid inputs.
 * @param authorization Enter a valid Api Key.
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *SuccessResult
 */
func (a ExchangeBankActionsApi) V1UserExchangeBankCoinWithdrawInitiate(body SendCoin, authorization string, accept string) (*SuccessResult, *APIResponse, error) {

	var httpMethod = "Post"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/user/exchange/bank/coin/withdraw/initiate"

	// verify the required parameter 'body' is set
	if &body == nil {
		return new(SuccessResult), nil, errors.New("Missing required parameter 'body' when calling ExchangeBankActionsApi->V1UserExchangeBankCoinWithdrawInitiate")
	}

	headerParams := make(map[string]string)
	queryParams := url.Values{}
	formParams := make(map[string]string)
	var postBody interface{}
	var fileName string
	var fileBytes []byte

	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		headerParams[key] = a.Configuration.DefaultHeader[key]
	}


	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		headerParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
"application/xml",
"application/csv",
	}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		headerParams["Accept"] = localVarHttpHeaderAccept
	}

	// header params "Authorization"
	headerParams["Authorization"] = authorization
	// header params "accept"
	headerParams["accept"] = accept

	// body params
	postBody = &body

	var successPayload = new(SuccessResult)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * Gets a Verification Code.
 * Gets Coin Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/coin/withdraw/verify.
 *
 * @param body You can get unverified withdraw ID&#39;s from /v1/user/exchange/bank/coin/withdraw/unverified
 * @param authorization API object to be added
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *SuccessResult
 */
func (a ExchangeBankActionsApi) V1UserExchangeBankCoinWithdrawNewVerifycode(body WithdrawId, authorization string, accept string) (*SuccessResult, *APIResponse, error) {

	var httpMethod = "Post"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/user/exchange/bank/coin/withdraw/newVerifycode"

	// verify the required parameter 'body' is set
	if &body == nil {
		return new(SuccessResult), nil, errors.New("Missing required parameter 'body' when calling ExchangeBankActionsApi->V1UserExchangeBankCoinWithdrawNewVerifycode")
	}

	headerParams := make(map[string]string)
	queryParams := url.Values{}
	formParams := make(map[string]string)
	var postBody interface{}
	var fileName string
	var fileBytes []byte

	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		headerParams[key] = a.Configuration.DefaultHeader[key]
	}


	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		headerParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
"application/xml",
"application/csv",
	}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		headerParams["Accept"] = localVarHttpHeaderAccept
	}

	// header params "Authorization"
	headerParams["Authorization"] = authorization
	// header params "accept"
	headerParams["accept"] = accept

	// body params
	postBody = &body

	var successPayload = new(SuccessResult)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * Cancel Bitcoin Withdrawal
 * Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/coin/withdraw/unverified.
 *
 * @param body You can get the WithdrawID from /v1/user/exchange/bank/coin/withdraw/unverified.
 * @param authorization Enter a valid Api Key.
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *SuccessResult
 */
func (a ExchangeBankActionsApi) V1UserExchangeBankCoinWithdrawUnverifiedCancel(body WithdrawId, authorization string, accept string) (*SuccessResult, *APIResponse, error) {

	var httpMethod = "Delete"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/user/exchange/bank/coin/withdraw/unverified/cancel"

	// verify the required parameter 'body' is set
	if &body == nil {
		return new(SuccessResult), nil, errors.New("Missing required parameter 'body' when calling ExchangeBankActionsApi->V1UserExchangeBankCoinWithdrawUnverifiedCancel")
	}

	headerParams := make(map[string]string)
	queryParams := url.Values{}
	formParams := make(map[string]string)
	var postBody interface{}
	var fileName string
	var fileBytes []byte

	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		headerParams[key] = a.Configuration.DefaultHeader[key]
	}


	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		headerParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
"application/xml",
"application/csv",
	}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		headerParams["Accept"] = localVarHttpHeaderAccept
	}

	// header params "Authorization"
	headerParams["Authorization"] = authorization
	// header params "accept"
	headerParams["accept"] = accept

	// body params
	postBody = &body

	var successPayload = new(SuccessResult)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * Verify Bitcoin Withdrawal
 * Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode.
 *
 * @param body You can get the code from /v1/user/exchange/bank/coin/withdraw/newVerifycode.
 * @param authorization Enter a valid Api Key.
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *SuccessResult
 */
func (a ExchangeBankActionsApi) V1UserExchangeBankCoinWithdrawVerify(body Code, authorization string, accept string) (*SuccessResult, *APIResponse, error) {

	var httpMethod = "Put"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/user/exchange/bank/coin/withdraw/verify"

	// verify the required parameter 'body' is set
	if &body == nil {
		return new(SuccessResult), nil, errors.New("Missing required parameter 'body' when calling ExchangeBankActionsApi->V1UserExchangeBankCoinWithdrawVerify")
	}

	headerParams := make(map[string]string)
	queryParams := url.Values{}
	formParams := make(map[string]string)
	var postBody interface{}
	var fileName string
	var fileBytes []byte

	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		headerParams[key] = a.Configuration.DefaultHeader[key]
	}


	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		headerParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
"application/xml",
"application/csv",
	}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		headerParams["Accept"] = localVarHttpHeaderAccept
	}

	// header params "Authorization"
	headerParams["Authorization"] = authorization
	// header params "accept"
	headerParams["accept"] = accept

	// body params
	postBody = &body

	var successPayload = new(SuccessResult)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * New Bank Link
 * Submits a New Bank Link on KYC Verified Accounts.
 *
 * @param body Please send the form with valid inputs.
 * @param authorization Enter a valid Api Key.
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *SuccessResult
 */
func (a ExchangeBankActionsApi) V1UserExchangeBankFiatAccountNew(body NewBankForm, authorization string, accept string) (*SuccessResult, *APIResponse, error) {

	var httpMethod = "Put"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/user/exchange/bank/fiat/account/new"

	// verify the required parameter 'body' is set
	if &body == nil {
		return new(SuccessResult), nil, errors.New("Missing required parameter 'body' when calling ExchangeBankActionsApi->V1UserExchangeBankFiatAccountNew")
	}

	headerParams := make(map[string]string)
	queryParams := url.Values{}
	formParams := make(map[string]string)
	var postBody interface{}
	var fileName string
	var fileBytes []byte

	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		headerParams[key] = a.Configuration.DefaultHeader[key]
	}


	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		headerParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
"application/xml",
"application/csv",
	}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		headerParams["Accept"] = localVarHttpHeaderAccept
	}

	// header params "Authorization"
	headerParams["Authorization"] = authorization
	// header params "accept"
	headerParams["accept"] = accept

	// body params
	postBody = &body

	var successPayload = new(SuccessResult)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * Cancel Unverified Exchange Fiat Deposit
 * Cancels an unverified Exchange Fiat Deposit.
 *
 * @param body Please send the form with valid inputs.
 * @param authorization Enter a valid Api Key.
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *SuccessResult
 */
func (a ExchangeBankActionsApi) V1UserExchangeBankFiatDepositCancel(body DepositId, authorization string, accept string) (*SuccessResult, *APIResponse, error) {

	var httpMethod = "Delete"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/user/exchange/bank/fiat/deposit/cancel"

	// verify the required parameter 'body' is set
	if &body == nil {
		return new(SuccessResult), nil, errors.New("Missing required parameter 'body' when calling ExchangeBankActionsApi->V1UserExchangeBankFiatDepositCancel")
	}

	headerParams := make(map[string]string)
	queryParams := url.Values{}
	formParams := make(map[string]string)
	var postBody interface{}
	var fileName string
	var fileBytes []byte

	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		headerParams[key] = a.Configuration.DefaultHeader[key]
	}


	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		headerParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
"application/xml",
"application/csv",
	}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		headerParams["Accept"] = localVarHttpHeaderAccept
	}

	// header params "Authorization"
	headerParams["Authorization"] = authorization
	// header params "accept"
	headerParams["accept"] = accept

	// body params
	postBody = &body

	var successPayload = new(SuccessResult)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * New Exchange Fiat Deposit
 * Submits an unverified fiat deposit. No action will occur unless user cancels or bank notifies us of the payment.
 *
 * @param body Please send the form with valid inputs.
 * @param authorization Enter a valid Api Key.
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *SuccessResult
 */
func (a ExchangeBankActionsApi) V1UserExchangeBankFiatDepositNew(body NewFiatBankDeposit, authorization string, accept string) (*SuccessResult, *APIResponse, error) {

	var httpMethod = "Put"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/user/exchange/bank/fiat/deposit/new"

	// verify the required parameter 'body' is set
	if &body == nil {
		return new(SuccessResult), nil, errors.New("Missing required parameter 'body' when calling ExchangeBankActionsApi->V1UserExchangeBankFiatDepositNew")
	}

	headerParams := make(map[string]string)
	queryParams := url.Values{}
	formParams := make(map[string]string)
	var postBody interface{}
	var fileName string
	var fileBytes []byte

	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		headerParams[key] = a.Configuration.DefaultHeader[key]
	}


	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		headerParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
"application/xml",
"application/csv",
	}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		headerParams["Accept"] = localVarHttpHeaderAccept
	}

	// header params "Authorization"
	headerParams["Authorization"] = authorization
	// header params "accept"
	headerParams["accept"] = accept

	// body params
	postBody = &body

	var successPayload = new(SuccessResult)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * Initiate Fiat Withdrawal
 * The code for verifying the withdrawal can be called from /v1/user/exchange/bank/fiat/withdraw/newVerifycode. May require a 2FA code if 2FA is enabled on the account. A mail is sent to the users email requesting confirmation of the withdrawal. This confirmation mail can be disabled on the Coinsecure Profile page.
 *
 * @param body Please send the form with valid inputs.
 * @param authorization Enter a valid Api Key.
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *SuccessResult
 */
func (a ExchangeBankActionsApi) V1UserExchangeBankFiatWithdrawInitiate(body WithdrawFiat, authorization string, accept string) (*SuccessResult, *APIResponse, error) {

	var httpMethod = "Post"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/user/exchange/bank/fiat/withdraw/initiate"

	// verify the required parameter 'body' is set
	if &body == nil {
		return new(SuccessResult), nil, errors.New("Missing required parameter 'body' when calling ExchangeBankActionsApi->V1UserExchangeBankFiatWithdrawInitiate")
	}

	headerParams := make(map[string]string)
	queryParams := url.Values{}
	formParams := make(map[string]string)
	var postBody interface{}
	var fileName string
	var fileBytes []byte

	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		headerParams[key] = a.Configuration.DefaultHeader[key]
	}


	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		headerParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
"application/xml",
"application/csv",
	}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		headerParams["Accept"] = localVarHttpHeaderAccept
	}

	// header params "Authorization"
	headerParams["Authorization"] = authorization
	// header params "accept"
	headerParams["accept"] = accept

	// body params
	postBody = &body

	var successPayload = new(SuccessResult)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * Gets a Fiat Verification Code.
 * Gets Fiat Unverified Withdraws Codes to call and apply on /v1/user/exchange/bank/fiat/withdraw/verify.
 *
 * @param body You can get unverified withdraw ID&#39;s from /v1/user/exchange/bank/fiat/withdraw/unverified
 * @param authorization API object to be added
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *SuccessResult
 */
func (a ExchangeBankActionsApi) V1UserExchangeBankFiatWithdrawNewVerifycode(body WithdrawId, authorization string, accept string) (*SuccessResult, *APIResponse, error) {

	var httpMethod = "Post"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/user/exchange/bank/fiat/withdraw/newVerifycode"

	// verify the required parameter 'body' is set
	if &body == nil {
		return new(SuccessResult), nil, errors.New("Missing required parameter 'body' when calling ExchangeBankActionsApi->V1UserExchangeBankFiatWithdrawNewVerifycode")
	}

	headerParams := make(map[string]string)
	queryParams := url.Values{}
	formParams := make(map[string]string)
	var postBody interface{}
	var fileName string
	var fileBytes []byte

	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		headerParams[key] = a.Configuration.DefaultHeader[key]
	}


	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		headerParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
"application/xml",
"application/csv",
	}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		headerParams["Accept"] = localVarHttpHeaderAccept
	}

	// header params "Authorization"
	headerParams["Authorization"] = authorization
	// header params "accept"
	headerParams["accept"] = accept

	// body params
	postBody = &body

	var successPayload = new(SuccessResult)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * Cancel Fiat Withdrawal
 * Cancels an unverified withdrawal. You can get the WithdrawID from /v1/user/exchange/bank/fiat/withdraw/unverified.
 *
 * @param body You can get the code from /v1/user/exchange/bank/fiat/withdraw/unverified.
 * @param authorization Enter a valid Api Key.
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *SuccessResult
 */
func (a ExchangeBankActionsApi) V1UserExchangeBankFiatWithdrawUnverifiedCancel(body WithdrawId, authorization string, accept string) (*SuccessResult, *APIResponse, error) {

	var httpMethod = "Delete"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/user/exchange/bank/fiat/withdraw/unverified/cancel"

	// verify the required parameter 'body' is set
	if &body == nil {
		return new(SuccessResult), nil, errors.New("Missing required parameter 'body' when calling ExchangeBankActionsApi->V1UserExchangeBankFiatWithdrawUnverifiedCancel")
	}

	headerParams := make(map[string]string)
	queryParams := url.Values{}
	formParams := make(map[string]string)
	var postBody interface{}
	var fileName string
	var fileBytes []byte

	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		headerParams[key] = a.Configuration.DefaultHeader[key]
	}


	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		headerParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
"application/xml",
"application/csv",
	}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		headerParams["Accept"] = localVarHttpHeaderAccept
	}

	// header params "Authorization"
	headerParams["Authorization"] = authorization
	// header params "accept"
	headerParams["accept"] = accept

	// body params
	postBody = &body

	var successPayload = new(SuccessResult)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * Verify Fiat Withdrawal
 * Verifies an unverified withdrawal. You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode.
 *
 * @param body You can get the code from /v1/user/exchange/bank/fiat/withdraw/newVerifycode
 * @param authorization Enter a valid Api Key.
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *SuccessResult
 */
func (a ExchangeBankActionsApi) V1UserExchangeBankFiatWithdrawVerify(body Code, authorization string, accept string) (*SuccessResult, *APIResponse, error) {

	var httpMethod = "Put"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/user/exchange/bank/fiat/withdraw/verify"

	// verify the required parameter 'body' is set
	if &body == nil {
		return new(SuccessResult), nil, errors.New("Missing required parameter 'body' when calling ExchangeBankActionsApi->V1UserExchangeBankFiatWithdrawVerify")
	}

	headerParams := make(map[string]string)
	queryParams := url.Values{}
	formParams := make(map[string]string)
	var postBody interface{}
	var fileName string
	var fileBytes []byte

	// add default headers if any
	for key := range a.Configuration.DefaultHeader {
		headerParams[key] = a.Configuration.DefaultHeader[key]
	}


	// to determine the Content-Type header
	localVarHttpContentTypes := []string{ "application/json",  }

	// set Content-Type header
	localVarHttpContentType := a.Configuration.APIClient.SelectHeaderContentType(localVarHttpContentTypes)
	if localVarHttpContentType != "" {
		headerParams["Content-Type"] = localVarHttpContentType
	}
	// to determine the Accept header
	localVarHttpHeaderAccepts := []string{
		"application/json",
"application/xml",
"application/csv",
	}

	// set Accept header
	localVarHttpHeaderAccept := a.Configuration.APIClient.SelectHeaderAccept(localVarHttpHeaderAccepts)
	if localVarHttpHeaderAccept != "" {
		headerParams["Accept"] = localVarHttpHeaderAccept
	}

	// header params "Authorization"
	headerParams["Authorization"] = authorization
	// header params "accept"
	headerParams["accept"] = accept

	// body params
	postBody = &body

	var successPayload = new(SuccessResult)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

