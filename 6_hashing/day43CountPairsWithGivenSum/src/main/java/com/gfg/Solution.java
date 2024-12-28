package com.gfg;

import java.util.HashMap;
import java.util.Map;

class Solution {

    int countPairs(int arr[], int target) {
        Map<Integer, Integer> fmap = new HashMap<>();
        int cnt = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(fmap.containsKey(target-arr[i]))
            {
                cnt += fmap.get(target-arr[i]);
            }
            fmap.put(arr[i],fmap.getOrDefault(arr[i],0)+1);
        }
        return cnt;
    }
}
