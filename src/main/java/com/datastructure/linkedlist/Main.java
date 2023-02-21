package com.datastructure.linkedlist;

import com.datastructure.ExceptionHandling.IndexOutOfBoundError;
import com.datastructure.linkedlist.LinkedList;

public class Main{
    public static void main(String[] args) throws IndexOutOfBoundError {
        LinkedList list = new LinkedList();
        list.addLast(90);
        list.addFirst(33);
        list.addFirst(23);
        list.addFirst(44);
        list.addFirst(554);
        list.addLast(12);
        list.addInPosition(3,100);
        list.display();
//        list.deleteFirst();
//        list.deleteLast();
        list.deleteAtPosition(3);
       list.display();
    }

}