package com.github;

public class Solution {
    public int maxSubarraySum(int[] arr) {
        int n = arr.length;
        int maxEnding = arr[0], maxSubsum = maxEnding;
        for(int i=1;i<n;i++){
            maxEnding = Math.max(maxEnding+arr[i],arr[i]);
            maxSubsum = Math.max(maxSubsum,maxEnding);
        }
        return maxSubsum;

    }
}
