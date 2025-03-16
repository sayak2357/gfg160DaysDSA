package com.gfg;

public class Solution {
    public int longestPalinSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
                if(i==j)
                    dp[i][j] = 1;
            }
        }
        return longstPalSubseqHelper(s,0,n-1,dp);
    }
    private int longstPalSubseqHelper(String s, int start, int end,int[][] dp){
        if(dp[start][end]!=-1)
            return dp[start][end];
        if(start>end)
            return 0;
        int ans = 1;
        if(s.charAt(start)==s.charAt(end))
            ans = 2 + longstPalSubseqHelper(s,start+1,end-1,dp);
        else
            ans = Math.max(longstPalSubseqHelper(s,start+1,end,dp),longstPalSubseqHelper(s,start,end-1,dp));
        dp[start][end] = ans;
        return ans;
    }
}
