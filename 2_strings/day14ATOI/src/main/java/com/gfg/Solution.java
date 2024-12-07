package com.gfg;

public class Solution {
    public int myAtoi(String s) {
        String inp = s.trim();
        char[] input = inp.toCharArray();
        int n = input.length;
        boolean isPositive = true;
        if(input[0]=='-')
            isPositive = false;
        int i = 0;
        long ans = 0;
        if(input[0]=='-' || input[0]=='+')
            i++;
        long upperLimit = (long) Math.pow(2,31)-1;
        while(i<n){
            Character c = input[i];
            if(!Character.isDigit(c))
                break;
            long num = Character.getNumericValue(c);
            ans = ans*10+num;
            i++;
        }
        if(isPositive && ans>upperLimit)
            ans = upperLimit;
        if(!isPositive && ans>(upperLimit+1))
            ans = (upperLimit+1)*(-1);
        int res =  isPositive ? (int) ans: ((int) ans)*(-1);
        return res;
    }
}
