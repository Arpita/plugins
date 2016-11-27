# coding: utf-8

"""
    Coinsecure Api Documentation

    To generate an API key, please visit <a href='https://coinsecure.in/api' target='_new' class='homeapi'>https://coinsecure.in/api</a>.<br>Guidelines for use can be accessed at <a href='https://api.coinsecure.in/v1/guidelines'>https://api.coinsecure.in/v1/guidelines</a>.<br>Programming Language Libraries for use can be accessed at <a href='https://api.coinsecure.in/v1/code-libraries'>https://api.coinsecure.in/v1/code-libraries</a>.

    OpenAPI spec version: beta
    
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


class LastTradeData(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, time=None, avg_rate=None, vol=None, ord_type=None):
        """
        LastTradeData - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'time': 'int',
            'avg_rate': 'int',
            'vol': 'int',
            'ord_type': 'str'
        }

        self.attribute_map = {
            'time': 'time',
            'avg_rate': 'avgRate',
            'vol': 'vol',
            'ord_type': 'ordType'
        }

        self._time = time
        self._avg_rate = avg_rate
        self._vol = vol
        self._ord_type = ord_type


    @property
    def time(self):
        """
        Gets the time of this LastTradeData.


        :return: The time of this LastTradeData.
        :rtype: int
        """
        return self._time

    @time.setter
    def time(self, time):
        """
        Sets the time of this LastTradeData.


        :param time: The time of this LastTradeData.
        :type: int
        """
        if time is None:
            raise ValueError("Invalid value for `time`, must not be `None`")

        self._time = time

    @property
    def avg_rate(self):
        """
        Gets the avg_rate of this LastTradeData.


        :return: The avg_rate of this LastTradeData.
        :rtype: int
        """
        return self._avg_rate

    @avg_rate.setter
    def avg_rate(self, avg_rate):
        """
        Sets the avg_rate of this LastTradeData.


        :param avg_rate: The avg_rate of this LastTradeData.
        :type: int
        """
        if avg_rate is None:
            raise ValueError("Invalid value for `avg_rate`, must not be `None`")

        self._avg_rate = avg_rate

    @property
    def vol(self):
        """
        Gets the vol of this LastTradeData.


        :return: The vol of this LastTradeData.
        :rtype: int
        """
        return self._vol

    @vol.setter
    def vol(self, vol):
        """
        Sets the vol of this LastTradeData.


        :param vol: The vol of this LastTradeData.
        :type: int
        """
        if vol is None:
            raise ValueError("Invalid value for `vol`, must not be `None`")

        self._vol = vol

    @property
    def ord_type(self):
        """
        Gets the ord_type of this LastTradeData.


        :return: The ord_type of this LastTradeData.
        :rtype: str
        """
        return self._ord_type

    @ord_type.setter
    def ord_type(self, ord_type):
        """
        Sets the ord_type of this LastTradeData.


        :param ord_type: The ord_type of this LastTradeData.
        :type: str
        """
        if ord_type is None:
            raise ValueError("Invalid value for `ord_type`, must not be `None`")

        self._ord_type = ord_type

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
