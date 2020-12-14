package com.company.zadanie2;

public class AnyTypeArray <E> {
    private E[] arr;
    public E getArrIndex(int i) {
        return arr[i];
    }
    public void setArr(E[] arr) {
        this.arr = arr;
    }
    public int getLength() {
        return arr.length;
    }
    public E getElem(E[] arr, int i) {
        return arr[i];
    }
}

