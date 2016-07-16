<?php
/**
 * TradeSummaryData
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   http://github.com/swagger-api/swagger-codegen
 * @license  http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
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

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;

/**
 * TradeSummaryData Class Doc Comment
 *
 * @category    Class
 * @package     Swagger\Client
 * @author      http://github.com/swagger-api/swagger-codegen
 * @license     http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class TradeSummaryData implements ArrayAccess
{
    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'TradeSummaryData';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = array(
        'completed_asks_sum' => 'int',
        'completed_bids_sum' => 'int',
        'completed_asks_count' => 'int',
        'completed_bids_count' => 'int',
        'pending_asks_count' => 'int',
        'pending_bids_count' => 'int'
    );

    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of attributes where the key is the local name, and the value is the original name
     * @var string[]
     */
    protected static $attributeMap = array(
        'completed_asks_sum' => 'completedAsksSum',
        'completed_bids_sum' => 'completedBidsSum',
        'completed_asks_count' => 'completedAsksCount',
        'completed_bids_count' => 'completedBidsCount',
        'pending_asks_count' => 'pendingAsksCount',
        'pending_bids_count' => 'pendingBidsCount'
    );

    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = array(
        'completed_asks_sum' => 'setCompletedAsksSum',
        'completed_bids_sum' => 'setCompletedBidsSum',
        'completed_asks_count' => 'setCompletedAsksCount',
        'completed_bids_count' => 'setCompletedBidsCount',
        'pending_asks_count' => 'setPendingAsksCount',
        'pending_bids_count' => 'setPendingBidsCount'
    );

    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = array(
        'completed_asks_sum' => 'getCompletedAsksSum',
        'completed_bids_sum' => 'getCompletedBidsSum',
        'completed_asks_count' => 'getCompletedAsksCount',
        'completed_bids_count' => 'getCompletedBidsCount',
        'pending_asks_count' => 'getPendingAsksCount',
        'pending_bids_count' => 'getPendingBidsCount'
    );

    public static function getters()
    {
        return self::$getters;
    }

    

    

    /**
     * Associative array for storing property values
     * @var mixed[]
     */
    protected $container = array();

    /**
     * Constructor
     * @param mixed[] $data Associated array of property value initalizing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['completed_asks_sum'] = isset($data['completed_asks_sum']) ? $data['completed_asks_sum'] : null;
        $this->container['completed_bids_sum'] = isset($data['completed_bids_sum']) ? $data['completed_bids_sum'] : null;
        $this->container['completed_asks_count'] = isset($data['completed_asks_count']) ? $data['completed_asks_count'] : null;
        $this->container['completed_bids_count'] = isset($data['completed_bids_count']) ? $data['completed_bids_count'] : null;
        $this->container['pending_asks_count'] = isset($data['pending_asks_count']) ? $data['pending_asks_count'] : null;
        $this->container['pending_bids_count'] = isset($data['pending_bids_count']) ? $data['pending_bids_count'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = array();
        if ($this->container['completed_asks_sum'] === null) {
            $invalid_properties[] = "'completed_asks_sum' can't be null";
        }
        if ($this->container['completed_bids_sum'] === null) {
            $invalid_properties[] = "'completed_bids_sum' can't be null";
        }
        if ($this->container['completed_asks_count'] === null) {
            $invalid_properties[] = "'completed_asks_count' can't be null";
        }
        if ($this->container['completed_bids_count'] === null) {
            $invalid_properties[] = "'completed_bids_count' can't be null";
        }
        if ($this->container['pending_asks_count'] === null) {
            $invalid_properties[] = "'pending_asks_count' can't be null";
        }
        if ($this->container['pending_bids_count'] === null) {
            $invalid_properties[] = "'pending_bids_count' can't be null";
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
        if ($this->container['completed_asks_sum'] === null) {
            return false;
        }
        if ($this->container['completed_bids_sum'] === null) {
            return false;
        }
        if ($this->container['completed_asks_count'] === null) {
            return false;
        }
        if ($this->container['completed_bids_count'] === null) {
            return false;
        }
        if ($this->container['pending_asks_count'] === null) {
            return false;
        }
        if ($this->container['pending_bids_count'] === null) {
            return false;
        }
        return true;
    }


    /**
     * Gets completed_asks_sum
     * @return int
     */
    public function getCompletedAsksSum()
    {
        return $this->container['completed_asks_sum'];
    }

    /**
     * Sets completed_asks_sum
     * @param int $completed_asks_sum
     * @return $this
     */
    public function setCompletedAsksSum($completed_asks_sum)
    {
        $this->container['completed_asks_sum'] = $completed_asks_sum;

        return $this;
    }

    /**
     * Gets completed_bids_sum
     * @return int
     */
    public function getCompletedBidsSum()
    {
        return $this->container['completed_bids_sum'];
    }

    /**
     * Sets completed_bids_sum
     * @param int $completed_bids_sum
     * @return $this
     */
    public function setCompletedBidsSum($completed_bids_sum)
    {
        $this->container['completed_bids_sum'] = $completed_bids_sum;

        return $this;
    }

    /**
     * Gets completed_asks_count
     * @return int
     */
    public function getCompletedAsksCount()
    {
        return $this->container['completed_asks_count'];
    }

    /**
     * Sets completed_asks_count
     * @param int $completed_asks_count
     * @return $this
     */
    public function setCompletedAsksCount($completed_asks_count)
    {
        $this->container['completed_asks_count'] = $completed_asks_count;

        return $this;
    }

    /**
     * Gets completed_bids_count
     * @return int
     */
    public function getCompletedBidsCount()
    {
        return $this->container['completed_bids_count'];
    }

    /**
     * Sets completed_bids_count
     * @param int $completed_bids_count
     * @return $this
     */
    public function setCompletedBidsCount($completed_bids_count)
    {
        $this->container['completed_bids_count'] = $completed_bids_count;

        return $this;
    }

    /**
     * Gets pending_asks_count
     * @return int
     */
    public function getPendingAsksCount()
    {
        return $this->container['pending_asks_count'];
    }

    /**
     * Sets pending_asks_count
     * @param int $pending_asks_count
     * @return $this
     */
    public function setPendingAsksCount($pending_asks_count)
    {
        $this->container['pending_asks_count'] = $pending_asks_count;

        return $this;
    }

    /**
     * Gets pending_bids_count
     * @return int
     */
    public function getPendingBidsCount()
    {
        return $this->container['pending_bids_count'];
    }

    /**
     * Sets pending_bids_count
     * @param int $pending_bids_count
     * @return $this
     */
    public function setPendingBidsCount($pending_bids_count)
    {
        $this->container['pending_bids_count'] = $pending_bids_count;

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
