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
from swagger_client.apis.exchange_bank_fiat_data_api import ExchangeBankFiatDataApi


class TestExchangeBankFiatDataApi(unittest.TestCase):
    """ ExchangeBankFiatDataApi unit test stubs """

    def setUp(self):
        self.api = swagger_client.apis.exchange_bank_fiat_data_api.ExchangeBankFiatDataApi()

    def tearDown(self):
        pass

    def test_v1userexchangebankfiataccounts(self):
        """
        Test case for v1userexchangebankfiataccounts

        Exchange Bitcoin Deposit Addresses
        """
        pass

    def test_v1userexchangebankfiatbalanceavailable(self):
        """
        Test case for v1userexchangebankfiatbalanceavailable

        Available Exchange Fiat Balance
        """
        pass

    def test_v1userexchangebankfiatbalancepending(self):
        """
        Test case for v1userexchangebankfiatbalancepending

        In Trade Coin Balance
        """
        pass

    def test_v1userexchangebankfiatbalancetotal(self):
        """
        Test case for v1userexchangebankfiatbalancetotal

        Total Exchange Fiat Balance
        """
        pass

    def test_v1userexchangebankfiatdepositcancelled(self):
        """
        Test case for v1userexchangebankfiatdepositcancelled

        Cancelled Exchange Fiat Deposits
        """
        pass

    def test_v1userexchangebankfiatdepositunverified(self):
        """
        Test case for v1userexchangebankfiatdepositunverified

        Unverified Exchange Fiat Deposits
        """
        pass

    def test_v1userexchangebankfiatdepositverified(self):
        """
        Test case for v1userexchangebankfiatdepositverified

        Verified Exchange Fiat Deposits
        """
        pass

    def test_v1userexchangebankfiatwithdrawcancelled(self):
        """
        Test case for v1userexchangebankfiatwithdrawcancelled

        Cancelled Exchange Fiat Withdrawals
        """
        pass

    def test_v1userexchangebankfiatwithdrawcompleted(self):
        """
        Test case for v1userexchangebankfiatwithdrawcompleted

        Completed Exchange Fiat Withdrawals
        """
        pass

    def test_v1userexchangebankfiatwithdrawunverified(self):
        """
        Test case for v1userexchangebankfiatwithdrawunverified

        Unverified Exchange Fiat Withdrawals
        """
        pass

    def test_v1userexchangebankfiatwithdrawverified(self):
        """
        Test case for v1userexchangebankfiatwithdrawverified

        Verified Exchange Fiat Withdrawals
        """
        pass


if __name__ == '__main__':
    unittest.main()