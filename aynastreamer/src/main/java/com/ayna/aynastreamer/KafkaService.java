package com.ayna.aynastreamer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaProducer kafkaProducer;

    public void sendMessagesToKafka() {
        kafkaProducer.sendCategoryNames();
    }
}