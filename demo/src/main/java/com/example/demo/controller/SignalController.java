package com.example.demo.controller;

import com.example.demo.service.SignalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class SignalController {

    @Autowired
    private SignalService signalService;
        @GetMapping("/{signal-id}")
        public void one(@PathVariable int id) {

            signalService.handleSignal(id);
        }

}
