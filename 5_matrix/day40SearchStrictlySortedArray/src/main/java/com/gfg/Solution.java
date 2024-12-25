package com.gfg;

public class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {

        // Assume the matrix is 1-D with indices from 0 to n*m-1
        // Do binary search on this hypothetical i-D array
        int n = mat.length, m = mat[0].length;
        int posStart = 0, posEnd = n*m-1;
        int mid = 0,row = 0, col = 0;
        while(posStart<=posEnd){
            mid = (posStart+posEnd)/2;
            row = mid/m;
            col = mid%m;
            if(mat[row][col] == x)
                return true;
            else if(mat[row][col]>x)
                posEnd = mid-1;
            else
                posStart = mid+1;
        }
        return false;
    }

}
