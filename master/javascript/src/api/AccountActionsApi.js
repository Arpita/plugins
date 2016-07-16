(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/FailResult', 'model/LoginFormNew', 'model/StandardLoginResultData', 'model/LoginId', 'model/StandardInitiateLoginResultData', 'model/Email', 'model/SuccessResult', 'model/SignupForm', 'model/NetkiNameAddress', 'model/Address', 'model/NetkiName', 'model/NumberOtp'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/FailResult'), require('../model/LoginFormNew'), require('../model/StandardLoginResultData'), require('../model/LoginId'), require('../model/StandardInitiateLoginResultData'), require('../model/Email'), require('../model/SuccessResult'), require('../model/SignupForm'), require('../model/NetkiNameAddress'), require('../model/Address'), require('../model/NetkiName'), require('../model/NumberOtp'));
  } else {
    // Browser globals (root is window)
    if (!root.CoinsecureApiDocumentation) {
      root.CoinsecureApiDocumentation = {};
    }
    root.CoinsecureApiDocumentation.AccountActionsApi = factory(root.CoinsecureApiDocumentation.ApiClient, root.CoinsecureApiDocumentation.FailResult, root.CoinsecureApiDocumentation.LoginFormNew, root.CoinsecureApiDocumentation.StandardLoginResultData, root.CoinsecureApiDocumentation.LoginId, root.CoinsecureApiDocumentation.StandardInitiateLoginResultData, root.CoinsecureApiDocumentation.Email, root.CoinsecureApiDocumentation.SuccessResult, root.CoinsecureApiDocumentation.SignupForm, root.CoinsecureApiDocumentation.NetkiNameAddress, root.CoinsecureApiDocumentation.Address, root.CoinsecureApiDocumentation.NetkiName, root.CoinsecureApiDocumentation.NumberOtp);
  }
}(this, function(ApiClient, FailResult, LoginFormNew, StandardLoginResultData, LoginId, StandardInitiateLoginResultData, Email, SuccessResult, SignupForm, NetkiNameAddress, Address, NetkiName, NumberOtp) {
  'use strict';

  /**
   * AccountActions service.
   * @module api/AccountActionsApi
   * @version 1.0b
   */

  /**
   * Constructs a new AccountActionsApi. 
   * @alias module:api/AccountActionsApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the v1login operation.
     * @callback module:api/AccountActionsApi~v1loginCallback
     * @param {String} error Error message, if any.
     * @param {module:model/StandardLoginResultData} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Creates a Login Instance and returns an API Key.
     * Creates a Login Instance and returns an API Key
     * @param {module:model/LoginFormNew} body Please send the form with valid inputs.
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/AccountActionsApi~v1loginCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/StandardLoginResultData}
     */
    this.v1login = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1login";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = StandardLoginResultData;

      return this.apiClient.callApi(
        '/v1/login', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1logininitiate operation.
     * @callback module:api/AccountActionsApi~v1logininitiateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/StandardInitiateLoginResultData} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Initiate Login
     * Sends an Email with a Verification Link.
     * @param {module:model/LoginId} body Enter a valid Login ID. This method will send an email with a token to be used for login.
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/AccountActionsApi~v1logininitiateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/StandardInitiateLoginResultData}
     */
    this.v1logininitiate = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1logininitiate";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = StandardInitiateLoginResultData;

      return this.apiClient.callApi(
        '/v1/login/initiate', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1loginpasswordforgot operation.
     * @callback module:api/AccountActionsApi~v1loginpasswordforgotCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Sends an email with a password reset token
     * Sends an email with a password reset token
     * @param {module:model/Email} body Enter a valid and registered Email ID.
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/AccountActionsApi~v1loginpasswordforgotCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1loginpasswordforgot = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1loginpasswordforgot";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = SuccessResult;

      return this.apiClient.callApi(
        '/v1/login/password/forgot', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1signup operation.
     * @callback module:api/AccountActionsApi~v1signupCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Creates a new Unverified Account.
     * Creates a new Unverified Account.
     * @param {module:model/SignupForm} body Please send the form with valid inputs.
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/AccountActionsApi~v1signupCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1signup = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1signup";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = SuccessResult;

      return this.apiClient.callApi(
        '/v1/signup', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userbankotpNumber operation.
     * @callback module:api/AccountActionsApi~v1userbankotpNumberCallback
     * @param {String} error Error message, if any.
     * @param {module:model/StandardInitiateLoginResultData} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Send OTP for Bank Link
     * Send OTP for an additional Bank Link.
     * @param {String} _number 
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization API object to be added
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/AccountActionsApi~v1userbankotpNumberCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/StandardInitiateLoginResultData}
     */
    this.v1userbankotpNumber = function(_number, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter '_number' is set
      if (_number == undefined || _number == null) {
        throw "Missing the required parameter '_number' when calling v1userbankotpNumber";
      }


      var pathParams = {
        'number': _number
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': opts['authorization'],
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = StandardInitiateLoginResultData;

      return this.apiClient.callApi(
        '/v1/user/bank/otp/{number}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangekyc operation.
     * @callback module:api/AccountActionsApi~v1userexchangekycCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Submits a New Bank Link and initial KYC Documents.
     * Submits a New Bank Link and initial KYC Documents.
     * @param {String} panNumber Please enter your Pan Card Number
     * @param {String} acctNick Please enter an Account NickName
     * @param {String} name Please enter your Name as it appears on your Bank account.
     * @param {String} ban Please enter your Bank account number.
     * @param {String} ifsc Please enter your IFSC Code.
     * @param {String} acctType Please enter your Coinsecure account type. Allowable Values are Personal or Company.
     * @param {String} banType Please enter your Bank account type. Allowable Values are Savings or Current.
     * @param {String} phone Please enter your Valid Phone Number.
     * @param {String} otp Please enter your OTP from SMS. The code can be requested from /v1/user/bank/otp/:number.
     * @param {File} file Enter a valid image, pdf or zip file under 5 MB in size.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization Enter a valid Api Key.
     * @param {String} opts.message Please enter an optional message if needed.
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/AccountActionsApi~v1userexchangekycCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1userexchangekyc = function(panNumber, acctNick, name, ban, ifsc, acctType, banType, phone, otp, file, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'panNumber' is set
      if (panNumber == undefined || panNumber == null) {
        throw "Missing the required parameter 'panNumber' when calling v1userexchangekyc";
      }

      // verify the required parameter 'acctNick' is set
      if (acctNick == undefined || acctNick == null) {
        throw "Missing the required parameter 'acctNick' when calling v1userexchangekyc";
      }

      // verify the required parameter 'name' is set
      if (name == undefined || name == null) {
        throw "Missing the required parameter 'name' when calling v1userexchangekyc";
      }

      // verify the required parameter 'ban' is set
      if (ban == undefined || ban == null) {
        throw "Missing the required parameter 'ban' when calling v1userexchangekyc";
      }

      // verify the required parameter 'ifsc' is set
      if (ifsc == undefined || ifsc == null) {
        throw "Missing the required parameter 'ifsc' when calling v1userexchangekyc";
      }

      // verify the required parameter 'acctType' is set
      if (acctType == undefined || acctType == null) {
        throw "Missing the required parameter 'acctType' when calling v1userexchangekyc";
      }

      // verify the required parameter 'banType' is set
      if (banType == undefined || banType == null) {
        throw "Missing the required parameter 'banType' when calling v1userexchangekyc";
      }

      // verify the required parameter 'phone' is set
      if (phone == undefined || phone == null) {
        throw "Missing the required parameter 'phone' when calling v1userexchangekyc";
      }

      // verify the required parameter 'otp' is set
      if (otp == undefined || otp == null) {
        throw "Missing the required parameter 'otp' when calling v1userexchangekyc";
      }

      // verify the required parameter 'file' is set
      if (file == undefined || file == null) {
        throw "Missing the required parameter 'file' when calling v1userexchangekyc";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': opts['authorization'],
        'accept': opts['accept']
      };
      var formParams = {
        'panNumber': panNumber,
        'acctNick': acctNick,
        'name': name,
        'ban': ban,
        'ifsc': ifsc,
        'acctType': acctType,
        'message': opts['message'],
        'banType': banType,
        'phone': phone,
        'otp': otp,
        'file': file
      };

      var authNames = [];
      var contentTypes = ['multipart/form-data'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = SuccessResult;

      return this.apiClient.callApi(
        '/v1/user/exchange/kyc', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1usergcmCode operation.
     * @callback module:api/AccountActionsApi~v1usergcmCodeCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete GCM Code
     * Delete GCM Code and associated API Key.
     * @param {String} code 
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization API object to be added
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/AccountActionsApi~v1usergcmCodeCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1usergcmCode = function(code, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'code' is set
      if (code == undefined || code == null) {
        throw "Missing the required parameter 'code' when calling v1usergcmCode";
      }


      var pathParams = {
        'code': code
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': opts['authorization'],
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = SuccessResult;

      return this.apiClient.callApi(
        '/v1/user/gcm/{code}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userkycotpNumber operation.
     * @callback module:api/AccountActionsApi~v1userkycotpNumberCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Send OTP for KYC Link
     * Send OTP for KYC Link.
     * @param {String} _number 
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization API object to be added
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/AccountActionsApi~v1userkycotpNumberCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1userkycotpNumber = function(_number, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter '_number' is set
      if (_number == undefined || _number == null) {
        throw "Missing the required parameter '_number' when calling v1userkycotpNumber";
      }


      var pathParams = {
        'number': _number
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': opts['authorization'],
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = SuccessResult;

      return this.apiClient.callApi(
        '/v1/user/kyc/otp/{number}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userlogout operation.
     * @callback module:api/AccountActionsApi~v1userlogoutCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Logout User
     * Logs out user and Deletes the api key and associated session data.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization Enter a valid Api Key.
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/AccountActionsApi~v1userlogoutCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1userlogout = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': opts['authorization'],
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = SuccessResult;

      return this.apiClient.callApi(
        '/v1/user/logout', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1usernetkicreate operation.
     * @callback module:api/AccountActionsApi~v1usernetkicreateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create Neki Wallet Name
     * Creates a new Netki Wallet Name.
     * @param {module:model/NetkiNameAddress} body Enter a valid Netki name and Bitcoin address from Wallet or Exchange.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization Enter a valid Api Key.
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/AccountActionsApi~v1usernetkicreateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1usernetkicreate = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1usernetkicreate";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': opts['authorization'],
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = SuccessResult;

      return this.apiClient.callApi(
        '/v1/user/netki/create', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1usernetkiupdate operation.
     * @callback module:api/AccountActionsApi~v1usernetkiupdateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update Netki Address
     * Updates the address on an existing wallet name.
     * @param {module:model/Address} body Enter a valid Bitcoin address from Wallet or Exchange to update the wallet name.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization Enter a valid Api Key.
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/AccountActionsApi~v1usernetkiupdateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1usernetkiupdate = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1usernetkiupdate";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': opts['authorization'],
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = SuccessResult;

      return this.apiClient.callApi(
        '/v1/user/netki/update', 'PATCH',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userprofileimagedelete operation.
     * @callback module:api/AccountActionsApi~v1userprofileimagedeleteCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete Profile Image
     * Deletes a profile Image.
     * @param {module:model/NetkiName} body Please enter a valid Netki name associated with your prfile Image.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization Enter a valid Api Key.
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/AccountActionsApi~v1userprofileimagedeleteCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1userprofileimagedelete = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1userprofileimagedelete";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': opts['authorization'],
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = SuccessResult;

      return this.apiClient.callApi(
        '/v1/user/contact', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userprofileimageupdate operation.
     * @callback module:api/AccountActionsApi~v1userprofileimageupdateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update Profile Image
     * Updates Profile Image and allows public or private options for netki profile page.
     * @param {String} netkiName Please enter your Netki Wallet Name.
     * @param {Boolean} isPublic Please enter if this image can be public.
     * @param {File} file Enter a valid image, pdf or zip file under 5 MB in size.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization Enter a valid Api Key.
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/AccountActionsApi~v1userprofileimageupdateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1userprofileimageupdate = function(netkiName, isPublic, file, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'netkiName' is set
      if (netkiName == undefined || netkiName == null) {
        throw "Missing the required parameter 'netkiName' when calling v1userprofileimageupdate";
      }

      // verify the required parameter 'isPublic' is set
      if (isPublic == undefined || isPublic == null) {
        throw "Missing the required parameter 'isPublic' when calling v1userprofileimageupdate";
      }

      // verify the required parameter 'file' is set
      if (file == undefined || file == null) {
        throw "Missing the required parameter 'file' when calling v1userprofileimageupdate";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': opts['authorization'],
        'accept': opts['accept']
      };
      var formParams = {
        'netkiName': netkiName,
        'isPublic': isPublic,
        'file': file
      };

      var authNames = [];
      var contentTypes = ['multipart/form-data'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = SuccessResult;

      return this.apiClient.callApi(
        '/v1/user/profile/image/update', 'PATCH',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userprofilephone operation.
     * @callback module:api/AccountActionsApi~v1userprofilephoneCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * New Profile Phone
     * Set a New Profile Phone Number.
     * @param {module:model/NumberOtp} body You can get an otp to update your profile phone number from /v1/user/profile/phone/otp/:number
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization Enter a valid Api Key.
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/AccountActionsApi~v1userprofilephoneCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1userprofilephone = function(body, opts, callback) {
      opts = opts || {};
      var postBody = body;

      // verify the required parameter 'body' is set
      if (body == undefined || body == null) {
        throw "Missing the required parameter 'body' when calling v1userprofilephone";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': opts['authorization'],
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = SuccessResult;

      return this.apiClient.callApi(
        '/v1/user/profile/phone/new', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userprofilephoneNumber operation.
     * @callback module:api/AccountActionsApi~v1userprofilephoneNumberCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete Profile Phone Number
     * Delete Profile Phone Number.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization API object to be added
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/AccountActionsApi~v1userprofilephoneNumberCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1userprofilephoneNumber = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': opts['authorization'],
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = SuccessResult;

      return this.apiClient.callApi(
        '/v1/user/profile/phone/delete', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userprofilephoneotpNumber operation.
     * @callback module:api/AccountActionsApi~v1userprofilephoneotpNumberCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Send OTP for Profile Phone
     * Send OTP for Profile Phone addition or updation.
     * @param {String} _number 
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization API object to be added
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/AccountActionsApi~v1userprofilephoneotpNumberCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1userprofilephoneotpNumber = function(_number, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter '_number' is set
      if (_number == undefined || _number == null) {
        throw "Missing the required parameter '_number' when calling v1userprofilephoneotpNumber";
      }


      var pathParams = {
        'number': _number
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': opts['authorization'],
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = SuccessResult;

      return this.apiClient.callApi(
        '/v1/user/profile/phone/otp/{number}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
