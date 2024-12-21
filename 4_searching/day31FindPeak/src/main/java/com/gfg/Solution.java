package com.gfg;

public class Solution {

    public int peakElement(int[] arr) {
        int n = arr.length;
        if(n==1)
            return 0;
        if(arr[0]>arr[1])
            return 0;
        if(arr[n-1]>arr[n-2])
            return n-1;
        int low = 0, high = n-1;
        int mid;
        while(low<=high){
            mid = low +(high-low)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
                return mid;
            else if(arr[mid]<arr[mid+1])
                low = mid+1;
            else
                high = mid-1;
        }
        return 0;
    }
}
