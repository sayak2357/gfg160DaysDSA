package com.gfg;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int longestSubarray(int[] arr, int k) {
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0,-1);
        int runningSum = 0, n = arr.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            runningSum+= arr[i];
            if(!prefixSumMap.containsKey(runningSum))
                prefixSumMap.put(runningSum,i);
            int sum = runningSum-k;
            if(prefixSumMap.containsKey(sum)){
                ans = Math.max(ans,i-prefixSumMap.get(sum));
            }
        }
        return ans;
    }
}
