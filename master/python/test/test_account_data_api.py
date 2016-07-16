# coding: utf-8

"""
    Coinsecure Api Documentation

    To generate an API key, please visit <a href='https://coinsecure.in/api' target='_new' class='homeapi'>https://coinsecure.in/api</a>.<br>Guidelines for use can be accessed at <a href='https://api.coinsecure.in/v1/guidelines'>https://api.coinsecure.in/v1/guidelines</a>.<br>Programming Language Libraries for use can be accessed at <a href='https://api.coinsecure.in/v1/code-libraries'>https://api.coinsecure.in/v1/code-libraries</a>.

    OpenAPI spec version: 1.0b
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
        http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
"""

from __future__ import absolute_import

import os
import sys
import unittest

import swagger_client
from swagger_client.rest import ApiException
from swagger_client.apis.account_data_api import AccountDataApi


class TestAccountDataApi(unittest.TestCase):
    """ AccountDataApi unit test stubs """

    def setUp(self):
        self.api = swagger_client.apis.account_data_api.AccountDataApi()

    def tearDown(self):
        pass

    def test_v1exchangebanksummary(self):
        """
        Test case for v1exchangebanksummary

        Exchange Bank Summary
        """
        pass

    def test_v1exchangeusercoinfee(self):
        """
        Test case for v1exchangeusercoinfee

        Users Coin Fee Percentage
        """
        pass

    def test_v1exchangeuserfiatfee(self):
        """
        Test case for v1exchangeuserfiatfee

        Users Fiat Fee Percentage
        """
        pass

    def test_v1netkisearch_netki_name(self):
        """
        Test case for v1netkisearch_netki_name

        Coinsecure.me Netki Lookup
        """
        pass

    def test_v1userexchangekycs(self):
        """
        Test case for v1userexchangekycs

        Gets KYC Status Details
        """
        pass

    def test_v1userexchangereferralcoinpaid(self):
        """
        Test case for v1userexchangereferralcoinpaid

        Users Paid Fiat Referrals
        """
        pass

    def test_v1userexchangereferralcoinsuccessful(self):
        """
        Test case for v1userexchangereferralcoinsuccessful

        Gets Users Successful Referral Links
        """
        pass

    def test_v1userexchangereferralfiatpaid(self):
        """
        Test case for v1userexchangereferralfiatpaid

        Users Paid Fiat Referrals
        """
        pass

    def test_v1userexchangereferrals(self):
        """
        Test case for v1userexchangereferrals

        Gets Users Referral Links
        """
        pass

    def test_v1userexchangetradesummary(self):
        """
        Test case for v1userexchangetradesummary

        Exchange Trade Summary
        """
        pass

    def test_v1userlogintoken_token(self):
        """
        Test case for v1userlogintoken_token

        Login Token Email
        """
        pass

    def test_v1usersummary(self):
        """
        Test case for v1usersummary

        Exchange Bank Summary
        """
        pass

    def test_v1userwalletsummary(self):
        """
        Test case for v1userwalletsummary

        Exchange Bank Summary
        """
        pass


if __name__ == '__main__':
    unittest.main()