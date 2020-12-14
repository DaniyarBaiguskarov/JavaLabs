package com.company;

public class ChairFactory implements AbstractChainFactory {

    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(300);
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
