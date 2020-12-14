package com.company;

public class ConcreteFactory implements ComplexAbstractFactory {
    public Complex createComplex(){
        return new Complex();
    }
    public Complex CreateComplex(int real, int image) {
        Complex com1=new Complex();
        com1.real=real;
        com1.image=image;
        return com1;
    }

}
