package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SortingStudentsByGPA task= new SortingStudentsByGPA();
        ArrayList<Student> list= new ArrayList<Student>();
        list.add(new Student(115,"Dima"));
        list.add(new Student(105,"Oleg"));
        list.add(new Student(155,"Sveta"));
        list.add(new Student(95,"Dasha"));
        list.add(new Student(200,"Boris"));
        try {
            System.out.println(new SearchByName(list, "Alex"));
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}

