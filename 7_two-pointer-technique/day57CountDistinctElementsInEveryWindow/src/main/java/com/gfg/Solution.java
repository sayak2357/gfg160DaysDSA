package com.gfg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
ArrayList<Integer> countDistinct(int arr[], int k) {
    ArrayList<Integer> res = new ArrayList<>();
    Map<Integer, Integer> freqMap = new HashMap<>();
    int n = arr.length;
    for(int i=0;i<k;i++){
        freqMap.put(arr[i],freqMap.getOrDefault(arr[i],0)+1);
    }
    res.add(freqMap.size());
    for(int i=k;i<n;i++){
        int numIn = arr[i];
        freqMap.put(numIn,freqMap.getOrDefault(numIn,0)+1);
        int numOut = arr[i-k];
        freqMap.put(numOut,freqMap.get(numOut)-1);
        if(freqMap.get(numOut)==0)
            freqMap.remove(numOut);
        res.add(freqMap.size());
    }
    return res;
}
}

