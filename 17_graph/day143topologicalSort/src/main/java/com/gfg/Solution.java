package com.gfg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
public static ArrayList<Integer> topoSort(int V, int[][] edges) {
    ArrayList<Integer> res = new ArrayList<>();
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    int[] inDegree = new int[V];
    for(int i=0;i<V;i++){
        adj.add(new ArrayList<>());
    }
    for(int i=0;i<edges.length;i++){
        int from = edges[i][0];
        int to = edges[i][1];
        inDegree[to]++;
        adj.get(from).add(to);
    }
    Queue<Integer> q = new LinkedList<>();
    for(int i=0;i<V;i++){
        if(inDegree[i]==0)
            q.offer(i);
    }
    while(!q.isEmpty()){
        int node = q.poll();
        res.add(node);
        for(int neighbour:adj.get(node)){
            inDegree[neighbour]--;
            if(inDegree[neighbour]==0)
            {
                q.offer(neighbour);
            }
        }
    }
    return res;
}
}
