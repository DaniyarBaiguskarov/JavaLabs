package com.company.zadanie1;

public class Person {
    private String name;
    private String surname;
    private String middlename;
    public Person(String surname) {
        this.surname = surname;
    }
    public Person(String surname, String name, String middlename) {
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(surname);
        if (name != null)
            builder.append(" ").append(name.toUpperCase().charAt(0)).append(".");
        if (name != null && middlename != null)
            builder.append(middlename.toUpperCase().charAt(0)).append(".");
        return builder.toString();
    }
}
