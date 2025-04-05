package com.gfg;

public class Solution {
    public int startStation(int[] gas, int[] cost) {
        int n = gas.length;
        int currentGas = 0;
        int totalGas = 0;
        int startIndex = 0;
        for(int i=0;i<n;i++){
            currentGas += gas[i] - cost[i];
            totalGas += gas[i] - cost[i];
            if(currentGas<0){
                currentGas = 0;
                startIndex = i+1;
            }
        }
        return totalGas<0?-1:startIndex;
    }
}
