package com.gfg;

public class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        int gap = (n+m+1)/2;
        while(gap>0){
            int i = 0;
            int j = gap;
            while(j<(n+m)){
                if(j<n && a[i]>a[j]){
                    swap(a,a,i,j);
                }
                else if(i<n && j>=n && a[i]>b[j-n]){
                    swap(a,b,i,j-n);
                }
                else if(i>=n && b[i-n]>b[j-n]){
                    swap(b,b,i-n,j-n);
                }
                i++;
                j++;
            }
            if(gap==1)
                break;
            gap = (gap+1)/2;
        }
    }
    private void swap(int[] arr1, int[] arr2,int i, int j){
        int temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }
}

