package com.company;

public class UnfairWaitList<E>extends WaitList<E> {
    public UnfairWaitList(){
        super();
    }
    /**
     * @param element
     */

    public void remove(E element) {
        content.remove(element);
    }

    /**
     * @param element
     */
    public void moveToBack(E element){
        content.add(element);
    }
}
