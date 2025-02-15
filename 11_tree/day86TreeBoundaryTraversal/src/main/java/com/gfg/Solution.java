package com.gfg;
import java.util.ArrayList;

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
    ArrayList<Integer> boundaryTraversal(Node node) {
        ArrayList<Integer> res = new ArrayList<>();
        if(node==null)
            return res;

        if(!isLeaf(node)){
            res.add(node.data);
        }
        collectBoundaryLeft(node.left,res);
        collectBoundaryLeaves(node,res);
        collectBoundaryRight(node.right,res);

        return res;
    }
    private boolean isLeaf(Node root){
        return root.left==null && root.right==null;
    }
    private void collectBoundaryLeft(Node root, ArrayList<Integer> res){
        if(root==null || isLeaf(root))
            return;
        res.add(root.data);
        if(root.left!=null)
            collectBoundaryLeft(root.left,res);
        else if(root.right!=null)
            collectBoundaryLeft(root.right,res);
    }
    private void collectBoundaryLeaves(Node root, ArrayList<Integer> res){
        if(root==null)
            return;
        if(isLeaf(root)){
            res.add(root.data);
            return;
        }
        collectBoundaryLeaves(root.left,res);
        collectBoundaryLeaves(root.right,res);
    }
    private void collectBoundaryRight(Node root, ArrayList<Integer> res){
        if(root==null || isLeaf(root))
            return;

        if(root.right!=null)
            collectBoundaryRight(root.right,res);
        else if(root.left!=null)
            collectBoundaryRight(root.left,res);
        res.add(root.data);
    }

}
