package com.zhu.base.demo;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import java.util.Properties;
import java.util.concurrent.Future;

/**
 * @Author ZhuHaiBo
 * @Create 2021/4/24 0:14
 */
@Slf4j
public class KafkaProducerDemo {

    public static void sendMessage(String topic, String serializer) {
        Properties properties = getProducerProperties(serializer);
        KafkaProducer<String, String> kafkaProducer = new KafkaProducer<>(properties);
        try {
            for (int i = 0; i < 100; i++) {
                ProducerRecord<String, String> producerRecord = new ProducerRecord<>(topic, null, String.valueOf(i));
                Future<RecordMetadata> metadataFuture = kafkaProducer.send(producerRecord);
                metadataFuture.get();
                log.info("Kafka Producer Send Message Success. Value = [{}]", i);
            }
        } catch (Exception e) {
            log.error("Producer Send Message Error! ErrorMessage = [{}]", e.getMessage());
        } finally {
            kafkaProducer.close();
        }
    }

    public static Properties getProducerProperties(String serializer) {
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "192.168.240.151:9092");
        properties.put("acks", "all");
        properties.put("key.serializer", serializer);
        properties.put("value.serializer", serializer);
        return properties;
    }

}
