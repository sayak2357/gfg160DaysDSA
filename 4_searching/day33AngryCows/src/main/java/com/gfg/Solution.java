package com.gfg;

import java.util.Arrays;

public class Solution {
public static int aggressiveCows(int[] stalls, int k) {
    int n = stalls.length;
    Arrays.sort(stalls);
    int min = 1, max = stalls[n-1]-stalls[0];
    int ans = Integer.MIN_VALUE;
    while(min<=max){
        int mid = (min+max)/2;
        // System.out.println(min+" "+mid+" "+max+" "+ans);
        if(isFeasible(stalls,mid,k)){
            min = mid+1;
            ans = Math.max(ans,mid);
        }
        else{
            max = mid-1;
        }
    }
    return ans==Integer.MIN_VALUE?0:ans;
}
private static boolean isFeasible(int[] arr, int dist, int k){
    int n = arr.length;
    int start = arr[0];
    k--;
    for(int i=1;i<n;i++){
        int diff = arr[i]-start;
        if(diff>=dist){
            k--;
            start = arr[i];
        }
        if(k==0)
            break;
    }
    return k==0;
}
}
