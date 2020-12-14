package com.company;

public class BoundedWaitList<E>extends WaitList<E> {
    private int capacity;
    public BoundedWaitList(int capacity){
        super();
        this.capacity=capacity;
    }

    /**
     * @return int
     */
    public int getCapacity() {
        return capacity;
    }
    /**
     * @param element
     */
    @Override
    public void add(E element) {
        if (super.content.size() <= capacity) {
            super.add(element);
        }
    }
    /**
     * @return String
     */
    public String toString(){
        return content.toString();
    }
}
