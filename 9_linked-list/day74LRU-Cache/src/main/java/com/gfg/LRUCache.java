package com.gfg;

import java.util.HashMap;
import java.util.Map;

class Node{
    int key,val;
    Node prev,next;
    public Node(int key,int val){
        this.val = val;
        this.key = key;
        this.prev = null;
        this.next = null;
    }
}
public class LRUCache {
    // Constructor for initializing the cache capacity with the given value.
    int cap,size;
    Map<Integer, Node> lruCache;
    Node head, tail;
    LRUCache(int cap) {
        this.cap = cap;
        this.lruCache = new HashMap<>();
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Function to return value corresponding to the key.
    public int get(int key) {
        int val = -1;
        if(this.lruCache.containsKey(key)){
            Node curr = lruCache.get(key);
            val = curr.val;
            if(this.head!=curr && this.tail!=curr){
                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;
                curr.next = head;
                head.prev = curr;
                head = curr;
            }
            else if(this.tail==curr){
                if(curr.prev!=null){
                    curr.prev.next = null;
                    this.tail = curr.prev;
                }
                head.prev = curr;
                curr.next = head;
                head = curr;
            }
        }
        return val;
    }

    // Function for storing key-value pair.
    public void put(int key, int value) {
        if(this.lruCache.containsKey(key)){
            Node curr = this.lruCache.get(key);
            curr.val = value;
            if(curr!=this.head && curr!=this.tail){
                curr.prev.next = curr.next;
                curr.next.prev= curr.prev;
            }
            else if(this.tail==curr && this.head!=this.tail){
                this.tail = this.tail.prev;
                this.tail.next = null;
            }
            if(curr!=head){
                curr.next = head;
                head.prev = curr;
                head = curr;
            }
            this.lruCache.put(key,curr);
        }
        else{
            Node curr = new Node(key,value);
            if(head==null){
                head = curr;
                tail = curr;
            }
            else{
                curr.next = head;
                head.prev = curr;
                head = curr;
            }
            this.size++;
            this.lruCache.put(key,curr);
            if(this.size>this.cap){
                Node tailNode = this.tail;
                Node newTail = tailNode.prev;
                newTail.next = null;
                this.tail = newTail;
                int keyToBeRemoved = tailNode.key;
                this.lruCache.remove(keyToBeRemoved);
                this.size--;
            }
        }
    }
}

