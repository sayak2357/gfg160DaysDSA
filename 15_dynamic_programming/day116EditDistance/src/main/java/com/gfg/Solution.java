package com.gfg;

public class Solution {
    public int editDistance(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        int ans = -1;
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<n+1;i++)
            dp[0][i] = i;

        for(int j=0;j<m+1;j++)
            dp[j][0] = j;

        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(s2.charAt(i-1)==s1.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    dp[i][j] = 1 + Math.min(Math.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1]);
                }
            }
        }
        ans = dp[m][n];
        return ans;
    }
}
