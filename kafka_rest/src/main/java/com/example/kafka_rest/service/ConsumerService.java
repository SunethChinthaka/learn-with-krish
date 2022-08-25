package com.example.kafka_rest.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @KafkaListener(topics = "mytopic", groupId = "mygroup")
    public void consumeTopic(String message) {
        System.out.println("(Consumer)-> Message Received: " + message);
    }

}
