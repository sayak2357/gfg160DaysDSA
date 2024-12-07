package com.gfg;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        char res = '$';
        Map<Character, Integer> countMap = new HashMap<>();
        for(char c:s.toCharArray()){
            countMap.put(c,countMap.getOrDefault(c,0)+1);
        }
        for(char c:s.toCharArray()){
            if(countMap.get(c)==1){
                res = c;
                break;
            }
        }
        return res;
    }
    static char nonRepeatingCharOptimised(String s) {
        char ans = '$';
        int[] fmap = new int[26];
        for(int i=0;i<26;i++)
            fmap[i] = -1;
        for(int i=0;i<s.length();i++){
            char p = s.charAt(i);
            if(fmap[p-'a'] == -1)
                fmap[p-'a'] = i;
            else if(fmap[p-'a']>=0)
                fmap[p-'a'] = -2;
        }
        int minIndex = Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(fmap[i]>=0){
                minIndex = Math.min(minIndex,fmap[i]);
            }
        }
        return minIndex==Integer.MAX_VALUE ? ans:s.charAt(minIndex);
    }
}
