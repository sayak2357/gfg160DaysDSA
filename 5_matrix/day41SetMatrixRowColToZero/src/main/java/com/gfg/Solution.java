package com.gfg;

public class Solution {
    public void setMatrixZeroes(int[][] mat) {

        // take 0th element of each row and column to store if that row can be made zero or not
        int c0 = 1;
        // since setting mat[0][0] doesn't clarify whether the 0th row or column needs to nulified, we use 'c0' variable to denote 0th column
        int n = mat.length, m = mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    mat[i][0] = 0;
                    if(j==0)
                        c0 = 0;
                    else
                        mat[0][j] = 0;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(mat[i][0] == 0 || mat[0][j] == 0){
                    mat[i][j] = 0;
                }
            }
        }
        // set 0th row
        if(mat[0][0]==0){
            for(int j=0;j<m;j++)
                mat[0][j] = 0;
        }

        // set 0th column
        if(c0==0){
            for(int i=0;i<n;i++)
                mat[i][0] = 0;
        }
    }
}
