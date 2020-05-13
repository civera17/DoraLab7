package com.company;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;

public class QueueClass {

    private Queue<String> queue;

    public QueueClass(Queue<String> queue) {
        this.queue = queue;
    }

    public QueueClass() {
        this.queue = new LinkedList<>();
    }

    public void showQueue(){
        System.out.println("\nElements of Queue: " + queue);
    }

    public void remove() {
        String removed = queue.remove();
        System.out.println("Removed string : " + removed);
    }

    public void peek() {
        String head = queue.peek();
        System.out.println("Head of Queue : " + head);
    }

    public void size() {
        System.out.println("Size of queue is - " + queue.size());
    }

    public void add(String string) {
        queue.add(string);
    }

    public void searchString(String string) {
        System.out.println("\nSearching for string " + string + "...");
        if (queue.contains(string)){
            System.out.println("Found");
        } else {
            System.out.println("String " + string + "not found in this queue");
        }
    }

}
