package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getScore()-o1.getScore();
    }
    public boolean intToBool(int x){
        if (x>0){
            return true;
        }
        else{
            return false;
        }
    }
    public void quickSort(ArrayList<Student> list, int low, int high){
        if (list.size() == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;//индекс опорного элемента

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (intToBool(compare(list.get(i), list.get(middle)))) {
                i++;
            }

            while (intToBool(compare(list.get(middle),list.get(j)))) {
                j--;
            }

            if (i <= j) {//меняем местами
                Student temp = list.get(i);
                list.set(i,list.get(j));
                list.set(j,temp);
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(list, low, j);

        if (high > i)
            quickSort(list, i, high);

    }
    public void print(ArrayList<Student> list,int por){
        if(por>0) {
            for (Student student : list) {
                student.printInfo();
            }
        } else{
            Collections.reverse(list);
            for (Student student : list) {
                student.printInfo();
            }
        }
    }
}

