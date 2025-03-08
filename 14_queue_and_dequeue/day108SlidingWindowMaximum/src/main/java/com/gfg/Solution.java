package com.gfg;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Solution {
    public ArrayList<Integer> maxOfSubarrays(int arr[], int k) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0;i<k;i++){
            while(dq.size()>0 && arr[i]>=arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for(int i=k;i<n;i++){
            res.add(arr[dq.peekFirst()]);
            while(!dq.isEmpty() && dq.peekFirst()<=(i-k)){
                dq.removeFirst();
            }
            while(dq.size()>0 && arr[i]>=arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);

        }
        res.add(arr[dq.peekFirst()]);
        return res;
    }
}