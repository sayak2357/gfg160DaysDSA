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
    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        return isBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    boolean isBSTHelper(Node root, int lowerLimit, int upperLimit){
        if(root==null)
            return true;
        return root.data>lowerLimit && root.data<upperLimit && isBSTHelper(root.left,lowerLimit, root.data) && isBSTHelper(root.right, root.data, upperLimit);
    }
}
