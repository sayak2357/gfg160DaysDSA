package com.gfg;

import java.util.HashMap;
import java.util.Map;

// Using Top-down giving TLE in GFG
class Tuple{
    public int idx,sum;
    public Tuple(int idx, int sum){
        this.idx = idx;
        this.sum = sum;
    }
    @Override
    public boolean equals(Object other){
        if(this==other)
            return true;
        if(other==null)
            return false;
        Tuple that = (Tuple) other;
        return that.idx==this.idx && that.sum==this.sum;
    }
}
public class Solution2 {
    public int count(int coins[], int sum) {
        Map<Tuple, Integer> dp = new HashMap<>();
        int n = coins.length;
        return this.countHelper(0,coins,sum,n,dp);
    }
    private int countHelper(int idx, int[] coins, int sum, int n, Map<Tuple, Integer> dp){
        if(idx>=n || sum<0)
            return 0;
        if(sum==0)
            return 1;
        Tuple curr = new Tuple(idx,sum);
        if(dp.containsKey(curr))
            return dp.get(curr);
        int ans = this.countHelper(idx,coins,sum-coins[idx],n,dp)+this.countHelper(idx+1,coins,sum,n,dp);
        dp.put(curr,ans);
        return ans;
    }

}
