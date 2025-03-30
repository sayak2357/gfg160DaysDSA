package com.gfg;

public class Solution {
    public int findMaxSum(int arr[]) {
        int n = arr.length;
        int[][] dp = new int[n+1][2];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=1;j++){
                if(i==n)
                    dp[i][j] = 0;
                else
                    dp[i][j] = -1;
            }
        }
        return findMaxSumHelper(0,n,arr,false,dp);
    }
    private int findMaxSumHelper(int idx,int n,int[] arr,boolean isPrevStolen,int[][] dp){
        if(idx>=n)
            return 0;
        int j = isPrevStolen?1:0;
        if(dp[idx][j]!=-1)
            return dp[idx][j];
        int ans = 0;
        if(isPrevStolen)
            ans = findMaxSumHelper(idx+1,n,arr,false,dp);
        else{
            ans = Math.max(arr[idx]+findMaxSumHelper(idx+1,n,arr,true,dp),
                    findMaxSumHelper(idx+1,n,arr,false,dp));
        }
        dp[idx][j] = ans;
        return ans;
    }
}
