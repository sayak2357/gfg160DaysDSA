package com.gfg;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
public class Solution {
    public Node rotate(Node head, int k) {
        int n = findLLLength(head);
        if(k%n==0)
            return head;
        k = k%n;
        //  System.out.println("k="+k+"n="+n);
        Node tail = head;
        k--;
        while(k>0){
            tail = tail.next;
            k--;
        }
        Node newHead = tail.next;
        tail.next = null;
        Node p = newHead;
        while(p.next!=null){
            p = p.next;
        }
        p.next = head;
        return newHead;
    }
    private int findLLLength(Node head){
        int n = 0;
        if(head==null)
            return n;
        while(head!=null){
            n++;
            head = head.next;
        }
        return n;
    }
}
