package com.gfg;

import java.util.Arrays;

public class Solution {
    int countPairs(int arr[], int target) {
        Arrays.sort(arr);
        int n = arr.length;
        int i=0, j = n-1;
        int count = 0;
        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum>=target){
                j--;
            }
            else{
                count += (j-i);
                i++;
            }
        }
        return count;
    }
}
