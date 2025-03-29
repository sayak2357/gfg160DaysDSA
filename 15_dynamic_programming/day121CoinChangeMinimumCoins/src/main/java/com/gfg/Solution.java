package com.gfg;

import java.util.Arrays;

public class Solution {

    public int minCoins(int coins[], int sum) {
        int[] dp = new int[sum+1];
        Arrays.fill(dp,sum+1);
        dp[0] = 0;
        for(int a=1;a<=sum;a++){
            for(int c:coins){
                if(c<=a){
                    dp[a] = Math.min(dp[a],1+dp[a-c]);
                }
            }
        }
        return dp[sum]==(sum+1)?-1:dp[sum];

    }
}
