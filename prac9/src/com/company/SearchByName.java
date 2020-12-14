package com.company;

import java.util.ArrayList;

public class SearchByName {
    public SearchByName(ArrayList<Student> s, String name) throws StudentNotFoundException {
        Student result = null;
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).getName() == name) {
                result = s.get(i);
                result.printInfo();
            }
        }
        if (result == null) {
            throw new StudentNotFoundException("Student " + name + " not found");
        }
    }
}
