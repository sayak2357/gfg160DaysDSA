package com.github;

public class Solution {
    public int maxProduct(int[] arr) {
        int n = arr.length;
        int currMin = arr[0], currMax = arr[0], maxProd = arr[0];
        for(int i=1;i<n;i++){
            int minP = arr[i]*currMin;
            int maxP = arr[i]*currMax;
            currMin = Math.min(arr[i],Math.min(minP,maxP));
            currMax = Math.max(arr[i],Math.max(minP,maxP));
            maxProd = Math.max(maxProd,currMax);
        }
        return maxProd;
    }
}
