package com.github;

public class Solution {
    public int maxSubarraySum(int[] arr) {
        int n = arr.length;
        int maxRunningsum = arr[0], maxSubsum = arr[0];
        for(int i=1;i<n;i++){
            maxRunningsum = Math.max(maxRunningsum+arr[i],arr[i]);
            maxSubsum = Math.max(maxSubsum,maxRunningsum);
        }
        return maxSubsum;

    }
}
