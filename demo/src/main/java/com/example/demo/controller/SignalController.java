package com.example.demo.controller;

import com.example.demo.service.SignalService;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
public class SignalController {
    private final SignalService signalService;

    //Here {signal} takes 1,2,3 signals currently
    @PostMapping("/signal")
    public ResponseEntity<String> handleSignal(@RequestParam int signal) {
        try {
            signalService.handleSignal(signal);
            return ResponseEntity.ok("Signal processed successfully");
        } catch (IllegalArgumentException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid signal");
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error processing signal");
        }
    }
}

