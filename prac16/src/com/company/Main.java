package com.company;

public class Main {

    public static void main(String[] args) {
        Dish first = new Dish(1, "first", "123");
        RestaurantOrder test = new RestaurantOrder();
        test.add(first);
        test.add(new Dish(2, "second", "123"));
        test.add(new Dish(3, "third", "123"));
        test.add(new Drink(4, "fourth", "321"));
        String[] names = test.nameInMas();
        for (int i = 0; i < names.length; i++) {
            if (names[i]!=null) System.out.println(names[i]);
        }
        System.out.println(test.getByIndex(3).getPrice());
        Item[] arr=test.MasOrder();
        for(int i=0;i< arr.length;i++){
            if (arr[i]!=null) System.out.println(arr[i].getDescription());
        }

    }
}
