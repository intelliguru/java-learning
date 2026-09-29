package com.intelliguru.javastreams.util.leetcode;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStockTest {

    private final BestTimeToBuyAndSellStock stock =
            new BestTimeToBuyAndSellStock();

    @Test
    void shouldReturnMaximumProfitForNormalCase() {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = stock.processBestTime(prices);

        assertEquals(5, result);
    }

    @Test
    void shouldReturnZeroWhenPricesAreDecreasing() {
        int[] prices = {7, 6, 4, 3, 1};

        int result = stock.processBestTime(prices);

        assertEquals(0, result);
    }

    @Test
    void shouldReturnProfitWhenPricesAreIncreasing() {
        int[] prices = {1, 2, 3, 4, 5};

        int result = stock.processBestTime(prices);

        assertEquals(4, result);
    }

    @Test
    void shouldReturnProfitForTwoElements() {
        int[] prices = {1, 5};

        int result = stock.processBestTime(prices);

        assertEquals(4, result);
    }

    @Test
    void shouldReturnZeroForTwoElementsWhenPriceDecreases() {
        int[] prices = {5, 1};

        int result = stock.processBestTime(prices);

        assertEquals(0, result);
    }

    @Test
    void shouldReturnZeroWhenAllPricesAreSame() {
        int[] prices = {5, 5, 5, 5, 5};

        int result = stock.processBestTime(prices);

        assertEquals(0, result);
    }

    @Test
    void shouldReturnZeroForSinglePrice() {
        int[] prices = {5};

        int result = stock.processBestTime(prices);

        assertEquals(0, result);
    }

    @Test
    void shouldReturnMaximumProfitWhenLowestPriceIsFirst() {
        int[] prices = {1, 5, 3, 8, 4};

        int result = stock.processBestTime(prices);

        assertEquals(7, result);
    }

    @Test
    void shouldReturnMaximumProfitWhenHighestPriceIsLast() {
        int[] prices = {8, 2, 4, 1, 10};

        int result = stock.processBestTime(prices);

        assertEquals(9, result);
    }

    @Test
    void shouldHandleLowestPriceInMiddle() {
        int[] prices = {10, 8, 2, 5, 7, 6};

        int result = stock.processBestTime(prices);

        assertEquals(5, result);
    }

    @Test
    void shouldNotSellBeforeBuying() {
        int[] prices = {10, 1, 5};

        int result = stock.processBestTime(prices);

        assertEquals(4, result);
    }

    @Test
    void shouldChooseBestProfitNotFirstAvailableProfit() {
        int[] prices = {3, 8, 1, 10};

        int result = stock.processBestTime(prices);

        assertEquals(9, result);
    }

    @Test
    void shouldHandleMultiplePossibleProfits() {
        int[] prices = {5, 2, 8, 1, 7};

        int result = stock.processBestTime(prices);

        assertEquals(6, result);
    }

    @Test
    void shouldHandleLargePriceDifference() {
        int[] prices = {10000, 1, 100000};

        int result = stock.processBestTime(prices);

        assertEquals(99999, result);
    }
}