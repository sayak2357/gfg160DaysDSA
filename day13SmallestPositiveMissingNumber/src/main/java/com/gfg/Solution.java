package com.gfg;

public class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int res = n+1;
        int i = 0;
        while(i<n){
            int num = arr[i];
            while(num>0 && num<=n && num!=arr[num-1]){
                swap(arr,i,num-1);
                num = arr[i];

            }
            i++;
        }
        for(i=0;i<n;i++){
            if(arr[i]!=(i+1))
            {
                res = i+1;
                break;
            }
        }
        return res;
    }
    private void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

