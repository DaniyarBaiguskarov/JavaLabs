package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tasks {
    public Tasks(){}
    void Currency(String string) {
        Matcher o = Pattern.compile("(?:^|[^\\w\\d.])([1-9]\\d*(?:.\\d{0,2})?\\s*(?:USD|EU|RUB))").matcher(string);
        while(o.find()) {
            String matched = o.group(1);
            System.out.println(matched);
        }
    }
    boolean Plus(String string) {
        Matcher m = Pattern.compile("([0-9]{1,9} \\+)").matcher(string);
        return m.find();
    }
    boolean Data(String s) {
        return s.matches("(0[1-9]|1[0-9]|2[0-9]|3[0-1])\\/(0[1-9]|1[0-2])\\/(19[0-8][0-9]|199[0-9]|[2-9][0-9]{3})");
    }
    boolean Mail(String s) {
        return s.matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)?");
    }
}
