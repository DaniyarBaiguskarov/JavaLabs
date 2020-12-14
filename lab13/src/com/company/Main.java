package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pass pass=new Pass();
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (pass.CheckingPass(password)) {
            System.out.println("Correct pass");
        }
        else {
            System.out.println("Incorrect pass");
        }
    }
}
