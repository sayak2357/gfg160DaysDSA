package com.gfg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = adj.size();
        Set<Integer> visited = new HashSet<>();
        for(int i=0;i<n;i++){
            if(!visited.contains(i)){
                dfsHelper(adj,i,visited,res);
            }
        }
        return res;
    }
    private void dfsHelper(ArrayList<ArrayList<Integer>> adj, int curr, Set<Integer> visited, ArrayList<Integer> res){
        res.add(curr);
        visited.add(curr);
        ArrayList<Integer> neighbours = adj.get(curr);
        for(int nh:neighbours){
            if(!visited.contains(nh)){
                dfsHelper(adj,nh,visited,res);
            }
        }
        return;
    }
}
