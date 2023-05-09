package com.example.demo.service;

import com.example.demo.lib.Algo;
import com.example.demo.lib.SignalHandler;

public class DefaultSignal implements SignalHandler {
    @Override
    public void handleSignal(int signal) {
        Algo algo = new Algo();
        algo.cancelTrades();
    }
}
