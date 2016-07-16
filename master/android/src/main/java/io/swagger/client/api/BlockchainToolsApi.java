package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.FailResult;
import io.swagger.client.model.ValidAddressSearchDataResponse;
import io.swagger.client.model.ConfirmDataResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class BlockchainToolsApi {
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
  * Search Bitcoin Blockchain
  * Searches for a Bitcoin Address, Netki Wallet Name or Transaction ID.
   * @param any 
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return ValidAddressSearchDataResponse
  */
  public ValidAddressSearchDataResponse v1bitcoinsearchAddress (String any, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'any' is set
      if (any == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'any' when calling v1bitcoinsearchAddress",
      new ApiException(400, "Missing the required parameter 'any' when calling v1bitcoinsearchAddress"));
      }
  

  // create path and map variables
  String path = "/v1/bitcoin/search/{any}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "any" + "\\}", apiInvoker.escapeString(any.toString()));

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
           return (ValidAddressSearchDataResponse) ApiInvoker.deserialize(localVarResponse, "", ValidAddressSearchDataResponse.class);
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
   * Search Bitcoin Blockchain
   * Searches for a Bitcoin Address, Netki Wallet Name or Transaction ID.
   * @param any    * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1bitcoinsearchAddress (String any, String accept, final Response.Listener<ValidAddressSearchDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'any' is set
    if (any == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'any' when calling v1bitcoinsearchAddress",
         new ApiException(400, "Missing the required parameter 'any' when calling v1bitcoinsearchAddress"));
    }
    

    // create path and map variables
    String path = "/v1/bitcoin/search/{any}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "any" + "\\}", apiInvoker.escapeString(any.toString()));

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
              responseListener.onResponse((ValidAddressSearchDataResponse) ApiInvoker.deserialize(localVarResponse,  "", ValidAddressSearchDataResponse.class));
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
  * Get Confirmations
  * Searches for a Number of Confirmations on a transaction ID.
   * @param txid 
   * @param accept JSON, XML or CSV can be returned (Optional)
   * @return ConfirmDataResponse
  */
  public ConfirmDataResponse v1bitcoinsearchTxid (String txid, String accept) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'txid' is set
      if (txid == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'txid' when calling v1bitcoinsearchTxid",
      new ApiException(400, "Missing the required parameter 'txid' when calling v1bitcoinsearchTxid"));
      }
  

  // create path and map variables
  String path = "/v1/bitcoin/search/confirmation/{txid}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "txid" + "\\}", apiInvoker.escapeString(txid.toString()));

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
           return (ConfirmDataResponse) ApiInvoker.deserialize(localVarResponse, "", ConfirmDataResponse.class);
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
   * Get Confirmations
   * Searches for a Number of Confirmations on a transaction ID.
   * @param txid    * @param accept JSON, XML or CSV can be returned (Optional)
  */
  public void v1bitcoinsearchTxid (String txid, String accept, final Response.Listener<ConfirmDataResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'txid' is set
    if (txid == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'txid' when calling v1bitcoinsearchTxid",
         new ApiException(400, "Missing the required parameter 'txid' when calling v1bitcoinsearchTxid"));
    }
    

    // create path and map variables
    String path = "/v1/bitcoin/search/confirmation/{txid}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "txid" + "\\}", apiInvoker.escapeString(txid.toString()));

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
              responseListener.onResponse((ConfirmDataResponse) ApiInvoker.deserialize(localVarResponse,  "", ConfirmDataResponse.class));
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
