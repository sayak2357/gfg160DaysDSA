package com.gfg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean wordBreak(String s, String[] dictionary) {
        Map<String, String> wordMap = new HashMap<>();
        for(String word:dictionary)
            wordMap.put(word,"");
        int n = s.length();
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[n] = 1;
        return validWordBreak(0,n,s,wordMap,dp);
    }
    private boolean validWordBreak(int idx,int n, String s, Map<String, String> wordMap,int[] dp){
        if(dp[idx]!=-1){
            return dp[idx]==1?true:false;
        }
        int remaining = n-idx;
        boolean ans = false;
        int verdict = 0;
        for(String word:wordMap.keySet()){
            int wlen = word.length();
            if(wlen<=remaining){
                String nextWord = s.substring(idx,idx+wlen);
                if(word.equals(nextWord)){
                    ans = validWordBreak(idx+wlen,n,s,wordMap,dp);
                    if(ans)
                        break;
                }
            }
        }
        verdict = ans?1:0;
        dp[idx] = verdict;
        return ans;
    }
}
