package com.gfg;

import java.util.ArrayList;

public class Solution {
    public boolean isCycle(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        boolean isCycleVerdict = false;
        for(int i=0;i<edges.length;i++){
            int x = edges[i][0];
            int y = edges[i][1];
            adj.get(x).add(y);
            adj.get(y).add(x);
        }
        boolean[] visited = new boolean[V];
        boolean[] explored = new boolean[V];
        for(int i=0;i<V;i++){
            if(!explored[i]){
                isCycleVerdict = isCycleHelper(i,-1,adj,visited,explored);
                if(isCycleVerdict)
                    break;
            }
        }
        return isCycleVerdict;
    }
    private boolean isCycleHelper(int root, int parent, ArrayList<ArrayList<Integer>> adj, boolean[] visited, boolean[] explored){
        if(visited[root])
            return true;
        explored[root] = true;
        visited[root] = true;
        for(int neighbour:adj.get(root)){
            if(neighbour!=parent){
                if(isCycleHelper(neighbour,root,adj,visited,explored)){
                    return true;
                }
            }
        }
        visited[root] = false;
        return false;
    }
}
