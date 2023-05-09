package com.example.demo.signals;

import com.example.demo.lib.Algo;
import com.example.demo.lib.SignalHandler;
import org.springframework.stereotype.Component;
@Component
public class Signal3 implements ISignal {

    @Override
    public int value() {
        return 3;
    }

    @Override
    public void execute(Algo algo) {
        System.out.println("executing signal 3");
        algo.setAlgoParam(1,90);
        algo.setAlgoParam(2,15);
        algo.performCalc();
        algo.submitToMarket();
    }
}
