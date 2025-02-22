package com.gfg;

import java.util.Stack;

public class Solution {
static int maxLength(String s) {
    Stack<Integer> stk = new Stack<>();
    stk.push(-1);
    int maxLen = 0;
    int n = s.length();
    for(int i=0;i<n;i++){
        if(s.charAt(i)=='(')
            stk.push(i);
        else{
            stk.pop();
            if(stk.size()==0)
                stk.push(i);
            else{
                maxLen = Math.max(maxLen, i - stk.peek());
            }
        }
    }
    return maxLen;
}
}