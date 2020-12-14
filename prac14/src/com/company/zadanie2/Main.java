package com.company.zadanie2;

public class Main {
    public static void main(String[] args){
        Address ad1 = Address.method1("Russia, Moscow, Moscow, Kievskaya, 40, 3, 120");
        System.out.println(ad1);
        Address ad2 = Address.method2("Germany; Brandenburg; Berlin; Hardenbergstraße; 65; 5; 10");
        System.out.println(ad2);
    }
}
