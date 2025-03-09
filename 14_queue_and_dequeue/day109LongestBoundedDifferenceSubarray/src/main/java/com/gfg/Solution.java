package com.gfg;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Solution {

    public ArrayList<Integer> longestSubarray(int[] arr, int x) {
        int n = arr.length;
        Deque<Integer> maxDq = new LinkedList<>();
        Deque<Integer> minDq = new LinkedList<>();
        int maxWindowLen = 0, str = 0, ansStr = 0;
        for(int end = 0;end<n;end++){
            while(!maxDq.isEmpty() && arr[end]>=arr[maxDq.peekLast()]){
                maxDq.removeLast();
            }
            maxDq.add(end);
            while(!minDq.isEmpty() && arr[end]<=arr[minDq.peekLast()]){
                minDq.removeLast();
            }
            minDq.add(end);

            while(arr[maxDq.peekFirst()] - arr[minDq.peekFirst()]>x){
                str++;
                if(maxDq.peekFirst()<str) maxDq.removeFirst();
                if(minDq.peekFirst()<str) minDq.removeFirst();
            }
            int tempLen = end-str+1;
            if(tempLen>maxWindowLen){
                maxWindowLen = tempLen;
                ansStr = str;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=ansStr;i<ansStr+maxWindowLen;i++){
            res.add(arr[i]);
        }
        return res;
    }
}

