package com.datastructure.linkedlist;

public class Node<Integar> {
    public Node next;
    private int number;

    public Node(int number){
        this.number = number;
        this.next = null;
    }

    public int getNumber(){
        return number;
    }
}
