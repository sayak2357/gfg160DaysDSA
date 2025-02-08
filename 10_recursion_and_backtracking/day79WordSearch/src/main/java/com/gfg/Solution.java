package com.gfg;

public class Solution {
    static public boolean isWordExist(char[][] mat, String word) {
        int n = mat.length;
        int m = mat[0].length;
        int wl = word.length();
        boolean res = false;
        int[][] bookkeeper = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==word.charAt(0)){
                    if(backtrack(i,j,n,m,mat,bookkeeper,0,wl,word))
                    {
                        res = true;
                        return res;
                    }
                }
            }
        }
        return res;
    }
    static private boolean backtrack(int i,int j,int n, int m,char[][] mat,int[][] bookkeeper,int idx,int wl,String word){
        if(idx>=wl)
            return true;
        if(i<0 || i>=n || j<0 || j>=m || bookkeeper[i][j]==1 || mat[i][j]!=word.charAt(idx))
            return false;
        if(idx==(wl-1))
            return true;
        bookkeeper[i][j] = 1;
        if(j<(m-1) && mat[i][j+1]==word.charAt(idx+1) && bookkeeper[i][j+1]==0){
            if(backtrack(i,j+1,n,m,mat,bookkeeper,idx+1,wl,word))
                return true;
        }
        if(i>0 && mat[i-1][j]==word.charAt(idx+1) && bookkeeper[i-1][j]==0){
            if(backtrack(i-1,j,n,m,mat,bookkeeper,idx+1,wl,word))
                return true;
        }
        if(j>0 && mat[i][j-1]==word.charAt(idx+1) && bookkeeper[i][j-1]==0){
            if(backtrack(i,j-1,n,m,mat,bookkeeper,idx+1,wl,word))
                return true;
        }
        if(i<(n-1) && mat[i+1][j]==word.charAt(idx+1) && bookkeeper[i+1][j]==0){
            if(backtrack(i+1,j,n,m,mat,bookkeeper,idx+1,wl,word))
                return true;
        }
        bookkeeper[i][j] = 0;
        return false;

    }
}
