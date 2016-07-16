<?php
/**
 * KYCData
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
 * KYCData Class Doc Comment
 *
 * @category    Class
 * @package     Swagger\Client
 * @author      http://github.com/swagger-api/swagger-codegen
 * @license     http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class KYCData implements ArrayAccess
{
    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'KYCData';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = array(
        'time_details' => '\Swagger\Client\Model\TimeKYCData',
        'kyc_id' => 'string',
        'first_name' => 'string',
        'last_name' => 'string',
        'status' => 'string',
        'user_type' => 'string',
        'info' => 'string'
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
        'time_details' => 'timeDetails',
        'kyc_id' => 'kycID',
        'first_name' => 'firstName',
        'last_name' => 'lastName',
        'status' => 'status',
        'user_type' => 'userType',
        'info' => 'info'
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
        'time_details' => 'setTimeDetails',
        'kyc_id' => 'setKycId',
        'first_name' => 'setFirstName',
        'last_name' => 'setLastName',
        'status' => 'setStatus',
        'user_type' => 'setUserType',
        'info' => 'setInfo'
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
        'time_details' => 'getTimeDetails',
        'kyc_id' => 'getKycId',
        'first_name' => 'getFirstName',
        'last_name' => 'getLastName',
        'status' => 'getStatus',
        'user_type' => 'getUserType',
        'info' => 'getInfo'
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
        $this->container['time_details'] = isset($data['time_details']) ? $data['time_details'] : null;
        $this->container['kyc_id'] = isset($data['kyc_id']) ? $data['kyc_id'] : null;
        $this->container['first_name'] = isset($data['first_name']) ? $data['first_name'] : null;
        $this->container['last_name'] = isset($data['last_name']) ? $data['last_name'] : null;
        $this->container['status'] = isset($data['status']) ? $data['status'] : null;
        $this->container['user_type'] = isset($data['user_type']) ? $data['user_type'] : null;
        $this->container['info'] = isset($data['info']) ? $data['info'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = array();
        if ($this->container['time_details'] === null) {
            $invalid_properties[] = "'time_details' can't be null";
        }
        if ($this->container['kyc_id'] === null) {
            $invalid_properties[] = "'kyc_id' can't be null";
        }
        if ($this->container['first_name'] === null) {
            $invalid_properties[] = "'first_name' can't be null";
        }
        if ($this->container['last_name'] === null) {
            $invalid_properties[] = "'last_name' can't be null";
        }
        if ($this->container['status'] === null) {
            $invalid_properties[] = "'status' can't be null";
        }
        if ($this->container['user_type'] === null) {
            $invalid_properties[] = "'user_type' can't be null";
        }
        if ($this->container['info'] === null) {
            $invalid_properties[] = "'info' can't be null";
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
        if ($this->container['kyc_id'] === null) {
            return false;
        }
        if ($this->container['first_name'] === null) {
            return false;
        }
        if ($this->container['last_name'] === null) {
            return false;
        }
        if ($this->container['status'] === null) {
            return false;
        }
        if ($this->container['user_type'] === null) {
            return false;
        }
        if ($this->container['info'] === null) {
            return false;
        }
        return true;
    }


    /**
     * Gets time_details
     * @return \Swagger\Client\Model\TimeKYCData
     */
    public function getTimeDetails()
    {
        return $this->container['time_details'];
    }

    /**
     * Sets time_details
     * @param \Swagger\Client\Model\TimeKYCData $time_details
     * @return $this
     */
    public function setTimeDetails($time_details)
    {
        $this->container['time_details'] = $time_details;

        return $this;
    }

    /**
     * Gets kyc_id
     * @return string
     */
    public function getKycId()
    {
        return $this->container['kyc_id'];
    }

    /**
     * Sets kyc_id
     * @param string $kyc_id
     * @return $this
     */
    public function setKycId($kyc_id)
    {
        $this->container['kyc_id'] = $kyc_id;

        return $this;
    }

    /**
     * Gets first_name
     * @return string
     */
    public function getFirstName()
    {
        return $this->container['first_name'];
    }

    /**
     * Sets first_name
     * @param string $first_name
     * @return $this
     */
    public function setFirstName($first_name)
    {
        $this->container['first_name'] = $first_name;

        return $this;
    }

    /**
     * Gets last_name
     * @return string
     */
    public function getLastName()
    {
        return $this->container['last_name'];
    }

    /**
     * Sets last_name
     * @param string $last_name
     * @return $this
     */
    public function setLastName($last_name)
    {
        $this->container['last_name'] = $last_name;

        return $this;
    }

    /**
     * Gets status
     * @return string
     */
    public function getStatus()
    {
        return $this->container['status'];
    }

    /**
     * Sets status
     * @param string $status
     * @return $this
     */
    public function setStatus($status)
    {
        $this->container['status'] = $status;

        return $this;
    }

    /**
     * Gets user_type
     * @return string
     */
    public function getUserType()
    {
        return $this->container['user_type'];
    }

    /**
     * Sets user_type
     * @param string $user_type
     * @return $this
     */
    public function setUserType($user_type)
    {
        $this->container['user_type'] = $user_type;

        return $this;
    }

    /**
     * Gets info
     * @return string
     */
    public function getInfo()
    {
        return $this->container['info'];
    }

    /**
     * Sets info
     * @param string $info
     * @return $this
     */
    public function setInfo($info)
    {
        $this->container['info'] = $info;

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
