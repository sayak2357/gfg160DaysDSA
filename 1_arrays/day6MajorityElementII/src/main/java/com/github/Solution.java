package com.github;

import java.util.ArrayList;
import java.util.List;

class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        if(n<1)
            return res;
        if(n==1){
            res.add(nums[0]);
            return res;
        }
        int t1=nums[0];
        int t2=nums[1],c1=1,c2=0;
        int i=0;
        for(i=1;i<n;i++){
            if(nums[i]!=t1){
                t2 = nums[i];
                c2 = 1;
                break;
            }
        }

        for(int j=i;j<n;j++){
            int num = nums[j];
            if(t1==num){
                c1++;
            }
            else if(t2==num && num!=t1){
                c2++;
            }
            else{
                c1--;
                c2--;
            }
            c1 = Integer.max(0,c1);
            c2 = Integer.max(0,c2);
            if(c1==0){
                c1=1;
                t1=num;
            }
            else if(c2==0 && num!=t1){
                c2=1;
                t2=num;
            }
        }
        int limit = n/3;
        if(c1>0)
            c1 = count(nums,t1);
        if(c1>limit)
            res.add(t1);
        if(c2>0)
            c2 = count(nums,t2);
        if(c2>limit)
            res.add(t2);
        order(res);
        return res;
    }
    private int count(int[] arr, int n){
        int res = 0;
        for(int num:arr){
            if(num==n)
                res++;
        }
        return res;
    }
    private void order(List<Integer> res){
        int size = res.size();
        if(size==2){
            int num1 = res.get(0);
            int num2 = res.get(1);
            if(num1>num2){
                res.set(0,num2);
                res.set(1,num1);
            }
        }
    }
}
