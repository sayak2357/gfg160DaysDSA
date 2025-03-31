package com.gfg;

import java.util.Arrays;

public class Solution {
    int maxValue(int[] arr) {
        int n = arr.length;
        int[][][] dp = new int[n+1][2][2];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=1;j++){
                if(i<n)
                    Arrays.fill(dp[i][j],-1);
                else
                    Arrays.fill(dp[i][j],0);
            }
        }
        return findMaxValueHelper(0,n,arr,false,false,dp);
    }
    int findMaxValueHelper(int idx, int n, int[] arr, boolean isPrevStolen, boolean isFirstStolen, int[][][] dp){
        if(idx>=n)
            return 0;
        int j = isPrevStolen?1:0;
        int k = isFirstStolen?1:0;
        if(dp[idx][j][k]!=-1)
            return dp[idx][j][k];
        int ans = 0;
        if(isPrevStolen){
            ans = findMaxValueHelper(idx+1,n,arr,false,isFirstStolen,dp);
        }
        else{
            if(idx==0){
                ans = Math.max(arr[idx]+findMaxValueHelper(idx+1,n,arr,true,true,dp),
                        findMaxValueHelper(idx+1,n,arr,false,false,dp));
            }
            else if(idx==(n-1) && isFirstStolen){
                ans = 0;
            }
            else{
                ans = Math.max(arr[idx]+findMaxValueHelper(idx+1,n,arr,true,isFirstStolen,dp),
                        findMaxValueHelper(idx+1,n,arr,false,isFirstStolen,dp));
            }
        }
        dp[idx][j][k] = ans;
        return ans;
    }
}
