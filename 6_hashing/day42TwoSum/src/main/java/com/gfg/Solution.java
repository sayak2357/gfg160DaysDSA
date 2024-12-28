package com.gfg;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    boolean twoSum(int arr[], int target) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int num:arr){
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
        }
        for(int num:arr){
            int pair = target-num;
            if(pair!=num){
                if(frequencyMap.containsKey(pair))
                    return true;
            }
            else{
                if(frequencyMap.get(pair)>1)
                    return true;
            }
        }
        return false;
    }
}
