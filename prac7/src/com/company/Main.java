package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> arr1 = new LinkedList<>();
        Queue<Integer> arr2 = new LinkedList<>();
        arr1.add(1);
        arr1.add(3);
        arr1.add(5);
        arr1.add(7);
        arr1.add(9);
        arr2.add(2);
        arr2.add(4);
        arr2.add(6);
        arr2.add(8);
        arr2.add(0);
        Game game=new Game(arr1,arr2);
    }
}
