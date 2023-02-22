package com.datastructure.queue;


public class CustomQueue {
    private int[] arr;
    private int first=0;
    private int last;
    private static final int DEFAULT_SIZE= 10;

    public CustomQueue(int size){
        arr = new int[size];
        first = last = -1;
    }
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public void enqueue(int value){
        if(last == arr.length){
            System.out.println("overflowed");
        }else{
            arr[++last] = value;
        }
        if(first == -1){
            first++;
        }

    }

    public int dequeue(){
        int x=0;
        if(first == -1){
            System.out.println("underflowed");
        }else {
            x = arr[first];
            first++;
        }
        if(last == 0){
            last--;
        }
        return x;

    }

    public void display(){
        for(int i= first; i<=last;i++){
            System.out.println(arr[i]);
        }
    }





    
}
