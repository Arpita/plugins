<?php
/**
 * WalletCoinWithdrawData
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   http://github.com/swagger-api/swagger-codegen
 * @license  http://www.apache.org/licenses/LICENSE-2.0 Apache License v2
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Coinsecure Api Documentation
 *
 * To generate an API key, please visit <a href='https://coinsecure.in/api' target='_new' class='homeapi'>https://coinsecure.in/api</a>.<br>Guidelines for use can be accessed at <a href='https://api.coinsecure.in/v1/guidelines'>https://api.coinsecure.in/v1/guidelines</a>.<br>Programming Language Libraries for use can be accessed at <a href='https://api.coinsecure.in/v1/code-libraries'>https://api.coinsecure.in/v1/code-libraries</a>.
 *
 * OpenAPI spec version: beta
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

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;

/**
 * WalletCoinWithdrawData Class Doc Comment
 *
 * @category    Class */
/**
 * @package     Swagger\Client
 * @author      http://github.com/swagger-api/swagger-codegen
 * @license     http://www.apache.org/licenses/LICENSE-2.0 Apache License v2
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class WalletCoinWithdrawData implements ArrayAccess
{
    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'WalletCoinWithdrawData';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'time_details' => '\Swagger\Client\Model\TimeData',
        'tx_id' => 'string',
        'message' => 'string',
        'satoshis' => 'int',
        'wallet_id' => 'string',
        'withdraw_id' => 'string',
        'sent_to' => 'string'
    ];

    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of attributes where the key is the local name, and the value is the original name
     * @var string[]
     */
    protected static $attributeMap = [
        'time_details' => 'timeDetails',
        'tx_id' => 'txID',
        'message' => 'message',
        'satoshis' => 'satoshis',
        'wallet_id' => 'walletID',
        'withdraw_id' => 'withdrawID',
        'sent_to' => 'sentTo'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'time_details' => 'setTimeDetails',
        'tx_id' => 'setTxId',
        'message' => 'setMessage',
        'satoshis' => 'setSatoshis',
        'wallet_id' => 'setWalletId',
        'withdraw_id' => 'setWithdrawId',
        'sent_to' => 'setSentTo'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'time_details' => 'getTimeDetails',
        'tx_id' => 'getTxId',
        'message' => 'getMessage',
        'satoshis' => 'getSatoshis',
        'wallet_id' => 'getWalletId',
        'withdraw_id' => 'getWithdrawId',
        'sent_to' => 'getSentTo'
    ];

    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    public static function setters()
    {
        return self::$setters;
    }

    public static function getters()
    {
        return self::$getters;
    }

    

    

    /**
     * Associative array for storing property values
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['time_details'] = isset($data['time_details']) ? $data['time_details'] : null;
        $this->container['tx_id'] = isset($data['tx_id']) ? $data['tx_id'] : null;
        $this->container['message'] = isset($data['message']) ? $data['message'] : null;
        $this->container['satoshis'] = isset($data['satoshis']) ? $data['satoshis'] : null;
        $this->container['wallet_id'] = isset($data['wallet_id']) ? $data['wallet_id'] : null;
        $this->container['withdraw_id'] = isset($data['withdraw_id']) ? $data['withdraw_id'] : null;
        $this->container['sent_to'] = isset($data['sent_to']) ? $data['sent_to'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];
        if ($this->container['time_details'] === null) {
            $invalid_properties[] = "'time_details' can't be null";
        }
        if ($this->container['tx_id'] === null) {
            $invalid_properties[] = "'tx_id' can't be null";
        }
        if ($this->container['message'] === null) {
            $invalid_properties[] = "'message' can't be null";
        }
        if ($this->container['satoshis'] === null) {
            $invalid_properties[] = "'satoshis' can't be null";
        }
        if ($this->container['wallet_id'] === null) {
            $invalid_properties[] = "'wallet_id' can't be null";
        }
        if ($this->container['withdraw_id'] === null) {
            $invalid_properties[] = "'withdraw_id' can't be null";
        }
        if ($this->container['sent_to'] === null) {
            $invalid_properties[] = "'sent_to' can't be null";
        }
        return $invalid_properties;
    }

    /**
     * validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properteis are valid
     */
    public function valid()
    {
        if ($this->container['time_details'] === null) {
            return false;
        }
        if ($this->container['tx_id'] === null) {
            return false;
        }
        if ($this->container['message'] === null) {
            return false;
        }
        if ($this->container['satoshis'] === null) {
            return false;
        }
        if ($this->container['wallet_id'] === null) {
            return false;
        }
        if ($this->container['withdraw_id'] === null) {
            return false;
        }
        if ($this->container['sent_to'] === null) {
            return false;
        }
        return true;
    }


    /**
     * Gets time_details
     * @return \Swagger\Client\Model\TimeData
     */
    public function getTimeDetails()
    {
        return $this->container['time_details'];
    }

    /**
     * Sets time_details
     * @param \Swagger\Client\Model\TimeData $time_details
     * @return $this
     */
    public function setTimeDetails($time_details)
    {
        $this->container['time_details'] = $time_details;

        return $this;
    }

    /**
     * Gets tx_id
     * @return string
     */
    public function getTxId()
    {
        return $this->container['tx_id'];
    }

    /**
     * Sets tx_id
     * @param string $tx_id
     * @return $this
     */
    public function setTxId($tx_id)
    {
        $this->container['tx_id'] = $tx_id;

        return $this;
    }

    /**
     * Gets message
     * @return string
     */
    public function getMessage()
    {
        return $this->container['message'];
    }

    /**
     * Sets message
     * @param string $message
     * @return $this
     */
    public function setMessage($message)
    {
        $this->container['message'] = $message;

        return $this;
    }

    /**
     * Gets satoshis
     * @return int
     */
    public function getSatoshis()
    {
        return $this->container['satoshis'];
    }

    /**
     * Sets satoshis
     * @param int $satoshis
     * @return $this
     */
    public function setSatoshis($satoshis)
    {
        $this->container['satoshis'] = $satoshis;

        return $this;
    }

    /**
     * Gets wallet_id
     * @return string
     */
    public function getWalletId()
    {
        return $this->container['wallet_id'];
    }

    /**
     * Sets wallet_id
     * @param string $wallet_id
     * @return $this
     */
    public function setWalletId($wallet_id)
    {
        $this->container['wallet_id'] = $wallet_id;

        return $this;
    }

    /**
     * Gets withdraw_id
     * @return string
     */
    public function getWithdrawId()
    {
        return $this->container['withdraw_id'];
    }

    /**
     * Sets withdraw_id
     * @param string $withdraw_id
     * @return $this
     */
    public function setWithdrawId($withdraw_id)
    {
        $this->container['withdraw_id'] = $withdraw_id;

        return $this;
    }

    /**
     * Gets sent_to
     * @return string
     */
    public function getSentTo()
    {
        return $this->container['sent_to'];
    }

    /**
     * Sets sent_to
     * @param string $sent_to
     * @return $this
     */
    public function setSentTo($sent_to)
    {
        $this->container['sent_to'] = $sent_to;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     * @param  integer $offset Offset
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     * @param  integer $offset Offset
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     * @param  integer $offset Offset
     * @param  mixed   $value  Value to be set
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     * @param  integer $offset Offset
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this), JSON_PRETTY_PRINT);
        }

        return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this));
    }
}
