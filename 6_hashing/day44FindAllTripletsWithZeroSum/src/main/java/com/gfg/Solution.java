package com.gfg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        int n = arr.length;
        Map<Integer, List<Integer>> fmap = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            int num = arr[i];
            if(fmap.containsKey(num)){
                fmap.get(num).add(i);
            }
            else{
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                fmap.put(num,temp);
            }
        }
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                int twoSum = arr[i]+arr[j];
                int missing = twoSum*(-1);
                if(fmap.containsKey(missing)){
                    List<Integer> missingPos = fmap.get(missing);
                    for(int idx:missingPos){
                        if(idx>j){
                            List<Integer> match = new ArrayList<>();
                            match.add(i);
                            match.add(j);
                            match.add(idx);
                            res.add(match);
                        }
                    }
                }
            }
        }
        return res;
    }
}
