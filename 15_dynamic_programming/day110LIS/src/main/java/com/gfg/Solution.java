package com.gfg;

public class Solution {
    static int lis(int arr[]) {
        int n = arr.length;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            res[i] = 1;
        }
        int LIS = 1;
        for(int i=1;i<n;i++){
            int maxLenEnding = 1;
            boolean flag = false;
            for(int j=i-1;j>=0;j--){
                if(arr[i]>arr[j]){
                    maxLenEnding = Math.max(maxLenEnding, res[j]);
                    flag = true;
                }
            }
            res[i] = flag? maxLenEnding+1:res[i];
            LIS = Math.max(LIS,res[i]);
        }
        return LIS;
    }
}
