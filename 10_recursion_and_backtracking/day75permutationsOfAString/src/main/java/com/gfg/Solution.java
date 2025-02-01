package com.gfg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public ArrayList<String> findPermutation(String s) {
        ArrayList<String> res = new ArrayList<>();
        int n = s.length();
        Map<Character, Integer> fmap = new HashMap<>();
        for(char c:s.toCharArray()){
            fmap.put(c,fmap.getOrDefault(c,0)+1);
        }
        String temp = "";
        generatePermutations(fmap,0,n,temp,res);
        return res;
    }
    private void generatePermutations(Map<Character, Integer> fmap, int idx,int n,String temp,ArrayList<String> res ){
        if(idx==n)
        {
            res.add(temp);
            return;
        }
        for(Character c:fmap.keySet()){
            if(fmap.get(c)>0){
                String tempNext = temp+c;
                int oldFreq = fmap.get(c);
                fmap.put(c,oldFreq-1);
                generatePermutations(fmap,idx+1,n,tempNext,res);
                fmap.put(c,oldFreq);
            }
        }
    }
}
