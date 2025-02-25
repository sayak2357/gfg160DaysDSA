package com.gfg;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> stk = new Stack<>();
        ArrayList<Integer> res2 = new ArrayList<>();
        for(int i=0;i<n;i++){
            int num = arr[i];
            int top = i;
            int ct = 1;
            while(stk.size()>0 && num>=arr[stk.peek()]){
                top = stk.pop();
                ct += res[top];
            }
            res[i] = ct;
            stk.push(i);
        }
        for(int num:res)
            res2.add(num);
        return res2;
    }
}