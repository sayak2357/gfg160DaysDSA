package com.gfg;

class Node
{
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
}
public class Solution {
    public static Node findFirstNode(Node head) {

        if(head.next==head)
            return head;
        if(head==null || head.next==null)
            return null;
        Node slow = head, fast = head;
        while(true){
            if(fast==null||fast.next==null)
                return null;
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
                break;
        }
        slow = head;
        while(fast!=slow){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
