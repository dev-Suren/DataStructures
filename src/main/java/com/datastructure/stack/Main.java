package com.datastructure.stack;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please select which stach to run\n" +
                "1. Normal Stack\n"
        +"2. using linkedlist");


        int selection = scanner.nextInt();
        switch(selection){
            case 1:
                CustomStack customStack = new CustomStack(4);
                System.out.println(customStack.isEmpty());
                customStack.push(33);
                customStack.push(22);
                customStack.push(54);
                customStack.push(66);
                System.out.println(customStack.isEmpty());
                System.out.println(customStack.pop());
                //customStack.push(44);
                System.out.println(customStack.peek());
                break;

            case 2:
                CustomStackLinkedList customStackLinkedList = new CustomStackLinkedList();
                System.out.println(customStackLinkedList.isEmpty());
                customStackLinkedList.push(24);
                customStackLinkedList.push(44);
                System.out.println("-------------------------");
                System.out.println(customStackLinkedList.peek());
                System.out.println("-------------------------");
                System.out.println(customStackLinkedList.pop());
                System.out.println("-------------------------");
                System.out.println(customStackLinkedList.peek());
                System.out.println("-------------------------");
                System.out.println(customStackLinkedList.isEmpty());

                break;

        }

    }
}
