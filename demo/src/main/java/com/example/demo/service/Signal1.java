package com.example.demo.service;

import com.example.demo.lib.Algo;
import com.example.demo.lib.SignalHandler;
import org.springframework.stereotype.Component;

@Component
public class Signal1 implements SignalHandler {
    @Override
    public void handleSignal(int signal) {
        Algo algo = new Algo();

        algo.setUp();
        algo.setAlgoParam(1, 60);
        algo.performCalc();
        algo.submitToMarket();
    }
}
