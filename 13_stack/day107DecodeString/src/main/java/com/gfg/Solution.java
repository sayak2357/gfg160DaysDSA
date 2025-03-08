package com.gfg;

import java.util.Stack;

public class Solution {
    static String decodeString(String s) {
        Stack<String> stack = new Stack<String>();
        int n = s.length();
        String res = "";
        for(int i=0;i<n;i++){
            String character = String.valueOf(s.charAt(i));
            if(!character.equals("]"))
                stack.push(character);
            else{
                String top = stack.pop();
                String temp = "";
                while(!top.equals("[")) {
                    temp = top + temp;
                    top = stack.pop();
                }
                String kTemp = stack.pop();
                if(stack.size()>0 && isNumeric(stack.peek())){
                    kTemp = stack.pop()+kTemp;
                }
                if(stack.size()>0 && isNumeric(stack.peek())){
                    kTemp = stack.pop()+kTemp;
                }
                int k = Integer.parseInt(kTemp);
                k--;
                String newTemp = temp;
                for(int j=1;j<=k;j++)
                    newTemp += temp;
                stack.push(newTemp);
            }
        }
        res = stack.pop();
        while(!stack.isEmpty()){
            res = stack.pop()+res;
        }
        return res;
    }

    private static boolean isNumeric(String s){
        try{
            Integer.parseInt(s);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
}
