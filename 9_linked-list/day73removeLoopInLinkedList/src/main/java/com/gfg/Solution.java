package com.gfg;


class Node
{
    int data;
    Node next;
}

public class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        if(head==null || head.next==null)
            return;
        Node slow = head, fast = head;
        while(true){
            if(fast==null || fast.next == null)
                return;
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
                break;
        }
        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        Node startingNode = slow;
        Node p = slow.next;
        while(p.next!=startingNode){
            p = p.next;
        }
        p.next = null;
        return;
    }
}
