package com.example.demo.service;

import com.example.demo.lib.Algo;
import com.example.demo.lib.SignalHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import sun.misc.Signal;

import java.util.HashMap;
import java.util.Map;


@Service
public class SignalService {
    private final Map<Integer, SignalHandler> signalHandlerMap = new HashMap<>();

    public SignalService() {
        signalHandlerMap.put(1, new Signal1());
        signalHandlerMap.put(2, new Signal2());
        signalHandlerMap.put(3, new Signal3());
    }

    public void handleSignal(int signal) {
        SignalHandler signalHandler = signalHandlerMap.getOrDefault(signal, null);
        if (signalHandler != null) {
            signalHandler.handleSignal(signal);
        } else {
            DefaultSignal defaultSignal = new DefaultSignal();
            defaultSignal.handleSignal(signal);
        }
    }
}
