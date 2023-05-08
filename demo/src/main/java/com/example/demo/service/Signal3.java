package com.example.demo.service;

import com.example.demo.lib.Algo;
import com.example.demo.lib.SignalHandler;
import org.springframework.stereotype.Component;
@Component
public class Signal3 implements SignalHandler {

    @Override
    public void handleSignal(int signal) {
        Algo algo = new Algo();
        algo.setAlgoParam(1,90);
        algo.setAlgoParam(2,15);
        algo.performCalc();
        algo.submitToMarket();
    }
}
