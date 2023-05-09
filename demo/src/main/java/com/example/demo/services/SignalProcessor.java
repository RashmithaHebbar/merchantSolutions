package com.example.demo.services;

import com.example.demo.lib.Algo;
import com.example.demo.lib.SignalHandler;
import com.example.demo.signals.ISignal;
import org.springframework.stereotype.Service;

@Service
public class SignalProcessor implements SignalHandler {
    private final SignalFactory signalFactory;
    private final Algo algo;

    public SignalProcessor(SignalFactory signalFactory) {
        this.signalFactory = signalFactory;
        this.algo = new Algo();
    }

    @Override
    public void handleSignal(int signal) {
        ISignal signalExecutor = this.signalFactory.getSignal(signal);
        signalExecutor.execute(algo);
        algo.doAlgo();
    }
}
