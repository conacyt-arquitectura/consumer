package mx.conacyt.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "personas", groupId = "miic")
    public void consume(PersonaFisica message) throws IOException {
        logger.info(String.format("-> Mensaje consumidor %s", message));
    }
}