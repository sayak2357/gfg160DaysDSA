package com.gfg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TimeSlot{
    int value;
    int sign;
    public TimeSlot(int value, int sign){
        this.value = value;
        this.sign = sign;
    }
}
public class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        int n = arr.length;
        int m = dep.length;
        List<TimeSlot> ts = new ArrayList<>();
        for(int time:arr){
            ts.add(new TimeSlot(time,1));
        }
        for(int time:dep){
            ts.add(new TimeSlot(time,-1));
        }
        Collections.sort(ts, (a, b)-> a.value-b.value);
        int platforms = 0;
        int maxPlatforms = 0;
        for(int i=0;i<(n+m);i++){
            TimeSlot tsTemp= ts.get(i);
            if(tsTemp.sign<0)
                platforms--;
            else
                platforms++;
            maxPlatforms = Math.max(maxPlatforms,platforms);
        }
        return maxPlatforms;
    }
}

