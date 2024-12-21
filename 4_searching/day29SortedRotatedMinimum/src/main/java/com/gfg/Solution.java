package com.gfg;

public class Solution {
    public int findMin(int[] arr) {
        int min = arr[0];
        int n = arr.length;
        int left = 0, right = n-1;
        while(left<=right){
            int mid = (left+right)/2;
            min = Math.min(min,arr[mid]);
            if(arr[mid]<arr[right]){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return min;
    }
}
