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


using NUnit.Framework;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using IO.Swagger.Api;
using IO.Swagger.Model;
using IO.Swagger.Client;
using System.Reflection;

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing TradeCoinWithdrawData
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the model.
    /// </remarks>
    [TestFixture]
    public class TradeCoinWithdrawDataTests
    {
        private TradeCoinWithdrawData instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new TradeCoinWithdrawData();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of TradeCoinWithdrawData
        /// </summary>
        [Test]
        public void TradeCoinWithdrawDataInstanceTest()
        {
            Assert.IsInstanceOf<TradeCoinWithdrawData> (instance, "instance is a TradeCoinWithdrawData");
        }

        /// <summary>
        /// Test the property 'TimeDetails'
        /// </summary>
        [Test]
        public void TimeDetailsTest()
        {
            // TODO: unit test for the property 'TimeDetails'
        }
        /// <summary>
        /// Test the property 'Address'
        /// </summary>
        [Test]
        public void AddressTest()
        {
            // TODO: unit test for the property 'Address'
        }
        /// <summary>
        /// Test the property 'Value'
        /// </summary>
        [Test]
        public void ValueTest()
        {
            // TODO: unit test for the property 'Value'
        }
        /// <summary>
        /// Test the property 'Fees'
        /// </summary>
        [Test]
        public void FeesTest()
        {
            // TODO: unit test for the property 'Fees'
        }
        /// <summary>
        /// Test the property 'WithdrawID'
        /// </summary>
        [Test]
        public void WithdrawIDTest()
        {
            // TODO: unit test for the property 'WithdrawID'
        }
        /// <summary>
        /// Test the property 'TxHash'
        /// </summary>
        [Test]
        public void TxHashTest()
        {
            // TODO: unit test for the property 'TxHash'
        }

    }

}
