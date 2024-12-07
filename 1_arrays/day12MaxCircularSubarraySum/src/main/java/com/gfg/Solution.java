package com.gfg;

public class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {

        int maxSum = kadanes(arr);
        int[] inverted = new int[arr.length];
        for(int i=0;i<arr.length;i++)
            inverted[i] = arr[i]*(-1);
        int minSubSum = kadanes(inverted);
        int arrSum = arraySum(arr);
        int maxCircularSubSum = arrSum+minSubSum;
        int maxNum = findMax(arr);
        if(maxNum<0)
            return maxNum;
        int ans = Math.max(maxSum,maxCircularSubSum);

        //System.out.println(maxSum+" "+minSubSum+" "+arrSum+" "+maxCircularSubSum);
        return ans;
    }
    private int findMax(int[] arr){
        int ans = arr[0];
        for(int i=1;i<arr.length;i++)
            ans = Math.max(ans,arr[i]);
        return ans;
    }
    private int arraySum(int[] arr){
        int sum = 0;
        for(int num:arr)
            sum += num;
        return sum;
    }
    private int kadanes(int[] arr){
        int ans = arr[0], maxSum = arr[0];
        int n = arr.length;
        for(int i=1;i<n;i++){
            maxSum = Math.max(arr[i],maxSum+arr[i]);
            ans = Math.max(ans,maxSum);
        }
        return ans;
    }
}