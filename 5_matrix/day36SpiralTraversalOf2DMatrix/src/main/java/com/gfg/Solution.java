package com.gfg;

import java.util.ArrayList;

public class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        int n = mat.length, m = mat[0].length;
        ArrayList<Integer> res = new ArrayList<>();
        int rowLimit = n-1, colLimit = m-1;
        int count = n*m;
        int rowStart = 0, colStart = 0;
        while(rowStart<=rowLimit && colStart<=colLimit){
            for(int j=colStart;j<=colLimit;j++){
                res.add(mat[rowStart][j]);
                count--;
            }
            // if(count==0)
            //     break;
            rowStart++;
            for(int i=rowStart;i<=rowLimit;i++){
                res.add(mat[i][colLimit]);
                count--;
            }
            if(count==0)
                break;
            colLimit--;
            for(int j=colLimit;j>=colStart;j--){
                res.add(mat[rowLimit][j]);
                count--;
            }
            rowLimit--;
            if(count==0)
                break;
            for(int i=rowLimit;i>=rowStart;i--){
                res.add(mat[i][colStart]);
                count--;
            }
            colStart++;

        }
        return res;
    }
}
