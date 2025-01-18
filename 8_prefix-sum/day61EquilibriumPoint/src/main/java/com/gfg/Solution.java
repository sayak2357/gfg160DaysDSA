package com.gfg;

public class Solution {
// Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        int n = arr.length;
        int totalSum = findSum(arr);
        int runningSum = 0;
        for(int i=0;i<n-1;i++){
            runningSum+=arr[i];
            int remaining = totalSum-runningSum;
            int rem = remaining-arr[i+1];
            if(rem==runningSum)
                return (i+1);
        }
        return -1;
    }

    private static int findSum(int[] arr){
        int sum = 0;
        for(int num:arr){
            sum+= num;
        }
        return sum;
    }
}

