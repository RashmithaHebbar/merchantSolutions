package com.example.demo;

public class SignalThree implements SignalHandler{

    @Override
    public void handleSignal(int signal) {
        Algo algo = new Algo();
        algo.setAlgoParam(1,90);
        algo.setAlgoParam(2,15);
        algo.performCalc();
        algo.submitToMarket();
    }
}
