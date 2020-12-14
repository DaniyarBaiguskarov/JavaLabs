package com.company;

import java.util.Arrays;

public class ArrayQueueModule<E> implements IQueue {
    private E mas[];
    private int capacity=0;
    private  int position=0;
    public ArrayQueueModule(int size){
        this.capacity=size;
        this.mas= (E[]) new Object[size];
    }
    public int getCapacity() {
        return capacity;
    }
    public int getPosition() {
        return position;
    }
    public void enqueue(Object element) {
        if(position== mas.length){
            E mas2[]= (E[]) new Object[capacity*2];
            capacity=mas2.length;
            mas=mas2;
            mas[position]= (E) element;
            position++;
        }
        else{
            mas[position]= (E) element;
            position++;
        }
    }
    public Object element() {
        return mas[0];
    }
    public Object dequeue() {
        Object object=mas[0];
        E mas2[]= Arrays.copyOfRange(mas,1,mas.length-1);
        for(int i=0;i<mas2.length;i++){
            mas[i]= mas2[i];
        }
        return object;
    }
    public int size() {
        return mas.length;
    }
    public boolean isEmpty() {
        return position==0;
    }
    public void clear() {
        for(int i=0;i< mas.length;i++) {
            position=0;
        };
    }
}

