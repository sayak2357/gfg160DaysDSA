package com.gfg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int longestStringChain(String words[]) {
        int n = words.length;
        int res = 1;
        Map<String, Integer> dp = new HashMap<>();
        Arrays.sort(words, (a,b) -> a.length()-b.length());
        for(String w:words){
            dp.put(w,1);
            for(int i=0;i<w.length();i++){
                String pred = w.substring(0,i)+w.substring(i+1);
                if(dp.containsKey(pred)){
                    dp.put(w,Math.max(dp.get(w),dp.get(pred)+1));
                }
            }
            res = Math.max(res,dp.get(w));
        }
        return res;
    }

}