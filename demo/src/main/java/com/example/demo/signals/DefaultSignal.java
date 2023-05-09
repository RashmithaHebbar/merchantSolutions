package com.example.demo.signals;

import com.example.demo.lib.Algo;
import org.springframework.stereotype.Component;

//Default signal class
@Component
public class DefaultSignal implements ISignal {
    @Override
    public int value() {
        return -1;
    }
    @Override
    public void execute(Algo algo) {
        System.out.println("Default Signal");
        algo.cancelTrades();
    }
}
