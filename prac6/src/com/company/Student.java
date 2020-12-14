package com.company;

public class Student {
    private int score;
    private String name;
    public Student(int score,String name){
        this.score=score;
        this.name=name;
    }

    public int getScore() {
        return score;
    }
    public void printInfo(){
        System.out.println(name+": "+score);
    }
}
