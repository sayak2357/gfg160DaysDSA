package com.gfg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        Queue<Integer> minHeap = new PriorityQueue<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int num:arr){
            minHeap.add(num);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        for(int i=0;i<k;i++){
            res.add(minHeap.poll());
        }
        Collections.reverse(res);
        return res;
    }
}