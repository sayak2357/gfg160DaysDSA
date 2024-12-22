package com.gfg;

public class Solution {
    public static int findPages(int[] arr, int k) {
        int n = arr.length;
        if(k>n)
            return -1;
        int min = findMax(arr);
        int max = findSum(arr);
        int ans = max;
        while(min<=max){
            int mid = min+(max-min)/2;
            if(isFeasible(arr,mid,k)){
                ans = mid;
                max = mid-1;
            }
            else{
                min = mid+1;
            }
        }
        return ans;
    }
    private static int findMax(int[] arr){
        int ans = arr[0];
        for(int num:arr)
            ans = Math.max(ans,num);

        return ans;
    }
    private static int findSum(int[] arr){
        int res = 0;
        for(int num:arr)
            res+=num;

        return res;
    }
    private static boolean isFeasible(int[] arr, int limit, int k){
        int n = arr.length;
        int runningSum = arr[0];
        int cnt =  1;
        for(int i=1;i<n;i++){
            if(runningSum+arr[i]>limit){
                cnt+=1;
                runningSum = arr[i];
            }
            else
                runningSum += arr[i];
        }
        return cnt<=k;
    }
}
