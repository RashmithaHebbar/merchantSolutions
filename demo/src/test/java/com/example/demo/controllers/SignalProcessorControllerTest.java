package com.example.demo.controllers;

import com.example.demo.services.SignalProcessor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class SignalProcessorControllerTest {

    @Mock
    private SignalProcessor signalProcessorMock;

    @InjectMocks
    private SignalProcessorController signalProcessorController;

    @Test
    public void testProcessSignal1() {
        int signalId = 1;
        ResponseEntity<String> expectedResponse = ResponseEntity.ok("Signal processed successfully");

        Mockito.doNothing().when(signalProcessorMock).handleSignal(signalId);

        ResponseEntity<String> actualResponse = signalProcessorController.processSignal(signalId);

        assertEquals(expectedResponse.getStatusCode(), actualResponse.getStatusCode());
        assertEquals(expectedResponse.getBody(), actualResponse.getBody());
        verify(signalProcessorMock).handleSignal(signalId);
    }

    @Test
    public void testProcessSignal2() {
        int signalId = 2;
        ResponseEntity<String> expectedResponse = ResponseEntity.ok("Signal processed successfully");

        Mockito.doNothing().when(signalProcessorMock).handleSignal(signalId);

        ResponseEntity<String> actualResponse = signalProcessorController.processSignal(signalId);

        assertEquals(expectedResponse.getStatusCode(), actualResponse.getStatusCode());
        assertEquals(expectedResponse.getBody(), actualResponse.getBody());
        verify(signalProcessorMock).handleSignal(signalId);
    }

    @Test
    public void testProcessSignal3() {
        int signalId = 3;
        ResponseEntity<String> expectedResponse = ResponseEntity.ok("Signal processed successfully");

        Mockito.doNothing().when(signalProcessorMock).handleSignal(signalId);

        ResponseEntity<String> actualResponse = signalProcessorController.processSignal(signalId);

        assertEquals(expectedResponse.getStatusCode(), actualResponse.getStatusCode());
        assertEquals(expectedResponse.getBody(), actualResponse.getBody());
        verify(signalProcessorMock).handleSignal(signalId);
    }

    @Test
    public void testProcessSignalWithDefaultSignal() {
        int signalId = 8;
        ResponseEntity<String> expectedResponse = ResponseEntity.ok("Signal processed successfully");

        Mockito.doNothing().when(signalProcessorMock).handleSignal(signalId);

        ResponseEntity<String> actualResponse = signalProcessorController.processSignal(signalId);

        assertEquals(expectedResponse.getStatusCode(), actualResponse.getStatusCode());
        assertEquals(expectedResponse.getBody(), actualResponse.getBody());
        verify(signalProcessorMock).handleSignal(signalId);
    }
}

