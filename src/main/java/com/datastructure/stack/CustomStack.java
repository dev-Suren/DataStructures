package com.datastructure.stack;

public class CustomStack {
    private int [] arr;
    private static final int DEFAULT_SIZE = 10;
    private int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.arr = new int[size];
    }
    public void push(int value) throws StackOverflowError{
        if(isFull()){
            throw new StackOverflowError("Stack full");
        }
        arr[++ptr] = value;
    }

    public int peek(){
        return arr[ptr];
    }

    private boolean isFull() {
        return ptr == arr.length-1;
    }

    public int pop(){
        if(isEmpty()){
            throw new StackOverflowError("Stack is empty");
        }
        int remove = arr[ptr];
        ptr--;
        return remove;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}

