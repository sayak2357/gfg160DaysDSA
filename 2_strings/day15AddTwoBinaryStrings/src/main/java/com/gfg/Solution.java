package com.gfg;

public class Solution {
    public String addBinary(String s1, String s2) {
        String max = s1.length()>s2.length()?s1:s2;
        String min = max==s1?s2:s1;
        int n = max.length();
        int m = min.length();
        int i = n-1,j=m-1;
        String sum = "";
        int carry=0;
        char a,b;
        while(i>=0){
            a = max.charAt(i);
            if(j>=0)
                b = min.charAt(j);
            else
                b = '0';
            int a1 = a-'0';
            int b1 = b - '0';
            int inSum =(a1+b1+carry)%2;
            carry = (a1+b1+carry)/2;
            i--;
            j--;
            sum = String.valueOf(inSum)+sum;
        }
        if(carry==1)
            sum = "1"+sum;
        sum = sum.replaceFirst ("^0*", "");
        return sum;
    }
}
