package com.github;

import java.util.Arrays;

public class Solution {
    int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        int res = arr[n-1]-arr[0];
        int minH = 0,maxH = 0;
        for(int i=1;i<n;i++){
            if(arr[i]<k)
                continue;
            minH = Math.min(arr[0]+k,arr[i]-k);
            maxH = Math.max(arr[n-1]-k,arr[i-1]+k);
            res = Math.min(res,maxH-minH);

        }
        return res;
    }
}
