package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayQueueModule<Integer> test= new ArrayQueueModule<>(2);
        test.enqueue(4);
        test.enqueue(1);
        System.out.println(test.size());
        System.out.println(test.element());
        test.clear();
        System.out.println(test.isEmpty());
    }
}
