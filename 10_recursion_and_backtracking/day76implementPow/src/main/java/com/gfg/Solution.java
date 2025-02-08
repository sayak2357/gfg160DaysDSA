package com.gfg;

public class Solution {
    double power(double b, int e) {
        double ans = 0;
        if(e<0){
            int abs = Math.abs(e);
            ans = powerMini(b,abs);
            ans = 1/ans;
        }
        else{
            ans = powerMini(b,e);
        }
        return ans;
    }
    double powerMini(double b, int e){
        if(e==0)
            return 1;
        double mid = power(b,e/2);
        int rem = e%2;
        if(rem==0)
            return mid*mid;
        return mid*mid*b;
    }
}
