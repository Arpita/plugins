package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.RateDataResponse;
import io.swagger.client.model.FailResult;
import io.swagger.client.model.RateVolDataResponse;
import io.swagger.client.model.LastTradeDataResponse;
import io.swagger.client.model.RateDiffDataResponse;
import io.swagger.client.model.StandardTickerResultData;
import io.swagger.client.model.OrderDataResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExchangeTradeDataApi
 */
public class ExchangeTradeDataApiTest {

    private final ExchangeTradeDataApi api = new ExchangeTradeDataApi();

    
    /**
     * Lowest Ask
     *
     * Returns the Lowest Ask Rate in Json. The Amount is in Paisa.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1exchangeasklowTest() throws ApiException {
        String accept = null;
        // RateDataResponse response = api.v1exchangeasklow(accept);

        // TODO: test validations
    }
    
    /**
     * All Sell Orders
     *
     * Returns all Ask Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1exchangeaskordersTest() throws ApiException {
        String accept = null;
        // RateVolDataResponse response = api.v1exchangeaskorders(accept);

        // TODO: test validations
    }
    
    /**
     * Returns the Highest Bid in the Order Book
     *
     * Highest Bid.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1exchangebidhighTest() throws ApiException {
        String accept = null;
        // RateDataResponse response = api.v1exchangebidhigh(accept);

        // TODO: test validations
    }
    
    /**
     * All Buy Orders
     *
     * Returns all Bid Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1exchangebidordersTest() throws ApiException {
        String accept = null;
        // RateVolDataResponse response = api.v1exchangebidorders(accept);

        // TODO: test validations
    }
    
    /**
     * Last Trade
     *
     * Returns a summary of data from the Exchange.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1exchangelastTradeTest() throws ApiException {
        String accept = null;
        // LastTradeDataResponse response = api.v1exchangelastTrade(accept);

        // TODO: test validations
    }
    
    /**
     * Max 24 Hour Rate
     *
     * Returns the highest rate over the last 24 hours with the 10 minutely difference. The values are in paisa.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1exchangemax24HrTest() throws ApiException {
        String accept = null;
        // RateDiffDataResponse response = api.v1exchangemax24Hr(accept);

        // TODO: test validations
    }
    
    /**
     * Min 24 Hour Rate
     *
     * Returns the lowest rate over the last 24 hours with the 10 minutely difference. The values are in paisa.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1exchangemin24HrTest() throws ApiException {
        String accept = null;
        // RateDiffDataResponse response = api.v1exchangemin24Hr(accept);

        // TODO: test validations
    }
    
    /**
     * Exchange Ticker
     *
     * Returns a summary of data from the Exchange.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1exchangetickerTest() throws ApiException {
        String accept = null;
        // StandardTickerResultData response = api.v1exchangeticker(accept);

        // TODO: test validations
    }
    
    /**
     * Cancelled User Sell Orders
     *
     * Returns all Cancelled User Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangeaskcancelledTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // OrderDataResponse response = api.v1userexchangeaskcancelled(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Completed User Sell Orders
     *
     * Returns all completed Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangeaskcompletedTest() throws ApiException {
        String authorization = null;
        Long from = null;
        Long to = null;
        Integer max = null;
        Long offset = null;
        String accept = null;
        // OrderDataResponse response = api.v1userexchangeaskcompleted(authorization, from, to, max, offset, accept);

        // TODO: test validations
    }
    
    /**
     * Pending User Sell Orders
     *
     * Returns all Open User Sell Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangeaskpendingTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // OrderDataResponse response = api.v1userexchangeaskpending(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Cancelled User Buy Orders
     *
     * Returns all Cancelled User Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebidcancelledTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // OrderDataResponse response = api.v1userexchangebidcancelled(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Completed User Buy Orders
     *
     * Returns all completed Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebidcompletedTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // OrderDataResponse response = api.v1userexchangebidcompleted(authorization, accept);

        // TODO: test validations
    }
    
    /**
     * Pending User Buy Orders
     *
     * Returns all Open User Buy Orders in Json. The Rate is displayed in Paisa and Volume in Satoshis.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1userexchangebidpendingTest() throws ApiException {
        String authorization = null;
        String accept = null;
        // OrderDataResponse response = api.v1userexchangebidpending(authorization, accept);

        // TODO: test validations
    }
    
}
