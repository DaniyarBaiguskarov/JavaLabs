package com.company.zadanie5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // write your code here
        String[] arr = new String[] {"Hello", "World"};
        Integer[] nums = new Integer[] {0, 1};

        ArrayList<Integer> listOfNumbers = Solution.newArrayList(nums);
        HashSet<String> hashSet = Solution.newHashSet(arr);
        HashMap<String, Integer> hashMap = Solution.newHashMap(arr, nums);

        System.out.println(listOfNumbers);
        System.out.println(hashSet);
        System.out.println(hashMap);
    }
}
