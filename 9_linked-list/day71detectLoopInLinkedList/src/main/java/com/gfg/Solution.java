package com.gfg;

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

public class Solution {
    // Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head) {
        boolean loopPresent = false;
        if(head==null || head.next==null)
            return loopPresent;
        if(head.next == head)
            return true;
        Node slow = head;
        Node fast = head.next;
        while(true){
            if(slow==fast){
                loopPresent = true;
                break;
            }
            if(fast==null || fast.next==null)
                break;
            slow = slow.next;
            fast = fast.next.next;
        }
        return loopPresent;
    }
}
