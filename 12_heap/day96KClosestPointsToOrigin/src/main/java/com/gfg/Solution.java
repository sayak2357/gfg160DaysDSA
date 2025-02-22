package com.gfg;

import java.util.PriorityQueue;
import java.util.Queue;

class Pair{
    int idx;
    double val;
    public Pair(int idx, double val){
        this.idx = idx;
        this.val = val;
    }
    public int getIdx(){
        return idx;
    }
    public double getVal(){
        return val;
    }
}
public class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] res = new int[k][2];
        int n = points.length;
        Queue<Pair> maxHeap = new PriorityQueue<>(
                (a,b) ->Double.compare(b.getVal(),a.getVal()));
        for(int i=0;i<n;i++){
            double x = (double) points[i][0];
            double y = (double) points[i][1];
            double dist = Math.sqrt((x*x)+(y*y));
            Pair p = new Pair(i,dist);
            maxHeap.add(p);
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }
        for(int i=0;i<k;i++){
            Pair p = maxHeap.poll();
            int index = p.getIdx();
            // System.out.println(index);
            int x1 = points[index][0];
            int y1 = points[index][1];
            res[i][0] = x1;
            res[i][1] = y1;
        }

        return res;
    }
}