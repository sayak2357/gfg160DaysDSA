package com.gfg;

import java.util.Arrays;

public class Solution {
    static boolean equalPartition(int arr[]) {
        int totalSum = Arrays.stream(arr).sum();
        if(totalSum%2==1)
            return false;
        int n = arr.length;
        int target = totalSum/2;
        int[][] dp = new int[n+1][target+1];
        for(int i=0;i<=n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        boolean ans = isSubsetSum(arr,n,target,dp)==1?true:false;
        return ans;
    }
    static int isSubsetSum(int[] arr, int n, int target, int[][] dp){
        if(target<0)
            return -1;
        if(target==0)
            return 1;
        if(n==0)
            return -1;
        if(dp[n][target]!=-1)
            return dp[n][target];
        int c1 = isSubsetSum(arr,n-1,target,dp);
        int c2 = isSubsetSum(arr,n-1,target-arr[n-1],dp);
        int ans = c1==1?1:c2==1?1:-1;
        dp[n][target] = ans;
        return ans;
    }
}