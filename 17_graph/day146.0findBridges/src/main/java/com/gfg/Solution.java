package com.gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private int timer = 1;
    public List<List<Integer>> articulationPoints(int V, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int x = edges[i][0];
            int y = edges[i][1];
            adj.get(x).add(y);
            adj.get(y).add(x);
        }
        int[] vis = new int[V];
        int[] tin = new int[V];
        int[] low = new int[V];
        List<List<Integer>> bridges = new ArrayList<>();
        dfs(0,-1,vis,adj,tin,low,bridges);
        return bridges;
    }
    private void dfs(int node, int parent, int[] vis, List<List<Integer>> adj, int[] tin, int[] low, List<List<Integer>> bridges){
        vis[node]= 1;
        tin[node] = low[node] = timer;
        timer++;
        for(int it:adj.get(node)){
            if(it==parent)
                continue;
            if(vis[it]==0){
                dfs(it,node,vis,adj,tin,low,bridges);
                low[node] = Math.min(low[node],low[it]);
                if(low[it]>tin[node]){
                    bridges.add(Arrays.asList(it,node));
                }
            }
            else{
                low[node] = Math.min(low[node],low[it]);
            }
        }
    }
}
