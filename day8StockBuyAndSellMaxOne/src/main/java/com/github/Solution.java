package com.github;

public class Solution {
    public int maximumProfit(int prices[]) {
        int n = prices.length;
        int minPrice = Integer.MAX_VALUE, maxPrice = Integer.MIN_VALUE, maxProfit = 0;
        int[] minPricesArr =  new int[n];
        for(int i=0;i<n;i++){
            minPrice = Math.min(minPrice,prices[i]);
            minPricesArr[i] = minPrice;
        }
        for(int i=n-1;i>=0;i--){
            maxPrice = Math.max(maxPrice,prices[i]);
            maxProfit = Math.max(maxProfit,maxPrice-minPricesArr[i]);
        }
        return maxProfit;
    }
}
