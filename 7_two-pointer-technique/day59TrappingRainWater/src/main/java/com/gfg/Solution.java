package com.gfg;

public class Solution {
    public int maxWater(int arr[]) {
        int n = arr.length;
        int[] maxOnRight = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            max = Math.max(max,arr[i]);
            maxOnRight[i] = max;
        }
        int waterTrapped = 0;
        max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(max,arr[i]);
            int waterOnTop = Math.min(max,maxOnRight[i])-arr[i];
            waterTrapped += waterOnTop;
        }
        return waterTrapped;
    }

    public int maxWaterOptimised(int arr[]) {
        int n = arr.length;
        int left = 1, right = n-2;
        int lMax = arr[left-1], rMax = arr[right+1];
        int waterTrapped = 0;
        while(left<=right){
            if(rMax<=lMax){
                waterTrapped += Math.max(0,rMax-arr[right]);
                rMax = Math.max(rMax,arr[right]);
                right--;
            }
            else{
                waterTrapped += Math.max(0, lMax-arr[left]);
                lMax = Math.max(lMax, arr[left]);
                left++;
            }
        }
        return waterTrapped;
    }
}
