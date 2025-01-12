package com.gfg;

import java.util.ArrayList;

public class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> res = new ArrayList<>();
        int prefixSum = 0;
        int n = arr.length;
        int left = 0;
        for(int i=0;i<n;i++){
            prefixSum += arr[i];
            while(prefixSum>target){
                prefixSum-=arr[left];
                left++;
            }
            if(prefixSum==target){
                res.add(left+1);
                res.add(i+1);
                break;
            }
        }
        if(res.size()==0)
            res.add(-1);
        return res;
    }
}
