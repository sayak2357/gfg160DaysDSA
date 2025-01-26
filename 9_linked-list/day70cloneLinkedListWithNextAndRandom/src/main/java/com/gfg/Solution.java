package com.gfg;


import java.util.HashMap;
import java.util.Map;

class Node {
    int data;
    Node next;
    Node random;

    Node(int x) {
        data = x;
        next = null;
        random = null;
    }
}

public class Solution {
    public Node cloneLinkedList(Node head) {
        Map<Node, Node> cloneMap = new HashMap<>();
        return cloneList(head,cloneMap);
    }
    private Node cloneList(Node head, Map<Node, Node> cloneMap){
        if(head==null)
            return null;
        if(cloneMap.containsKey(head))
            return cloneMap.get(head);
        Node cloned = new Node(head.data);
        cloneMap.put(head,cloned);
        cloned.random = cloneList(head.random,cloneMap);
        cloned.next = cloneList(head.next,cloneMap);
        return cloned;
    }
}