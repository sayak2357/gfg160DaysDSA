package com.gfg;

public class Solution {
    public static int[] productExceptSelf(int arr[]) {
        int n = arr.length;
        int[] leftProduct = new int[n];
        int[] ans = new int[n];
        int product = 1;
        for(int i=0;i<n;i++){
            product*=arr[i];
            leftProduct[i] = product;
        }
        product = 1;
        for(int i=n-1;i>=0;i--){
            int prevLeftProduct = i>0?leftProduct[i-1]:1;
            ans[i] = prevLeftProduct*product;
            product *= arr[i];
        }
        return ans;
    }
}
