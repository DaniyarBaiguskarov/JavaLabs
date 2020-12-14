package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        dva c1=new dva();
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
        c1.print(n);
        tri c2=new tri();
        int k = in.nextInt();
        int m = in.nextInt();
        c2.print(k,m);
        pyat c3=new pyat();
        int c = in.nextInt();
        c3.print(c);
        int b = in.nextInt();
        shest c4 = new shest();
        c4.print(b,2);
    }
}
