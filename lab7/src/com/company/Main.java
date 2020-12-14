package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<Integer> numb=new LinkedList<Integer>();
        numb.add(1);
        numb.add(2);
        numb.add(3);
        numb.add(4);
        System.out.println("Первое число:"+numb.getFirst());
        numb.removeFirst();
        System.out.println("Новое первое число:"+numb.getFirst());
        numb.addFirst(5);
        System.out.println("Новое первое число:"+numb.getFirst());
        numb.set(3,11);
        for(int i=0;i<numb.size();i++){
            System.out.print(numb.get(i)+" ");
        }
        System.out.println("\n"+numb);
        if (numb.contains(3)){
            System.out.println("имеется число 3");
        }
        System.out.println(numb.size());
        LinkedList<City> city=new LinkedList<City>();
        city.addFirst(new City("Moscow"));
        city.add(new City("London"));
        System.out.println(city.getLast().getName());

    }
}
