package com.gfg;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxLen(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0)
                arr[i] = -1;
        }
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0,-1);
        int runningSum = 0;
        int ans = 0;
        for(int i=0;i<n;i++){
            runningSum += arr[i];
            if(!prefixSumMap.containsKey(runningSum))
                prefixSumMap.put(runningSum,i);
            else{
                ans = Math.max(ans,i-prefixSumMap.get(runningSum));
            }
        }
        return ans;
    }
}
