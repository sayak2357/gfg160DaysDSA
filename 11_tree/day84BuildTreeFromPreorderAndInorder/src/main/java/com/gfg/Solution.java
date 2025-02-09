package com.gfg;

import java.util.HashMap;
import java.util.Map;

class Node {
    int data;
    Node left, right;

    Node(int key) {
        data = key;
        left = right = null;
    }
}

public class Solution {
    public static Node buildTree(int inorder[], int preorder[]) {
        Map<Integer, Integer> hmap = new HashMap<>();
        int n = inorder.length;
        for(int i=0;i<n;i++){
            int val = inorder[i];
            hmap.put(val,i);
        }
        int[] preindex = {0};
        return buildTreeRec(hmap,preorder,preindex,0,n-1);
    }
    private static Node buildTreeRec(Map<Integer, Integer> hmap, int[] preorder,int[] preindex, int left, int right){
        if(left>right)
            return null;
        int rootVal = preorder[preindex[0]];
        preindex[0]++;
        Node root = new Node(rootVal);
        int index = hmap.get(rootVal);

        root.left = buildTreeRec(hmap,preorder,preindex,left,index-1);
        root.right = buildTreeRec(hmap,preorder,preindex,index+1,right);
        return root;
    }
}

