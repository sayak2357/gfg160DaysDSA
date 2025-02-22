package com.gfg;

import java.util.Stack;

public class Solution {
    static boolean isBalanced(String s) {
        Stack<Character> stk = new Stack<>();

        boolean verdict = true;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                stk.push(s.charAt(i));
            }
            else{
                if(stk.size()>0 && ((s.charAt(i)==')' && stk.peek()=='(')
                        || (s.charAt(i)==']' && stk.peek()=='[') || (s.charAt(i)=='}' && stk.peek()=='{'))){
                    stk.pop();
                }
                else{
                    verdict = false;
                    break;
                }
            }
        }

        return stk.size()>0 ? false:verdict;
    }
}
