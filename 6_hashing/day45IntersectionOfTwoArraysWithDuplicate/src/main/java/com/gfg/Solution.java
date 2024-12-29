package com.gfg;

import java.util.*;

public class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        Set<Integer> res = new HashSet<>();
        Map<Integer, Boolean> bMap = new HashMap<>();
        for(int num:b)
            bMap.put(num,true);
        for(int num:a){
            if(bMap.containsKey(num)){
                res.add(num);
            }
        }
        ArrayList<Integer> finalRes = new ArrayList<>();
        for(int num:res)
            finalRes.add(num);

        return finalRes;
    }
}
