package com.gfg;

import java.util.Arrays;

public class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        int n = arr.length;
        int dp[][] = new int[n+1][sum+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = isSubsetSumHelper(0,n,arr,sum,dp);
        return ans==1?true:false;
    }
    static int isSubsetSumHelper(int idx, int n, int[] arr, int target,int[][] dp ){
        if(target==0)
            return 1;
        if(target<0 || idx>=n)
            return 0;
        if(dp[idx][target]!=-1)
            return dp[idx][target];
        int c1 = isSubsetSumHelper(idx+1,n,arr,target,dp);
        int c2 = isSubsetSumHelper(idx+1,n,arr,target-arr[idx],dp);
        int ans = c1==1?1:c2==1?1:0;
        dp[idx][target] = ans;
        return ans;
    }
}