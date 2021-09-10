package com.example.telegramBot.controller;

import com.example.telegramBot.model.UserPin;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class PinController {

    @PostMapping("/pin")
    public void receivePin(@RequestBody UserPin userPin) {
        log.info("pin received {}", userPin);
    }
}
