package com.gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        List<Integer> res = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        int absDiff = Integer.MIN_VALUE;
        Arrays.sort(arr);
        int n = arr.length;
        int i=0, j = n-1;
        while(i<j){
            int sum = arr[i]+arr[j];
            int diff = Math.abs(sum-target);
            int currAbsDiff = arr[j]-arr[i];
            if(diff<minDiff || (diff==minDiff && currAbsDiff>absDiff)){
                //   System.out.println(arr[i]+" "+arr[j]+" "+minDiff+" "+res.toString());
                minDiff = diff;
                updateList(res,arr[i],arr[j]);
                absDiff = currAbsDiff;
            }
            if(sum>target)
                j--;
            else
                i++;
        }
        return res;
    }
    private void updateList(List<Integer> res,int a, int b){
        int size = res.size();
        if(size==0){
            res.add(a);
            res.add(b);
        }
        else{
            res.set(0,a);
            res.set(1,b);
        }
    }
}
