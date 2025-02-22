package com.gfg;

public class Solution {
    // k is the maximum number of zeros allowed to flip
    public int maxOnes(int arr[], int k) {
        int n = arr.length;
        int l = 0,r=0,i=0;
        int flips = 0;
        int ans=0;
        if(k==0)
            return longestConsecutiveOnes(arr,n);
        while(i<n){
            if(arr[i]==0){
                flips++;
            }
            i++;
            if(flips==k)
                break;

        }
        while(i<n && arr[i]==1){
            i++;
        }
        r = i-1;
        ans = Math.max(ans,r-l+1);
        r++;
        while(r<n){
            if(arr[r]==0){
                int temp = l;
                while(arr[temp]!=0){
                    temp++;
                }
                temp++;
                l = temp;
            }
            ans = Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
    private int longestConsecutiveOnes(int[] arr, int n){
        int ans = 0;
        int temp=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                temp++;
            }
            else{
                temp = 0;
            }
            ans = Math.max(ans,temp);
        }
        return ans;
    }
}