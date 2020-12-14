package com.company;
import java.util.Scanner;
public class dva {
    int n;
    public void print(int n){
        if (n>1){
            print(n-1);
        }
        System.out.print(n+" ");
    }
}
