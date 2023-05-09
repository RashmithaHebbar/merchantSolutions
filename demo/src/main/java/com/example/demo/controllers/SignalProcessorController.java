package com.example.demo.controllers;

import com.example.demo.services.SignalProcessor;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@AllArgsConstructor
@Slf4j
public class SignalProcessorController {
    private final SignalProcessor signalProcessor;

    @PostMapping("/signal")
    @ResponseBody
    public ResponseEntity<String>  processSignal(@RequestParam(required = false) int signalId){
        try {
            log.info("Got a new request for processing signal: "+signalId);
            signalProcessor.handleSignal(signalId);
        }catch (Exception ex) {
            System.out.println(ex);
        }
        return ResponseEntity.ok("Signal processed successfully");
    }
}
