package com.example.demo;

public class SignalTwo implements SignalHandler{
    @Override
    public void handleSignal(int signal) {
        Algo algo = new Algo();
        algo.reverse();
        algo.setAlgoParam(1,80);
        algo.submitToMarket();
    }
}
