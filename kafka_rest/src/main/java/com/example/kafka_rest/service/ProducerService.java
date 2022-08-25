package com.example.kafka_rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
    public static final String topic = "mytopic";
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void publishTopic(String message) {
        System.out.println("(Producer)-> Message Sent to the: " + topic);
        this.kafkaTemplate.send(topic, message);
    }
}
