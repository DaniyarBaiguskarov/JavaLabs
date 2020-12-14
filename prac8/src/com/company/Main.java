package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BoundedWaitList<String> Bounded = new BoundedWaitList<>(10);
        Bounded.add("element1");
        Bounded.add("element2");
        Bounded.add("element3");
        System.out.println(Bounded);
        Bounded.remove();
        System.out.println(Bounded);

        UnfairWaitList<String> Unfair = new UnfairWaitList<>();
        Unfair.add("element1");
        Unfair.add("element2");
        Unfair.add("element3");
        System.out.println(Unfair);
        Unfair.moveToBack("element4");
        System.out.println(Unfair);
        Unfair.remove("element1");
        System.out.println(Unfair);
        System.out.println(Unfair.contains("element2"));
        System.out.println(Unfair.contains("element5"));
    }
}
