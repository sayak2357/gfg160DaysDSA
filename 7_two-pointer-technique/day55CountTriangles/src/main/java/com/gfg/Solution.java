package com.gfg;

import java.util.Arrays;

public class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);
        int i = 0, j = n-1;
        int count = 0;
        for(int k=2;k<n;k++){
            i = 0;
            j = k-1;
            int sum = arr[i]+arr[j];
            while(i<j){
                if(sum>arr[k]){
                    count += (j-i);
                    j--;
                }
                else{
                    i++;
                }
                sum = arr[i]+arr[j];
            }
        }
        return count;
    }
}
