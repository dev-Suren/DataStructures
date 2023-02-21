package com.datastructure.stack;

public class CustomStackLinkedList {
    private class Node{
        private int value;
        Node next;

        public Node( int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }



    }
    private Node head;
    private Node tail;
    private int ptr=0;




    public void push(int value){
        Node node = new Node(value);
        if(tail == null){
            tail = head;
        }
        head.next = node;
        head = node;
        ptr++;
    }

    public int pop(){
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        int values = tail.value;
        tail = temp.next;
        ptr --;
        return values;
    }

    public int peek(){
        return tail.getValue();
    }

    public boolean isEmpty(){
        return head == null;
    }


}
