=begin
#Coinsecure Api Documentation

#To generate an API key, please visit <a href='https://coinsecure.in/api' target='_new' class='homeapi'>https://coinsecure.in/api</a>.<br>Guidelines for use can be accessed at <a href='https://api.coinsecure.in/v1/guidelines'>https://api.coinsecure.in/v1/guidelines</a>.<br>Programming Language Libraries for use can be accessed at <a href='https://api.coinsecure.in/v1/code-libraries'>https://api.coinsecure.in/v1/code-libraries</a>.

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

=end

require 'date'

module SwaggerClient

  class FiatBankData
    attr_accessor :time

    attr_accessor :status

    attr_accessor :update_time

    attr_accessor :update_message

    attr_accessor :bank_id

    attr_accessor :info

    attr_accessor :account_number

    attr_accessor :account_nick

    attr_accessor :account_type

    attr_accessor :account_id


    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'time' => :'time',
        :'status' => :'status',
        :'update_time' => :'updateTime',
        :'update_message' => :'updateMessage',
        :'bank_id' => :'bankID',
        :'info' => :'info',
        :'account_number' => :'accountNumber',
        :'account_nick' => :'accountNick',
        :'account_type' => :'accountType',
        :'account_id' => :'accountID'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'time' => :'Integer',
        :'status' => :'String',
        :'update_time' => :'Integer',
        :'update_message' => :'String',
        :'bank_id' => :'String',
        :'info' => :'String',
        :'account_number' => :'String',
        :'account_nick' => :'String',
        :'account_type' => :'String',
        :'account_id' => :'String'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}){|(k,v), h| h[k.to_sym] = v}

      if attributes.has_key?(:'time')
        self.time = attributes[:'time']
      end

      if attributes.has_key?(:'status')
        self.status = attributes[:'status']
      end

      if attributes.has_key?(:'updateTime')
        self.update_time = attributes[:'updateTime']
      end

      if attributes.has_key?(:'updateMessage')
        self.update_message = attributes[:'updateMessage']
      end

      if attributes.has_key?(:'bankID')
        self.bank_id = attributes[:'bankID']
      end

      if attributes.has_key?(:'info')
        self.info = attributes[:'info']
      end

      if attributes.has_key?(:'accountNumber')
        self.account_number = attributes[:'accountNumber']
      end

      if attributes.has_key?(:'accountNick')
        self.account_nick = attributes[:'accountNick']
      end

      if attributes.has_key?(:'accountType')
        self.account_type = attributes[:'accountType']
      end

      if attributes.has_key?(:'accountID')
        self.account_id = attributes[:'accountID']
      end

    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properies with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @time.nil?
        invalid_properties.push("invalid value for 'time', time cannot be nil.")
      end

      if @status.nil?
        invalid_properties.push("invalid value for 'status', status cannot be nil.")
      end

      if @update_time.nil?
        invalid_properties.push("invalid value for 'update_time', update_time cannot be nil.")
      end

      if @update_message.nil?
        invalid_properties.push("invalid value for 'update_message', update_message cannot be nil.")
      end

      if @bank_id.nil?
        invalid_properties.push("invalid value for 'bank_id', bank_id cannot be nil.")
      end

      if @info.nil?
        invalid_properties.push("invalid value for 'info', info cannot be nil.")
      end

      if @account_number.nil?
        invalid_properties.push("invalid value for 'account_number', account_number cannot be nil.")
      end

      if @account_nick.nil?
        invalid_properties.push("invalid value for 'account_nick', account_nick cannot be nil.")
      end

      if @account_type.nil?
        invalid_properties.push("invalid value for 'account_type', account_type cannot be nil.")
      end

      if @account_id.nil?
        invalid_properties.push("invalid value for 'account_id', account_id cannot be nil.")
      end

      return invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @time.nil?
      return false if @status.nil?
      return false if @update_time.nil?
      return false if @update_message.nil?
      return false if @bank_id.nil?
      return false if @info.nil?
      return false if @account_number.nil?
      return false if @account_nick.nil?
      return false if @account_type.nil?
      return false if @account_id.nil?
      return true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          time == o.time &&
          status == o.status &&
          update_time == o.update_time &&
          update_message == o.update_message &&
          bank_id == o.bank_id &&
          info == o.info &&
          account_number == o.account_number &&
          account_nick == o.account_nick &&
          account_type == o.account_type &&
          account_id == o.account_id
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [time, status, update_time, update_message, bank_id, info, account_number, account_nick, account_type, account_id].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.swagger_types.each_pair do |key, type|
        if type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map{ |v| _deserialize($1, v) } )
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end # or else data not found in attributes(hash), not an issue as the data can be optional
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :DateTime
        DateTime.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :BOOLEAN
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        temp_model = SwaggerClient.const_get(type).new
        temp_model.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        next if value.nil?
        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map{ |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end
