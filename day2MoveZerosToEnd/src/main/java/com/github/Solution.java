package com.github;

public class Solution {
    void pushZerosToEnd(int[] arr) {
        int n = arr.length,count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                swap(arr,i,count);
                count++;
            }
        }

    }
    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}