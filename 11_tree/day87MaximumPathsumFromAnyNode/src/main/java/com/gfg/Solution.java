package com.gfg;

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

public class Solution {
    // Function to return maximum path sum from any node in a tree.

    int findMaxSum(Node node) {
        int[] maxSum = new int[]{Integer.MIN_VALUE};
        findMaxSumMini(node,maxSum);
        return maxSum[0];
    }
    int findMaxSumMini(Node root, int[] maxPathSum){
        if(root==null){
            return 0;
        }
        int ls = Math.max(0,findMaxSumMini(root.left, maxPathSum));
        int rs = Math.max(0,findMaxSumMini(root.right,maxPathSum));
        maxPathSum[0] = Math.max(maxPathSum[0], ls+rs+root.data);
        return Math.max(ls,rs)+root.data;
    }
}

