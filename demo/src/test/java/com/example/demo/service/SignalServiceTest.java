package com.example.demo.service;

import com.example.demo.lib.SignalHandler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;

@RunWith(MockitoJUnitRunner.class)
public class SignalServiceTest {
    @Mock
    private SignalHandler signalHandlerMock;

    @Test
    public void testHandleSignalWithInvalidSignal() {
        Map<Integer, SignalHandler> signalHandlerMap = new HashMap<>();
        signalHandlerMap.put(1, signalHandlerMock);
        SignalService signalService = new SignalService(signalHandlerMap);

        signalService.handleSignal(2);

        verifyNoInteractions(signalHandlerMock);
    }
}