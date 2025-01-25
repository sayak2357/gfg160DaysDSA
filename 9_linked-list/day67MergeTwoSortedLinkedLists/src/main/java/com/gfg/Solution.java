package com.gfg;

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

public class Solution {
    Node sortedMerge(Node head1, Node head2) {
        Node head = new Node(0);
        Node p1 = head1, p2 = head2;
        Node p = head;
        while(p1!=null && p2!=null){
            if(p1.data<p2.data){
                p.next = p1;
                p1 = p1.next;
            }
            else{
                p.next = p2;
                p2 = p2.next;
            }
            p = p.next;
        }
        if(p1!=null)
            p.next = p1;
        if(p2!=null)
            p.next = p2;

        return head.next;
    }
}
