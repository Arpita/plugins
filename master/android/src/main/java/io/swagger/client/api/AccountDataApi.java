package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.FailResult;
import io.swagger.client.model.BankSummaryDataResponse;
import io.swagger.client.model.DoubleDataResponse;
import io.swagger.client.model.KYCDataResponse;
import io.swagger.client.model.SuccCoinRefDataResponse;
import io.swagger.client.model.SuccRefDataResponse;
import io.swagger.client.model.AllRefDataResponse;
import io.swagger.client.model.TradeSummaryDataResponse;
import io.swagger.client.model.SuccessResult;
import io.swagger.client.model.UserSummaryDataResponse;
import io.swagger.client.model.WalletSummaryDataResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class AccountDataApi {
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
  * Exchange Bank Summary
  * Gets a Summary of Exchange Bank Data and Balances.
   * @param authorization API object to be added
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return BankSummaryDataResponse
  */
  public BankSummaryDataResponse v1exchangebanksummary (String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1exchangebanksummary",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1exchangebanksummary"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/bank/summary".replaceAll("\\{format\\}","json");

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
           return (BankSummaryDataResponse) ApiInvoker.deserialize(localVarResponse, "", BankSummaryDataResponse.class);
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
   * Exchange Bank Summary
   * Gets a Summary of Exchange Bank Data and Balances.
   * @param authorization API object to be added   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1exchangebanksummary (String authorization, String accept, final Response.Listener<BankSummaryDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1exchangebanksummary",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1exchangebanksummary"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/bank/summary".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((BankSummaryDataResponse) ApiInvoker.deserialize(localVarResponse,  "", BankSummaryDataResponse.class));
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
  * Users Coin Fee Percentage
  * Returns the users coin fee percentage. The response is in percentage.
   * @param authorization API object to be added
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return DoubleDataResponse
  */
  public DoubleDataResponse v1exchangeusercoinfee (String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  

  // create path and map variables
  String path = "/v1/user/exchange/coin/fee".replaceAll("\\{format\\}","json");

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
           return (DoubleDataResponse) ApiInvoker.deserialize(localVarResponse, "", DoubleDataResponse.class);
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
   * Users Coin Fee Percentage
   * Returns the users coin fee percentage. The response is in percentage.
   * @param authorization API object to be added   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1exchangeusercoinfee (String authorization, String accept, final Response.Listener<DoubleDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  

    // create path and map variables
    String path = "/v1/user/exchange/coin/fee".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((DoubleDataResponse) ApiInvoker.deserialize(localVarResponse,  "", DoubleDataResponse.class));
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
  * Users Fiat Fee Percentage
  * Returns the users fiat fee percentage. The response is in percentage.
   * @param authorization API object to be added
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return DoubleDataResponse
  */
  public DoubleDataResponse v1exchangeuserfiatfee (String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1exchangeuserfiatfee",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1exchangeuserfiatfee"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/fiat/fee".replaceAll("\\{format\\}","json");

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
           return (DoubleDataResponse) ApiInvoker.deserialize(localVarResponse, "", DoubleDataResponse.class);
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
   * Users Fiat Fee Percentage
   * Returns the users fiat fee percentage. The response is in percentage.
   * @param authorization API object to be added   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1exchangeuserfiatfee (String authorization, String accept, final Response.Listener<DoubleDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1exchangeuserfiatfee",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1exchangeuserfiatfee"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/fiat/fee".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((DoubleDataResponse) ApiInvoker.deserialize(localVarResponse,  "", DoubleDataResponse.class));
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
  * Coinsecure.me Netki Lookup
  * Searches for a coinsecure.me Netki Wallet Name and responds with an Address model output.
   * @param netkiName 
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return DoubleDataResponse
  */
  public DoubleDataResponse v1netkisearchNetkiName (String netkiName, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'netkiName' is set
      if (netkiName == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'netkiName' when calling v1netkisearchNetkiName",
      new ApiException(400, "Missing the required parameter 'netkiName' when calling v1netkisearchNetkiName"));
      }
  

  // create path and map variables
  String path = "/v1/netki/search/{netkiName}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "netkiName" + "\\}", apiInvoker.escapeString(netkiName.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();


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
           return (DoubleDataResponse) ApiInvoker.deserialize(localVarResponse, "", DoubleDataResponse.class);
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
   * Coinsecure.me Netki Lookup
   * Searches for a coinsecure.me Netki Wallet Name and responds with an Address model output.
   * @param netkiName    * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1netkisearchNetkiName (String netkiName, String accept, final Response.Listener<DoubleDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'netkiName' is set
    if (netkiName == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'netkiName' when calling v1netkisearchNetkiName",
         new ApiException(400, "Missing the required parameter 'netkiName' when calling v1netkisearchNetkiName"));
    }
    

    // create path and map variables
    String path = "/v1/netki/search/{netkiName}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "netkiName" + "\\}", apiInvoker.escapeString(netkiName.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


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
              responseListener.onResponse((DoubleDataResponse) ApiInvoker.deserialize(localVarResponse,  "", DoubleDataResponse.class));
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
  * Gets KYC Status Details
  * Gets Users KYC Status Details.
   * @param authorization API object to be added
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return KYCDataResponse
  */
  public KYCDataResponse v1userexchangekycs (String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangekycs",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangekycs"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/kycs".replaceAll("\\{format\\}","json");

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
           return (KYCDataResponse) ApiInvoker.deserialize(localVarResponse, "", KYCDataResponse.class);
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
   * Gets KYC Status Details
   * Gets Users KYC Status Details.
   * @param authorization API object to be added   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userexchangekycs (String authorization, String accept, final Response.Listener<KYCDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangekycs",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangekycs"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/kycs".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((KYCDataResponse) ApiInvoker.deserialize(localVarResponse,  "", KYCDataResponse.class));
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
  * Users Paid Fiat Referrals
  * Returns the Users Paid Coin Referrals.
   * @param authorization API object to be added
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return SuccCoinRefDataResponse
  */
  public SuccCoinRefDataResponse v1userexchangereferralcoinpaid (String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangereferralcoinpaid",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangereferralcoinpaid"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/referral/coin/paid".replaceAll("\\{format\\}","json");

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
           return (SuccCoinRefDataResponse) ApiInvoker.deserialize(localVarResponse, "", SuccCoinRefDataResponse.class);
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
   * Users Paid Fiat Referrals
   * Returns the Users Paid Coin Referrals.
   * @param authorization API object to be added   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userexchangereferralcoinpaid (String authorization, String accept, final Response.Listener<SuccCoinRefDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangereferralcoinpaid",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangereferralcoinpaid"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/referral/coin/paid".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((SuccCoinRefDataResponse) ApiInvoker.deserialize(localVarResponse,  "", SuccCoinRefDataResponse.class));
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
  * Gets Users Successful Referral Links
  * Gets Users Successful Referral Links that can be used during signup.
   * @param authorization API object to be added
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return SuccRefDataResponse
  */
  public SuccRefDataResponse v1userexchangereferralcoinsuccessful (String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangereferralcoinsuccessful",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangereferralcoinsuccessful"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/referral/coin/successful".replaceAll("\\{format\\}","json");

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
           return (SuccRefDataResponse) ApiInvoker.deserialize(localVarResponse, "", SuccRefDataResponse.class);
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
   * Gets Users Successful Referral Links
   * Gets Users Successful Referral Links that can be used during signup.
   * @param authorization API object to be added   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userexchangereferralcoinsuccessful (String authorization, String accept, final Response.Listener<SuccRefDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangereferralcoinsuccessful",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangereferralcoinsuccessful"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/referral/coin/successful".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((SuccRefDataResponse) ApiInvoker.deserialize(localVarResponse,  "", SuccRefDataResponse.class));
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
  * Users Paid Fiat Referrals
  * Returns the Users Paid Fiat Referrals.
   * @param authorization API object to be added
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return SuccCoinRefDataResponse
  */
  public SuccCoinRefDataResponse v1userexchangereferralfiatpaid (String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangereferralfiatpaid",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangereferralfiatpaid"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/referral/fiat/paid".replaceAll("\\{format\\}","json");

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
           return (SuccCoinRefDataResponse) ApiInvoker.deserialize(localVarResponse, "", SuccCoinRefDataResponse.class);
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
   * Users Paid Fiat Referrals
   * Returns the Users Paid Fiat Referrals.
   * @param authorization API object to be added   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userexchangereferralfiatpaid (String authorization, String accept, final Response.Listener<SuccCoinRefDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangereferralfiatpaid",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangereferralfiatpaid"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/referral/fiat/paid".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((SuccCoinRefDataResponse) ApiInvoker.deserialize(localVarResponse,  "", SuccCoinRefDataResponse.class));
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
  * Gets Users Referral Links
  * Gets Users Referral Links that can be used during signup.
   * @param authorization API object to be added
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return AllRefDataResponse
  */
  public AllRefDataResponse v1userexchangereferrals (String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangereferrals",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangereferrals"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/referrals".replaceAll("\\{format\\}","json");

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
           return (AllRefDataResponse) ApiInvoker.deserialize(localVarResponse, "", AllRefDataResponse.class);
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
   * Gets Users Referral Links
   * Gets Users Referral Links that can be used during signup.
   * @param authorization API object to be added   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userexchangereferrals (String authorization, String accept, final Response.Listener<AllRefDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangereferrals",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangereferrals"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/referrals".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((AllRefDataResponse) ApiInvoker.deserialize(localVarResponse,  "", AllRefDataResponse.class));
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
  * Exchange Trade Summary
  * Gets a Summary of Exchange Trade Data.
   * @param authorization API object to be added
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return TradeSummaryDataResponse
  */
  public TradeSummaryDataResponse v1userexchangetradesummary (String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangetradesummary",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangetradesummary"));
      }
  

  // create path and map variables
  String path = "/v1/user/exchange/trade/summary".replaceAll("\\{format\\}","json");

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
           return (TradeSummaryDataResponse) ApiInvoker.deserialize(localVarResponse, "", TradeSummaryDataResponse.class);
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
   * Exchange Trade Summary
   * Gets a Summary of Exchange Trade Data.
   * @param authorization API object to be added   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userexchangetradesummary (String authorization, String accept, final Response.Listener<TradeSummaryDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userexchangetradesummary",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1userexchangetradesummary"));
    }
    

    // create path and map variables
    String path = "/v1/user/exchange/trade/summary".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((TradeSummaryDataResponse) ApiInvoker.deserialize(localVarResponse,  "", TradeSummaryDataResponse.class));
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
  * Login Token Email
  * Retrieves details of a Login Token
   * @param token 
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return SuccessResult
  */
  public SuccessResult v1userlogintokenToken (String token, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'token' is set
      if (token == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'token' when calling v1userlogintokenToken",
      new ApiException(400, "Missing the required parameter 'token' when calling v1userlogintokenToken"));
      }
  

  // create path and map variables
  String path = "/v1/user/login/token/{token}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "token" + "\\}", apiInvoker.escapeString(token.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();


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
           return (SuccessResult) ApiInvoker.deserialize(localVarResponse, "", SuccessResult.class);
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
   * Login Token Email
   * Retrieves details of a Login Token
   * @param token    * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userlogintokenToken (String token, String accept, final Response.Listener<SuccessResult> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'token' is set
    if (token == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'token' when calling v1userlogintokenToken",
         new ApiException(400, "Missing the required parameter 'token' when calling v1userlogintokenToken"));
    }
    

    // create path and map variables
    String path = "/v1/user/login/token/{token}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "token" + "\\}", apiInvoker.escapeString(token.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();


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
              responseListener.onResponse((SuccessResult) ApiInvoker.deserialize(localVarResponse,  "", SuccessResult.class));
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
  * Exchange Bank Summary
  * Gets a Summary of Exchange Bank Data and Balances.
   * @param authorization API object to be added
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return UserSummaryDataResponse
  */
  public UserSummaryDataResponse v1usersummary (String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1usersummary",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1usersummary"));
      }
  

  // create path and map variables
  String path = "/v1/user/summary".replaceAll("\\{format\\}","json");

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
           return (UserSummaryDataResponse) ApiInvoker.deserialize(localVarResponse, "", UserSummaryDataResponse.class);
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
   * Exchange Bank Summary
   * Gets a Summary of Exchange Bank Data and Balances.
   * @param authorization API object to be added   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1usersummary (String authorization, String accept, final Response.Listener<UserSummaryDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1usersummary",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1usersummary"));
    }
    

    // create path and map variables
    String path = "/v1/user/summary".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((UserSummaryDataResponse) ApiInvoker.deserialize(localVarResponse,  "", UserSummaryDataResponse.class));
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
  * Exchange Bank Summary
  * Gets a Summary of Exchange Bank Data and Balances.
   * @param authorization API object to be added
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return WalletSummaryDataResponse
  */
  public WalletSummaryDataResponse v1userwalletsummary (String authorization, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'authorization' is set
      if (authorization == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userwalletsummary",
      new ApiException(400, "Missing the required parameter 'authorization' when calling v1userwalletsummary"));
      }
  

  // create path and map variables
  String path = "/v1/user/wallet/summary".replaceAll("\\{format\\}","json");

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
           return (WalletSummaryDataResponse) ApiInvoker.deserialize(localVarResponse, "", WalletSummaryDataResponse.class);
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
   * Exchange Bank Summary
   * Gets a Summary of Exchange Bank Data and Balances.
   * @param authorization API object to be added   * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1userwalletsummary (String authorization, String accept, final Response.Listener<WalletSummaryDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'authorization' when calling v1userwalletsummary",
         new ApiException(400, "Missing the required parameter 'authorization' when calling v1userwalletsummary"));
    }
    

    // create path and map variables
    String path = "/v1/user/wallet/summary".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((WalletSummaryDataResponse) ApiInvoker.deserialize(localVarResponse,  "", WalletSummaryDataResponse.class));
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
