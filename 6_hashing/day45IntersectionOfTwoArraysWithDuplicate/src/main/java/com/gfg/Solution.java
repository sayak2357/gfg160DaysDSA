package com.gfg;

import java.util.*;

public class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        ArrayList<Integer> res = new ArrayList<>();
        Set<Integer> bSet = new HashSet<>();
        for(int num:b)
            bSet.add(num);
        for(int num:a){
            if(bSet.contains(num)){
                res.add(num);
                bSet.remove(num);
            }
        }
        return res;
    }
}
