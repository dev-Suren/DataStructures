package com.datastructure.stack;

public class CustomStackLinkedList {
    private class Node{
        private int value;
        public Node next;

        public Node( int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }



    }
     Node head;
     Node tail;
    private int ptr=0;




    public void push(int value){
        Node node = new Node(value);
        if(tail == null){
            tail = head;
        }
        node.next = head;
        head = node;
        ptr++;
    }

    public int pop(){
        int values = head.value;
        head = head.next;
        ptr --;
        return values;
    }

    public int peek(){
        return head.getValue();
    }

    public boolean isEmpty(){
        return head == null;
    }


}
