package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Priceable good=new Smartphone("Samsung",60000);
        good.getPrice();
        good=new Laptop("Acer",2013,40000);
        good.getPrice();
    }
}
