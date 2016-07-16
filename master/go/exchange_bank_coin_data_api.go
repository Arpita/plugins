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

type ExchangeBankCoinDataApi struct {
	Configuration Configuration
}

func NewExchangeBankCoinDataApi() *ExchangeBankCoinDataApi {
	configuration := NewConfiguration()
	return &ExchangeBankCoinDataApi{
		Configuration: *configuration,
	}
}

func NewExchangeBankCoinDataApiWithBasePath(basePath string) *ExchangeBankCoinDataApi {
	configuration := NewConfiguration()
	configuration.BasePath = basePath

	return &ExchangeBankCoinDataApi{
		Configuration: *configuration,
	}
}

/**
 * Exchange Coin Addresses
 * Gets a List of Users Exchange Bitcoin Deposit Addresses.
 *
 * @param authorization API object to be added
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *TradeAddressDataResponse
 */
func (a ExchangeBankCoinDataApi) V1UserExchangeBankCoinAddresses(authorization string, accept string) (*TradeAddressDataResponse, *APIResponse, error) {

	var httpMethod = "Get"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/user/exchange/bank/coin/addresses"

	// verify the required parameter 'authorization' is set
	if &authorization == nil {
		return new(TradeAddressDataResponse), nil, errors.New("Missing required parameter 'authorization' when calling ExchangeBankCoinDataApi->V1UserExchangeBankCoinAddresses")
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

	var successPayload = new(TradeAddressDataResponse)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * Available Exchange Coin Balance
 * Returns balance which is in Available for Trades. The response is in satoshis.
 *
 * @param authorization API object to be added
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *VolDataResponse
 */
func (a ExchangeBankCoinDataApi) V1UserExchangeBankCoinBalanceAvailable(authorization string, accept string) (*VolDataResponse, *APIResponse, error) {

	var httpMethod = "Get"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/user/exchange/bank/coin/balance/total"

	// verify the required parameter 'authorization' is set
	if &authorization == nil {
		return new(VolDataResponse), nil, errors.New("Missing required parameter 'authorization' when calling ExchangeBankCoinDataApi->V1UserExchangeBankCoinBalanceAvailable")
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

	var successPayload = new(VolDataResponse)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * In Trade Coin Balance
 * Returns in-trade or pending coin balance in satoshi.
 *
 * @param authorization API object to be added
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *VolDataResponse
 */
func (a ExchangeBankCoinDataApi) V1UserExchangeBankCoinBalancePending(authorization string, accept string) (*VolDataResponse, *APIResponse, error) {

	var httpMethod = "Get"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/user/exchange/bank/coin/balance/pending"

	// verify the required parameter 'authorization' is set
	if &authorization == nil {
		return new(VolDataResponse), nil, errors.New("Missing required parameter 'authorization' when calling ExchangeBankCoinDataApi->V1UserExchangeBankCoinBalancePending")
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

	var successPayload = new(VolDataResponse)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * Total Exchange Coin Balance
 * Returns users total coin balance in satoshis. Pending + Available
 *
 * @param authorization API object to be added
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *VolDataResponse
 */
func (a ExchangeBankCoinDataApi) V1UserExchangeBankCoinBalanceTotal(authorization string, accept string) (*VolDataResponse, *APIResponse, error) {

	var httpMethod = "Get"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/user/exchange/bank/coin/balance/available"

	// verify the required parameter 'authorization' is set
	if &authorization == nil {
		return new(VolDataResponse), nil, errors.New("Missing required parameter 'authorization' when calling ExchangeBankCoinDataApi->V1UserExchangeBankCoinBalanceTotal")
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

	var successPayload = new(VolDataResponse)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * Cancelled Exchange Coin Deposits
 * Gets a List of Cancelled Exchange Coin Deposits. The value and fees are in paisa.
 *
 * @param authorization API object to be added
 * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
 * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
 * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
 * @param offset Offset defaults to 0 if input is invalid. (Optional)
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *CoinDepDataResponse
 */
func (a ExchangeBankCoinDataApi) V1UserExchangeBankCoinDepositCancelled(authorization string, from int64, to int64, max int32, offset int64, accept string) (*CoinDepDataResponse, *APIResponse, error) {

	var httpMethod = "Get"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/user/exchange/bank/coin/deposit/cancelled"

	// verify the required parameter 'authorization' is set
	if &authorization == nil {
		return new(CoinDepDataResponse), nil, errors.New("Missing required parameter 'authorization' when calling ExchangeBankCoinDataApi->V1UserExchangeBankCoinDepositCancelled")
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
		queryParams.Add("from", a.Configuration.APIClient.ParameterToString(from, ""))
			queryParams.Add("to", a.Configuration.APIClient.ParameterToString(to, ""))
			queryParams.Add("max", a.Configuration.APIClient.ParameterToString(max, ""))
			queryParams.Add("offset", a.Configuration.APIClient.ParameterToString(offset, ""))
	

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

	var successPayload = new(CoinDepDataResponse)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * Unverified Exchange Coin Deposits
 * Gets a List of Unverified Exchange Coin Deposits. The value and fees are in paisa.
 *
 * @param authorization API object to be added
 * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
 * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
 * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
 * @param offset Offset defaults to 0 if input is invalid. (Optional)
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *CoinDepDataResponse
 */
func (a ExchangeBankCoinDataApi) V1UserExchangeBankCoinDepositUnverified(authorization string, from int64, to int64, max int32, offset int64, accept string) (*CoinDepDataResponse, *APIResponse, error) {

	var httpMethod = "Get"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/user/exchange/bank/coin/deposit/unverified"

	// verify the required parameter 'authorization' is set
	if &authorization == nil {
		return new(CoinDepDataResponse), nil, errors.New("Missing required parameter 'authorization' when calling ExchangeBankCoinDataApi->V1UserExchangeBankCoinDepositUnverified")
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
		queryParams.Add("from", a.Configuration.APIClient.ParameterToString(from, ""))
			queryParams.Add("to", a.Configuration.APIClient.ParameterToString(to, ""))
			queryParams.Add("max", a.Configuration.APIClient.ParameterToString(max, ""))
			queryParams.Add("offset", a.Configuration.APIClient.ParameterToString(offset, ""))
	

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

	var successPayload = new(CoinDepDataResponse)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * Verified Exchange Coin Deposits
 * Gets a List of Verified Exchange Coin Deposits. The value and fees are in paisa.
 *
 * @param authorization API object to be added
 * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
 * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
 * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
 * @param offset Offset defaults to 0 if input is invalid. (Optional)
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *CoinDepDataResponse
 */
func (a ExchangeBankCoinDataApi) V1UserExchangeBankCoinDepositVerified(authorization string, from int64, to int64, max int32, offset int64, accept string) (*CoinDepDataResponse, *APIResponse, error) {

	var httpMethod = "Get"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/user/exchange/bank/coin/deposit/verified"

	// verify the required parameter 'authorization' is set
	if &authorization == nil {
		return new(CoinDepDataResponse), nil, errors.New("Missing required parameter 'authorization' when calling ExchangeBankCoinDataApi->V1UserExchangeBankCoinDepositVerified")
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
		queryParams.Add("from", a.Configuration.APIClient.ParameterToString(from, ""))
			queryParams.Add("to", a.Configuration.APIClient.ParameterToString(to, ""))
			queryParams.Add("max", a.Configuration.APIClient.ParameterToString(max, ""))
			queryParams.Add("offset", a.Configuration.APIClient.ParameterToString(offset, ""))
	

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

	var successPayload = new(CoinDepDataResponse)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * Cancelled Exchange Coin Withdrawals
 * Gets a List of Cancelled Coin Withdrawals. The value and fees are in satoshis.
 *
 * @param authorization API object to be added
 * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
 * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
 * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
 * @param offset Offset defaults to 0 if input is invalid. (Optional)
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *TradeCoinWithdrawDataResponse
 */
func (a ExchangeBankCoinDataApi) V1UserExchangeBankCoinWithdrawCancelled(authorization string, from int64, to int64, max int32, offset int64, accept string) (*TradeCoinWithdrawDataResponse, *APIResponse, error) {

	var httpMethod = "Get"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/user/exchange/bank/coin/withdraw/cancelled"

	// verify the required parameter 'authorization' is set
	if &authorization == nil {
		return new(TradeCoinWithdrawDataResponse), nil, errors.New("Missing required parameter 'authorization' when calling ExchangeBankCoinDataApi->V1UserExchangeBankCoinWithdrawCancelled")
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
		queryParams.Add("from", a.Configuration.APIClient.ParameterToString(from, ""))
			queryParams.Add("to", a.Configuration.APIClient.ParameterToString(to, ""))
			queryParams.Add("max", a.Configuration.APIClient.ParameterToString(max, ""))
			queryParams.Add("offset", a.Configuration.APIClient.ParameterToString(offset, ""))
	

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

	var successPayload = new(TradeCoinWithdrawDataResponse)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * Completed Exchange Coin Withdrawals
 * Gets a List of Completed Coin Withdrawals. The value and fees are in satoshis.
 *
 * @param authorization API object to be added
 * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
 * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
 * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
 * @param offset Offset defaults to 0 if input is invalid. (Optional)
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *TradeCoinWithdrawDataResponse
 */
func (a ExchangeBankCoinDataApi) V1UserExchangeBankCoinWithdrawCompleted(authorization string, from int64, to int64, max int32, offset int64, accept string) (*TradeCoinWithdrawDataResponse, *APIResponse, error) {

	var httpMethod = "Get"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/user/exchange/bank/coin/withdraw/completed"

	// verify the required parameter 'authorization' is set
	if &authorization == nil {
		return new(TradeCoinWithdrawDataResponse), nil, errors.New("Missing required parameter 'authorization' when calling ExchangeBankCoinDataApi->V1UserExchangeBankCoinWithdrawCompleted")
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
		queryParams.Add("from", a.Configuration.APIClient.ParameterToString(from, ""))
			queryParams.Add("to", a.Configuration.APIClient.ParameterToString(to, ""))
			queryParams.Add("max", a.Configuration.APIClient.ParameterToString(max, ""))
			queryParams.Add("offset", a.Configuration.APIClient.ParameterToString(offset, ""))
	

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

	var successPayload = new(TradeCoinWithdrawDataResponse)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * Unverified Exchange Coin Withdrawals
 * Gets a List of Unverified Exchange Coin Withdrawals. The value and fees are in satoshis.
 *
 * @param authorization API object to be added
 * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
 * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
 * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
 * @param offset Offset defaults to 0 if input is invalid. (Optional)
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *TradeCoinWithdrawDataResponse
 */
func (a ExchangeBankCoinDataApi) V1UserExchangeBankCoinWithdrawUnverified(authorization string, from int64, to int64, max int32, offset int64, accept string) (*TradeCoinWithdrawDataResponse, *APIResponse, error) {

	var httpMethod = "Get"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/user/exchange/bank/coin/withdraw/unverified"

	// verify the required parameter 'authorization' is set
	if &authorization == nil {
		return new(TradeCoinWithdrawDataResponse), nil, errors.New("Missing required parameter 'authorization' when calling ExchangeBankCoinDataApi->V1UserExchangeBankCoinWithdrawUnverified")
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
		queryParams.Add("from", a.Configuration.APIClient.ParameterToString(from, ""))
			queryParams.Add("to", a.Configuration.APIClient.ParameterToString(to, ""))
			queryParams.Add("max", a.Configuration.APIClient.ParameterToString(max, ""))
			queryParams.Add("offset", a.Configuration.APIClient.ParameterToString(offset, ""))
	

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

	var successPayload = new(TradeCoinWithdrawDataResponse)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * Verified Exchange Coin Withdrawals
 * Gets a List of Verified Exchange Coin Withdrawals. The value and fees are in satoshis.
 *
 * @param authorization API object to be added
 * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
 * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
 * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
 * @param offset Offset defaults to 0 if input is invalid. (Optional)
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *TradeCoinWithdrawDataResponse
 */
func (a ExchangeBankCoinDataApi) V1UserExchangeBankCoinWithdrawVerified(authorization string, from int64, to int64, max int32, offset int64, accept string) (*TradeCoinWithdrawDataResponse, *APIResponse, error) {

	var httpMethod = "Get"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/user/exchange/bank/coin/withdraw/verified"

	// verify the required parameter 'authorization' is set
	if &authorization == nil {
		return new(TradeCoinWithdrawDataResponse), nil, errors.New("Missing required parameter 'authorization' when calling ExchangeBankCoinDataApi->V1UserExchangeBankCoinWithdrawVerified")
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
		queryParams.Add("from", a.Configuration.APIClient.ParameterToString(from, ""))
			queryParams.Add("to", a.Configuration.APIClient.ParameterToString(to, ""))
			queryParams.Add("max", a.Configuration.APIClient.ParameterToString(max, ""))
			queryParams.Add("offset", a.Configuration.APIClient.ParameterToString(offset, ""))
	

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

	var successPayload = new(TradeCoinWithdrawDataResponse)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

