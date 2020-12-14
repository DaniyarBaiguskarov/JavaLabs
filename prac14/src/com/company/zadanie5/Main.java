package com.company.zadanie5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        //"C:\\Users\\789\\IdeaProjects\\prac14\\12.txt"//
        Scanner in = new Scanner(System.in);
        String fileName = in.nextLine();
        String contents = readFromFile(fileName);
        String[] words = contents.split(" ");
        System.out.println(getLine(words));
    }
    public static String getLine(String[] words){
        ArrayList wordsAsList = new ArrayList<>(Arrays.asList(words));
        while (Sovpadenie(wordsAsList)) {
            Collections.shuffle(wordsAsList);
        }
        StringBuilder result = new StringBuilder();
        for (int i=0;i<=wordsAsList.size()-1;i++) {
            result.append(wordsAsList.get(i)).append(" ");
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
    public static boolean Sovpadenie(ArrayList<String> wordsAsList) {
        for (int i = 0; i < wordsAsList.size() - 1; ++i) {
            String first=wordsAsList.get(i).toLowerCase();
            String second=wordsAsList.get(i+1).toLowerCase();
            if (first.charAt(first.length() - 1) != second.charAt(0)){
                return true;
            }
        }
        return  false;
    }
    private static String readFromFile(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
}
