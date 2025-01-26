package com.gfg;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class Solution {
    static Node addTwoLists(Node num1, Node num2) {
        Node num1Rev = reverse(num1);
        Node num2Rev = reverse(num2);
        Node res = new Node(0);
        Node p1 = num1Rev, p2 = num2Rev;
        int carry = 0;
        Node p = res;
        int sum = 0;
        Node num = null;
        while(p1!=null && p2!=null){
            sum = (p1.data+p2.data+carry)%10;
            carry = (p1.data+p2.data+carry)/10;
            num = new Node(sum);
            p.next = num;
            p = p.next;
            p1 = p1.next;
            p2 = p2.next;
        }
        while(p1!=null){
            sum = (p1.data+carry)%10;
            carry = (p1.data+carry)/10;
            num = new Node(sum);
            p.next = num;
            p = p.next;
            p1 = p1.next;
        }
        while(p2!=null){
            sum = (p2.data+carry)%10;
            carry = (p2.data+carry)/10;
            num = new Node(sum);
            p.next = num;
            p = p.next;
            p2 = p2.next;
        }
        if(carry==1)
            p.next = new Node(1);
        Node ans = reverse(res.next);
        if(ans.data==0)
            ans = ans.next;
        return ans;
    }
    private static Node reverse(Node head){
        if(head==null)
            return head;
        Node prev = null;
        Node curr = head;
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

