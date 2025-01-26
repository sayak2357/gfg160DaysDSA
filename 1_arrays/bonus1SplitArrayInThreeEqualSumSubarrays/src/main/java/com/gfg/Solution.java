package com.gfg;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> findSplit(int[] arr) {
        // Return an array of possible answer, driver code will judge and return true or
        // false based on
        List<Integer> res = new ArrayList<>();
        int n = arr.length;
        int sum = findSum(arr);
        int rem = sum%3;
        if(rem>0){
            res.add(-1);
            res.add(-1);
            return res;
        }
        int minSum = sum/3;
        int t1=-1,t2=-1,t3=-1;
        int runningSum = 0;
        for(int i=0;i<n;i++){
            runningSum += arr[i];
            if(runningSum==minSum && t1==-1){
                t1 =i;
                runningSum = 0;
            }
            else if(runningSum==minSum && t2==-1){
                t2 =i;
                runningSum = 0;
            }
            else if(runningSum==minSum && t3==-1 && i==(n-1)){
                t3 =i;
                runningSum = 0;
            }
        }
        if(t3!=-1){
            res.add(t1);
            res.add(t2);
        }
        else{
            res.add(-1);
            res.add(-1);
        }
        return res;
    }
    private int findSum(int[] arr){
        int sum = 0;
        for(int num:arr)
            sum += num;

        return sum;
    }
}
