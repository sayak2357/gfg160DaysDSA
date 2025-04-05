package com.gfg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Activity{
    int startTime,endTime;
    public Activity(int startTime, int endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
public class Solution {
    public int activitySelection(int[] start, int[] finish) {
        int n = start.length;
        List<Activity> activityList = new ArrayList<>();
        for(int i=0;i<n;i++){
            Activity act = new Activity(start[i],finish[i]);
            activityList.add(act);
        }
        Collections.sort(activityList, (a, b)->a.endTime-b.endTime);
        int maxTasks = 0;
        int lastEndTime =-1;
        for(int i=0;i<n;i++){
            int currStartTime = activityList.get(i).startTime;
            int currEndTime = activityList.get(i).endTime;
            if(currStartTime>lastEndTime){
                maxTasks++;
                lastEndTime = currEndTime;
            }
        }
        return maxTasks;
    }
}
