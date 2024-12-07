package com.github;

public class Solution {
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d%n;
        rotate(arr,0,d-1);
        rotate(arr,d,n-1);
        rotate(arr,0,n-1);
    }
    static void rotate(int[] arr, int l, int r){
        while(l<r){
            swap(arr,l,r);
            l++;
            r--;
        }
    }
    static void swap(int[] arr, int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
