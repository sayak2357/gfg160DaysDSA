package com.gfg;

import java.util.Arrays;

public class Solution {
    static int countWays(String s) {
        int n = s.length();
        int[][][] dp = new int[n][n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return solve(0,n-1,1,s,dp);
    }
    static int solve(int i, int j, int isTrue,String s,int[][][] dp){
        if(i>j)
            return 0;
        if(i==j){
            if(isTrue==1)
                return s.charAt(i)=='T'?1:0;
            else
                return s.charAt(i)=='F'?1:0;
        }
        if(dp[i][j][isTrue]!=-1)
            return dp[i][j][isTrue];
        int ways = 0;
        for(int ind=i+1;ind<=j-1;ind+=2){
            int LT = solve(i,ind-1,1,s,dp);
            int LF = solve(i,ind-1,0,s,dp);
            int RT = solve(ind+1,j,1,s,dp);
            int RF = solve(ind+1,j,0,s,dp);

            if(s.charAt(ind)=='&'){
                if(isTrue==1){
                    ways += (LT*RT);
                }
                else{
                    ways += (LT*RF)+(LF*RT)+(LF*RF);
                }
            }
            else if(s.charAt(ind)=='|'){
                if(isTrue==1){
                    ways += (LT*RT)+(LT*RF)+(LF*RT);
                }
                else{
                    ways += (LF*RF);
                }
            }
            else{
                if(isTrue==1){
                    ways += (LT*RF)+(LF*RT);
                }
                else{
                    ways += (LF*RF)+(LT*RT);
                }
            }
        }
        dp[i][j][isTrue] = ways;
        return ways;
    }
}
