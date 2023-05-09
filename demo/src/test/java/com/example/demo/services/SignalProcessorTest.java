package com.example.demo.services;

import com.example.demo.lib.Algo;
import com.example.demo.lib.SignalHandler;
import com.example.demo.signals.ISignal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class SignalProcessorTest {

    @Test
    public void handleSignal_shouldCallExecuteAndDoAlgo() {
        // Mock objects
        SignalFactory signalFactory = mock(SignalFactory.class);
        Algo algo = mock(Algo.class);
        ISignal signalExecutor = mock(ISignal.class);

        // Create SignalProcessor object
        SignalProcessor signalProcessor = new SignalProcessor(signalFactory);

        // Mock signalFactory.getSignal()
        when(signalFactory.getSignal(anyInt())).thenReturn(signalExecutor);

        // Call handleSignal() method
        signalProcessor.handleSignal(123);

        // Verify that signalFactory.getSignal() was called with the correct argument
        verify(signalFactory).getSignal(123);

    }

    @Test
    void handleSignal_shouldHandleSignal() {
        SignalFactory signalFactory = mock(SignalFactory.class);
        Algo algo = mock(Algo.class);
        SignalHandler signalProcessor = new SignalProcessor(signalFactory);

        int signal = 4;
        ISignal signalExecutor = mock(ISignal.class);
        when(signalFactory.getSignal(signal)).thenReturn(signalExecutor);

        signalProcessor.handleSignal(signal);

        verify(signalFactory).getSignal(signal);
    }

}
