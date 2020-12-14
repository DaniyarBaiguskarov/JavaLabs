package com.company;

public interface IQueue <E> {
    public void enqueue(E element);
    public E element();
    public E dequeue();
    public  int size();
    public boolean isEmpty();
    public void clear();
}
