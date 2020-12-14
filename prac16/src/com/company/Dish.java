package com.company;

public class Dish implements Item, Comparable<Item> {
    private int price;
    private String name;
    private String description;


    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public Dish(String name, String description) {
        this.name = name;
        this.description = description;
        this.price = 0;
    }

    public Dish(int price, String name, String descrition) {
        this.price = price;
        this.name = name;
        this.description = descrition;
    }

    public int compareTo(Item o) {
        if (this.price > o.getPrice()) return 1;
        if (this.price < o.getPrice()) return -1;
        if (this.price == o.getPrice()) return 0;
        return 0;
    }
}

