package com.gfg;

import java.util.Arrays;

public class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagramsOptimal(String s1, String s2) {
        int[] freqArr = new int[26];
        for(char a:s1.toCharArray())
            freqArr[a-'a']++;
        for(char b:s2.toCharArray())
            freqArr[b-'a']-=1;
        return allZeros(freqArr);
    }
    private static boolean allZeros(int[] freqArr){
        for(int a:freqArr){
            if(a!=0)
                return false;
        }
        return true;
    }
    public static boolean areAnagrams(String s1, String s2) {

        char[] s1c = s1.toCharArray();
        char[] s2c = s2.toCharArray();
        Arrays.sort(s1c);
        Arrays.sort(s2c);
        String sortedS1 = new String(s1c);
        String sortedS2 = new String(s2c);
        //  System.out.println(new String(ss1));
        return sortedS1.equals(sortedS2);
    }
}
