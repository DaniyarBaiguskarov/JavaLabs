package com.company;

public class Laptop implements Priceable {
    private String name;
    private int relesed;
    private int price;
    Laptop (String name,int relesed,int price){
        this.name=name;
        this.price=price;
        this.relesed=relesed;
    }
    public void getPrice() {
        System.out.printf("Цена:"+price+"\n");
    }
}
