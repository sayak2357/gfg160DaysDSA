package com.gfg;

public class Solution {
    // Function to count inversions in the array.
    public static int inversionCount(int arr[]) {
        int n = arr.length;
        return mergeSort(arr,0,n-1);
    }
    private static int mergeSort(int[] arr, int l,int h){
        if(l>=h)
            return 0;
        int mid = (l+h)/2;
        int invCount = mergeSort(arr,l,mid);
        invCount += mergeSort(arr,mid+1,h);
        invCount += merge(arr,l,mid,h);
        return invCount;
    }
    private static int merge(int[] arr, int left, int mid, int right){
        int[] temp = new int[right-left+1];
        int i =left, j = mid+1, pos = 0, invCount = 0;
        while(i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp[pos++] = arr[i++];
            }
            else{
                invCount += mid-i+1;
                temp[pos++] = arr[j++];
            }
        }
        while(i<=mid){
            temp[pos++] = arr[i++];
        }
        while(j<=right){
            temp[pos++] = arr[j++];
        }
        for(i=left;i<=right;i++){
            arr[i] = temp[i-left];
        }
        return invCount;
    }

}