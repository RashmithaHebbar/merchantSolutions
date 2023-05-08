package com.example.demo.service;

import com.example.demo.lib.Algo;
import com.example.demo.lib.SignalHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class SignalService {

    public void handleSignal(int signal) {
        Algo algo = new Algo();

        switch (signal){
            case 1 -> new Signal1();

            case 2 -> new Signal2();

            case 3 -> new Signal3();

            default-> algo.cancelTrades();
        }

        algo.doAlgo();
    }
}
