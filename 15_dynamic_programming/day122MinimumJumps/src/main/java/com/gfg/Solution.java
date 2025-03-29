package com.gfg;

public class Solution {
    static int minJumps(int[] arr) {
        // code here
        int n = arr.length;
        int jumps = 0;
        int maxReach = 0, currReach = 0;
        for(int i=0;i<n-1;i++){
            maxReach = Math.max(maxReach,i+arr[i]);
            if(i==currReach && maxReach>0){
                jumps++;
                currReach = maxReach;
            }
        }
        return currReach>=(n-1)?jumps:-1;
    }

}
