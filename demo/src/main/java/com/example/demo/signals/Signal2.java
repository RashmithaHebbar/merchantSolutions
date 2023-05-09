package com.example.demo.signals;

import com.example.demo.lib.Algo;
import com.example.demo.lib.SignalHandler;
import org.springframework.stereotype.Component;

@Component
public class Signal2 implements ISignal {
    @Override
    public int value() {
        return 2;
    }

    @Override
    public void execute(Algo algo) {
        System.out.println("executing signal 2");
        algo.reverse();
        algo.setAlgoParam(1,80);
        algo.submitToMarket();

    }
}
