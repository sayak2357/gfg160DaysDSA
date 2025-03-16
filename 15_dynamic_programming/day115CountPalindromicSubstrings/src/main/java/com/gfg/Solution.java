package com.gfg;

public class Solution {
    public int countPS(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int count = 0;
        for(int g=0;g<n;g++){
            for(int i=0,j=g;j<n;i++,j++){
                if(g==0){
                    dp[i][j] = true;
                }
                else if(g==1){
                    dp[i][j] = s.charAt(i)==s.charAt(j);
                }
                else{
                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]==true){
                        dp[i][j] = true;
                    }
                    else{
                        dp[i][j] = false;
                    }
                }
                int length = j-i+1;
                if(dp[i][j] && length>=2)
                    count++;
            }
        }
        return count;
    }
}
