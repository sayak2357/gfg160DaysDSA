package com.gfg;

public class Solution {
    int countWays(int n) {
        // your code here
        if(n<3)
            return n;
        int dp1 = 1, dp2 =2;
        int dp3 = 0;
        for(int i=3;i<=n;i++){
            dp3 = dp1+dp2;
            dp1 = dp2;
            dp2 = dp3;
        }
        return dp3;
    }

}