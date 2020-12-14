package com.company;

import java.util.Scanner;

public class shest {
    int n, k=2;
    public boolean print(int m, int k) {
        if ((m % k) == 0&&(m!=k)) {
            System.out.println("Sost");
            return false;
        }
        if(m==k){
            System.out.println("PRost");
            return false;
        }
        print(m, k + 1);
        return false;
    }
}
