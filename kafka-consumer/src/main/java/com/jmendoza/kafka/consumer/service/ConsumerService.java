package com.jmendoza.kafka.consumer.service;

import com.jmendoza.kafka.consumer.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @KafkaListener(groupId = "groupUser", topics = "${kafka.topic}",
            containerFactory = "kafkaListenerContainerFactory")
    public void consumeJson(User user) {
        System.out.println("Consumed JSON Message: " + user);
    }
}
