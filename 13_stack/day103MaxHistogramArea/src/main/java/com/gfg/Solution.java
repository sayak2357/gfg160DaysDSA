package com.gfg;

import java.util.Stack;

public class Solution {
    public static int getMaxArea(int arr[]) {
        int n = arr.length;
        int maxArea = 0;
        int[] lowerLeft = new int[n];
        int[] lowerRight = new int[n];
        findLowereOnLeftAndRigh(arr,n,lowerLeft,lowerRight);
        for(int i=0;i<n;i++){
            maxArea = Math.max(maxArea, arr[i]*(lowerRight[i]-lowerLeft[i]-1));
        }
        return maxArea;
    }
    private static void findLowereOnLeftAndRigh(int[] arr, int n,int[] lowerLeft,int[] lowerRight){
        int i=0;
        for(i=0;i<n;i++)
            lowerRight[i] = n;
        for(i=0;i<n;i++)
            lowerLeft[i] = -1;
        Stack<Integer> stk = new Stack<>();
        i=0;
        while(i<n){
            int num = arr[i];
            while(stk.size()>0 && num<arr[stk.peek()]){
                lowerRight[stk.peek()] = i;
                stk.pop();
            }
            if(stk.size()>0){
                lowerLeft[i] = stk.peek();
            }
            stk.push(i);
            i++;
        }

    }
}