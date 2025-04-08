package com.gfg;

import java.util.ArrayList;

public class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        boolean[] visited = new boolean[V];
        boolean[] explored = new boolean[V];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int from = edges[i][0];
            int to   = edges[i][1];
            adj.get(from).add(to);
        }
        boolean verdict = false;
        for(int i=0;i<V;i++){
            if(!explored[i]){
                if(dfs(i,adj,visited,explored)){
                    verdict = true;
                    break;
                }
            }
        }
        return verdict;
    }
    private boolean dfs(int root, ArrayList<ArrayList<Integer>> adj,boolean[] visited, boolean[] explored){
        if(visited[root])
            return true;
        visited[root] = true;
        explored[root] = true;
        boolean flag = false;
        for(int neighbour:adj.get(root)){
            if(dfs(neighbour,adj,visited,explored)){
                flag = true;
                break;
            }
        }
        visited[root] = false;
        return flag;
    }
}
