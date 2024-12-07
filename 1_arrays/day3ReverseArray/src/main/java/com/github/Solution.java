package com.github;

public class Solution {
    public void reverseArray(int arr[]) {
        int n = arr.length,i=0;
        while(i<n/2){
            swap(arr,i,n-1-i);
            i++;
        }
    }
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
