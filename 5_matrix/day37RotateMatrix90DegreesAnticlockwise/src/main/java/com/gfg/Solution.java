package com.gfg;

public class Solution {
    // Function to rotate matrix anticlockwise by 90 degrees.
    public static void rotateby90(int mat[][]) {
        int n = mat.length, m = mat[0].length;
        // Reverse each row

        for(int i=0;i<n;i++){
            reverseRow(mat,i,n,m);
        }

        // take transpose
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
                swap(mat,i,j,j,i);
            }
        }
    }
    private static void reverseRow(int[][] mat, int r, int row, int col){
        int colStart = 0, colEnd = col-1;
        while(colStart<colEnd){
            swap(mat,r,colStart,r,colEnd);
            colStart++;
            colEnd--;
        }
    }
    private static void swap(int[][] mat,int row,int col,int rowDes, int colDes){
        int temp = mat[row][col];
        mat[row][col] = mat[rowDes][colDes];
        mat[rowDes][colDes] = temp;
    }
}
