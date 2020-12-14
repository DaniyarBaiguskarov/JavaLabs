package com.company;

public interface Order {
    public void add(Item item);
    public boolean delete(String name);
    public int deleteAllWithName(String name);
    public int num();
    public Item[] MasOrder();
    public int allPrice();
    public int numByName(String name);
    public String[] nameInMas();
    public Item[] masItemSort();
}

