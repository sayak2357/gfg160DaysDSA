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
    // Return the Kth smallest element in the given BST
    public int kthSmallest(Node root, int k) {
        Node curr = root;
        int ans = Integer.MIN_VALUE;
        int count = 0;
        while(curr!=null){
            if(curr.left==null){
                ans = curr.data;
                count++;
                if(count==k)
                    break;
                curr = curr.right;
            }
            else{
                Node prev = curr.left;
                while(prev.right!=null && prev.right!=curr){
                    prev = prev.right;
                }
                if(prev.right==null){
                    prev.right = curr;
                    curr = curr.left;
                }
                else{
                    prev.right = null;
                    ans = curr.data;
                    count++;
                    if(count==k)
                        break;
                    curr = curr.right;
                }
            }
        }
        return count==k?ans:-1;
    }
}
