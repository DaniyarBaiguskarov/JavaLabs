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
        task.print(list,1);
        int low=0;
        int hight=list.size()-1;
        task.quickSort(list,low,hight);
        System.out.println("Отсортированный список : ");
        task.print(list,-1);
    }
}

