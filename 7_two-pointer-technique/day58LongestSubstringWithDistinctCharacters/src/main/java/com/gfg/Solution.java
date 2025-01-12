package com.gfg;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int longestUniqueSubstr(String s) {
        int n = s.length();
        if(n==0)
            return n;
        int ans = 1;
        int left = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        for(int right=0;right<n;right++){
            Character newChar = s.charAt(right);
            if(charMap.containsKey(newChar)){
                left = Math.max(left,charMap.get(newChar)+1);
            }
            charMap.put(newChar,right);
            int temp = right-left+1;
            ans = Math.max(ans,temp);
        }
        return ans;
    }
}
