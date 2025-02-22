package com.gfg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public ArrayList<Double> getMedian(int[] arr) {
        ArrayList<Double> res = new ArrayList<>();
        Queue<Integer> minHeap = new PriorityQueue<>();
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int t1 = 0, t2 = 0;
        int n = arr.length;
        double runningMedian = 0d;
        for(int i=0;i<n;i++){
            int num = arr[i];
            if(t1==0){
                maxHeap.add(num);
                t1++;
            }
            else{
                if(num<=runningMedian){
                    maxHeap.add(num);
                    t1++;
                }
                else{
                    minHeap.add(num);
                    t2++;
                }
            }
            int sizeDiff = Math.abs(t1-t2);
            if(sizeDiff>1){
                if(t1>t2){
                    minHeap.add(maxHeap.poll());
                    t1--;
                    t2++;
                }
                else{
                    maxHeap.add(minHeap.poll());
                    t1++;
                    t2--;
                }
            }
            if(t1>t2){
                runningMedian = (double) maxHeap.peek();
            }
            else if(t1<t2){
                runningMedian = (double) minHeap.peek();
            }
            else{
                int maximum = maxHeap.peek();
                int minimum = minHeap.peek();
                runningMedian = ((double) (maximum) + (double) minimum)/2;

            }
            res.add(runningMedian);
        }
        return res;
    }
}
