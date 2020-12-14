package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Client client=new Client();
        client.setChair(new VictorianChair(200));
        AbstractChainFactory factory=new ChairFactory();
        VictorianChair vicChair=factory.createVictorianChair();
        vicChair.getAge();
        Chair funcChair= factory.createFunctionalChair();
        FunctionalChair chair= (FunctionalChair) funcChair;
        chair.sum(2,2);
        MagicChair magChair= factory.createMagicChair();
        magChair.doMagic();

    }
}
