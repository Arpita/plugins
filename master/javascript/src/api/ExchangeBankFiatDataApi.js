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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/FiatBankDataResponse', 'model/FailResult', 'model/RateDataResponse', 'model/FiatDepDataResponse', 'model/FiatWithDataResponse'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/FiatBankDataResponse'), require('../model/FailResult'), require('../model/RateDataResponse'), require('../model/FiatDepDataResponse'), require('../model/FiatWithDataResponse'));
  } else {
    // Browser globals (root is window)
    if (!root.CoinsecureApiDocumentation) {
      root.CoinsecureApiDocumentation = {};
    }
    root.CoinsecureApiDocumentation.ExchangeBankFiatDataApi = factory(root.CoinsecureApiDocumentation.ApiClient, root.CoinsecureApiDocumentation.FiatBankDataResponse, root.CoinsecureApiDocumentation.FailResult, root.CoinsecureApiDocumentation.RateDataResponse, root.CoinsecureApiDocumentation.FiatDepDataResponse, root.CoinsecureApiDocumentation.FiatWithDataResponse);
  }
}(this, function(ApiClient, FiatBankDataResponse, FailResult, RateDataResponse, FiatDepDataResponse, FiatWithDataResponse) {
  'use strict';

  /**
   * ExchangeBankFiatData service.
   * @module api/ExchangeBankFiatDataApi
   * @version beta
   */

  /**
   * Constructs a new ExchangeBankFiatDataApi. 
   * @alias module:api/ExchangeBankFiatDataApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the v1userexchangebankfiataccounts operation.
     * @callback module:api/ExchangeBankFiatDataApi~v1userexchangebankfiataccountsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/FiatBankDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Exchange Bitcoin Deposit Addresses
     * Gets a List of Users Exchange Bitcoin Addresses.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankFiatDataApi~v1userexchangebankfiataccountsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/FiatBankDataResponse}
     */
    this.v1userexchangebankfiataccounts = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling v1userexchangebankfiataccounts");
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
      var returnType = FiatBankDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/bank/fiat/accounts', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankfiatbalanceavailable operation.
     * @callback module:api/ExchangeBankFiatDataApi~v1userexchangebankfiatbalanceavailableCallback
     * @param {String} error Error message, if any.
     * @param {module:model/RateDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Available Exchange Fiat Balance
     * Returns balance which is in Available for Trades. The response is in paisa.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankFiatDataApi~v1userexchangebankfiatbalanceavailableCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/RateDataResponse}
     */
    this.v1userexchangebankfiatbalanceavailable = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling v1userexchangebankfiatbalanceavailable");
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
      var returnType = RateDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/bank/fiat/balance/total', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankfiatbalancepending operation.
     * @callback module:api/ExchangeBankFiatDataApi~v1userexchangebankfiatbalancependingCallback
     * @param {String} error Error message, if any.
     * @param {module:model/RateDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * In Trade Coin Balance
     * Returns in-trade or pending fiat balance in paisa.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankFiatDataApi~v1userexchangebankfiatbalancependingCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/RateDataResponse}
     */
    this.v1userexchangebankfiatbalancepending = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling v1userexchangebankfiatbalancepending");
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
      var returnType = RateDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/bank/fiat/balance/pending', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankfiatbalancetotal operation.
     * @callback module:api/ExchangeBankFiatDataApi~v1userexchangebankfiatbalancetotalCallback
     * @param {String} error Error message, if any.
     * @param {module:model/RateDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Total Exchange Fiat Balance
     * Returns users total fiat balance in paisa. Pending + Available
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankFiatDataApi~v1userexchangebankfiatbalancetotalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/RateDataResponse}
     */
    this.v1userexchangebankfiatbalancetotal = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling v1userexchangebankfiatbalancetotal");
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
      var returnType = RateDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/bank/fiat/balance/available', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankfiatdepositcancelled operation.
     * @callback module:api/ExchangeBankFiatDataApi~v1userexchangebankfiatdepositcancelledCallback
     * @param {String} error Error message, if any.
     * @param {module:model/FiatDepDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancelled Exchange Fiat Deposits
     * Gets a List of Cancelled Exchange Fiat Deposits. The value and fees are in paisa.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {Number} opts.from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (default to 0)
     * @param {Number} opts.to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (default to 9223372036854776000)
     * @param {Number} opts.max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (default to 10)
     * @param {Number} opts.offset Offset defaults to 0 if input is invalid. (Optional) (default to 0)
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankFiatDataApi~v1userexchangebankfiatdepositcancelledCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/FiatDepDataResponse}
     */
    this.v1userexchangebankfiatdepositcancelled = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling v1userexchangebankfiatdepositcancelled");
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
      var returnType = FiatDepDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/bank/fiat/deposit/cancelled', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankfiatdepositunverified operation.
     * @callback module:api/ExchangeBankFiatDataApi~v1userexchangebankfiatdepositunverifiedCallback
     * @param {String} error Error message, if any.
     * @param {module:model/FiatDepDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Unverified Exchange Fiat Deposits
     * Gets a List of Unverified Exchange Fiat Deposits. The value and fees are in paisa.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {Number} opts.from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (default to 0)
     * @param {Number} opts.to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (default to 9223372036854776000)
     * @param {Number} opts.max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (default to 10)
     * @param {Number} opts.offset Offset defaults to 0 if input is invalid. (Optional) (default to 0)
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankFiatDataApi~v1userexchangebankfiatdepositunverifiedCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/FiatDepDataResponse}
     */
    this.v1userexchangebankfiatdepositunverified = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling v1userexchangebankfiatdepositunverified");
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
      var returnType = FiatDepDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/bank/fiat/deposit/unverified', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankfiatdepositverified operation.
     * @callback module:api/ExchangeBankFiatDataApi~v1userexchangebankfiatdepositverifiedCallback
     * @param {String} error Error message, if any.
     * @param {module:model/FiatDepDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Verified Exchange Fiat Deposits
     * Gets a List of Verified Exchange Fiat Deposits. The value and fees are in paisa.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {Number} opts.from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (default to 0)
     * @param {Number} opts.to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (default to 9223372036854776000)
     * @param {Number} opts.max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (default to 10)
     * @param {Number} opts.offset Offset defaults to 0 if input is invalid. (Optional) (default to 0)
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankFiatDataApi~v1userexchangebankfiatdepositverifiedCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/FiatDepDataResponse}
     */
    this.v1userexchangebankfiatdepositverified = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling v1userexchangebankfiatdepositverified");
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
      var returnType = FiatDepDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/bank/fiat/deposit/verified', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankfiatwithdrawcancelled operation.
     * @callback module:api/ExchangeBankFiatDataApi~v1userexchangebankfiatwithdrawcancelledCallback
     * @param {String} error Error message, if any.
     * @param {module:model/FiatWithDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancelled Exchange Fiat Withdrawals
     * Gets a List of Cancelled Exchange Fiat Withdrawals. The fiat value is in paisa.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {Number} opts.from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (default to 0)
     * @param {Number} opts.to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (default to 9223372036854776000)
     * @param {Number} opts.max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (default to 10)
     * @param {Number} opts.offset Offset defaults to 0 if input is invalid. (Optional) (default to 0)
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankFiatDataApi~v1userexchangebankfiatwithdrawcancelledCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/FiatWithDataResponse}
     */
    this.v1userexchangebankfiatwithdrawcancelled = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling v1userexchangebankfiatwithdrawcancelled");
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
      var returnType = FiatWithDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/bank/fiat/withdraw/cancelled', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankfiatwithdrawcompleted operation.
     * @callback module:api/ExchangeBankFiatDataApi~v1userexchangebankfiatwithdrawcompletedCallback
     * @param {String} error Error message, if any.
     * @param {module:model/FiatWithDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Completed Exchange Fiat Withdrawals
     * Gets a List of Completed Exchange Fiat Withdrawals. The fiat value is in paisa.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {Number} opts.from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (default to 0)
     * @param {Number} opts.to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (default to 9223372036854776000)
     * @param {Number} opts.max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (default to 10)
     * @param {Number} opts.offset Offset defaults to 0 if input is invalid. (Optional) (default to 0)
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankFiatDataApi~v1userexchangebankfiatwithdrawcompletedCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/FiatWithDataResponse}
     */
    this.v1userexchangebankfiatwithdrawcompleted = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling v1userexchangebankfiatwithdrawcompleted");
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
      var returnType = FiatWithDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/bank/fiat/withdraw/completed', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankfiatwithdrawunverified operation.
     * @callback module:api/ExchangeBankFiatDataApi~v1userexchangebankfiatwithdrawunverifiedCallback
     * @param {String} error Error message, if any.
     * @param {module:model/FiatWithDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Unverified Exchange Fiat Withdrawals
     * Gets a List of Unverified Exchange Fiat Withdrawals. The fiat value is in paisa.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {Number} opts.from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (default to 0)
     * @param {Number} opts.to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (default to 9223372036854776000)
     * @param {Number} opts.max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (default to 10)
     * @param {Number} opts.offset Offset defaults to 0 if input is invalid. (Optional) (default to 0)
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankFiatDataApi~v1userexchangebankfiatwithdrawunverifiedCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/FiatWithDataResponse}
     */
    this.v1userexchangebankfiatwithdrawunverified = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling v1userexchangebankfiatwithdrawunverified");
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
      var returnType = FiatWithDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/bank/fiat/withdraw/unverified', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebankfiatwithdrawverified operation.
     * @callback module:api/ExchangeBankFiatDataApi~v1userexchangebankfiatwithdrawverifiedCallback
     * @param {String} error Error message, if any.
     * @param {module:model/FiatWithDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Verified Exchange Fiat Withdrawals
     * Gets a List of Verified Exchange Fiat Withdrawals. The fiat value is in paisa.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {Number} opts.from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (default to 0)
     * @param {Number} opts.to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (default to 9223372036854776000)
     * @param {Number} opts.max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (default to 10)
     * @param {Number} opts.offset Offset defaults to 0 if input is invalid. (Optional) (default to 0)
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeBankFiatDataApi~v1userexchangebankfiatwithdrawverifiedCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/FiatWithDataResponse}
     */
    this.v1userexchangebankfiatwithdrawverified = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw new Error("Missing the required parameter 'authorization' when calling v1userexchangebankfiatwithdrawverified");
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
      var returnType = FiatWithDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/bank/fiat/withdraw/verified', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
