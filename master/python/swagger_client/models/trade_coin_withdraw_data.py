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

from pprint import pformat
from six import iteritems
import re


class TradeCoinWithdrawData(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self):
        """
        TradeCoinWithdrawData - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'time_details': 'TimeData',
            'address': 'str',
            'value': 'int',
            'fees': 'int',
            'withdraw_id': 'str',
            'tx_hash': 'str'
        }

        self.attribute_map = {
            'time_details': 'timeDetails',
            'address': 'address',
            'value': 'value',
            'fees': 'fees',
            'withdraw_id': 'withdrawID',
            'tx_hash': 'txHash'
        }

        self._time_details = None
        self._address = None
        self._value = None
        self._fees = None
        self._withdraw_id = None
        self._tx_hash = None

    @property
    def time_details(self):
        """
        Gets the time_details of this TradeCoinWithdrawData.


        :return: The time_details of this TradeCoinWithdrawData.
        :rtype: TimeData
        """
        return self._time_details

    @time_details.setter
    def time_details(self, time_details):
        """
        Sets the time_details of this TradeCoinWithdrawData.


        :param time_details: The time_details of this TradeCoinWithdrawData.
        :type: TimeData
        """
        
        self._time_details = time_details

    @property
    def address(self):
        """
        Gets the address of this TradeCoinWithdrawData.


        :return: The address of this TradeCoinWithdrawData.
        :rtype: str
        """
        return self._address

    @address.setter
    def address(self, address):
        """
        Sets the address of this TradeCoinWithdrawData.


        :param address: The address of this TradeCoinWithdrawData.
        :type: str
        """
        
        self._address = address

    @property
    def value(self):
        """
        Gets the value of this TradeCoinWithdrawData.


        :return: The value of this TradeCoinWithdrawData.
        :rtype: int
        """
        return self._value

    @value.setter
    def value(self, value):
        """
        Sets the value of this TradeCoinWithdrawData.


        :param value: The value of this TradeCoinWithdrawData.
        :type: int
        """
        
        self._value = value

    @property
    def fees(self):
        """
        Gets the fees of this TradeCoinWithdrawData.


        :return: The fees of this TradeCoinWithdrawData.
        :rtype: int
        """
        return self._fees

    @fees.setter
    def fees(self, fees):
        """
        Sets the fees of this TradeCoinWithdrawData.


        :param fees: The fees of this TradeCoinWithdrawData.
        :type: int
        """
        
        self._fees = fees

    @property
    def withdraw_id(self):
        """
        Gets the withdraw_id of this TradeCoinWithdrawData.


        :return: The withdraw_id of this TradeCoinWithdrawData.
        :rtype: str
        """
        return self._withdraw_id

    @withdraw_id.setter
    def withdraw_id(self, withdraw_id):
        """
        Sets the withdraw_id of this TradeCoinWithdrawData.


        :param withdraw_id: The withdraw_id of this TradeCoinWithdrawData.
        :type: str
        """
        
        self._withdraw_id = withdraw_id

    @property
    def tx_hash(self):
        """
        Gets the tx_hash of this TradeCoinWithdrawData.


        :return: The tx_hash of this TradeCoinWithdrawData.
        :rtype: str
        """
        return self._tx_hash

    @tx_hash.setter
    def tx_hash(self, tx_hash):
        """
        Sets the tx_hash of this TradeCoinWithdrawData.


        :param tx_hash: The tx_hash of this TradeCoinWithdrawData.
        :type: str
        """
        
        self._tx_hash = tx_hash

    def to_dict(self):
        """
        Returns the model properties as a dict
        """
        result = {}

        for attr, _ in iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """
        Returns the string representation of the model
        """
        return pformat(self.to_dict())

    def __repr__(self):
        """
        For `print` and `pprint`
        """
        return self.to_str()

    def __eq__(self, other):
        """
        Returns true if both objects are equal
        """
        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other

