package com.gfg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Node{
    int val;
    ArrayList<Node> neighbors;
    public Node(){
        val = 0;
        neighbors = new ArrayList<>();
    }

    public Node(int val){
        this.val = val;
        neighbors = new ArrayList<>();
    }

    public Node(int val, ArrayList<Node> neighbors){
        this.val = val;
        this.neighbors = neighbors;
    }
}
public class Solution {
    Node cloneGraph(Node node) {
        Map<Integer, Node> hm = new HashMap<>();
        return cloneGraphHelper(node,hm);
    }
    Node cloneGraphHelper(Node node,Map<Integer, Node> hm){
        if(node==null)
            return null;
        int nodeVal = node.val;
        Node copy = null;
        if(hm.containsKey(nodeVal)){
            copy = hm.get(nodeVal);
        }
        else{
            copy = new Node(nodeVal);
            hm.put(nodeVal,copy);
            ArrayList<Node> neighbours = copy.neighbors;
            for(Node nh:node.neighbors){
                Node neighbourCopy = cloneGraphHelper(nh,hm);
                neighbours.add(neighbourCopy);
            }
        }
        return copy;
    }
}
