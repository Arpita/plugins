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

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::ExchangeBankCoinDataApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'ExchangeBankCoinDataApi' do
  before do
    # run before each test
    @instance = SwaggerClient::ExchangeBankCoinDataApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ExchangeBankCoinDataApi' do
    it 'should create an instact of ExchangeBankCoinDataApi' do
      expect(@instance).to be_instance_of(SwaggerClient::ExchangeBankCoinDataApi)
    end
  end

  # unit tests for v1userexchangebankcoinaddresses
  # Exchange Coin Addresses
  # Gets a List of Users Exchange Bitcoin Deposit Addresses.
  # @param authorization API object to be added
  # @param [Hash] opts the optional parameters
  # @option opts [String] :accept JSON, XML or CSV can be returned (Optional)
  # @return [TradeAddressDataResponse]
  describe 'v1userexchangebankcoinaddresses test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for v1userexchangebankcoinbalanceavailable
  # Available Exchange Coin Balance
  # Returns balance which is in Available for Trades. The response is in satoshis.
  # @param authorization API object to be added
  # @param [Hash] opts the optional parameters
  # @option opts [String] :accept JSON, XML or CSV can be returned (Optional)
  # @return [VolDataResponse]
  describe 'v1userexchangebankcoinbalanceavailable test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for v1userexchangebankcoinbalancepending
  # In Trade Coin Balance
  # Returns in-trade or pending coin balance in satoshi.
  # @param authorization API object to be added
  # @param [Hash] opts the optional parameters
  # @option opts [String] :accept JSON, XML or CSV can be returned (Optional)
  # @return [VolDataResponse]
  describe 'v1userexchangebankcoinbalancepending test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for v1userexchangebankcoinbalancetotal
  # Total Exchange Coin Balance
  # Returns users total coin balance in satoshis. Pending + Available
  # @param authorization API object to be added
  # @param [Hash] opts the optional parameters
  # @option opts [String] :accept JSON, XML or CSV can be returned (Optional)
  # @return [VolDataResponse]
  describe 'v1userexchangebankcoinbalancetotal test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for v1userexchangebankcoindepositcancelled
  # Cancelled Exchange Coin Deposits
  # Gets a List of Cancelled Exchange Coin Deposits. The value and fees are in paisa.
  # @param authorization API object to be added
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
  # @option opts [Integer] :to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
  # @option opts [Integer] :max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
  # @option opts [Integer] :offset Offset defaults to 0 if input is invalid. (Optional)
  # @option opts [String] :accept JSON, XML or CSV can be returned (Optional)
  # @return [CoinDepDataResponse]
  describe 'v1userexchangebankcoindepositcancelled test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for v1userexchangebankcoindepositunverified
  # Unverified Exchange Coin Deposits
  # Gets a List of Unverified Exchange Coin Deposits. The value and fees are in paisa.
  # @param authorization API object to be added
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
  # @option opts [Integer] :to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
  # @option opts [Integer] :max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
  # @option opts [Integer] :offset Offset defaults to 0 if input is invalid. (Optional)
  # @option opts [String] :accept JSON, XML or CSV can be returned (Optional)
  # @return [CoinDepDataResponse]
  describe 'v1userexchangebankcoindepositunverified test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for v1userexchangebankcoindepositverified
  # Verified Exchange Coin Deposits
  # Gets a List of Verified Exchange Coin Deposits. The value and fees are in paisa.
  # @param authorization API object to be added
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
  # @option opts [Integer] :to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
  # @option opts [Integer] :max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
  # @option opts [Integer] :offset Offset defaults to 0 if input is invalid. (Optional)
  # @option opts [String] :accept JSON, XML or CSV can be returned (Optional)
  # @return [CoinDepDataResponse]
  describe 'v1userexchangebankcoindepositverified test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for v1userexchangebankcoinwithdrawcancelled
  # Cancelled Exchange Coin Withdrawals
  # Gets a List of Cancelled Coin Withdrawals. The value and fees are in satoshis.
  # @param authorization API object to be added
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
  # @option opts [Integer] :to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
  # @option opts [Integer] :max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
  # @option opts [Integer] :offset Offset defaults to 0 if input is invalid. (Optional)
  # @option opts [String] :accept JSON, XML or CSV can be returned (Optional)
  # @return [TradeCoinWithdrawDataResponse]
  describe 'v1userexchangebankcoinwithdrawcancelled test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for v1userexchangebankcoinwithdrawcompleted
  # Completed Exchange Coin Withdrawals
  # Gets a List of Completed Coin Withdrawals. The value and fees are in satoshis.
  # @param authorization API object to be added
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
  # @option opts [Integer] :to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
  # @option opts [Integer] :max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
  # @option opts [Integer] :offset Offset defaults to 0 if input is invalid. (Optional)
  # @option opts [String] :accept JSON, XML or CSV can be returned (Optional)
  # @return [TradeCoinWithdrawDataResponse]
  describe 'v1userexchangebankcoinwithdrawcompleted test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for v1userexchangebankcoinwithdrawunverified
  # Unverified Exchange Coin Withdrawals
  # Gets a List of Unverified Exchange Coin Withdrawals. The value and fees are in satoshis.
  # @param authorization API object to be added
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
  # @option opts [Integer] :to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
  # @option opts [Integer] :max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
  # @option opts [Integer] :offset Offset defaults to 0 if input is invalid. (Optional)
  # @option opts [String] :accept JSON, XML or CSV can be returned (Optional)
  # @return [TradeCoinWithdrawDataResponse]
  describe 'v1userexchangebankcoinwithdrawunverified test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for v1userexchangebankcoinwithdrawverified
  # Verified Exchange Coin Withdrawals
  # Gets a List of Verified Exchange Coin Withdrawals. The value and fees are in satoshis.
  # @param authorization API object to be added
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
  # @option opts [Integer] :to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
  # @option opts [Integer] :max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
  # @option opts [Integer] :offset Offset defaults to 0 if input is invalid. (Optional)
  # @option opts [String] :accept JSON, XML or CSV can be returned (Optional)
  # @return [TradeCoinWithdrawDataResponse]
  describe 'v1userexchangebankcoinwithdrawverified test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
