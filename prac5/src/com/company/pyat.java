package com.company;

import java.util.Scanner;

public class pyat {
    int n, sum;
    public void print(int n){
        if(n>0){

            sum=sum+n%10;
            n=n/10;
            print(n);
        }
        else {
            System.out.println(sum);
        }
    }
}
