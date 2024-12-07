package com.github;

class Solution {
    public int maximumProfit(int prices[]) {
        int n = prices.length;
        int totalProfit = 0, purchasePrice = 0;
        int i=0;
        while(i<n){
            while(i<(n-1) && prices[i]>=prices[i+1]){
                i++;
            }
            purchasePrice = prices[i];
            i++;
            while(i<(n-1) && prices[i]<=prices[i+1]){
                i++;
            }
            if(i>=n)
                break;
            totalProfit += (prices[i]-purchasePrice);
            i++;
        }
        return totalProfit;
    }
}
