package com.example.demo.controllers;

import com.example.demo.services.SignalService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SignalControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SignalService signalService;

    @Test
    public void handleSignal_validSignal_returnsOk() throws Exception {
        int signal = 1;
        mockMvc.perform(post("/signal")
                        .param("signal", String.valueOf(signal)))
                .andExpect(status().isOk())
                .andExpect(content().string("Signal processed successfully"));
        verify(signalService).handleSignal(signal);
    }
    @Test
    public void testSignal1() throws Exception {
        mockMvc.perform(post("/signal")
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                        .param("signal", "1"))
                .andExpect(status().isOk());
        verify(signalService, times(1)).handleSignal(1);
    }

    @Test
    public void testSignal2() throws Exception {
        mockMvc.perform(post("/signal")
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                        .param("signal", "2"))
                .andExpect(status().isOk());
        verify(signalService, times(1)).handleSignal(2);
    }

    @Test
    public void testSignal3() throws Exception {
        mockMvc.perform(post("/signal")
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                        .param("signal", "3"))
                .andExpect(status().isOk());
        verify(signalService, times(1)).handleSignal(3);
    }

    @Test
    public void handleSignal_internalServerError_returnsInternalServerError() throws Exception {
        int signal = 1;
        doThrow(new RuntimeException()).when(signalService).handleSignal(signal);
        mockMvc.perform(post("/signal")
                        .param("signal", String.valueOf(signal)))
                .andExpect(status().isInternalServerError())
                .andExpect(content().string("Error processing signal"));
        verify(signalService).handleSignal(signal);
    }

}
