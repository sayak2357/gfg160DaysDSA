package com.gfg;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public long subarrayXor(int arr[], int k) {

        Map<Integer, Integer> prefixXorMap = new HashMap<>();
        int prefixXor = 0;
        prefixXorMap.put(0,1);
        int res = 0;
        for(int num:arr){
            prefixXor ^= num;
            res += prefixXorMap.getOrDefault(prefixXor^k,0);
            prefixXorMap.put(prefixXor, prefixXorMap.getOrDefault(prefixXor,0)+1);
        }
        return res;
    }
}
