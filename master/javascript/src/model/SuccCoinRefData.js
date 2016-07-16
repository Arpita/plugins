(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.CoinsecureApiDocumentation) {
      root.CoinsecureApiDocumentation = {};
    }
    root.CoinsecureApiDocumentation.SuccCoinRefData = factory(root.CoinsecureApiDocumentation.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The SuccCoinRefData model module.
   * @module model/SuccCoinRefData
   * @version 1.0b
   */

  /**
   * Constructs a new <code>SuccCoinRefData</code>.
   * @alias module:model/SuccCoinRefData
   * @class
   * @param refPercent
   * @param time
   * @param orderID
   * @param refID
   * @param tradeID
   * @param newUserIDMasked
   * @param depositID
   * @param amtPaid
   */
  var exports = function(refPercent, time, orderID, refID, tradeID, newUserIDMasked, depositID, amtPaid) {
    var _this = this;

    _this['refPercent'] = refPercent;
    _this['time'] = time;
    _this['orderID'] = orderID;
    _this['refID'] = refID;
    _this['tradeID'] = tradeID;
    _this['newUserIDMasked'] = newUserIDMasked;
    _this['depositID'] = depositID;
    _this['amtPaid'] = amtPaid;
  };

  /**
   * Constructs a <code>SuccCoinRefData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SuccCoinRefData} obj Optional instance to populate.
   * @return {module:model/SuccCoinRefData} The populated <code>SuccCoinRefData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('refPercent')) {
        obj['refPercent'] = ApiClient.convertToType(data['refPercent'], 'Number');
      }
      if (data.hasOwnProperty('time')) {
        obj['time'] = ApiClient.convertToType(data['time'], 'Integer');
      }
      if (data.hasOwnProperty('orderID')) {
        obj['orderID'] = ApiClient.convertToType(data['orderID'], 'String');
      }
      if (data.hasOwnProperty('refID')) {
        obj['refID'] = ApiClient.convertToType(data['refID'], 'String');
      }
      if (data.hasOwnProperty('tradeID')) {
        obj['tradeID'] = ApiClient.convertToType(data['tradeID'], 'String');
      }
      if (data.hasOwnProperty('newUserIDMasked')) {
        obj['newUserIDMasked'] = ApiClient.convertToType(data['newUserIDMasked'], 'String');
      }
      if (data.hasOwnProperty('depositID')) {
        obj['depositID'] = ApiClient.convertToType(data['depositID'], 'String');
      }
      if (data.hasOwnProperty('amtPaid')) {
        obj['amtPaid'] = ApiClient.convertToType(data['amtPaid'], 'Integer');
      }
    }
    return obj;
  }

  /**
   * @member {Number} refPercent
   */
  exports.prototype['refPercent'] = undefined;
  /**
   * @member {Integer} time
   */
  exports.prototype['time'] = undefined;
  /**
   * @member {String} orderID
   */
  exports.prototype['orderID'] = undefined;
  /**
   * @member {String} refID
   */
  exports.prototype['refID'] = undefined;
  /**
   * @member {String} tradeID
   */
  exports.prototype['tradeID'] = undefined;
  /**
   * @member {String} newUserIDMasked
   */
  exports.prototype['newUserIDMasked'] = undefined;
  /**
   * @member {String} depositID
   */
  exports.prototype['depositID'] = undefined;
  /**
   * @member {Integer} amtPaid
   */
  exports.prototype['amtPaid'] = undefined;




  return exports;
}));


