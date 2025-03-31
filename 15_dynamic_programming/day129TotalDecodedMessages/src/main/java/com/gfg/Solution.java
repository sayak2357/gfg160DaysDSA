package com.gfg;

import java.util.Arrays;

public class Solution {
    public int countWays(String digits) {
        int n = digits.length();
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[n] = 1;
        return countWaysHelper(0,n,digits,dp);
    }
    private int countWaysHelper(int idx, int n, String digits,int[] dp){
        if(dp[idx]!=-1)
            return dp[idx];
        int count = 0;
        int single = 0, tuple = 0;
        single = Integer.parseInt(digits.substring(idx,idx+1));
        if(single>0){
            count += countWaysHelper(idx+1,n,digits,dp);

            if(idx<(n-1)){
                tuple = Integer.parseInt(digits.substring(idx,idx+2));
                if(tuple<=26)
                    count += countWaysHelper(idx+2,n,digits,dp);
            }
        }
        dp[idx] = count;
        return count;

    }
}
