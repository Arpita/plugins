(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/FailResult', 'model/BankSummaryDataResponse', 'model/DoubleDataResponse', 'model/KYCDataResponse', 'model/SuccCoinRefDataResponse', 'model/SuccRefDataResponse', 'model/AllRefDataResponse', 'model/TradeSummaryDataResponse', 'model/SuccessResult', 'model/UserSummaryDataResponse', 'model/WalletSummaryDataResponse'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/FailResult'), require('../model/BankSummaryDataResponse'), require('../model/DoubleDataResponse'), require('../model/KYCDataResponse'), require('../model/SuccCoinRefDataResponse'), require('../model/SuccRefDataResponse'), require('../model/AllRefDataResponse'), require('../model/TradeSummaryDataResponse'), require('../model/SuccessResult'), require('../model/UserSummaryDataResponse'), require('../model/WalletSummaryDataResponse'));
  } else {
    // Browser globals (root is window)
    if (!root.CoinsecureApiDocumentation) {
      root.CoinsecureApiDocumentation = {};
    }
    root.CoinsecureApiDocumentation.AccountDataApi = factory(root.CoinsecureApiDocumentation.ApiClient, root.CoinsecureApiDocumentation.FailResult, root.CoinsecureApiDocumentation.BankSummaryDataResponse, root.CoinsecureApiDocumentation.DoubleDataResponse, root.CoinsecureApiDocumentation.KYCDataResponse, root.CoinsecureApiDocumentation.SuccCoinRefDataResponse, root.CoinsecureApiDocumentation.SuccRefDataResponse, root.CoinsecureApiDocumentation.AllRefDataResponse, root.CoinsecureApiDocumentation.TradeSummaryDataResponse, root.CoinsecureApiDocumentation.SuccessResult, root.CoinsecureApiDocumentation.UserSummaryDataResponse, root.CoinsecureApiDocumentation.WalletSummaryDataResponse);
  }
}(this, function(ApiClient, FailResult, BankSummaryDataResponse, DoubleDataResponse, KYCDataResponse, SuccCoinRefDataResponse, SuccRefDataResponse, AllRefDataResponse, TradeSummaryDataResponse, SuccessResult, UserSummaryDataResponse, WalletSummaryDataResponse) {
  'use strict';

  /**
   * AccountData service.
   * @module api/AccountDataApi
   * @version 1.0b
   */

  /**
   * Constructs a new AccountDataApi. 
   * @alias module:api/AccountDataApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the v1exchangebanksummary operation.
     * @callback module:api/AccountDataApi~v1exchangebanksummaryCallback
     * @param {String} error Error message, if any.
     * @param {module:model/BankSummaryDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Exchange Bank Summary
     * Gets a Summary of Exchange Bank Data and Balances.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/AccountDataApi~v1exchangebanksummaryCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/BankSummaryDataResponse}
     */
    this.v1exchangebanksummary = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1exchangebanksummary";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': authorization,
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = BankSummaryDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/bank/summary', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1exchangeusercoinfee operation.
     * @callback module:api/AccountDataApi~v1exchangeusercoinfeeCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DoubleDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Users Coin Fee Percentage
     * Returns the users coin fee percentage. The response is in percentage.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization API object to be added
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/AccountDataApi~v1exchangeusercoinfeeCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/DoubleDataResponse}
     */
    this.v1exchangeusercoinfee = function(opts, callback) {
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
      var returnType = DoubleDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/coin/fee', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1exchangeuserfiatfee operation.
     * @callback module:api/AccountDataApi~v1exchangeuserfiatfeeCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DoubleDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Users Fiat Fee Percentage
     * Returns the users fiat fee percentage. The response is in percentage.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/AccountDataApi~v1exchangeuserfiatfeeCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/DoubleDataResponse}
     */
    this.v1exchangeuserfiatfee = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1exchangeuserfiatfee";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': authorization,
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = DoubleDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/fiat/fee', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1netkisearchNetkiName operation.
     * @callback module:api/AccountDataApi~v1netkisearchNetkiNameCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DoubleDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Coinsecure.me Netki Lookup
     * Searches for a coinsecure.me Netki Wallet Name and responds with an Address model output.
     * @param {String} netkiName 
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/AccountDataApi~v1netkisearchNetkiNameCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/DoubleDataResponse}
     */
    this.v1netkisearchNetkiName = function(netkiName, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'netkiName' is set
      if (netkiName == undefined || netkiName == null) {
        throw "Missing the required parameter 'netkiName' when calling v1netkisearchNetkiName";
      }


      var pathParams = {
        'netkiName': netkiName
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
      var returnType = DoubleDataResponse;

      return this.apiClient.callApi(
        '/v1/netki/search/{netkiName}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangekycs operation.
     * @callback module:api/AccountDataApi~v1userexchangekycsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/KYCDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets KYC Status Details
     * Gets Users KYC Status Details.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/AccountDataApi~v1userexchangekycsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/KYCDataResponse}
     */
    this.v1userexchangekycs = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1userexchangekycs";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': authorization,
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = KYCDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/kycs', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangereferralcoinpaid operation.
     * @callback module:api/AccountDataApi~v1userexchangereferralcoinpaidCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccCoinRefDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Users Paid Fiat Referrals
     * Returns the Users Paid Coin Referrals.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/AccountDataApi~v1userexchangereferralcoinpaidCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccCoinRefDataResponse}
     */
    this.v1userexchangereferralcoinpaid = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1userexchangereferralcoinpaid";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': authorization,
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = SuccCoinRefDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/referral/coin/paid', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangereferralcoinsuccessful operation.
     * @callback module:api/AccountDataApi~v1userexchangereferralcoinsuccessfulCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccRefDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets Users Successful Referral Links
     * Gets Users Successful Referral Links that can be used during signup.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/AccountDataApi~v1userexchangereferralcoinsuccessfulCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccRefDataResponse}
     */
    this.v1userexchangereferralcoinsuccessful = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1userexchangereferralcoinsuccessful";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': authorization,
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = SuccRefDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/referral/coin/successful', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangereferralfiatpaid operation.
     * @callback module:api/AccountDataApi~v1userexchangereferralfiatpaidCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccCoinRefDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Users Paid Fiat Referrals
     * Returns the Users Paid Fiat Referrals.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/AccountDataApi~v1userexchangereferralfiatpaidCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccCoinRefDataResponse}
     */
    this.v1userexchangereferralfiatpaid = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1userexchangereferralfiatpaid";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': authorization,
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = SuccCoinRefDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/referral/fiat/paid', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangereferrals operation.
     * @callback module:api/AccountDataApi~v1userexchangereferralsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AllRefDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets Users Referral Links
     * Gets Users Referral Links that can be used during signup.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/AccountDataApi~v1userexchangereferralsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/AllRefDataResponse}
     */
    this.v1userexchangereferrals = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1userexchangereferrals";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': authorization,
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = AllRefDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/referrals', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangetradesummary operation.
     * @callback module:api/AccountDataApi~v1userexchangetradesummaryCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TradeSummaryDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Exchange Trade Summary
     * Gets a Summary of Exchange Trade Data.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/AccountDataApi~v1userexchangetradesummaryCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/TradeSummaryDataResponse}
     */
    this.v1userexchangetradesummary = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1userexchangetradesummary";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': authorization,
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = TradeSummaryDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/trade/summary', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userlogintokenToken operation.
     * @callback module:api/AccountDataApi~v1userlogintokenTokenCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SuccessResult} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Login Token Email
     * Retrieves details of a Login Token
     * @param {String} token 
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/AccountDataApi~v1userlogintokenTokenCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/SuccessResult}
     */
    this.v1userlogintokenToken = function(token, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'token' is set
      if (token == undefined || token == null) {
        throw "Missing the required parameter 'token' when calling v1userlogintokenToken";
      }


      var pathParams = {
        'token': token
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
        '/v1/user/login/token/{token}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1usersummary operation.
     * @callback module:api/AccountDataApi~v1usersummaryCallback
     * @param {String} error Error message, if any.
     * @param {module:model/UserSummaryDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Exchange Bank Summary
     * Gets a Summary of Exchange Bank Data and Balances.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/AccountDataApi~v1usersummaryCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/UserSummaryDataResponse}
     */
    this.v1usersummary = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1usersummary";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': authorization,
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = UserSummaryDataResponse;

      return this.apiClient.callApi(
        '/v1/user/summary', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userwalletsummary operation.
     * @callback module:api/AccountDataApi~v1userwalletsummaryCallback
     * @param {String} error Error message, if any.
     * @param {module:model/WalletSummaryDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Exchange Bank Summary
     * Gets a Summary of Exchange Bank Data and Balances.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/AccountDataApi~v1userwalletsummaryCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/WalletSummaryDataResponse}
     */
    this.v1userwalletsummary = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1userwalletsummary";
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var headerParams = {
        'Authorization': authorization,
        'accept': opts['accept']
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json', 'application/xml', 'application/csv'];
      var returnType = WalletSummaryDataResponse;

      return this.apiClient.callApi(
        '/v1/user/wallet/summary', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
