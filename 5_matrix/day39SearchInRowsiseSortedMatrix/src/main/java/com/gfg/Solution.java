package com.gfg;

public class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {

        // binary search each row
        // Complexity: O(n*log(m))
        int n = mat.length, m = mat[0].length;
        for(int i=0;i<n;i++){
            if(binarySearch(mat,i,m-1,x))
                return true;
        }
        return false;
    }
    private boolean binarySearch(int[][] arr,int row, int col, int x){
        if(x<arr[row][0] || x>arr[row][col])
            return false;
        int low = 0, high = col;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[row][mid] == x)
                return true;
            else if(arr[row][mid]>x)
                high = mid-1;
            else
                low = mid+1;
        }
        return false;
    }
}
