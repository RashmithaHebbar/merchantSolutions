package com.example.demo.signals;

import com.example.demo.lib.Algo;
import com.example.demo.lib.SignalHandler;
import org.springframework.stereotype.Component;

//Default signal class
@Component
public class DefaultSignal implements SignalHandler {
    @Override
    public void handleSignal(int signal) {
        Algo algo = new Algo();
        algo.cancelTrades();
    }
}
