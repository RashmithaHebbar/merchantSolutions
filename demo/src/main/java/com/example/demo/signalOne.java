package com.example.demo;

public class signalOne implements SignalHandler {
    @Override
    public void handleSignal(int signal) {
        Algo algo = new Algo();

        algo.setUp();
        algo.setAlgoParam(1,60);
        algo.performCalc();
        algo.submitToMarket();
    }
}
