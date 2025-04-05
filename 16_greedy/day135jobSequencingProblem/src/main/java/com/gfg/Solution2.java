package com.gfg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// DSU based approach O(N*logN)
public class Solution2 {

    int[] parent;
    int[] size;
    int ans;
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        int n = deadline.length;
        parent = new int[n+1];
        size = new int[n+1];
        for(int i=0;i<n+1;i++){
            parent[i] = i;
        }
        List<Task> taskList = new ArrayList<>();
        for(int i=0;i<n;i++){
            taskList.add(new Task(deadline[i],profit[i]));
        }
        Collections.sort(taskList, (a, b)->b.profit-a.profit);
        int totalProfit = 0;
        int jobCount = 0;

        for(int i=0;i<n;i++){
            Task curr = taskList.get(i);
            int availableSlot = find(curr.deadline);
            if(availableSlot>0){
                Union(availableSlot-1,availableSlot);
                totalProfit += curr.profit;
                jobCount++;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(jobCount);
        res.add(totalProfit);
        return res;
    }
    private int find(int x){
        if(x==parent[x])
            return x;
        parent[x] = find(parent[x]);
        return parent[x];
    }
    private int Union(int a, int b){
        int rootA = find(a);
        int rootB = find(b);

        if(size[rootA]<size[rootB]){
            ans += size[rootA] * size[rootB];
            parent[rootA] = rootB;
            size[rootB] = size[rootA];
        }
        else if(size[rootA] > size[rootB]){
            ans += size[rootA]*size[rootB];
            parent[rootB] = rootA;
            size[rootA] += size[rootB];
        }
        else{
            ans += size[rootA]*size[rootB];
            parent[rootB] = rootA;
            size[rootA] = size[rootB];
        }
        return ans;
    }
}
