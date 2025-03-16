package com.gfg;

public class Solution {

    static int lcs(String s1, String s2) {
        int la = s1.length();
        int lb = s2.length();
        int[][] dp = new int[la+1][lb+1];
        for(int i=0;i<=la;i++){
            for(int j=0;j<=lb;j++){
                dp[i][j] = -1;
            }
        }
        return lcsHelper(s1,s2,la,lb,0,0,dp);

    }
    static int lcsHelper(String a, String b, int l1, int l2,int idxa, int idxb,int[][] dp){

        if(dp[idxa][idxb]!=-1)
            return dp[idxa][idxb];
        if(idxa>=l1 || idxb>=l2)
            return 0;
        int ans = 0;
        if(a.charAt(idxa)==b.charAt(idxb))
            ans = 1+lcsHelper(a,b,l1,l2,idxa+1,idxb+1,dp);
        else
            ans = Math.max(lcsHelper(a,b,l1,l2,idxa+1,idxb,dp),lcsHelper(a,b,l1,l2,idxa,idxb+1,dp));
        dp[idxa][idxb] = ans;
        return ans;
    }
}
