package com.ayna.aynastreamer;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component 
public class KafkaProducer {

	private static final String TOPIC = "my-topic"; // Change to your Kafka topic name

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private final List<String> categoryNames = Arrays.asList(
        "Toys", "Electronics", "Books", "Fashion", "Groceries", "Pets",
        "Vets", "Clinical", "Apparel", "Clothes", "Furniture"
    );

    public void sendCategoryNames() {
        for (String categoryName : categoryNames) {
            kafkaTemplate.send(TOPIC, categoryName);
        }
    }
}
