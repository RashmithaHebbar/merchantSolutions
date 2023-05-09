package com.example.demo.services;

import com.example.demo.signals.ISignal;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

@Service
public class SignalFactory {
    //    private final List<ISignal> signals;
    private Map<Integer, ISignal> signalsCache;

    public SignalFactory(List<ISignal> signals) {
        this.signalsCache = signals.stream().collect(
                toMap(ISignal::value, Function.identity())
        );
    }

    public ISignal getSignal(int signal) {
        return this.signalsCache.getOrDefault(
                signal,
                this.signalsCache.get(-1) // Default
        );
    }
}