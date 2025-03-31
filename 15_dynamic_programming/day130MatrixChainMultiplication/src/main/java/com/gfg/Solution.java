package com.gfg;

public class Solution {
    static int matrixMultiplication(int arr[]) {
        int n = arr.length;
        int[][] dp = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)
                    dp[i][j] = 0;
                else
                    dp[i][j] = -1;
            }
        }
        return getMinMultiplications(1,n-1,arr,dp);
    }
    static int getMinMultiplications(int i, int j, int[] arr, int[][] dp){
        if(i>=j)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int ans = Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            ans = Math.min(ans,getMinMultiplications(i,k,arr,dp)+getMinMultiplications(k+1,j,arr,dp)
                    +arr[i-1]*arr[k]*arr[j]);
        }
        dp[i][j] = ans;
        return ans;
    }
}
