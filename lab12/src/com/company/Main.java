package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Tasks test = new Tasks();
        test.Currency("TEST 10 USD, 100 RUB, 1000 ERR");
        System.out.println(test.Plus("2 + 2"));
        System.out.println(test.Data("12/10/1997"));
        System.out.println(test.Mail("test@mail.ru"));
    }
}
