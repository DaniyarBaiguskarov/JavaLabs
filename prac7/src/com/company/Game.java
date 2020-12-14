package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Game {
    public Game(Queue<Integer> arr1,Queue<Integer>arr2){
    int count = 0;
    boolean res = false;
        for (int i = 0; i < 106; i++) {
        count++;
        if (arr1.peek() > arr2.peek() || ((arr1.peek() == 0) && (arr2.peek() == 9))) {
            arr1.add(arr1.peek());
            arr1.add(arr2.peek());
        } else if (arr1.peek() < arr2.peek() || ((arr1.peek() == 9) && (arr2.peek() == 0))) {
            arr2.add(arr2.peek());
            arr2.add(arr1.peek());
        }
        arr1.remove();
        arr2.remove();
        if (arr1.size() == 0) {
            System.out.println("Second " + count);
            res = true;
            break;
        } else if (arr2.size() == 0) {
            System.out.println("First " + count);
            res = true;
            break;
        }
    }
        if (!res) System.out.println("Botva!");
}
}

