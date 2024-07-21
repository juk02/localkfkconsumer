package com.example.localkfkconsumer;

import org.apache.kafka.clients.consumer.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KfkConsumer {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @KafkaListener(topics = "local.promotion", groupId = "local.promotion")
    public void consumeMessage(String message, Consumer<?, ?> consumer) {
        logger.debug("Message [{}] consumed", message);
    }

}
