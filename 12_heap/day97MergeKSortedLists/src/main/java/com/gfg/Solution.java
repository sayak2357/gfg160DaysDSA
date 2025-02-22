package com.gfg;

import java.util.*;

class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}

public class Solution {
    // Function to merge K sorted linked list.
    Node mergeKLists(List<Node> arr) {
        Node res = new Node(-1);
        Node p = res;
        Queue<Node> minHeap = new PriorityQueue<>((a,b)->a.data-b.data);
        for(Node head:arr){
            minHeap.add(head);
        }
        while(minHeap.size()>0){
            Node min = minHeap.poll();
            p.next = min;
            p = min;
            if(min.next!=null){
                minHeap.add(min.next);
            }
        }
        return res.next;
    }
}
