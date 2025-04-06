package com.gfg;

import java.util.*;

public class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(0);
        visited.add(0);
        while(!queue.isEmpty()){
            int node = queue.poll();
            res.add(node);
            ArrayList<Integer> neighbours = adj.get(node);
            for(int nh:neighbours){
                if(!visited.contains(nh)){
                    queue.offer(nh);
                    visited.add(nh);
                }
            }
        }
        return res;
    }
}
