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
    Node prev,first,last;
    void correctBST(Node root) {
        prev = null;
        first = null;
        last = null;
        inorder(root);
        swap(first,last);
    }
    void inorder(Node root){
        if(root==null)
            return;
        inorder(root.left);
        if(prev!=null){
            if(prev.data>root.data){
                if(first==null)
                    first = prev;
                last = root;
            }
        }
        prev = root;
        inorder(root.right);
    }
    void swap(Node a, Node b){
        int temp = a.data;
        a.data = b.data;
        b.data = temp;
    }

}

