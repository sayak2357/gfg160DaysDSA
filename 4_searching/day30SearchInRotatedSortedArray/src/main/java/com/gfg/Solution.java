package com.gfg;

public class Solution {
    int search(int[] arr, int key) {
        int n = arr.length;
        int ans = -1;
        int left = 0, right = n-1;
        int mid = -1;
        while(left<=right){
            mid = (left+right)/2;
            //   System.out.println("start: "+left+" "+right+" "+mid);
            if(arr[mid]==key){
                ans = mid;
                break;
            }
            if(arr[mid]>arr[right] && key>arr[mid])
                left = mid+1;
            else if(arr[mid]>arr[right] && key<arr[mid]){
                if(key<arr[left])
                    left =  mid+1;
                else
                    right = mid-1;
            }
            else if(arr[mid]<=arr[right]){
                if(key>arr[mid] && key<=arr[right])
                    left = mid+1;
                else
                    right = mid-1;
            }
            //  System.out.println("end: "+left+" "+right+" "+mid);
        }
        return ans;
    }
}
