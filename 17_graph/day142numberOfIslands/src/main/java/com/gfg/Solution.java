package com.gfg;

public class Solution {
    public int countIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int islandCount = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='L'){
                    captureIsland(i,j,n,m,grid);
                    islandCount++;
                }
            }
        }
        return islandCount;
    }
    private void captureIsland(int x, int y,int n, int m,char[][] grid){
        if(x<0 || x>=n || y<0 || y>=m || grid[x][y]!='L'){
            return;
        }
        grid[x][y] = 'I';
        captureIsland(x,y+1,n,m,grid);
        captureIsland(x,y-1,n,m,grid);
        captureIsland(x-1,y,n,m,grid);
        captureIsland(x+1,y,n,m,grid);
        captureIsland(x+1,y+1,n,m,grid);
        captureIsland(x+1,y-1,n,m,grid);
        captureIsland(x-1,y+1,n,m,grid);
        captureIsland(x-1,y-1,n,m,grid);
    }
}
