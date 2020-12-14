package com.company;

import java.util.regex.Pattern;

public class Pass {
    public Pass(){}
    public boolean CheckingPass(String password){
        String[] must=new String[]{".{8,}", "[A-Z]", "[a-z]", "[0-9]"};
        for(int i = 0; i< must.length; i++) {
            String passReg = must[i];
            if (!Pattern.compile(passReg).matcher(password).find()) {
                return false;
            }
        }
        return true;
    }
}
