package com.gfg;

import java.util.LinkedList;
import java.util.Queue;

class Pair{
    public int x,y;
    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Solution {
    public int orangesRotting(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        Queue<Pair> rottenQ = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==2){
                    rottenQ.add(new Pair(i,j));
                }
            }
        }
        int day=0;
        while(rottenQ.size()>0){
            //day++;
            int N = rottenQ.size();
            for(int i=0;i<N;i++){
                Pair r = rottenQ.poll();
                int x = r.x;
                int y = r.y;
                if(y<(m-1) && mat[x][y+1]==1){
                    mat[x][y+1]=2;
                    rottenQ.add(new Pair(x,y+1));
                }
                if(y>0 && mat[x][y-1]==1){
                    mat[x][y-1]=2;
                    rottenQ.add(new Pair(x,y-1));
                }
                if(x>0 && mat[x-1][y]==1){
                    mat[x-1][y] = 2;
                    rottenQ.add(new Pair(x-1,y));
                }
                if(x<(n-1) && mat[x+1][y]==1){
                    mat[x+1][y] = 2;
                    rottenQ.add(new Pair(x+1,y));
                }
            }
            if(!rottenQ.isEmpty())
                day++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1)
                    return -1;
            }
        }
        return day;
    }
}
