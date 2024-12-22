package com.gfg;

public class Solution {
    public int kthMissing(int[] arr, int k) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>(k+i)){
                return k+i;
            }
        }
        return k+n;
    }

    public int kthMissingOptimised(int[] arr, int k) {
        int n = arr.length;
        int low = 0, high = n-1;
        int res = n+k;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>(mid+k)){
                res = mid+k;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return res;
    }
}