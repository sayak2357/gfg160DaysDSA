package com.gfg;


import java.util.HashMap;
import java.util.Map;

class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

public class Solution {
    boolean findTarget(Node root, int target) {
        boolean[] ans = new boolean[]{false};
        Map<Integer, Integer> keyMap = new HashMap<>();
        traverse(root,target,keyMap,ans);
        return ans[0];
    }
    void traverse(Node root, int target, Map<Integer, Integer> keyMap, boolean[] ans){
        if(root==null)
            return;
        int val = root.data;
        if(keyMap.containsKey(target-val)){
            ans[0] = true;
            return;
        }
        keyMap.put(val,1);
        traverse(root.left,target,keyMap,ans);
        traverse(root.right,target,keyMap,ans);
    }
}
