package com.company;

public class Stack {
    private int stack[];
    private int tos;

    public Stack(int size) {
        stack=new int[size];
         tos=-1;
    }
    public void push(int item)
    {
        if (isFull())
        {
                stack[++tos]=item;
        }
    }
    public boolean isFull()
    {
        if(tos==stack.length-1)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        return true;
    }
    public boolean isEmpty()
    {
        if(tos<0)
        {
            System.out.println("stack underflow");
            return false;
        }
        return true;
    }
    public int pop()
    {
        if (isEmpty())
        {
            return stack[tos--];
        }
        return -1;
    }
    public int peek() {
        if (isEmpty()) {
            return stack[tos];
        } else {
            return -1;
        }
    }
}
