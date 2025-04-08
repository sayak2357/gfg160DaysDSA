package com.gfg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean isBridge(int V, int[][] edges, int c, int d) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int x = edges[i][0];
            int y = edges[i][1];
            if(!adj.get(x).contains(y)){
                adj.get(x).add(y);
            }
            if(!adj.get(y).contains(x)){
                adj.get(y).add(x);
            }
        }
        removeVertex(adj,c,d);
        return !isReachable(c,d,adj,V);
    }
    private void removeVertex(ArrayList<ArrayList<Integer>> adj,int x, int y){
        int idx = -1;
        for(int i=0;i<adj.get(x).size();i++){
            if(adj.get(x).get(i)==y){
                idx = i;
                break;
            }
        }
        if(idx>=0){
            adj.get(x).remove(idx);
        }
        idx = -1;
        for(int i=0;i<adj.get(y).size();i++){
            if(adj.get(y).get(i)==x){
                idx = i;
                break;
            }
        }
        if(idx>=0){
            adj.get(y).remove(idx);
        }
    }
    private boolean isReachable(int x, int y, ArrayList<ArrayList<Integer>> adj, int V){
        boolean verdict = false;
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        visited[x] = true;
        while(!q.isEmpty()){
            int node = q.poll();
            if(node==y){
                verdict = true;
                break;
            }
            for(int nh:adj.get(node)){
                if(!visited[nh]){
                    q.offer(nh);
                    visited[nh] = true;
                }
            }
        }
        return verdict;
    }
}
