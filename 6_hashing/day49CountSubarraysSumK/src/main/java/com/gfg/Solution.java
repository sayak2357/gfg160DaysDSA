package com.gfg;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int countSubarrays(int arr[], int k) {
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        int count = 0, n = arr.length;
        prefixSumMap.put(0,1);
        int runningSum = 0;
        for(int i=0;i<n;i++){
            runningSum+= arr[i];
            if(prefixSumMap.containsKey(runningSum-k))
                count+=prefixSumMap.get(runningSum-k);

            prefixSumMap.put(runningSum,prefixSumMap.getOrDefault(runningSum,0)+1);
        }
        return count;
    }
}
