package com.gfg;


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
    private int diameter;
    int diameter(Node root) {
        diameter = 0;
        nodeHeight(root);
        return diameter;
    }
    private int nodeHeight(Node root){
        if(root==null)
            return -1;
        int leftHeight = 1+nodeHeight(root.left);
        int rightHeight = 1+nodeHeight(root.right);
        int myHeight = Math.max(leftHeight,rightHeight);
        diameter = Math.max(diameter,leftHeight+rightHeight);
        return myHeight;
    }
}
