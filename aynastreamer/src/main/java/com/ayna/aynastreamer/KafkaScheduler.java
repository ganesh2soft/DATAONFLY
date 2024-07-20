package com.ayna.aynastreamer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class KafkaScheduler {

	@Autowired
    private KafkaProducer kafkaProducer;

    @Scheduled(fixedRate = 2000) // Send every 2 seconds
    public void sendCategoryNamesPeriodically() {
        kafkaProducer.sendCategoryNames();
    }
}
