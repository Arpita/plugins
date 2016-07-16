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

type SecurityActionsApi struct {
	Configuration Configuration
}

func NewSecurityActionsApi() *SecurityActionsApi {
	configuration := NewConfiguration()
	return &SecurityActionsApi{
		Configuration: *configuration,
	}
}

func NewSecurityActionsApiWithBasePath(basePath string) *SecurityActionsApi {
	configuration := NewConfiguration()
	configuration.BasePath = basePath

	return &SecurityActionsApi{
		Configuration: *configuration,
	}
}

/**
 * Initiate Authy Registration.
 * Sends a Token via call or sms to begin the registration. This token needs to be used as the code in /v1/user/mfa/authy/initiate/register.
 *
 * @param body Please Send Valid Json as below.
 * @param authorization API object to be added
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *SuccessResult
 */
func (a SecurityActionsApi) V1MfaAuthyInitiate(body MethodCountryMobile, authorization string, accept string) (*SuccessResult, *APIResponse, error) {

	var httpMethod = "Post"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/mfa/authy/initiate"

	// verify the required parameter 'body' is set
	if &body == nil {
		return new(SuccessResult), nil, errors.New("Missing required parameter 'body' when calling SecurityActionsApi->V1MfaAuthyInitiate")
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
 * Initiate GA Registration.
 * Returns the Google Authenticator Secret and a QR code URL.
 *
 * @param body Please Send Valid Json as below.
 * @param authorization API object to be added
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *SuccessResult
 */
func (a SecurityActionsApi) V1MfaGaInitiate(body MethodCountryMobile, authorization string, accept string) (*SuccessResult, *APIResponse, error) {

	var httpMethod = "Post"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/mfa/ga/initiate"

	// verify the required parameter 'body' is set
	if &body == nil {
		return new(SuccessResult), nil, errors.New("Missing required parameter 'body' when calling SecurityActionsApi->V1MfaGaInitiate")
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
 * Authy Call Code
 * Calls valid phone user with a code.
 *
 * @param authorization Login Token or any Apikey to be added as Authorization in header
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *SuccessResult
 */
func (a SecurityActionsApi) V1UserMfaAuthyCall(authorization string, accept string) (*SuccessResult, *APIResponse, error) {

	var httpMethod = "Get"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/mfa/authy/call"


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

	var successPayload = new(SuccessResult)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * Disable Authy
 * Disables users Authy
 *
 * @param body Please Send Valid Json as below.
 * @param authorization API object to be added
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *SuccessResult
 */
func (a SecurityActionsApi) V1UserMfaAuthyDisable(body Code, authorization string, accept string) (*SuccessResult, *APIResponse, error) {

	var httpMethod = "Delete"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/user/mfa/authy/disable"

	// verify the required parameter 'body' is set
	if &body == nil {
		return new(SuccessResult), nil, errors.New("Missing required parameter 'body' when calling SecurityActionsApi->V1UserMfaAuthyDisable")
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
 * Verify Authy Registration
 * Verifies and registers the user with verification code sent to sms or call from /v1/mfa/authy/initiate.
 *
 * @param body Please Send Valid Json as below.
 * @param authorization API object to be added
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *SuccessResult
 */
func (a SecurityActionsApi) V1UserMfaAuthyInitiateEnable(body CodeCountryMobile, authorization string, accept string) (*SuccessResult, *APIResponse, error) {

	var httpMethod = "Put"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/user/mfa/authy/initiate/enable"

	// verify the required parameter 'body' is set
	if &body == nil {
		return new(SuccessResult), nil, errors.New("Missing required parameter 'body' when calling SecurityActionsApi->V1UserMfaAuthyInitiateEnable")
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
 * Authy Sms Code
 * Disables users Authy
 *
 * @param authorization Login Token or any Apikey to be added as Authorization in header
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *SuccessResult
 */
func (a SecurityActionsApi) V1UserMfaAuthySms(authorization string, accept string) (*SuccessResult, *APIResponse, error) {

	var httpMethod = "Get"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/mfa/authy/sms"


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

	var successPayload = new(SuccessResult)
	httpResponse, err := a.Configuration.APIClient.CallAPI(path, httpMethod, postBody, headerParams, queryParams, formParams, fileName, fileBytes)
	if err != nil {
		return successPayload, NewAPIResponse(httpResponse.RawResponse), err
	}
	err = json.Unmarshal(httpResponse.Body(), &successPayload)
	return successPayload, NewAPIResponse(httpResponse.RawResponse), err
}

/**
 * Disable Google Authenticator
 * Disables users Google Authenticator 2FA
 *
 * @param body Please Send Valid Json as below.
 * @param authorization API object to be added
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *SuccessResult
 */
func (a SecurityActionsApi) V1UserMfaGaDisable(body Code, authorization string, accept string) (*SuccessResult, *APIResponse, error) {

	var httpMethod = "Delete"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/user/mfa/ga/disable"

	// verify the required parameter 'body' is set
	if &body == nil {
		return new(SuccessResult), nil, errors.New("Missing required parameter 'body' when calling SecurityActionsApi->V1UserMfaGaDisable")
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
 * Enable Google Authenticator
 * Enables Google Authenticator 2FA with the code from /v1/mfa/ga/initiate.
 *
 * @param body Please Send Valid Json as below.
 * @param authorization API object to be added
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *SuccessResult
 */
func (a SecurityActionsApi) V1UserMfaGaInitiateEnable(body CodeCountryMobile, authorization string, accept string) (*SuccessResult, *APIResponse, error) {

	var httpMethod = "Put"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/user/mfa/ga/initiate/enable"

	// verify the required parameter 'body' is set
	if &body == nil {
		return new(SuccessResult), nil, errors.New("Missing required parameter 'body' when calling SecurityActionsApi->V1UserMfaGaInitiateEnable")
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
 * Change Password.
 * Changes an account Password.
 *
 * @param body 
 * @param authorization Enter a valid Api Key.
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *SuccessResult
 */
func (a SecurityActionsApi) V1UserPasswordChange(body ChangePassword, authorization string, accept string) (*SuccessResult, *APIResponse, error) {

	var httpMethod = "Patch"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/user/password/change"

	// verify the required parameter 'body' is set
	if &body == nil {
		return new(SuccessResult), nil, errors.New("Missing required parameter 'body' when calling SecurityActionsApi->V1UserPasswordChange")
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
 * Reset Password.
 * Resets an account Password. Use forgotPassword to generate a token.
 *
 * @param body Please Send Valid Json as below.
 * @param accept JSON, XML or CSV can be returned (Optional)
 * @return *SuccessResult
 */
func (a SecurityActionsApi) V1UserPasswordReset(body ResetPassword, accept string) (*SuccessResult, *APIResponse, error) {

	var httpMethod = "Patch"
	// create path and map variables
	path := a.Configuration.BasePath + "/v1/user/password/reset"

	// verify the required parameter 'body' is set
	if &body == nil {
		return new(SuccessResult), nil, errors.New("Missing required parameter 'body' when calling SecurityActionsApi->V1UserPasswordReset")
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

