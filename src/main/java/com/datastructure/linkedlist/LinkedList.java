package com.datastructure.linkedlist;

import com.datastructure.ExceptionHandling.IndexOutOfBoundError;

public class LinkedList {
    private Node head;
    private Node tail;
    private int count=0;

    public void addFirst(int number){
        if(tail == null){
            tail = head;
        }
        Node node = new Node(number);
        node.next = head;
        head = node;
        count+=1;


    }

    public void addLast(int number){
        if(tail == null){
            addFirst(number);
            count++;
            return;

        }
        Node node = new Node(number);
        tail.next= node;
        tail = node;
        count++;

    }

    public void addInPosition(int position, int number) throws IndexOutOfBoundError {
        if(position>count){
            throw new IndexOutOfBoundError();
        }
        Node temp = head;
        if(position==0){
            addFirst(number);
        }
        if(position==count){
            addLast(number);
        }
        Node node = new Node(number);
        for(int i=0;i<position-1;i++){
            temp= temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        count++;



    }
    public void deleteFirst(){
        head = head.next;
        if(head == null){
            tail = null;
        }
        count--;
    }

    public void deleteLast(){
        Node temp = head;
        while(temp.next!= tail){
            temp = temp.next;
        }
        tail = temp;
        count--;
    }

    public void deleteAtPosition(int index){
        if(index == 0){
            deleteLast();
            count--;
            return;
        }
        if(index == count){
            deleteLast();
            count--;
            return;
        }
        Node temp = head;
        for(int i= 0;i<index-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;

    }



    public void display(){
        Node tmp = head;
        while(tmp !=null){
            System.out.print(tmp.getNumber()+"->");
            tmp = tmp.next;
        }
        System.out.print("end\n");
    }

}
