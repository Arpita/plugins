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

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using IO.Swagger.Client;
using IO.Swagger.Api;
using IO.Swagger.Model;

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing SecurityActionsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class SecurityActionsApiTests
    {
        private SecurityActionsApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new SecurityActionsApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of SecurityActionsApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            Assert.IsInstanceOf<SecurityActionsApi> (instance, "instance is a SecurityActionsApi");
        }

        
        /// <summary>
        /// Test V1mfaauthyinitiate
        /// </summary>
        [Test]
        public void V1mfaauthyinitiateTest()
        {
            // TODO: add unit test for the method 'V1mfaauthyinitiate'
            MethodCountryMobile body = null; // TODO: replace null with proper value
            string authorization = null; // TODO: replace null with proper value
            string accept = null; // TODO: replace null with proper value
            var response = instance.V1mfaauthyinitiate(body, authorization, accept);
            Assert.IsInstanceOf<SuccessResult> (response, "response is SuccessResult");
        }
        
        /// <summary>
        /// Test V1mfagainitiate
        /// </summary>
        [Test]
        public void V1mfagainitiateTest()
        {
            // TODO: add unit test for the method 'V1mfagainitiate'
            MethodCountryMobile body = null; // TODO: replace null with proper value
            string authorization = null; // TODO: replace null with proper value
            string accept = null; // TODO: replace null with proper value
            var response = instance.V1mfagainitiate(body, authorization, accept);
            Assert.IsInstanceOf<SuccessResult> (response, "response is SuccessResult");
        }
        
        /// <summary>
        /// Test V1usermfaauthycall
        /// </summary>
        [Test]
        public void V1usermfaauthycallTest()
        {
            // TODO: add unit test for the method 'V1usermfaauthycall'
            string authorization = null; // TODO: replace null with proper value
            string accept = null; // TODO: replace null with proper value
            var response = instance.V1usermfaauthycall(authorization, accept);
            Assert.IsInstanceOf<SuccessResult> (response, "response is SuccessResult");
        }
        
        /// <summary>
        /// Test V1usermfaauthydisable
        /// </summary>
        [Test]
        public void V1usermfaauthydisableTest()
        {
            // TODO: add unit test for the method 'V1usermfaauthydisable'
            Code body = null; // TODO: replace null with proper value
            string authorization = null; // TODO: replace null with proper value
            string accept = null; // TODO: replace null with proper value
            var response = instance.V1usermfaauthydisable(body, authorization, accept);
            Assert.IsInstanceOf<SuccessResult> (response, "response is SuccessResult");
        }
        
        /// <summary>
        /// Test V1usermfaauthyinitiateenable
        /// </summary>
        [Test]
        public void V1usermfaauthyinitiateenableTest()
        {
            // TODO: add unit test for the method 'V1usermfaauthyinitiateenable'
            CodeCountryMobile body = null; // TODO: replace null with proper value
            string authorization = null; // TODO: replace null with proper value
            string accept = null; // TODO: replace null with proper value
            var response = instance.V1usermfaauthyinitiateenable(body, authorization, accept);
            Assert.IsInstanceOf<SuccessResult> (response, "response is SuccessResult");
        }
        
        /// <summary>
        /// Test V1usermfaauthysms
        /// </summary>
        [Test]
        public void V1usermfaauthysmsTest()
        {
            // TODO: add unit test for the method 'V1usermfaauthysms'
            string authorization = null; // TODO: replace null with proper value
            string accept = null; // TODO: replace null with proper value
            var response = instance.V1usermfaauthysms(authorization, accept);
            Assert.IsInstanceOf<SuccessResult> (response, "response is SuccessResult");
        }
        
        /// <summary>
        /// Test V1usermfagadisable
        /// </summary>
        [Test]
        public void V1usermfagadisableTest()
        {
            // TODO: add unit test for the method 'V1usermfagadisable'
            Code body = null; // TODO: replace null with proper value
            string authorization = null; // TODO: replace null with proper value
            string accept = null; // TODO: replace null with proper value
            var response = instance.V1usermfagadisable(body, authorization, accept);
            Assert.IsInstanceOf<SuccessResult> (response, "response is SuccessResult");
        }
        
        /// <summary>
        /// Test V1usermfagainitiateenable
        /// </summary>
        [Test]
        public void V1usermfagainitiateenableTest()
        {
            // TODO: add unit test for the method 'V1usermfagainitiateenable'
            CodeCountryMobile body = null; // TODO: replace null with proper value
            string authorization = null; // TODO: replace null with proper value
            string accept = null; // TODO: replace null with proper value
            var response = instance.V1usermfagainitiateenable(body, authorization, accept);
            Assert.IsInstanceOf<SuccessResult> (response, "response is SuccessResult");
        }
        
        /// <summary>
        /// Test V1userpasswordchange
        /// </summary>
        [Test]
        public void V1userpasswordchangeTest()
        {
            // TODO: add unit test for the method 'V1userpasswordchange'
            ChangePassword body = null; // TODO: replace null with proper value
            string authorization = null; // TODO: replace null with proper value
            string accept = null; // TODO: replace null with proper value
            var response = instance.V1userpasswordchange(body, authorization, accept);
            Assert.IsInstanceOf<SuccessResult> (response, "response is SuccessResult");
        }
        
        /// <summary>
        /// Test V1userpasswordreset
        /// </summary>
        [Test]
        public void V1userpasswordresetTest()
        {
            // TODO: add unit test for the method 'V1userpasswordreset'
            ResetPassword body = null; // TODO: replace null with proper value
            string accept = null; // TODO: replace null with proper value
            var response = instance.V1userpasswordreset(body, accept);
            Assert.IsInstanceOf<SuccessResult> (response, "response is SuccessResult");
        }
        
    }

}
