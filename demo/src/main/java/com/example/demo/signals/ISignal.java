package com.example.demo.signals;

import com.example.demo.lib.Algo;
import org.springframework.stereotype.Component;

@Component
public interface ISignal {
    int value();
    void execute(Algo algo);
}