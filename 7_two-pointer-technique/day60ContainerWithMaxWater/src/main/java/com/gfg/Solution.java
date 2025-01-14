package com.gfg;

public class Solution {

    public int maxWater(int arr[]) {
        int n = arr.length;
        int maxWater = 0;
        int i = 0, j = n-1;
        while(i<j){
            int waterLevel = Math.min(arr[i],arr[j]);
            int width = j-i;
            maxWater = Math.max(maxWater, waterLevel*width);
            if(arr[i]<arr[j])
                i++;
            else
                j--;
        }
        return maxWater;
    }
}
