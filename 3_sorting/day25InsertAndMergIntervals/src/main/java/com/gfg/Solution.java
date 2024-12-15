package com.gfg;

import java.util.ArrayList;

public class Solution {
    public static ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {

        ArrayList<int[]> res = new ArrayList<>();
        int n = intervals.length;
        int i = 0;
        while(i<n && intervals[i][1]<newInterval[0]){
            res.add(new int[]{intervals[i][0],intervals[i][1]});
            i++;
        }
        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]   = Math.max(intervals[i][1],newInterval[1]);
            i++;

        }
        res.add(new int[]{newInterval[0],newInterval[1]});
        while(i<n){
            res.add(new int[]{intervals[i][0],intervals[i][1]});
            i++;
        }

        return res;
    }

}

