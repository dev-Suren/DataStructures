package com.datastructure.queue;

public class CustomQueueUsingStack {
    private class Node{
        Node next;
        private final int  number;

        public Node(int number){
            this.number = number;
        }
        public int getNumber(){
            return number;
        }
    }
    Node head;
    Node tail;


    public void enqueue(int values){
        Node node = new Node(values);
        if(head == null && tail == null ){
            tail = node;
            head = tail;
        }else{
            tail.next = node;
            tail = node;
        }
    }

    public int dequeue(){
        int value = head.getNumber();
        head = head.next;
        return value;
    }

    public void display(){
        Node tmp = head;
        while(tmp != null){
            System.out.println(tmp.getNumber());
            tmp= tmp.next;
        }
    }
}
