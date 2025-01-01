package com.gfg;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int num:arr)
            set.add(num);
        int ans = 0;
        for(int num:arr){
            int prev = num-1;
            if(!set.contains(prev)){
                int temp = 0;
                int next = num;
                while(set.contains(next)){
                    temp++;
                    next++;
                }
                ans = Math.max(ans,temp);
            }
        }
        return ans;
    }
}
