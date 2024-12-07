package com.github;

public class Solution {
    public int maximumProfit(int prices[]) {
        int n = prices.length;
        int minPrice = Integer.MAX_VALUE, maxProfit = 0;
        for(int num:prices){
            if(num<=minPrice)
                minPrice = num;
            else
                maxProfit = Math.max(maxProfit,num-minPrice);
        }
        return maxProfit;
    }
}
