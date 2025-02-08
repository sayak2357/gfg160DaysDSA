package com.gfg;

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

public class Solution {
    // Function to find the height of a binary tree.
    int height(Node node) {
        if(node==null)
            return -1;
        if(node.left==null && node.right==null)
            return 0;
        return Math.max(height(node.left),height(node.right))+1;
    }
}
