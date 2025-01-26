package com.gfg;

import java.util.ArrayList;
import java.util.List;

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
    public static Node reverseKGroup(Node head, int k) {
        if(head==null)
            return head;
        int n = 1;
        Node p = head;
        Node last = null;
        while(n<k && p!=null){
            if(last==null)
                last = p;
            else
                last = last.next;
            p = p.next;
            n++;
        }
        Node nextSet;
        List<Node> reversed;
        if(p==null){
            nextSet = null;
            last.next = null;
        }
        else{
            nextSet = p .next;
            p.next = null;
        }
        reversed = reverse(head);
        Node newHead = reversed.get(0);
        Node newTail = reversed.get(1);
        newTail.next = reverseKGroup(nextSet,k);
        return newHead;
    }
    private static List<Node> reverse(Node head){
        List<Node> res = new ArrayList<>();
        Node p = head;
        Node prev = null;
        while(p!=null){
            Node next = p.next;
            p.next = prev;
            prev = p;
            p = next;
        }
        res.add(prev);
        res.add(head);
        return res;
    }
}
