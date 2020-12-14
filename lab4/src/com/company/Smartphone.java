package com.company;

public class Smartphone implements Priceable{
    private String name;
    private int price;
    Smartphone(String name,int price){
        this.name=name;
        this.price=price;
    }
    public void getPrice() {
        System.out.printf("Цена:"+price+"\n");
    }
}
