package com.gfg;

import java.util.Arrays;

public class Solution {
    public int count(int coins[], int sum) {
        Arrays.sort(coins);
        int n = coins.length;
        int[][] dp = new int[n+1][sum+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i==0){
                    if(j==0)
                        dp[i][j] = 1;
                    else
                        dp[i][j] = 0;
                }
                else{
                    int amount = coins[i-1];
                    if(amount>j){
                        dp[i][j] = dp[i-1][j];
                    }
                    else{
                        dp[i][j] = dp[i-1][j]+dp[i][j-amount];
                    }
                }
            }
        }
        return dp[n][sum];
    }

}
