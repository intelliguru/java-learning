package com.intelliguru.javastreams.util.leetcode;

public class BestTimeToBuyAndSellStock {

    public int processBestTime(int[] prices) {
//        int minPrice = prices[0];
//        int maxProfit = 0;
//
//        for (int i = 1; i < prices.length; i++) {
//            if (prices[i] < minPrice) {
//                minPrice = prices[i];
//            }
//
//            int currentProfit = prices[i] - minPrice;
//            if (currentProfit > maxProfit) {
//                maxProfit = currentProfit;
//            }
//        }
//        return maxProfit;

        return processBestTime2ndApproach(prices);
    }

    private int processBestTime2ndApproach(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price-minPrice);
        }
        return maxProfit;
    }
}
