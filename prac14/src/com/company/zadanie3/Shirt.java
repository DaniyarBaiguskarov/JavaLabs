package com.company.zadanie3;

public class Shirt {
    private int index;
    private String name;
    private String color;
    private String size;
    public Shirt(int index, String name, String color, String size) {
        this.index = index;
        this.name = name;
        this.color = color;
        this.size = size;
    }
    public static Shirt toArray(String src) {
        String[] word = src.split(",");
        word[0] = word[0].replace('S', '0');
        return new Shirt(Integer.parseInt(word[0]), word[1],word[2],word[3]);
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "index=" + index +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
