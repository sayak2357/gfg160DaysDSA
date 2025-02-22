package com.gfg;

/*

Any number say abc = a*100+b*10+c
                   = (a+b+c) + 99*a+9*b
                   = (a+b+c) + 9*(11a+b)
               abc%9 = (a+b+c)%9
 */
public class Solution {
    public int singleDigit(int n) {
        if(n==0)
            return n;
        if(n%9==0)
            return 9;
        return n%9;
    }

}