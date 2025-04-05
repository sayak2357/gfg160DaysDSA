package com.gfg;

import java.util.*;

class Task{
    int deadline, profit;
    public Task(int deadline, int profit){
        this.deadline = deadline;
        this.profit = profit;
    }
}
// Greed solution O(n*maxProfit) // O(N^2)
public class Solution {

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        int n = deadline.length;
        List<Task> taskList = new ArrayList<>();
        for(int i=0;i<n;i++){
            taskList.add(new Task(deadline[i],profit[i]));
        }
        Collections.sort(taskList, (a, b)->b.profit-a.profit);
        int totalProfit = 0;
        int jobCount = 0;
        Set<Integer> deadlineSet = new HashSet<>();
        for(int i=0;i<n;i++){
            Task curr = taskList.get(i);
            int currProfit = curr.profit;
            int currDeadline = curr.deadline;
            for(int j=currDeadline;j>=1;j--){
                if(!deadlineSet.contains(j)){
                    deadlineSet.add(j);
                    totalProfit += currProfit;
                    jobCount++;
                    break;
                }
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(jobCount);
        res.add(totalProfit);
        return res;
    }
}