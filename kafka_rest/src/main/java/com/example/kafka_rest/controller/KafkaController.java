package com.example.kafka_rest.controller;

import com.example.kafka_rest.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
    @Autowired
    ProducerService producerService;

    @PostMapping(value = "/sendMessage")
    public ResponseEntity<String> sendMessage(@RequestParam("message") String message) {
        producerService.publishTopic(message);
        return ResponseEntity.ok("Message sent successfully to the Topic");
    }
}

