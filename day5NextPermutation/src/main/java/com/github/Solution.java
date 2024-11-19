package com.github;
import java.util.*;
public class Solution {
    void nextPermutation(int[] arr) {
        int n = arr.length;
        int pivot = -1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot==-1){
            Arrays.sort(arr);
            return;
        }
        int candidate = -1;
        for(int i=n-1;i>pivot;i--){
            if(arr[i]>arr[pivot]){
                candidate = i;
                break;
            }
        }
        swap(arr,pivot,candidate);
        //  Arrays.sort(arr,pivot+1,n);
        reverse(arr,pivot+1,n-1);
    }
    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    void reverse(int[] arr, int i, int j){
        if(i>=j)
            return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverse(arr,++i,--j);
    }
}