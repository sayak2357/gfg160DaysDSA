package com.gfg;

import java.util.HashMap;
import java.util.Map;
class Tuple {
    public Tuple(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    @Override
//    public int hashCode() {
//        int hash = 17;
//        hash = 31 * hash + this.x;
//        hash = 31 * hash + this.y;
//        return hash;
//    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null) return false;
        if (this.getClass() != other.getClass()) return false;
        Tuple that = (Tuple) other;
        return (this.x == that.x) && (this.y == that.y);
    }

    private int x;
    private int y;
}
public class Solution {
    static int knapsack(int W, int val[], int wt[]) {
        int n = val.length;
        Map<Tuple, Integer> dp = new HashMap<>();
        return knapsackHelper(W,0,val,wt,dp,n);
    }
    static int knapsackHelper(int weight,int idx,int[] val,int[] wt,Map<Tuple,Integer> dp, int n){
        if(idx>=n)
            return 0;
        Tuple curr = new Tuple(idx,weight);
        if(dp.containsKey(curr))
            return dp.get(curr);
        int ans = 0;
        if(wt[idx]>weight)
            ans = knapsackHelper(weight,idx+1,val,wt,dp,n);
        else{
            ans = Math.max(val[idx]+knapsackHelper(weight-wt[idx],idx+1,val,wt,dp,n)
                    , knapsackHelper(weight,idx+1,val,wt,dp,n));
        }
        dp.put(curr,ans);
        return ans;
    }
}