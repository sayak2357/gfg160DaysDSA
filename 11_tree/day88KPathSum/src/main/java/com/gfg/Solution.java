package com.gfg;

import java.util.HashMap;
import java.util.Map;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Solution {
    public int sumK(Node root, int k) {
        int[] ksumPathCount = new int[]{0};
        Map<Integer, Integer> pathSum = new HashMap<>();
        pathSum.put(0,1);
        traverse(root,0,k,ksumPathCount,pathSum);
        return ksumPathCount[0];
    }
    private void traverse(Node root,int s,int target,int[] count, Map<Integer, Integer> pathSum){
        if(root==null)
            return;
        s+= root.data;
        if(pathSum.containsKey(s-target)){
            count[0] += pathSum.get(s-target);
        }
        pathSum.put(s,pathSum.getOrDefault(s,0)+1);

        traverse(root.left,s,target,count,pathSum);
        traverse(root.right,s,target,count,pathSum);
        pathSum.put(s,pathSum.get(s)-1);
        return;
    }
}
