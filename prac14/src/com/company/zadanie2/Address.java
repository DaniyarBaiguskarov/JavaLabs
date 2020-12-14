package com.company.zadanie2;

import java.util.StringTokenizer;

public class Address {
    private static String[] Word;
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String corp;
    private String flat;
    public  Address(String country,String region,String city,String street,String house,String corp,String flat){
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.house = house;
        this.corp = corp;
        this.flat = flat;
    }
    public static Address method1(String src) throws IllegalArgumentException {
        String[] word = src.split(", ");
        int Words=7;
        if (word.length != Words)
            throw new IllegalArgumentException();
        return new Address(word[0], word[1], word[2], word[3], word[4], word[5], word[6]
        );
    }
    public static Address method2(String src) throws IllegalArgumentException {
        StringTokenizer tokenizer = new StringTokenizer(src, " ,.;-");
        Word = new String[7];
        int Words=7;
        if (tokenizer.countTokens() < Words)
            throw new IllegalArgumentException();

        for (int i = 0; i < Words; ++i)
            Word[i] = tokenizer.nextToken();

        return new Address(Word[0], Word[1], Word[2], Word[3], Word[4], Word[5], Word[6]);
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", corp='" + corp + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }
}
