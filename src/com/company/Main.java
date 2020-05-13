package com.company;

import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        QueueClass queueClass = new QueueClass();
        queueClass.add("Ion loh");
        queueClass.peek();
        queueClass.searchString("Ion loh");
    }
}
