package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.TradeAddressDataResponse;
import io.swagger.client.model.FailResult;
import io.swagger.client.model.VolDataResponse;
import io.swagger.client.model.CoinDepDataResponse;
import io.swagger.client.model.TradeCoinWithdrawDataResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ExchangeBankCoinDataApi {
  String basePath = "https://api.coinsecure.in/";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Exchange Coin Addresses
  * Gets a List of Users Exchange Bitcoin Deposit Addresses.
   * @param authorization API object to be added
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return TradeAddressDataResponse
  */
  public TradeAddressDataResponse v1userexchangebankcoinaddresses (String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankcoinaddresses",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoinaddresses"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/bank/coin/addresses".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();


          headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
          headerParams.put("accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (TradeAddressDataResponse) ApiInvoker.deserialize(localVarResponse, "", TradeAddressDataResponse.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Exchange Coin Addresses
   * Gets a List of Users Exchange Bitcoin Deposit Addresses.
   * @param authorization API object to be added   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userexchangebankcoinaddresses (String authorization, String accept, final Response.Listener<TradeAddressDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankcoinaddresses",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoinaddresses"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/bank/coin/addresses".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((TradeAddressDataResponse) ApiInvoker.deserialize(localVarResponse,  "", TradeAddressDataResponse.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Available Exchange Coin Balance
  * Returns balance which is in Available for Trades. The response is in satoshis.
   * @param authorization API object to be added
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return VolDataResponse
  */
  public VolDataResponse v1userexchangebankcoinbalanceavailable (String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankcoinbalanceavailable",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoinbalanceavailable"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/bank/coin/balance/total".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();


          headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
          headerParams.put("accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (VolDataResponse) ApiInvoker.deserialize(localVarResponse, "", VolDataResponse.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Available Exchange Coin Balance
   * Returns balance which is in Available for Trades. The response is in satoshis.
   * @param authorization API object to be added   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userexchangebankcoinbalanceavailable (String authorization, String accept, final Response.Listener<VolDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankcoinbalanceavailable",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoinbalanceavailable"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/bank/coin/balance/total".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((VolDataResponse) ApiInvoker.deserialize(localVarResponse,  "", VolDataResponse.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * In Trade Coin Balance
  * Returns in-trade or pending coin balance in satoshi.
   * @param authorization API object to be added
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return VolDataResponse
  */
  public VolDataResponse v1userexchangebankcoinbalancepending (String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankcoinbalancepending",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoinbalancepending"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/bank/coin/balance/pending".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();


          headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
          headerParams.put("accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (VolDataResponse) ApiInvoker.deserialize(localVarResponse, "", VolDataResponse.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * In Trade Coin Balance
   * Returns in-trade or pending coin balance in satoshi.
   * @param authorization API object to be added   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userexchangebankcoinbalancepending (String authorization, String accept, final Response.Listener<VolDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankcoinbalancepending",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoinbalancepending"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/bank/coin/balance/pending".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((VolDataResponse) ApiInvoker.deserialize(localVarResponse,  "", VolDataResponse.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Total Exchange Coin Balance
  * Returns users total coin balance in satoshis. Pending + Available
   * @param authorization API object to be added
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return VolDataResponse
  */
  public VolDataResponse v1userexchangebankcoinbalancetotal (String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankcoinbalancetotal",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoinbalancetotal"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/bank/coin/balance/available".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();


          headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
          headerParams.put("accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (VolDataResponse) ApiInvoker.deserialize(localVarResponse, "", VolDataResponse.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Total Exchange Coin Balance
   * Returns users total coin balance in satoshis. Pending + Available
   * @param authorization API object to be added   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userexchangebankcoinbalancetotal (String authorization, String accept, final Response.Listener<VolDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankcoinbalancetotal",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoinbalancetotal"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/bank/coin/balance/available".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((VolDataResponse) ApiInvoker.deserialize(localVarResponse,  "", VolDataResponse.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Cancelled Exchange Coin Deposits
  * Gets a List of Cancelled Exchange Coin Deposits. The value and fees are in paisa.
   * @param authorization API object to be added
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
   * @param offset Offset defaults to 0 if input is invalid. (Optional)
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return CoinDepDataResponse
  */
  public CoinDepDataResponse v1userexchangebankcoindepositcancelled (String authorization, Long from, Long to, Integer max, Long offset, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankcoindepositcancelled",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoindepositcancelled"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/bank/coin/deposit/cancelled".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "from", from));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "to", to));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "max", max));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));

          headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
          headerParams.put("accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (CoinDepDataResponse) ApiInvoker.deserialize(localVarResponse, "", CoinDepDataResponse.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Cancelled Exchange Coin Deposits
   * Gets a List of Cancelled Exchange Coin Deposits. The value and fees are in paisa.
   * @param authorization API object to be added   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)   * @param offset Offset defaults to 0 if input is invalid. (Optional)   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userexchangebankcoindepositcancelled (String authorization, Long from, Long to, Integer max, Long offset, String accept, final Response.Listener<CoinDepDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankcoindepositcancelled",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoindepositcancelled"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/bank/coin/deposit/cancelled".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "from", from));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "to", to));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "max", max));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));

    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((CoinDepDataResponse) ApiInvoker.deserialize(localVarResponse,  "", CoinDepDataResponse.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Unverified Exchange Coin Deposits
  * Gets a List of Unverified Exchange Coin Deposits. The value and fees are in paisa.
   * @param authorization API object to be added
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
   * @param offset Offset defaults to 0 if input is invalid. (Optional)
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return CoinDepDataResponse
  */
  public CoinDepDataResponse v1userexchangebankcoindepositunverified (String authorization, Long from, Long to, Integer max, Long offset, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankcoindepositunverified",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoindepositunverified"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/bank/coin/deposit/unverified".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "from", from));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "to", to));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "max", max));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));

          headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
          headerParams.put("accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (CoinDepDataResponse) ApiInvoker.deserialize(localVarResponse, "", CoinDepDataResponse.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Unverified Exchange Coin Deposits
   * Gets a List of Unverified Exchange Coin Deposits. The value and fees are in paisa.
   * @param authorization API object to be added   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)   * @param offset Offset defaults to 0 if input is invalid. (Optional)   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userexchangebankcoindepositunverified (String authorization, Long from, Long to, Integer max, Long offset, String accept, final Response.Listener<CoinDepDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankcoindepositunverified",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoindepositunverified"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/bank/coin/deposit/unverified".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "from", from));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "to", to));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "max", max));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));

    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((CoinDepDataResponse) ApiInvoker.deserialize(localVarResponse,  "", CoinDepDataResponse.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Verified Exchange Coin Deposits
  * Gets a List of Verified Exchange Coin Deposits. The value and fees are in paisa.
   * @param authorization API object to be added
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
   * @param offset Offset defaults to 0 if input is invalid. (Optional)
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return CoinDepDataResponse
  */
  public CoinDepDataResponse v1userexchangebankcoindepositverified (String authorization, Long from, Long to, Integer max, Long offset, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankcoindepositverified",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoindepositverified"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/bank/coin/deposit/verified".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "from", from));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "to", to));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "max", max));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));

          headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
          headerParams.put("accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (CoinDepDataResponse) ApiInvoker.deserialize(localVarResponse, "", CoinDepDataResponse.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Verified Exchange Coin Deposits
   * Gets a List of Verified Exchange Coin Deposits. The value and fees are in paisa.
   * @param authorization API object to be added   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)   * @param offset Offset defaults to 0 if input is invalid. (Optional)   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userexchangebankcoindepositverified (String authorization, Long from, Long to, Integer max, Long offset, String accept, final Response.Listener<CoinDepDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankcoindepositverified",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoindepositverified"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/bank/coin/deposit/verified".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "from", from));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "to", to));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "max", max));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));

    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((CoinDepDataResponse) ApiInvoker.deserialize(localVarResponse,  "", CoinDepDataResponse.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Cancelled Exchange Coin Withdrawals
  * Gets a List of Cancelled Coin Withdrawals. The value and fees are in satoshis.
   * @param authorization API object to be added
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
   * @param offset Offset defaults to 0 if input is invalid. (Optional)
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return TradeCoinWithdrawDataResponse
  */
  public TradeCoinWithdrawDataResponse v1userexchangebankcoinwithdrawcancelled (String authorization, Long from, Long to, Integer max, Long offset, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankcoinwithdrawcancelled",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoinwithdrawcancelled"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/bank/coin/withdraw/cancelled".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "from", from));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "to", to));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "max", max));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));

          headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
          headerParams.put("accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (TradeCoinWithdrawDataResponse) ApiInvoker.deserialize(localVarResponse, "", TradeCoinWithdrawDataResponse.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Cancelled Exchange Coin Withdrawals
   * Gets a List of Cancelled Coin Withdrawals. The value and fees are in satoshis.
   * @param authorization API object to be added   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)   * @param offset Offset defaults to 0 if input is invalid. (Optional)   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userexchangebankcoinwithdrawcancelled (String authorization, Long from, Long to, Integer max, Long offset, String accept, final Response.Listener<TradeCoinWithdrawDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankcoinwithdrawcancelled",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoinwithdrawcancelled"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/bank/coin/withdraw/cancelled".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "from", from));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "to", to));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "max", max));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));

    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((TradeCoinWithdrawDataResponse) ApiInvoker.deserialize(localVarResponse,  "", TradeCoinWithdrawDataResponse.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Completed Exchange Coin Withdrawals
  * Gets a List of Completed Coin Withdrawals. The value and fees are in satoshis.
   * @param authorization API object to be added
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
   * @param offset Offset defaults to 0 if input is invalid. (Optional)
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return TradeCoinWithdrawDataResponse
  */
  public TradeCoinWithdrawDataResponse v1userexchangebankcoinwithdrawcompleted (String authorization, Long from, Long to, Integer max, Long offset, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankcoinwithdrawcompleted",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoinwithdrawcompleted"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/bank/coin/withdraw/completed".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "from", from));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "to", to));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "max", max));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));

          headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
          headerParams.put("accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (TradeCoinWithdrawDataResponse) ApiInvoker.deserialize(localVarResponse, "", TradeCoinWithdrawDataResponse.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Completed Exchange Coin Withdrawals
   * Gets a List of Completed Coin Withdrawals. The value and fees are in satoshis.
   * @param authorization API object to be added   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)   * @param offset Offset defaults to 0 if input is invalid. (Optional)   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userexchangebankcoinwithdrawcompleted (String authorization, Long from, Long to, Integer max, Long offset, String accept, final Response.Listener<TradeCoinWithdrawDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankcoinwithdrawcompleted",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoinwithdrawcompleted"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/bank/coin/withdraw/completed".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "from", from));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "to", to));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "max", max));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));

    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((TradeCoinWithdrawDataResponse) ApiInvoker.deserialize(localVarResponse,  "", TradeCoinWithdrawDataResponse.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Unverified Exchange Coin Withdrawals
  * Gets a List of Unverified Exchange Coin Withdrawals. The value and fees are in satoshis.
   * @param authorization API object to be added
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
   * @param offset Offset defaults to 0 if input is invalid. (Optional)
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return TradeCoinWithdrawDataResponse
  */
  public TradeCoinWithdrawDataResponse v1userexchangebankcoinwithdrawunverified (String authorization, Long from, Long to, Integer max, Long offset, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankcoinwithdrawunverified",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoinwithdrawunverified"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/bank/coin/withdraw/unverified".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "from", from));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "to", to));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "max", max));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));

          headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
          headerParams.put("accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (TradeCoinWithdrawDataResponse) ApiInvoker.deserialize(localVarResponse, "", TradeCoinWithdrawDataResponse.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Unverified Exchange Coin Withdrawals
   * Gets a List of Unverified Exchange Coin Withdrawals. The value and fees are in satoshis.
   * @param authorization API object to be added   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)   * @param offset Offset defaults to 0 if input is invalid. (Optional)   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userexchangebankcoinwithdrawunverified (String authorization, Long from, Long to, Integer max, Long offset, String accept, final Response.Listener<TradeCoinWithdrawDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankcoinwithdrawunverified",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoinwithdrawunverified"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/bank/coin/withdraw/unverified".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "from", from));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "to", to));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "max", max));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));

    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((TradeCoinWithdrawDataResponse) ApiInvoker.deserialize(localVarResponse,  "", TradeCoinWithdrawDataResponse.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Verified Exchange Coin Withdrawals
  * Gets a List of Verified Exchange Coin Withdrawals. The value and fees are in satoshis.
   * @param authorization API object to be added
   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)
   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)
   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)
   * @param offset Offset defaults to 0 if input is invalid. (Optional)
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return TradeCoinWithdrawDataResponse
  */
  public TradeCoinWithdrawDataResponse v1userexchangebankcoinwithdrawverified (String authorization, Long from, Long to, Integer max, Long offset, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankcoinwithdrawverified",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoinwithdrawverified"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/bank/coin/withdraw/verified".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "from", from));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "to", to));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "max", max));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));

          headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
          headerParams.put("accept", ApiInvoker.parameterToString(accept));

      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (TradeCoinWithdrawDataResponse) ApiInvoker.deserialize(localVarResponse, "", TradeCoinWithdrawDataResponse.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Verified Exchange Coin Withdrawals
   * Gets a List of Verified Exchange Coin Withdrawals. The value and fees are in satoshis.
   * @param authorization API object to be added   * @param from From date in Epoch, defaults to 0 if invalid input or greater than current time. (Optional)   * @param to To Date in Epoch, defaults to current time if invalid input or greater than current time. (Optional)   * @param max Max defaults to 10 if invalid input and defaults to 100 if greater than 100. (Optional)   * @param offset Offset defaults to 0 if input is invalid. (Optional)   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userexchangebankcoinwithdrawverified (String authorization, Long from, Long to, Integer max, Long offset, String accept, final Response.Listener<TradeCoinWithdrawDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangebankcoinwithdrawverified",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangebankcoinwithdrawverified"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/bank/coin/withdraw/verified".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "from", from));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "to", to));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "max", max));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));

    headerParams.put("Authorization", ApiInvoker.parameterToString(authorization));
    headerParams.put("accept", ApiInvoker.parameterToString(accept));

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((TradeCoinWithdrawDataResponse) ApiInvoker.deserialize(localVarResponse,  "", TradeCoinWithdrawDataResponse.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
