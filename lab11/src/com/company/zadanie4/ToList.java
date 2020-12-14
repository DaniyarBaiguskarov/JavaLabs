package com.company.zadanie4;

import java.util.ArrayList;
import java.util.List;

public class ToList<T> {
    private ArrayList<T> list;
    public ToList(List<?> catalog) {
        list = new ArrayList<>();
        for (var element : catalog)
            list.add((T)element);
        System.out.print("Первые 5 элементов: ");
        for (int i = 0; i < list.size(); ++i)
            if (i < 5)
                System.out.print(" "+list.get(i));
    }
}
