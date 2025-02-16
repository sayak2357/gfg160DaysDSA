package com.gfg;


class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}

public class Solution {
    Node LCA(Node root, Node n1, Node n2) {
        if(n1.data==root.data)
            return n1;
        if(n2.data==root.data)
            return n2;
        if(n1.data<root.data && n2.data<root.data)
            return LCA(root.left,n1,n2);
        else if(n1.data>root.data && n2.data>root.data)
            return LCA(root.right,n1,n2);
        else
            return root;
    }
}
