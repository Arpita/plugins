(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/TradeAddressDataResponse', 'model/FailResult', 'model/VolDataResponse', 'model/CoinDepDataResponse', 'model/TradeCoinWithdrawDataResponse'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/TradeAddressDataResponse'), require('../model/FailResult'), require('../model/VolDataResponse'), require('../model/CoinDepDataResponse'), require('../model/TradeCoinWithdrawDataResponse'));
  } else {
    // Browser globals (root is window)
    if (!root.CoinsecureApiDocumentation) {
      root.CoinsecureApiDocumentation = {};
    }
    root.CoinsecureApiDocumentation.ExchangeBankCoinDataApi = factory(root.CoinsecureApiDocumentation.ApiClient, root.CoinsecureApiDocumentation.TradeAddressDataResponse, root.CoinsecureApiDocumentation.FailResult, root.CoinsecureApiDocumentation.VolDataResponse, root.CoinsecureApiDocumentation.CoinDepDataResponse, root.CoinsecureApiDocumentation.TradeCoinWithdrawDataResponse);
  }
}(this, function(ApiClient, TradeAddressDataResponse, FailResult, VolDataResponse, CoinDepDataResponse, TradeCoinWithdrawDataResponse) {
  'use strict';

  /**
   * ExchangeBankCoinData service.
   * @module api/ExchangeBankCoinDataApi
   * @version 1.0b
   */

  /**
   * Constructs a new ExchangeBankCoinDataApi. 
   * @alias module:api/ExchangeBankCoinDataApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the v1userexchangebankcoinaddresses operation.
     * @callback module:api/ExchangeBankCoinDataApi~v1userexchangebankcoinaddressesCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TradeAddressDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Exchange Coin Addresses
     * Gets a List of Users Exchange Bitcoin Deposit Addresses.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankCoinDataApi~v1userexchangebankcoinaddressesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/TradeAddressDataResponse}
     */
    this.v1userexchangebankcoinaddresses = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1userexchangebankcoinaddresses";
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
      var returnType = TradeAddressDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/bank/coin/addresses', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankcoinbalanceavailable operation.
     * @callback module:api/ExchangeBankCoinDataApi~v1userexchangebankcoinbalanceavailableCallback
     * @param {String} error Error message, if any.
     * @param {module:model/VolDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Available Exchange Coin Balance
     * Returns balance which is in Available for Trades. The response is in satoshis.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankCoinDataApi~v1userexchangebankcoinbalanceavailableCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/VolDataResponse}
     */
    this.v1userexchangebankcoinbalanceavailable = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1userexchangebankcoinbalanceavailable";
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
      var returnType = VolDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/bank/coin/balance/total', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankcoinbalancepending operation.
     * @callback module:api/ExchangeBankCoinDataApi~v1userexchangebankcoinbalancependingCallback
     * @param {String} error Error message, if any.
     * @param {module:model/VolDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * In Trade Coin Balance
     * Returns in-trade or pending coin balance in satoshi.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankCoinDataApi~v1userexchangebankcoinbalancependingCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/VolDataResponse}
     */
    this.v1userexchangebankcoinbalancepending = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1userexchangebankcoinbalancepending";
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
      var returnType = VolDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/bank/coin/balance/pending', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankcoinbalancetotal operation.
     * @callback module:api/ExchangeBankCoinDataApi~v1userexchangebankcoinbalancetotalCallback
     * @param {String} error Error message, if any.
     * @param {module:model/VolDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Total Exchange Coin Balance
     * Returns users total coin balance in satoshis. Pending + Available
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankCoinDataApi~v1userexchangebankcoinbalancetotalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/VolDataResponse}
     */
    this.v1userexchangebankcoinbalancetotal = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1userexchangebankcoinbalancetotal";
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
      var returnType = VolDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/bank/coin/balance/available', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankcoindepositcancelled operation.
     * @callback module:api/ExchangeBankCoinDataApi~v1userexchangebankcoindepositcancelledCallback
     * @param {String} error Error message, if any.
     * @param {module:model/CoinDepDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancelled Exchange Coin Deposits
     * Gets a List of Cancelled Exchange Coin Deposits. The value and fees are in paisa.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {Integer} opts.from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (default to 0)
     * @param {Integer} opts.to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (default to 9223372036854776000)
     * @param {Integer} opts.max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (default to 10)
     * @param {Integer} opts.offset Offset defaults to 0 if input is invalid. (Optional) (default to 0)
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankCoinDataApi~v1userexchangebankcoindepositcancelledCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/CoinDepDataResponse}
     */
    this.v1userexchangebankcoindepositcancelled = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1userexchangebankcoindepositcancelled";
      }


      var pathParams = {
      };
      var queryParams = {
        'from': opts['from'],
        'to': opts['to'],
        'max': opts['max'],
        'offset': opts['offset']
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
      var returnType = CoinDepDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/bank/coin/deposit/cancelled', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankcoindepositunverified operation.
     * @callback module:api/ExchangeBankCoinDataApi~v1userexchangebankcoindepositunverifiedCallback
     * @param {String} error Error message, if any.
     * @param {module:model/CoinDepDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Unverified Exchange Coin Deposits
     * Gets a List of Unverified Exchange Coin Deposits. The value and fees are in paisa.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {Integer} opts.from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (default to 0)
     * @param {Integer} opts.to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (default to 9223372036854776000)
     * @param {Integer} opts.max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (default to 10)
     * @param {Integer} opts.offset Offset defaults to 0 if input is invalid. (Optional) (default to 0)
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankCoinDataApi~v1userexchangebankcoindepositunverifiedCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/CoinDepDataResponse}
     */
    this.v1userexchangebankcoindepositunverified = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1userexchangebankcoindepositunverified";
      }


      var pathParams = {
      };
      var queryParams = {
        'from': opts['from'],
        'to': opts['to'],
        'max': opts['max'],
        'offset': opts['offset']
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
      var returnType = CoinDepDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/bank/coin/deposit/unverified', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankcoindepositverified operation.
     * @callback module:api/ExchangeBankCoinDataApi~v1userexchangebankcoindepositverifiedCallback
     * @param {String} error Error message, if any.
     * @param {module:model/CoinDepDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Verified Exchange Coin Deposits
     * Gets a List of Verified Exchange Coin Deposits. The value and fees are in paisa.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {Integer} opts.from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (default to 0)
     * @param {Integer} opts.to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (default to 9223372036854776000)
     * @param {Integer} opts.max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (default to 10)
     * @param {Integer} opts.offset Offset defaults to 0 if input is invalid. (Optional) (default to 0)
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankCoinDataApi~v1userexchangebankcoindepositverifiedCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/CoinDepDataResponse}
     */
    this.v1userexchangebankcoindepositverified = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1userexchangebankcoindepositverified";
      }


      var pathParams = {
      };
      var queryParams = {
        'from': opts['from'],
        'to': opts['to'],
        'max': opts['max'],
        'offset': opts['offset']
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
      var returnType = CoinDepDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/bank/coin/deposit/verified', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankcoinwithdrawcancelled operation.
     * @callback module:api/ExchangeBankCoinDataApi~v1userexchangebankcoinwithdrawcancelledCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TradeCoinWithdrawDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancelled Exchange Coin Withdrawals
     * Gets a List of Cancelled Coin Withdrawals. The value and fees are in satoshis.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {Integer} opts.from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (default to 0)
     * @param {Integer} opts.to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (default to 9223372036854776000)
     * @param {Integer} opts.max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (default to 10)
     * @param {Integer} opts.offset Offset defaults to 0 if input is invalid. (Optional) (default to 0)
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankCoinDataApi~v1userexchangebankcoinwithdrawcancelledCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/TradeCoinWithdrawDataResponse}
     */
    this.v1userexchangebankcoinwithdrawcancelled = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1userexchangebankcoinwithdrawcancelled";
      }


      var pathParams = {
      };
      var queryParams = {
        'from': opts['from'],
        'to': opts['to'],
        'max': opts['max'],
        'offset': opts['offset']
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
      var returnType = TradeCoinWithdrawDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/bank/coin/withdraw/cancelled', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankcoinwithdrawcompleted operation.
     * @callback module:api/ExchangeBankCoinDataApi~v1userexchangebankcoinwithdrawcompletedCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TradeCoinWithdrawDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Completed Exchange Coin Withdrawals
     * Gets a List of Completed Coin Withdrawals. The value and fees are in satoshis.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {Integer} opts.from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (default to 0)
     * @param {Integer} opts.to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (default to 9223372036854776000)
     * @param {Integer} opts.max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (default to 10)
     * @param {Integer} opts.offset Offset defaults to 0 if input is invalid. (Optional) (default to 0)
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankCoinDataApi~v1userexchangebankcoinwithdrawcompletedCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/TradeCoinWithdrawDataResponse}
     */
    this.v1userexchangebankcoinwithdrawcompleted = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1userexchangebankcoinwithdrawcompleted";
      }


      var pathParams = {
      };
      var queryParams = {
        'from': opts['from'],
        'to': opts['to'],
        'max': opts['max'],
        'offset': opts['offset']
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
      var returnType = TradeCoinWithdrawDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/bank/coin/withdraw/completed', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankcoinwithdrawunverified operation.
     * @callback module:api/ExchangeBankCoinDataApi~v1userexchangebankcoinwithdrawunverifiedCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TradeCoinWithdrawDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Unverified Exchange Coin Withdrawals
     * Gets a List of Unverified Exchange Coin Withdrawals. The value and fees are in satoshis.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {Integer} opts.from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (default to 0)
     * @param {Integer} opts.to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (default to 9223372036854776000)
     * @param {Integer} opts.max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (default to 10)
     * @param {Integer} opts.offset Offset defaults to 0 if input is invalid. (Optional) (default to 0)
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankCoinDataApi~v1userexchangebankcoinwithdrawunverifiedCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/TradeCoinWithdrawDataResponse}
     */
    this.v1userexchangebankcoinwithdrawunverified = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1userexchangebankcoinwithdrawunverified";
      }


      var pathParams = {
      };
      var queryParams = {
        'from': opts['from'],
        'to': opts['to'],
        'max': opts['max'],
        'offset': opts['offset']
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
      var returnType = TradeCoinWithdrawDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/bank/coin/withdraw/unverified', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankcoinwithdrawverified operation.
     * @callback module:api/ExchangeBankCoinDataApi~v1userexchangebankcoinwithdrawverifiedCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TradeCoinWithdrawDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Verified Exchange Coin Withdrawals
     * Gets a List of Verified Exchange Coin Withdrawals. The value and fees are in satoshis.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {Integer} opts.from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (default to 0)
     * @param {Integer} opts.to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (default to 9223372036854776000)
     * @param {Integer} opts.max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (default to 10)
     * @param {Integer} opts.offset Offset defaults to 0 if input is invalid. (Optional) (default to 0)
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankCoinDataApi~v1userexchangebankcoinwithdrawverifiedCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/TradeCoinWithdrawDataResponse}
     */
    this.v1userexchangebankcoinwithdrawverified = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1userexchangebankcoinwithdrawverified";
      }


      var pathParams = {
      };
      var queryParams = {
        'from': opts['from'],
        'to': opts['to'],
        'max': opts['max'],
        'offset': opts['offset']
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
      var returnType = TradeCoinWithdrawDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/bank/coin/withdraw/verified', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
