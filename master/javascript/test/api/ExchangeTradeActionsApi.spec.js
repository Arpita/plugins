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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.CoinsecureApiDocumentation);
  }
}(this, function(expect, CoinsecureApiDocumentation) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new CoinsecureApiDocumentation.ExchangeTradeActionsApi();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('ExchangeTradeActionsApi', function() {
    describe('v1userexchangeaskcancelOrderID', function() {
      it('should call v1userexchangeaskcancelOrderID successfully', function(done) {
        //uncomment below and update the code to test v1userexchangeaskcancelOrderID
        //instance.v1userexchangeaskcancelOrderID(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('v1userexchangeasknew', function() {
      it('should call v1userexchangeasknew successfully', function(done) {
        //uncomment below and update the code to test v1userexchangeasknew
        //instance.v1userexchangeasknew(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('v1userexchangebidcancelOrderID', function() {
      it('should call v1userexchangebidcancelOrderID successfully', function(done) {
        //uncomment below and update the code to test v1userexchangebidcancelOrderID
        //instance.v1userexchangebidcancelOrderID(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('v1userexchangebidnew', function() {
      it('should call v1userexchangebidnew successfully', function(done) {
        //uncomment below and update the code to test v1userexchangebidnew
        //instance.v1userexchangebidnew(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('v1userexchangeinstantbuy', function() {
      it('should call v1userexchangeinstantbuy successfully', function(done) {
        //uncomment below and update the code to test v1userexchangeinstantbuy
        //instance.v1userexchangeinstantbuy(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('v1userexchangeinstantsell', function() {
      it('should call v1userexchangeinstantsell successfully', function(done) {
        //uncomment below and update the code to test v1userexchangeinstantsell
        //instance.v1userexchangeinstantsell(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
