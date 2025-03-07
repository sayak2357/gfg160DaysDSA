package com.gfg;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public ArrayList<Integer> maxOfMins(int[] arr) {
        int n = arr.length;
        int[] leftSmaller, rightSmaller;
        leftSmaller = new int[n];
        rightSmaller = new int[n];
        ArrayList<Integer> maxOfMinWindow = new ArrayList<>();
        int[] temp = new int[n];
        for(int i=0;i<n;i++){
            leftSmaller[i] = -1;
            rightSmaller[i] = n;
            temp[i] = Integer.MIN_VALUE;
        }
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            while(stack.size()>0 && arr[i]<arr[stack.peek()]){
                rightSmaller[stack.peek()] = i;
                stack.pop();
            }
            if(!stack.isEmpty())
                leftSmaller[i] = stack.peek();
            stack.push(i);
        }
        for(int i=0;i<n;i++){
            int windowLength = rightSmaller[i] - leftSmaller[i] - 1;
            temp[windowLength-1] = Math.max(temp[windowLength-1],arr[i]);
        }
        for(int i=n-2;i>=0;i--){
            temp[i] = Math.max(temp[i],temp[i+1]);
        }
        for(int val:temp)
            maxOfMinWindow.add(val);
        return maxOfMinWindow;
    }
}
