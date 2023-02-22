package com.datastructure.queue;

public class Main {
    public static void main(String[] args) {
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


    }
}
