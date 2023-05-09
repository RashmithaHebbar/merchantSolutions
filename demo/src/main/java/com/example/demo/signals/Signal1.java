package com.example.demo.signals;

import com.example.demo.lib.Algo;
import com.example.demo.lib.SignalHandler;
import org.springframework.stereotype.Component;

@Component
public class Signal1 implements ISignal {
    @Override
    public int value() {
        return 1;
    }
    @Override
    public void execute(Algo algo) {
        System.out.println("executing signal 1");
        algo.setUp();
        algo.setAlgoParam(1, 60);
        algo.performCalc();
        algo.submitToMarket();
    }
}
