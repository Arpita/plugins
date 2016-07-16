(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/WalletAddressDataResponse', 'model/FailResult', 'model/WalletsDataResponse', 'model/WalletCoinWithdrawDataResponse'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/WalletAddressDataResponse'), require('../model/FailResult'), require('../model/WalletsDataResponse'), require('../model/WalletCoinWithdrawDataResponse'));
  } else {
    // Browser globals (root is window)
    if (!root.CoinsecureApiDocumentation) {
      root.CoinsecureApiDocumentation = {};
    }
    root.CoinsecureApiDocumentation.WalletDataApi = factory(root.CoinsecureApiDocumentation.ApiClient, root.CoinsecureApiDocumentation.WalletAddressDataResponse, root.CoinsecureApiDocumentation.FailResult, root.CoinsecureApiDocumentation.WalletsDataResponse, root.CoinsecureApiDocumentation.WalletCoinWithdrawDataResponse);
  }
}(this, function(ApiClient, WalletAddressDataResponse, FailResult, WalletsDataResponse, WalletCoinWithdrawDataResponse) {
  'use strict';

  /**
   * WalletData service.
   * @module api/WalletDataApi
   * @version 1.0b
   */

  /**
   * Constructs a new WalletDataApi. 
   * @alias module:api/WalletDataApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the v1userwalletcoinaddressWalletID operation.
     * @callback module:api/WalletDataApi~v1userwalletcoinaddressWalletIDCallback
     * @param {String} error Error message, if any.
     * @param {module:model/WalletAddressDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Wallet Bitcoin Addresses
     * Gets a List of Users Bitcoin Deposit Addresses.
     * @param {String} walletID 
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization API object to be added
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/WalletDataApi~v1userwalletcoinaddressWalletIDCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/WalletAddressDataResponse}
     */
    this.v1userwalletcoinaddressWalletID = function(walletID, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'walletID' is set
      if (walletID == undefined || walletID == null) {
        throw "Missing the required parameter 'walletID' when calling v1userwalletcoinaddressWalletID";
      }


      var pathParams = {
        'walletID': walletID
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
      var returnType = WalletAddressDataResponse;

      return this.apiClient.callApi(
        '/v1/user/wallet/coin/address/{walletID}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userwalletcoindepositconfirmedWalletID operation.
     * @callback module:api/WalletDataApi~v1userwalletcoindepositconfirmedWalletIDCallback
     * @param {String} error Error message, if any.
     * @param {module:model/WalletAddressDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Confirmed Wallet Transactions
     * Gets your Confirmed Wallet Bitcoin Transactions.
     * @param {String} walletID 
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization API object to be added
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/WalletDataApi~v1userwalletcoindepositconfirmedWalletIDCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/WalletAddressDataResponse}
     */
    this.v1userwalletcoindepositconfirmedWalletID = function(walletID, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'walletID' is set
      if (walletID == undefined || walletID == null) {
        throw "Missing the required parameter 'walletID' when calling v1userwalletcoindepositconfirmedWalletID";
      }


      var pathParams = {
        'walletID': walletID
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
      var returnType = WalletAddressDataResponse;

      return this.apiClient.callApi(
        '/v1/user/wallet/coin/deposit/confirmed/{walletID}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userwalletcoindepositconfirmedall operation.
     * @callback module:api/WalletDataApi~v1userwalletcoindepositconfirmedallCallback
     * @param {String} error Error message, if any.
     * @param {module:model/WalletAddressDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Confirmed Wallet Deposit
     * Gets the total confirmed transactions across all accounts and addresses
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization API object to be added
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/WalletDataApi~v1userwalletcoindepositconfirmedallCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/WalletAddressDataResponse}
     */
    this.v1userwalletcoindepositconfirmedall = function(opts, callback) {
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
      var returnType = WalletAddressDataResponse;

      return this.apiClient.callApi(
        '/v1/user/wallet/coin/deposit/confirmed/all', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userwalletcoindepositunconfirmedWalletID operation.
     * @callback module:api/WalletDataApi~v1userwalletcoindepositunconfirmedWalletIDCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Unconfirmed Transactions in Wallet
     * Gets the unconfirmed transactions on an account/ wallet.
     * @param {String} walletID 
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/WalletDataApi~v1userwalletcoindepositunconfirmedWalletIDCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.v1userwalletcoindepositunconfirmedWalletID = function(walletID, authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'walletID' is set
      if (walletID == undefined || walletID == null) {
        throw "Missing the required parameter 'walletID' when calling v1userwalletcoindepositunconfirmedWalletID";
      }

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1userwalletcoindepositunconfirmedWalletID";
      }


      var pathParams = {
        'walletID': walletID
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
      var returnType = null;

      return this.apiClient.callApi(
        '/v1/user/wallet/coin/deposit/unconfirmed/{walletID}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userwalletcoindepositunconfirmedall operation.
     * @callback module:api/WalletDataApi~v1userwalletcoindepositunconfirmedallCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * All Unconfirmed Deposits
     * Gets the total unconfirmed transactions across all accounts and addresses
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization API object to be added
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/WalletDataApi~v1userwalletcoindepositunconfirmedallCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.v1userwalletcoindepositunconfirmedall = function(opts, callback) {
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
      var returnType = null;

      return this.apiClient.callApi(
        '/v1/user/wallet/coin/deposit/unconfirmed/all', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1userwalletcoinwallets operation.
     * @callback module:api/WalletDataApi~v1userwalletcoinwalletsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/WalletsDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Wallet Details
     * Gets a List of Users Wallets.
     * @param {Object} opts Optional parameters
     * @param {String} opts.authorization API object to be added
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/WalletDataApi~v1userwalletcoinwalletsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/WalletsDataResponse}
     */
    this.v1userwalletcoinwallets = function(opts, callback) {
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
      var returnType = WalletsDataResponse;

      return this.apiClient.callApi(
        '/v1/user/wallet/coin/wallets', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1walletwithdrawcancelled operation.
     * @callback module:api/WalletDataApi~v1walletwithdrawcancelledCallback
     * @param {String} error Error message, if any.
     * @param {module:model/WalletCoinWithdrawDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Cancelled Coin Withdrawals
     * Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/WalletDataApi~v1walletwithdrawcancelledCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/WalletCoinWithdrawDataResponse}
     */
    this.v1walletwithdrawcancelled = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1walletwithdrawcancelled";
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
      var returnType = WalletCoinWithdrawDataResponse;

      return this.apiClient.callApi(
        '/v1/wallet/coin/withdraw/cancelled', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1walletwithdrawcompleted operation.
     * @callback module:api/WalletDataApi~v1walletwithdrawcompletedCallback
     * @param {String} error Error message, if any.
     * @param {module:model/WalletCoinWithdrawDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Completed Coin Withdrawals
     * Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/WalletDataApi~v1walletwithdrawcompletedCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/WalletCoinWithdrawDataResponse}
     */
    this.v1walletwithdrawcompleted = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1walletwithdrawcompleted";
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
      var returnType = WalletCoinWithdrawDataResponse;

      return this.apiClient.callApi(
        '/v1/wallet/coin/withdraw/completed', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1walletwithdrawunverified operation.
     * @callback module:api/WalletDataApi~v1walletwithdrawunverifiedCallback
     * @param {String} error Error message, if any.
     * @param {module:model/WalletCoinWithdrawDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Unverified Coin Withdrawals
     * Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/WalletDataApi~v1walletwithdrawunverifiedCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/WalletCoinWithdrawDataResponse}
     */
    this.v1walletwithdrawunverified = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1walletwithdrawunverified";
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
      var returnType = WalletCoinWithdrawDataResponse;

      return this.apiClient.callApi(
        '/v1/wallet/coin/withdraw/unverified', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the v1walletwithdrawverified operation.
     * @callback module:api/WalletDataApi~v1walletwithdrawverifiedCallback
     * @param {String} error Error message, if any.
     * @param {module:model/WalletCoinWithdrawDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Verified Coin Withdrawals
     * Gets a List of Unverified Coin Withdrawals. The value and fees are in satoshis.
     * @param {String} authorization API object to be added
     * @param {Object} opts Optional parameters
     * @param {String} opts.accept JSON, XML or CSV can be returned (Optional)
     * @param {module:api/WalletDataApi~v1walletwithdrawverifiedCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {module:model/WalletCoinWithdrawDataResponse}
     */
    this.v1walletwithdrawverified = function(authorization, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'authorization' is set
      if (authorization == undefined || authorization == null) {
        throw "Missing the required parameter 'authorization' when calling v1walletwithdrawverified";
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
      var returnType = WalletCoinWithdrawDataResponse;

      return this.apiClient.callApi(
        '/v1/wallet/coin/withdraw/verified', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
