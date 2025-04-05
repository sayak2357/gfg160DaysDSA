package com.gfg;

import java.util.Arrays;

public class Solution {
    public int maxPartitions(String s) {
        int[] lastCharacterIndex = new int[26];
        Arrays.fill(lastCharacterIndex,-1);
        int n = s.length();
        for(int i=n-1;i>=0;i--){
            int idx = s.charAt(i)-'a';
            if(lastCharacterIndex[idx]==-1){
                lastCharacterIndex[idx] = i;
            }
        }
        int temp=-1;
        int count = 0;
        for(int i=0;i<n;i++){
            temp = Math.max(lastCharacterIndex[s.charAt(i)-'a'],temp);
            if(temp==i){
                count++;
            }
        }
        return count;
    }
}
