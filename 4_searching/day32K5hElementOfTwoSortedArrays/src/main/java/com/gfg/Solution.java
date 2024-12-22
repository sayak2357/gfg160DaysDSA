package com.gfg;

public class Solution {
    public int kthElement(int a[], int b[], int k) {
        int n = a.length, m = b.length;
        int i= 0, j = 0;
        int num = a[0];
        while(i<n && j<m && k>0){
            if(a[i]<b[j]){
                num = a[i++];
            }
            else{
                num = b[j++];
            }
            k--;
        }
        while(i<n && k>0){
            num = a[i++];
            k--;
        }
        while(j<m && k>0){
            num = b[j++];
            k--;
        }
        return num;
    }

}
