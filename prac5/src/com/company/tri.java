package com.company;
import java.util.Scanner;
public class tri {
    int n, m;

    public void print(int n, int m){
        if (n<m){
            if (n!=m+1){
                System.out.print(n+" ");
                n=n+1;
                print(n,m);
            }
        }
        else if (n>m){
            if (n!=m-1){
                System.out.print(n+" ");
                n=n-1;
                print(n,m);
            }
        }
        else if (n==m){
            System.out.print(n+" ");
        }
    }
}
