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
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
        if(node==null)
            return;
        Node left = node.left, right = node.right;
        mirror(right);
        mirror(left);
        node.left = right;
        node.right = left;
    }
}
