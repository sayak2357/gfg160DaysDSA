package com.gfg;
import java.util.*;

public class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<ArrayList<Integer>> board = generateBoard(n);
        ArrayList<Integer> queensPlaced = new ArrayList<>();
        playNQueen(0,queensPlaced,res,board,n);
        return res;
    }
    private ArrayList<ArrayList<Integer>> generateBoard(int n){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(0);
            }
            res.add(row);
        }
        return res;
    }
    private boolean playNQueen(int i,ArrayList<Integer> queensPlaced, ArrayList<ArrayList<Integer>> res, ArrayList<ArrayList<Integer>> board, int n){
        if(i==n){
            res.add(queensPlaced);
            return true;
        }
        boolean queenPlaced = false;
        ArrayList<Integer> placedQueen = (ArrayList) queensPlaced.clone();
        for(int j=0;j<n;j++){
            if(isSafe(i,j,board,n)){
                board.get(i).add(j,1);
                placedQueen.add(j+1);
                if(playNQueen(i+1,placedQueen,res,board,n)){
                    queenPlaced = true;
                }
                placedQueen.removeLast();
                board.get(i).add(j,0);
            }
        }
        return queenPlaced;
    }
    private boolean isSafe(int i, int j, ArrayList<ArrayList<Integer>> board, int n){
        for(int k=0;k<n;k++){
            if(board.get(i).get(k)==1)
                return false;
        }
        for(int k=0;k<n;k++){
            if(board.get(k).get(j)==1)
                return false;
        }
        int row = i, col = j;
        while(row>=0 && col>=0){
            if(board.get(row).get(col)==1)
                return false;
            row--;
            col--;
        }
        row = i;
        col = j;
        while(row>=0 && col<n){
            if(board.get(row).get(col)==1)
                return false;
            row--;
            col++;
        }
        row = i;
        col = j;
        while(row<n && col>=0){
            if(board.get(row).get(col)==1)
                return false;
            row++;
            col--;
        }
        row = i;
        col = j;
        while(row<n && col<n){
            if(board.get(row).get(col)==1)
                return false;
            row++;
            col++;
        }
        return true;
    }
}
