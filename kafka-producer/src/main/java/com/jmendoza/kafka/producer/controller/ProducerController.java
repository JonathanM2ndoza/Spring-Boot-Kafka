package com.jmendoza.kafka.producer.controller;

import com.jmendoza.kafka.producer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class ProducerController {

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;
    @Autowired
    private Environment env;

    @PostMapping("/sendMessage")
    public String sendMessage(@Valid @RequestBody User user) {
        kafkaTemplate.send(env.getRequiredProperty("kafka.topic"), user);
        return "Published successfully";
    }
}
