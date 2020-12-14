package com.company.zadanie4;

public class Main {
    public static void main(String[] args){
        System.out.println(Phone.phoneChanger("+79175655655").toCommonPhone());
        System.out.println(Phone.phoneChanger("89175655655").toCommonPhone());
    }
}
