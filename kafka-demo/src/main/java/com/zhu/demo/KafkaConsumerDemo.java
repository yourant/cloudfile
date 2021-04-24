package com.zhu.demo;


import cn.hutool.core.collection.CollUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.time.Duration;
import java.util.Properties;

/**
 * @Author ZhuHaiBo
 * @Create 2021/4/24 0:17
 */
@Slf4j
public class KafkaConsumerDemo {

    public static void receiverMessage(String topic, String groupId, String deSerializer) {
        Properties properties = getConsumerProperties(groupId, deSerializer);
        KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<>(properties);
        // kafka消费者订阅
        kafkaConsumer.subscribe(CollUtil.newArrayList(topic));
        while (true) {
            ConsumerRecords<String, String> consumerRecords = kafkaConsumer.poll(Duration.ofSeconds(1L));
            for (ConsumerRecord<String, String> consumerRecord : consumerRecords) {
                String tempTopic = consumerRecord.topic();
                long offset = consumerRecord.offset();
                int partition = consumerRecord.partition();
                String messageKey = consumerRecord.key();
                String messageVal = consumerRecord.value();
                log.info("Receiver Message Success, Result = " +
                                "[topic = {}, offset = {}, partition = {}, key = {}, value = {}]",
                        tempTopic, offset, partition, messageKey, messageVal);
            }
        }
    }

    public static Properties getConsumerProperties(String groupId, String deSerializer) {
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "192.168.240.152:9092");
        properties.put("group.id", groupId);
        properties.put("enable.auto.commit", "true");
        properties.put("auto.commit.interval.ms", "1000");
        properties.put("key.deserializer", deSerializer);
        properties.put("value.deserializer", deSerializer);
        return properties;
    }

}
