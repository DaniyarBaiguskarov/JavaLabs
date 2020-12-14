package com.company;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter an integer: ");
            String intString = scanner.nextLine();
            int n = Integer.parseInt(intString);

            System.out.println(2 / n);
        }
        catch (NumberFormatException nfe) {
            System.out.println("Incorrect input");
        }
        catch (ArithmeticException ae) {
            System.out.println("Division by zero");
        }
        finally {
            System.out.println("Unexpected error");
        }
    }
}
