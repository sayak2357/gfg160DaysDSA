package com.gfg;

import java.util.Stack;

public class Solution {
    private Stack<Integer> stack,minStack;
    public Solution() {
        this.stack = new Stack<Integer>();
        this.minStack = new Stack<Integer>();
    }

    // Add an element to the top of Stack
    public void push(int x) {
        this.stack.push(x);
        if(this.minStack.isEmpty() || x<this.minStack.peek()){
            this.minStack.push(x);
        }
    }

    // Remove the top element from the Stack
    public void pop() {
        if(this.stack.isEmpty())
            return;
        int top = this.stack.pop();
        if(!this.minStack.isEmpty() && top==this.minStack.peek()){
            this.minStack.pop();
        }
    }

    // Returns top element of the Stack
    public int peek() {
        return this.stack.size()>0 ?this.stack.peek():-1;
    }

    // Finds minimum element of Stack
    public int getMin() {
        return this.stack.size()>0 && this.minStack.size()>0 ? this.minStack.peek():-1;
    }
}
