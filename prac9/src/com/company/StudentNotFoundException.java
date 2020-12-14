package com.company;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String errMessage) {
        super(errMessage);
    }
}
