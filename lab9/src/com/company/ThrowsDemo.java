package com.company;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        var scanner = new Scanner(System.in);
        boolean input = true;

        while (input) {
            try {
                System.out.println("Enter key: ");
                String key = scanner.nextLine();
                printDetails(key);
                input = false;
            }
            catch (Exception e) {
                System.out.println("Empty key. Try again");
            }
        }
    }


    public void printDetails(String key) throws Exception {
        System.out.println(getDetails(key));
    }


    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}
