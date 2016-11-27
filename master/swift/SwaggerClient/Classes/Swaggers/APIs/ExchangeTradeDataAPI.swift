//
// ExchangeTradeDataAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Alamofire



public class ExchangeTradeDataAPI: APIBase {
    /**
     Lowest Ask
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func v1exchangeasklow(completion: ((data: RateDataResponse?, error: ErrorType?) -> Void)) {
        v1exchangeasklowWithRequestBuilder().execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     Lowest Ask
     - GET /v1/exchange/ask/low
     - Returns the Lowest Ask Rate in Json. The Amount is in Paisa.
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : {
    "rate" : 123456789
  },
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : {
    "rate" : 123456789
  },
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]

     - returns: RequestBuilder<RateDataResponse> 
     */
    public class func v1exchangeasklowWithRequestBuilder() -> RequestBuilder<RateDataResponse> {
        let path = "/v1/exchange/ask/low"
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<RateDataResponse>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     All Sell Orders
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func v1exchangeaskorders(completion: ((data: RateVolDataResponse?, error: ErrorType?) -> Void)) {
        v1exchangeaskordersWithRequestBuilder().execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     All Sell Orders
     - GET /v1/exchange/ask/orders
     - Returns all Ask Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : [ {
    "vol" : 123456789,
    "rate" : 123456789
  } ],
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : [ {
    "vol" : 123456789,
    "rate" : 123456789
  } ],
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]

     - returns: RequestBuilder<RateVolDataResponse> 
     */
    public class func v1exchangeaskordersWithRequestBuilder() -> RequestBuilder<RateVolDataResponse> {
        let path = "/v1/exchange/ask/orders"
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<RateVolDataResponse>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     Returns the Highest Bid in the Order Book
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func v1exchangebidhigh(completion: ((data: RateDataResponse?, error: ErrorType?) -> Void)) {
        v1exchangebidhighWithRequestBuilder().execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     Returns the Highest Bid in the Order Book
     - GET /v1/exchange/bid/high
     - Highest Bid.
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : {
    "rate" : 123456789
  },
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : {
    "rate" : 123456789
  },
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]

     - returns: RequestBuilder<RateDataResponse> 
     */
    public class func v1exchangebidhighWithRequestBuilder() -> RequestBuilder<RateDataResponse> {
        let path = "/v1/exchange/bid/high"
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<RateDataResponse>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     All Buy Orders
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func v1exchangebidorders(completion: ((data: RateVolDataResponse?, error: ErrorType?) -> Void)) {
        v1exchangebidordersWithRequestBuilder().execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     All Buy Orders
     - GET /v1/exchange/bid/orders
     - Returns all Bid Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : [ {
    "vol" : 123456789,
    "rate" : 123456789
  } ],
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : [ {
    "vol" : 123456789,
    "rate" : 123456789
  } ],
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]

     - returns: RequestBuilder<RateVolDataResponse> 
     */
    public class func v1exchangebidordersWithRequestBuilder() -> RequestBuilder<RateVolDataResponse> {
        let path = "/v1/exchange/bid/orders"
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<RateVolDataResponse>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     Last Trade
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func v1exchangelastTrade(completion: ((data: LastTradeDataResponse?, error: ErrorType?) -> Void)) {
        v1exchangelastTradeWithRequestBuilder().execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     Last Trade
     - GET /v1/exchange/lastTrade
     - Returns a summary of data from the Exchange.
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : {
    "vol" : 123456789,
    "avgRate" : 123456789,
    "time" : 123456789,
    "ordType" : "aeiou"
  },
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : {
    "vol" : 123456789,
    "avgRate" : 123456789,
    "time" : 123456789,
    "ordType" : "aeiou"
  },
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]

     - returns: RequestBuilder<LastTradeDataResponse> 
     */
    public class func v1exchangelastTradeWithRequestBuilder() -> RequestBuilder<LastTradeDataResponse> {
        let path = "/v1/exchange/lastTrade"
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<LastTradeDataResponse>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     Max 24 Hour Rate
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func v1exchangemax24Hr(completion: ((data: RateDiffDataResponse?, error: ErrorType?) -> Void)) {
        v1exchangemax24HrWithRequestBuilder().execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     Max 24 Hour Rate
     - GET /v1/exchange/max24Hr
     - Returns the highest rate over the last 24 hours with the 10 minutely difference. The values are in paisa.
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : {
    "rate" : 123456789,
    "difference" : 123456789
  },
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : {
    "rate" : 123456789,
    "difference" : 123456789
  },
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]

     - returns: RequestBuilder<RateDiffDataResponse> 
     */
    public class func v1exchangemax24HrWithRequestBuilder() -> RequestBuilder<RateDiffDataResponse> {
        let path = "/v1/exchange/max24Hr"
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<RateDiffDataResponse>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     Min 24 Hour Rate
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func v1exchangemin24Hr(completion: ((data: RateDiffDataResponse?, error: ErrorType?) -> Void)) {
        v1exchangemin24HrWithRequestBuilder().execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     Min 24 Hour Rate
     - GET /v1/exchange/min24Hr
     - Returns the lowest rate over the last 24 hours with the 10 minutely difference. The values are in paisa.
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : {
    "rate" : 123456789,
    "difference" : 123456789
  },
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : {
    "rate" : 123456789,
    "difference" : 123456789
  },
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]

     - returns: RequestBuilder<RateDiffDataResponse> 
     */
    public class func v1exchangemin24HrWithRequestBuilder() -> RequestBuilder<RateDiffDataResponse> {
        let path = "/v1/exchange/min24Hr"
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<RateDiffDataResponse>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     Exchange Ticker
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func v1exchangeticker(completion: ((data: StandardTickerResultData?, error: ErrorType?) -> Void)) {
        v1exchangetickerWithRequestBuilder().execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     Exchange Ticker
     - GET /v1/exchange/ticker
     - Returns a summary of data from the Exchange.
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : {
    "coinVolume" : 123456789,
    "high" : 123456789,
    "low" : 123456789,
    "ask" : 123456789,
    "fiatVolume" : 123456789,
    "bid" : 123456789,
    "open" : 123456789,
    "lastPrice" : 123456789,
    "timestamp" : 123456789
  },
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : {
    "coinVolume" : 123456789,
    "high" : 123456789,
    "low" : 123456789,
    "ask" : 123456789,
    "fiatVolume" : 123456789,
    "bid" : 123456789,
    "open" : 123456789,
    "lastPrice" : 123456789,
    "timestamp" : 123456789
  },
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]

     - returns: RequestBuilder<StandardTickerResultData> 
     */
    public class func v1exchangetickerWithRequestBuilder() -> RequestBuilder<StandardTickerResultData> {
        let path = "/v1/exchange/ticker"
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<StandardTickerResultData>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     Cancelled User Sell Orders
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func v1userexchangeaskcancelled(completion: ((data: OrderDataResponse?, error: ErrorType?) -> Void)) {
        v1userexchangeaskcancelledWithRequestBuilder().execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     Cancelled User Sell Orders
     - GET /v1/user/exchange/ask/cancelled
     - Returns all Cancelled User Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : [ {
    "vol" : 123456789,
    "rate" : 123456789,
    "orderID" : "aeiou",
    "time" : 123456789,
    "status" : "aeiou"
  } ],
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : [ {
    "vol" : 123456789,
    "rate" : 123456789,
    "orderID" : "aeiou",
    "time" : 123456789,
    "status" : "aeiou"
  } ],
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]

     - returns: RequestBuilder<OrderDataResponse> 
     */
    public class func v1userexchangeaskcancelledWithRequestBuilder() -> RequestBuilder<OrderDataResponse> {
        let path = "/v1/user/exchange/ask/cancelled"
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<OrderDataResponse>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     Completed User Sell Orders
     
     - parameter from: (query) From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
     - parameter to: (query) To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
     - parameter max: (query) Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
     - parameter offset: (query) Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func v1userexchangeaskcompleted(from from: Int64? = nil, to: Int64? = nil, max: Int32? = nil, offset: Int64? = nil, completion: ((data: OrderDataResponse?, error: ErrorType?) -> Void)) {
        v1userexchangeaskcompletedWithRequestBuilder(from: from, to: to, max: max, offset: offset).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     Completed User Sell Orders
     - GET /v1/user/exchange/ask/completed
     - Returns all completed Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : [ {
    "vol" : 123456789,
    "rate" : 123456789,
    "orderID" : "aeiou",
    "time" : 123456789,
    "status" : "aeiou"
  } ],
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : [ {
    "vol" : 123456789,
    "rate" : 123456789,
    "orderID" : "aeiou",
    "time" : 123456789,
    "status" : "aeiou"
  } ],
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]
     
     - parameter from: (query) From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
     - parameter to: (query) To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
     - parameter max: (query) Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
     - parameter offset: (query) Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)

     - returns: RequestBuilder<OrderDataResponse> 
     */
    public class func v1userexchangeaskcompletedWithRequestBuilder(from from: Int64? = nil, to: Int64? = nil, max: Int32? = nil, offset: Int64? = nil) -> RequestBuilder<OrderDataResponse> {
        let path = "/v1/user/exchange/ask/completed"
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [
            "from": from?.encodeToJSON(),
            "to": to?.encodeToJSON(),
            "max": max?.encodeToJSON(),
            "offset": offset?.encodeToJSON()
        ]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<OrderDataResponse>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**
     Pending User Sell Orders
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func v1userexchangeaskpending(completion: ((data: OrderDataResponse?, error: ErrorType?) -> Void)) {
        v1userexchangeaskpendingWithRequestBuilder().execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     Pending User Sell Orders
     - GET /v1/user/exchange/ask/pending
     - Returns all Open User Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : [ {
    "vol" : 123456789,
    "rate" : 123456789,
    "orderID" : "aeiou",
    "time" : 123456789,
    "status" : "aeiou"
  } ],
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : [ {
    "vol" : 123456789,
    "rate" : 123456789,
    "orderID" : "aeiou",
    "time" : 123456789,
    "status" : "aeiou"
  } ],
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]

     - returns: RequestBuilder<OrderDataResponse> 
     */
    public class func v1userexchangeaskpendingWithRequestBuilder() -> RequestBuilder<OrderDataResponse> {
        let path = "/v1/user/exchange/ask/pending"
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<OrderDataResponse>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     Cancelled User Buy Orders
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func v1userexchangebidcancelled(completion: ((data: OrderDataResponse?, error: ErrorType?) -> Void)) {
        v1userexchangebidcancelledWithRequestBuilder().execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     Cancelled User Buy Orders
     - GET /v1/user/exchange/bid/cancelled
     - Returns all Cancelled User Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : [ {
    "vol" : 123456789,
    "rate" : 123456789,
    "orderID" : "aeiou",
    "time" : 123456789,
    "status" : "aeiou"
  } ],
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : [ {
    "vol" : 123456789,
    "rate" : 123456789,
    "orderID" : "aeiou",
    "time" : 123456789,
    "status" : "aeiou"
  } ],
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]

     - returns: RequestBuilder<OrderDataResponse> 
     */
    public class func v1userexchangebidcancelledWithRequestBuilder() -> RequestBuilder<OrderDataResponse> {
        let path = "/v1/user/exchange/bid/cancelled"
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<OrderDataResponse>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     Completed User Buy Orders
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func v1userexchangebidcompleted(completion: ((data: OrderDataResponse?, error: ErrorType?) -> Void)) {
        v1userexchangebidcompletedWithRequestBuilder().execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     Completed User Buy Orders
     - GET /v1/user/exchange/bid/completed
     - Returns all completed Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : [ {
    "vol" : 123456789,
    "rate" : 123456789,
    "orderID" : "aeiou",
    "time" : 123456789,
    "status" : "aeiou"
  } ],
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : [ {
    "vol" : 123456789,
    "rate" : 123456789,
    "orderID" : "aeiou",
    "time" : 123456789,
    "status" : "aeiou"
  } ],
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]

     - returns: RequestBuilder<OrderDataResponse> 
     */
    public class func v1userexchangebidcompletedWithRequestBuilder() -> RequestBuilder<OrderDataResponse> {
        let path = "/v1/user/exchange/bid/completed"
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<OrderDataResponse>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     Pending User Buy Orders
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func v1userexchangebidpending(completion: ((data: OrderDataResponse?, error: ErrorType?) -> Void)) {
        v1userexchangebidpendingWithRequestBuilder().execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     Pending User Buy Orders
     - GET /v1/user/exchange/bid/pending
     - Returns all Open User Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : [ {
    "vol" : 123456789,
    "rate" : 123456789,
    "orderID" : "aeiou",
    "time" : 123456789,
    "status" : "aeiou"
  } ],
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : [ {
    "vol" : 123456789,
    "rate" : 123456789,
    "orderID" : "aeiou",
    "time" : 123456789,
    "status" : "aeiou"
  } ],
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]

     - returns: RequestBuilder<OrderDataResponse> 
     */
    public class func v1userexchangebidpendingWithRequestBuilder() -> RequestBuilder<OrderDataResponse> {
        let path = "/v1/user/exchange/bid/pending"
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<OrderDataResponse>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     Completed Exchange Trades
     
     - parameter from: (query) From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
     - parameter to: (query) To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
     - parameter max: (query) Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
     - parameter offset: (query) Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func v1userexchangetrades(from from: Int64? = nil, to: Int64? = nil, max: Int32? = nil, offset: Int64? = nil, completion: ((data: RateVolTimeTypeDataResponse?, error: ErrorType?) -> Void)) {
        v1userexchangetradesWithRequestBuilder(from: from, to: to, max: max, offset: offset).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     Completed Exchange Trades
     - GET /v1/exchange/trades
     - Returns all completed Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : [ {
    "vol" : 123456789,
    "rate" : 123456789,
    "time" : 123456789,
    "ordType" : "aeiou"
  } ],
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]
     - examples: [{contentType=application/json, example={
  "method" : "aeiou",
  "success" : true,
  "time" : "2000-01-23T04:56:07.000+00:00",
  "message" : [ {
    "vol" : 123456789,
    "rate" : 123456789,
    "time" : 123456789,
    "ordType" : "aeiou"
  } ],
  "title" : "aeiou"
}}, {contentType=application/xml, example=<null>
  <success>true</success>
  <method>string</method>
  <title>string</title>
  <time>2000-01-23T04:56:07.000Z</time>
</null>}]
     
     - parameter from: (query) From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional) (optional, default to 0)
     - parameter to: (query) To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional) (optional, default to 9223372036854776000)
     - parameter max: (query) Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional) (optional, default to 10)
     - parameter offset: (query) Offset defaults to 0 if input is invalid. (Optional) (optional, default to 0)

     - returns: RequestBuilder<RateVolTimeTypeDataResponse> 
     */
    public class func v1userexchangetradesWithRequestBuilder(from from: Int64? = nil, to: Int64? = nil, max: Int32? = nil, offset: Int64? = nil) -> RequestBuilder<RateVolTimeTypeDataResponse> {
        let path = "/v1/exchange/trades"
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [
            "from": from?.encodeToJSON(),
            "to": to?.encodeToJSON(),
            "max": max?.encodeToJSON(),
            "offset": offset?.encodeToJSON()
        ]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<RateVolTimeTypeDataResponse>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

}
