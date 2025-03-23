package com.gfg;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if(n==1)
            return cost[0];
        if(n==2)
            return Math.min(cost[0],cost[1]);
        Map<Integer, Integer> dp = new HashMap<>();
        dp.put(n-1,cost[n-1]);
        dp.put(n-2,cost[n-2]);
        return Math.min(minCostClimbStairsHelper(0,cost,dp),minCostClimbStairsHelper(1,cost,dp));
    }
    static int minCostClimbStairsHelper(int x, int[] cost, Map<Integer, Integer> dp){
        if(dp.containsKey(x))
            return dp.get(x);
        int ans = cost[x] + Math.min(minCostClimbStairsHelper(x+1,cost,dp),minCostClimbStairsHelper(x+2,cost,dp));
        dp.put(x,ans);
        return ans;
    }
};
