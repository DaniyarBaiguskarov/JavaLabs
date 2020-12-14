package com.company.zadanie4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // write your code here
        ArrayList elements = new ArrayList<Integer>();
        elements.add(1);
        elements.add(2);
        elements.add(3);
        elements.add(4);
        elements.add(5);
        elements.add(6);
        ToList result = new ToList<>(elements);
    }
}
