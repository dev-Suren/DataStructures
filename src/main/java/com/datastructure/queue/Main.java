package com.datastructure.queue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch(choice){
            case 1:
                CustomQueue customQueue = new CustomQueue(5);
                customQueue.enqueue(10);
                customQueue.enqueue(11);
                customQueue.enqueue(12);
                customQueue.enqueue(13);
                customQueue.enqueue(14);
                System.out.println(customQueue.dequeue());
                System.out.println(customQueue.dequeue());
                System.out.println(customQueue.dequeue());
                System.out.println("----------------------");
                customQueue.display();
                break;

            case 2:
                CustomQueueUsingStack customQueue1 = new CustomQueueUsingStack();
                customQueue1.enqueue(10);
                customQueue1.enqueue(11);
                customQueue1.enqueue(12);
                customQueue1.enqueue(13);
                customQueue1.enqueue(14);
                System.out.println(customQueue1.dequeue());
                System.out.println(customQueue1.dequeue());
                System.out.println(customQueue1.dequeue());
                System.out.println("----------------------");
                customQueue1.display();
                break;
        }



    }
}
