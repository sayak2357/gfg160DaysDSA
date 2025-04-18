package com.gfg;

import java.util.*;
class Pair{
        public int x,y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + this.x;
        hash = 31 * hash + this.y;
        return hash;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null) return false;
        if (this.getClass() != other.getClass()) return false;
        Pair that = (Pair) other;
        return (this.x == that.x) && (this.y == that.y);
    }

}
class NodeWeightPair{
    public int node,weight;
    public NodeWeightPair(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + this.node;
        hash = 31 * hash + this.weight;
        return hash;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null) return false;
        if (this.getClass() != other.getClass()) return false;
        NodeWeightPair that = (NodeWeightPair) other;
        return (this.node == that.node) && (this.weight == that.weight);
    }
}
class Solution {
    public int[] dijkstra(int V, int[][] edges, int src) {
        List<List<Integer>> adj = new ArrayList<>();
        Map<Pair,Integer> hm = new HashMap<>();
        int[] dist = new int[V];
        boolean[] visited = new boolean[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int x = edges[i][0];
            int y = edges[i][1];
            int wt = edges[i][2];
            adj.get(x).add(y);
            adj.get(y).add(x);
            hm.put(new Pair(x,y),wt);
            hm.put(new Pair(y,x),wt);
        }
        Queue<NodeWeightPair> minHeap = new PriorityQueue<>((a,b)->a.weight-b.weight);
        minHeap.offer(new NodeWeightPair(src,0));
        while(!minHeap.isEmpty()){
            NodeWeightPair curr = minHeap.poll();
            int node = curr.node;
            int wt = curr.weight;
            dist[node] = Math.min(dist[node],wt);
            visited[node] = true;
            for(int nh:adj.get(node)){
                if(!visited[nh]){
                    int distFromSource = hm.get(new Pair(node,nh))+wt;
                    if(distFromSource<dist[nh]){
                        dist[nh] = distFromSource;
                        minHeap.offer(new NodeWeightPair(nh,distFromSource));
                    }
                }
            }
        }
        return dist;
    }
}