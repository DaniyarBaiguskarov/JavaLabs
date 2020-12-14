package com.company.zadanie4;

public class Phone {
    private int Code;
    private int firstThree;
    private int secondThree;
    private int fourthThree;
    private Phone(int Code, int firstThree, int secondThree, int fourthThree) {
        this.Code = Code;
        this.firstThree = firstThree;
        this.secondThree = secondThree;
        this.fourthThree = fourthThree;
    }
    public String toCommonPhone() {
        return new StringBuffer().append("+").append(Code).append(firstThree).append("-").append(secondThree).append("-").append(fourthThree).toString();
    }
    public static Phone phoneChanger(String str){
        if (String.valueOf(str.charAt(1))=="+"){
            return new Phone(Integer.parseInt(String.valueOf(str.charAt(1))), Integer.parseInt(str.substring(2, 5)), Integer.parseInt(str.substring(5, 8)), Integer.parseInt(str.substring(8, 12)));
        }
        else{
            return new Phone(7, Integer.parseInt(str.substring(1, 4)), Integer.parseInt(str.substring(4, 7)), Integer.parseInt(str.substring(7, 11)));
        }
    }


}
