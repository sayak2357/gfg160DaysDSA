package com.gfg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        Queue<Node> levelNodes = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        levelNodes.add(root);
        while(!levelNodes.isEmpty()){
            int n = levelNodes.size();
            ArrayList<Integer> level = new ArrayList<>();
            for(int i=0;i<n;i++){
                Node curr = levelNodes.poll();
                level.add(curr.data);
                if(curr.left!=null)
                    levelNodes.add(curr.left);
                if(curr.right!=null)
                    levelNodes.add(curr.right);
            }
            res.add(level);
        }
        return res;
    }
}