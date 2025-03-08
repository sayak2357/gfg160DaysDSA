package com.gfg;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public int evaluate(String[] arr) {
        String[] operations = new String[]{"+","-","*","/"};
        Stack<Integer> stack = new Stack<Integer>();
        for(String token:arr){
            if(Arrays.asList(operations).contains(token)){
                int num2 = stack.pop();
                int num1 = stack.pop();
                int res = 0;
                if(token.equals("+"))
                    res = num1+num2;
                else if(token.equals("-"))
                    res = num1-num2;
                else if(token.equals("*"))
                    res = num1*num2;
                else
                    res = num1/num2;
                stack.push(res);
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }
}
