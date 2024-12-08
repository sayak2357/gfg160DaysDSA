package com.gfg;

import java.util.ArrayList;

public class Solution {

    public ArrayList<Integer> search(String pat, String txt) {
        int m = pat.length();
        int n = txt.length();
        int[] lps = constructLPS(pat);
        // set i,j for traversing text & pattern
        int i = 0;
        int j = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while(i<n){
            if(txt.charAt(i) == pat.charAt(j)){
                i+= 1;
                j+= 1;
                // if whole pattern is matched, store the start index in res
                if(j==m){
                    res.add(i-j);
                    // Use LPS of previous index to skip redundant comparisons
                    j = lps[j-1];
                }
            }
            // if there is mismatch
            else{
                // Use LPS value of previous index
                if(j!=0)
                    j = lps[j-1];
                else
                    i+=1;
            }
        }

        return res;
    }
    private int[] constructLPS(String pattern){

        // len stores the length of longest prefix which is also a suffix for the prev index
        int m = pattern.length();
        int len = 0;
        int[] lps = new int[m];
        int i = 1;
        while(i<m){
            // if characters match, increment the size of lps
            if(pattern.charAt(i)==pattern.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            // if there is mismatch
            else{
                if(len!=0){
                    // update len to the previous lps value to avoid redundant comparisons
                    len = lps[len-1];
                }
                else{
                    // if no matching prefix is found, set lps to 0
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
