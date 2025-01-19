package com.gfg;

// function Template for Java

///* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.data = value;
    }
}

//*/

public class Solution {
    Node reverseList(Node head) {
        Node prev = null, curr = head;
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}