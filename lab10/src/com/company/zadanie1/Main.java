package com.company.zadanie1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static <E> ArrayList<E> convert(E[] arr) {
        return new ArrayList(Arrays.asList(arr));
    }
    public static void main(String[] args) {
        // write your code here
        Integer[] a = new Integer[]{1, 2, 3};
        ArrayList<Integer> listInt = convert(a);
        System.out.println(listInt);
    }
}
