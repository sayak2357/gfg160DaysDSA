package com.gfg;

public class Solution {
    static int maxProfit(int prices[], int k) {
        int n = prices.length;
        int[][][] dp = new int[n+1][2][k+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=1;j++){
                for(int x=0;x<=k;x++){
                    if(x==0 || i==n)
                        dp[i][j][x] = 0;
                    else
                        dp[i][j][x] = -1;
                }
            }
        }
        return maxProfitHelper(0,1,n,prices,dp,k);
    }
    static int maxProfitHelper(int idx, int buy, int n, int[] prices, int[][][] dp, int cap){
        if(dp[idx][buy][cap]!=-1)
            return dp[idx][buy][cap];
        int profit = 0;
        if(buy==1){
            profit = Math.max(-prices[idx]+maxProfitHelper(idx+1,0,n,prices,dp,cap),
                    maxProfitHelper(idx+1,1,n,prices,dp,cap));
        }
        else{
            profit = Math.max(prices[idx]+maxProfitHelper(idx+1,1,n,prices,dp,cap-1),
                    maxProfitHelper(idx+1,0,n,prices,dp,cap));
        }
        dp[idx][buy][cap] = profit;
        return profit;
    }
}
