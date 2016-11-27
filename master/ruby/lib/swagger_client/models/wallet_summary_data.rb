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

  class WalletSummaryData
    attr_accessor :wallet_confirmed_balance

    attr_accessor :wallet_uncofirmed_balance

    attr_accessor :has_wallet_netki

    attr_accessor :wallet_netki

    attr_accessor :wallet_netki_address

    attr_accessor :wallet_netki_wallet_id


    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'wallet_confirmed_balance' => :'walletConfirmedBalance',
        :'wallet_uncofirmed_balance' => :'walletUncofirmedBalance',
        :'has_wallet_netki' => :'hasWalletNetki',
        :'wallet_netki' => :'walletNetki',
        :'wallet_netki_address' => :'walletNetkiAddress',
        :'wallet_netki_wallet_id' => :'walletNetkiWalletId'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'wallet_confirmed_balance' => :'Integer',
        :'wallet_uncofirmed_balance' => :'Integer',
        :'has_wallet_netki' => :'BOOLEAN',
        :'wallet_netki' => :'String',
        :'wallet_netki_address' => :'String',
        :'wallet_netki_wallet_id' => :'String'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}){|(k,v), h| h[k.to_sym] = v}

      if attributes.has_key?(:'walletConfirmedBalance')
        self.wallet_confirmed_balance = attributes[:'walletConfirmedBalance']
      end

      if attributes.has_key?(:'walletUncofirmedBalance')
        self.wallet_uncofirmed_balance = attributes[:'walletUncofirmedBalance']
      end

      if attributes.has_key?(:'hasWalletNetki')
        self.has_wallet_netki = attributes[:'hasWalletNetki']
      else
        self.has_wallet_netki = false
      end

      if attributes.has_key?(:'walletNetki')
        self.wallet_netki = attributes[:'walletNetki']
      end

      if attributes.has_key?(:'walletNetkiAddress')
        self.wallet_netki_address = attributes[:'walletNetkiAddress']
      end

      if attributes.has_key?(:'walletNetkiWalletId')
        self.wallet_netki_wallet_id = attributes[:'walletNetkiWalletId']
      end

    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properies with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @wallet_confirmed_balance.nil?
        invalid_properties.push("invalid value for 'wallet_confirmed_balance', wallet_confirmed_balance cannot be nil.")
      end

      if @wallet_uncofirmed_balance.nil?
        invalid_properties.push("invalid value for 'wallet_uncofirmed_balance', wallet_uncofirmed_balance cannot be nil.")
      end

      if @has_wallet_netki.nil?
        invalid_properties.push("invalid value for 'has_wallet_netki', has_wallet_netki cannot be nil.")
      end

      if @wallet_netki.nil?
        invalid_properties.push("invalid value for 'wallet_netki', wallet_netki cannot be nil.")
      end

      if @wallet_netki_address.nil?
        invalid_properties.push("invalid value for 'wallet_netki_address', wallet_netki_address cannot be nil.")
      end

      if @wallet_netki_wallet_id.nil?
        invalid_properties.push("invalid value for 'wallet_netki_wallet_id', wallet_netki_wallet_id cannot be nil.")
      end

      return invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @wallet_confirmed_balance.nil?
      return false if @wallet_uncofirmed_balance.nil?
      return false if @has_wallet_netki.nil?
      return false if @wallet_netki.nil?
      return false if @wallet_netki_address.nil?
      return false if @wallet_netki_wallet_id.nil?
      return true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          wallet_confirmed_balance == o.wallet_confirmed_balance &&
          wallet_uncofirmed_balance == o.wallet_uncofirmed_balance &&
          has_wallet_netki == o.has_wallet_netki &&
          wallet_netki == o.wallet_netki &&
          wallet_netki_address == o.wallet_netki_address &&
          wallet_netki_wallet_id == o.wallet_netki_wallet_id
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [wallet_confirmed_balance, wallet_uncofirmed_balance, has_wallet_netki, wallet_netki, wallet_netki_address, wallet_netki_wallet_id].hash
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
