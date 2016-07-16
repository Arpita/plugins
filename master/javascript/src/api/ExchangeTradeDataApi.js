(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/RateDataResponse', 'model/FailResult', 'model/RateVolDataResponse', 'model/LastTradeDataResponse', 'model/RateDiffDataResponse', 'model/StandardTickerResultData', 'model/OrderDataResponse'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/RateDataResponse'), require('../model/FailResult'), require('../model/RateVolDataResponse'), require('../model/LastTradeDataResponse'), require('../model/RateDiffDataResponse'), require('../model/StandardTickerResultData'), require('../model/OrderDataResponse'));
  } else {
    // Browser globals (root is window)
    if (!root.CoinsecureApiDocumentation) {
      root.CoinsecureApiDocumentation = {};
    }
    root.CoinsecureApiDocumentation.ExchangeTradeDataApi = factory(root.CoinsecureApiDocumentation.ApiClient, root.CoinsecureApiDocumentation.RateDataResponse, root.CoinsecureApiDocumentation.FailResult, root.CoinsecureApiDocumentation.RateVolDataResponse, root.CoinsecureApiDocumentation.LastTradeDataResponse, root.CoinsecureApiDocumentation.RateDiffDataResponse, root.CoinsecureApiDocumentation.StandardTickerResultData, root.CoinsecureApiDocumentation.OrderDataResponse);
  }
}(this, function(ApiClient, RateDataResponse, FailResult, RateVolDataResponse, LastTradeDataResponse, RateDiffDataResponse, StandardTickerResultData, OrderDataResponse) {
  'use strict';

  /**
   * ExchangeTradeData service.
   * @module api/ExchangeTradeDataApi
   * @version 1.0b
   */

  /**
   * Constructs a new ExchangeTradeDataApi. 
   * @alias module:api/ExchangeTradeDataApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the v1exchangeasklow operation.
     * @callback module:api/ExchangeTradeDataApi~v1exchangeasklowCallback
     * @param {String} error Error message, if any.
     * @param {module:model/RateDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Lowest Ask
     * Returns the Lowest Ask Rate in Json. The Amount is in Paisa.
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeTradeDataApi~v1exchangeasklowCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/RateDataResponse}
     */
    this.v1exchangeasklow = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


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
      var returnType = RateDataResponse;

      return this.apiClient.callApi(
        '/v1/exchange/ask/low', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1exchangeaskorders operation.
     * @callback module:api/ExchangeTradeDataApi~v1exchangeaskordersCallback
     * @param {String} error Error message, if any.
     * @param {module:model/RateVolDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * All Sell Orders
     * Returns all Ask Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeTradeDataApi~v1exchangeaskordersCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/RateVolDataResponse}
     */
    this.v1exchangeaskorders = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


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
      var returnType = RateVolDataResponse;

      return this.apiClient.callApi(
        '/v1/exchange/ask/orders', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1exchangebidhigh operation.
     * @callback module:api/ExchangeTradeDataApi~v1exchangebidhighCallback
     * @param {String} error Error message, if any.
     * @param {module:model/RateDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Returns the Highest Bid in the Order Book
     * Highest Bid.
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeTradeDataApi~v1exchangebidhighCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/RateDataResponse}
     */
    this.v1exchangebidhigh = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


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
      var returnType = RateDataResponse;

      return this.apiClient.callApi(
        '/v1/exchange/bid/high', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1exchangebidorders operation.
     * @callback module:api/ExchangeTradeDataApi~v1exchangebidordersCallback
     * @param {String} error Error message, if any.
     * @param {module:model/RateVolDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * All Buy Orders
     * Returns all Bid Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeTradeDataApi~v1exchangebidordersCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/RateVolDataResponse}
     */
    this.v1exchangebidorders = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


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
      var returnType = RateVolDataResponse;

      return this.apiClient.callApi(
        '/v1/exchange/bid/orders', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1exchangelastTrade operation.
     * @callback module:api/ExchangeTradeDataApi~v1exchangelastTradeCallback
     * @param {String} error Error message, if any.
     * @param {module:model/LastTradeDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Last Trade
     * Returns a summary of data from the Exchange.
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeTradeDataApi~v1exchangelastTradeCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/LastTradeDataResponse}
     */
    this.v1exchangelastTrade = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


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
      var returnType = LastTradeDataResponse;

      return this.apiClient.callApi(
        '/v1/exchange/lastTrade', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1exchangemax24Hr operation.
     * @callback module:api/ExchangeTradeDataApi~v1exchangemax24HrCallback
     * @param {String} error Error message, if any.
     * @param {module:model/RateDiffDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Max 24 Hour Rate
     * Returns the highest rate over the last 24 hours with the 10 minutely difference. The values are in paisa.
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeTradeDataApi~v1exchangemax24HrCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/RateDiffDataResponse}
     */
    this.v1exchangemax24Hr = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


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
      var returnType = RateDiffDataResponse;

      return this.apiClient.callApi(
        '/v1/exchange/max24Hr', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1exchangemin24Hr operation.
     * @callback module:api/ExchangeTradeDataApi~v1exchangemin24HrCallback
     * @param {String} error Error message, if any.
     * @param {module:model/RateDiffDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Min 24 Hour Rate
     * Returns the lowest rate over the last 24 hours with the 10 minutely difference. The values are in paisa.
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeTradeDataApi~v1exchangemin24HrCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/RateDiffDataResponse}
     */
    this.v1exchangemin24Hr = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


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
      var returnType = RateDiffDataResponse;

      return this.apiClient.callApi(
        '/v1/exchange/min24Hr', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1exchangeticker operation.
     * @callback module:api/ExchangeTradeDataApi~v1exchangetickerCallback
     * @param {String} error Error message, if any.
     * @param {module:model/StandardTickerResultData} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Exchange Ticker
     * Returns a summary of data from the Exchange.
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeTradeDataApi~v1exchangetickerCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/StandardTickerResultData}
     */
    this.v1exchangeticker = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


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
      var returnType = StandardTickerResultData;

      return this.apiClient.callApi(
        '/v1/exchange/ticker', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangeaskcancelled operation.
     * @callback module:api/ExchangeTradeDataApi~v1userexchangeaskcancelledCallback
     * @param {String} error Error message, if any.
     * @param {module:model/OrderDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancelled User Sell Orders
     * Returns all Cancelled User Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeTradeDataApi~v1userexchangeaskcancelledCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/OrderDataResponse}
     */
    this.v1userexchangeaskcancelled = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1userexchangeaskcancelled";
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
      var returnType = OrderDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/ask/cancelled', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangeaskcompleted operation.
     * @callback module:api/ExchangeTradeDataApi~v1userexchangeaskcompletedCallback
     * @param {String} error Error message, if any.
     * @param {module:model/OrderDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Completed User Sell Orders
     * Returns all completed Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {Integer} opts.from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (default to 0)
     * @param {Integer} opts.to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (default to 9223372036854776000)
     * @param {Integer} opts.max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (default to 10)
     * @param {Integer} opts.offset Offset defaults to 0 if input is invalid. (Optional) (default to 0)
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeTradeDataApi~v1userexchangeaskcompletedCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/OrderDataResponse}
     */
    this.v1userexchangeaskcompleted = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1userexchangeaskcompleted";
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
      var returnType = OrderDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/ask/completed', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangeaskpending operation.
     * @callback module:api/ExchangeTradeDataApi~v1userexchangeaskpendingCallback
     * @param {String} error Error message, if any.
     * @param {module:model/OrderDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Pending User Sell Orders
     * Returns all Open User Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeTradeDataApi~v1userexchangeaskpendingCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/OrderDataResponse}
     */
    this.v1userexchangeaskpending = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1userexchangeaskpending";
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
      var returnType = OrderDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/ask/pending', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebidcancelled operation.
     * @callback module:api/ExchangeTradeDataApi~v1userexchangebidcancelledCallback
     * @param {String} error Error message, if any.
     * @param {module:model/OrderDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancelled User Buy Orders
     * Returns all Cancelled User Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeTradeDataApi~v1userexchangebidcancelledCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/OrderDataResponse}
     */
    this.v1userexchangebidcancelled = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1userexchangebidcancelled";
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
      var returnType = OrderDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/bid/cancelled', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebidcompleted operation.
     * @callback module:api/ExchangeTradeDataApi~v1userexchangebidcompletedCallback
     * @param {String} error Error message, if any.
     * @param {module:model/OrderDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Completed User Buy Orders
     * Returns all completed Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeTradeDataApi~v1userexchangebidcompletedCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/OrderDataResponse}
     */
    this.v1userexchangebidcompleted = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1userexchangebidcompleted";
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
      var returnType = OrderDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/bid/completed', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userexchangebidpending operation.
     * @callback module:api/ExchangeTradeDataApi~v1userexchangebidpendingCallback
     * @param {String} error Error message, if any.
     * @param {module:model/OrderDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Pending User Buy Orders
     * Returns all Open User Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/ExchangeTradeDataApi~v1userexchangebidpendingCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/OrderDataResponse}
     */
    this.v1userexchangebidpending = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1userexchangebidpending";
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
      var returnType = OrderDataResponse;

      return this.apiClient.callApi(
        '/v1/user/exchange/bid/pending', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
