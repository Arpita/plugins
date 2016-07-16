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


class NewBankForm(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self):
        """
        NewBankForm - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'acct_nick': 'str',
            'name': 'str',
            'ban': 'str',
            'ifsc': 'str',
            'message': 'str',
            'ban_type': 'str',
            'phone': 'str',
            'otp': 'str'
        }

        self.attribute_map = {
            'acct_nick': 'acct_nick',
            'name': 'name',
            'ban': 'ban',
            'ifsc': 'ifsc',
            'message': 'message',
            'ban_type': 'banType',
            'phone': 'phone',
            'otp': 'otp'
        }

        self._acct_nick = None
        self._name = None
        self._ban = None
        self._ifsc = None
        self._message = None
        self._ban_type = None
        self._phone = None
        self._otp = None

    @property
    def acct_nick(self):
        """
        Gets the acct_nick of this NewBankForm.


        :return: The acct_nick of this NewBankForm.
        :rtype: str
        """
        return self._acct_nick

    @acct_nick.setter
    def acct_nick(self, acct_nick):
        """
        Sets the acct_nick of this NewBankForm.


        :param acct_nick: The acct_nick of this NewBankForm.
        :type: str
        """
        
        self._acct_nick = acct_nick

    @property
    def name(self):
        """
        Gets the name of this NewBankForm.


        :return: The name of this NewBankForm.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this NewBankForm.


        :param name: The name of this NewBankForm.
        :type: str
        """
        
        self._name = name

    @property
    def ban(self):
        """
        Gets the ban of this NewBankForm.


        :return: The ban of this NewBankForm.
        :rtype: str
        """
        return self._ban

    @ban.setter
    def ban(self, ban):
        """
        Sets the ban of this NewBankForm.


        :param ban: The ban of this NewBankForm.
        :type: str
        """
        
        self._ban = ban

    @property
    def ifsc(self):
        """
        Gets the ifsc of this NewBankForm.


        :return: The ifsc of this NewBankForm.
        :rtype: str
        """
        return self._ifsc

    @ifsc.setter
    def ifsc(self, ifsc):
        """
        Sets the ifsc of this NewBankForm.


        :param ifsc: The ifsc of this NewBankForm.
        :type: str
        """
        
        self._ifsc = ifsc

    @property
    def message(self):
        """
        Gets the message of this NewBankForm.


        :return: The message of this NewBankForm.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """
        Sets the message of this NewBankForm.


        :param message: The message of this NewBankForm.
        :type: str
        """
        
        self._message = message

    @property
    def ban_type(self):
        """
        Gets the ban_type of this NewBankForm.


        :return: The ban_type of this NewBankForm.
        :rtype: str
        """
        return self._ban_type

    @ban_type.setter
    def ban_type(self, ban_type):
        """
        Sets the ban_type of this NewBankForm.


        :param ban_type: The ban_type of this NewBankForm.
        :type: str
        """
        
        self._ban_type = ban_type

    @property
    def phone(self):
        """
        Gets the phone of this NewBankForm.


        :return: The phone of this NewBankForm.
        :rtype: str
        """
        return self._phone

    @phone.setter
    def phone(self, phone):
        """
        Sets the phone of this NewBankForm.


        :param phone: The phone of this NewBankForm.
        :type: str
        """
        
        self._phone = phone

    @property
    def otp(self):
        """
        Gets the otp of this NewBankForm.


        :return: The otp of this NewBankForm.
        :rtype: str
        """
        return self._otp

    @otp.setter
    def otp(self, otp):
        """
        Sets the otp of this NewBankForm.


        :param otp: The otp of this NewBankForm.
        :type: str
        """
        
        self._otp = otp

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

