package com.company.zadanie2;

public class Main {
    public static <E> void  anyTypeMassive  (String s, E [] arr) {
        E[] a = arr;
        AnyTypeArray<E> sid = new AnyTypeArray<E>();
        sid.setArr(a);
        System.out.print(s + "  ");
        for (int i = 0; i < sid.getLength(); i++) System.out.print(sid.getArrIndex(i) + " ");
        System.out.println();
    }

    public static void main(String [] args){
        String [] s = {"Hello", "World","!"};
        anyTypeMassive("String" , s);
        Integer [] intr = { 1,2,3,4,5,6,7,8};
        anyTypeMassive("Integer" , intr);
        Double [] ad = {1.2,1.3,1.4};
        anyTypeMassive("Double" , ad);
        AnyTypeArray arr=new AnyTypeArray();
        System.out.println(arr.getElem(s,1));

    }
}
