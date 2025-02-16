package com.gfg;

import java.util.ArrayList;

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

public class Tree {
    // Function to serialize a tree and return a list containing nodes of tree.
    public ArrayList<Integer> serialize(Node root) {
        ArrayList<Integer> serialized = new ArrayList<>();
        serializeMini(root,serialized);
        return serialized;
    }
    private void serializeMini(Node root, ArrayList<Integer> serialized){
        if(root==null){
            serialized.add(-1);
            return;
        }
        serialized.add(root.data);
        serializeMini(root.left,serialized);
        serializeMini(root.right,serialized);
    }

    // Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> arr) {
        int[] index = new int[]{0};
        return createTree(arr,index);
    }
    private Node createTree(ArrayList<Integer> serialized, int[] idx){
        if(idx[0]>=serialized.size())
            return null;
        int val = serialized.get(idx[0]);
        idx[0]++;
        if(val==-1)
            return null;
        Node curr = new Node(val);
        curr.left = createTree(serialized,idx);
        curr.right = createTree(serialized,idx);
        return curr;
    }
};
