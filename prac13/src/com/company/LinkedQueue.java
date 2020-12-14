package com.company;

import java.util.AbstractList;

public class LinkedQueue <E> implements ILinkedQueue {
    private AbstractList<E> abstractList = new AbstractList<E>() {
        @Override
        public E get(int index) {
            return (E) this;
        }
        @Override
        public int size() {
            return 0;
        }
    };
    public boolean add(Object element) {
        abstractList.add((E) element);
        return true;
    }
    public boolean contains(Object object) {
        return abstractList.contains(object);
    }
    public boolean isEmpty() {
        return abstractList.isEmpty();
    }

    public Object peek() {
        return abstractList.get(0);
    }
    public Object pool() {
        return null;
    }
}

