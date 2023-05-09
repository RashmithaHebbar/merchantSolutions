package com.example.demo.services;

import com.example.demo.lib.SignalHandler;
import com.example.demo.signals.DefaultSignal;
import com.example.demo.signals.Signal1;
import com.example.demo.signals.Signal2;
import com.example.demo.signals.Signal3;
import org.springframework.stereotype.Service;

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

    public SignalService(Map<Integer, SignalHandler> signalHandlerMap) {
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
