package com.gfg;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        int[] nextGreater = new int[n];
        for(int i=0;i<n;i++)
            nextGreater[i] = -1;

        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<n;i++){
            int num = arr[i];
            while(stk.size()>0 && num>arr[stk.peek()]){
                nextGreater[stk.pop()] = num;
            }
            stk.push(i);
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int ng:nextGreater)
            res.add(ng);
        return res;
    }
}