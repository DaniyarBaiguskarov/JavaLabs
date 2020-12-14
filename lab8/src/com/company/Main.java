package com.company;

import java.io.FileReader;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C:\\Users\\789\\IdeaProjects\\lab8\\m.txt");
        int c;
        while((c=reader.read())!=-1){
            System.out.print((char)c);
        }
    }
}
