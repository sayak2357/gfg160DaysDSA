package com.gfg;

public class Solution {
    static String longestPalindrome(String s) {
        String ans = "";
        int longestLength = 1;
        int n = s.length();
        int t=-1;
        for(int i=1;i<n;i++){
            int temp = expandFromMid(s,i,i);
            if(temp>longestLength){
                longestLength = temp;
                t = (temp-1)/2;
                ans = s.substring(i-t,i+t+1);
            }
            if(s.charAt(i)==s.charAt(i-1)){
                temp = expandFromMid(s,i-1,i);
                if(temp>longestLength){
                    longestLength = temp;
                    t = temp/2;
                    ans = s.substring(i-t,i+t);
                }
            }
        }
        return ans;
    }
    static int expandFromMid(String s, int i, int j){
        int n = s.length();
        int left = i-1;
        int right = j+1;
        int ans = i==j?1:2;
        while(left>=0 && right <n && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
            ans+=2;
        }
        return ans;
    }
}
