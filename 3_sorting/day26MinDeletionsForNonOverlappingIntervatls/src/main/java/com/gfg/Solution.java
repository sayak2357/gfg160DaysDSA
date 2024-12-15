package com.gfg;

import java.util.Arrays;

public class Solution {
    public static int minRemoval(int intervals[][]) {
        Arrays.sort(intervals, (a, b) -> a[0]-b[0]);
        int n = intervals.length;
        int prevEnd = intervals[0][1];
        int count = 0;
        for(int i=1;i<n;i++){
            int currStart = intervals[i][0];
            int currEnd =   intervals[i][1];
            if(isOverlap(currStart,prevEnd)){
                count++;
                prevEnd = Math.min(prevEnd,currEnd);
            }
            else{
                prevEnd = currEnd;
            }
        }
        return count;
    }
    private static boolean isOverlap(int currStart,int prevEnd){
        return !(currStart>=prevEnd);
    }
}
