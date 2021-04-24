package com.zhu.demo;

import cn.hutool.core.util.ObjectUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

/**
 * @Author ZhuHaiBo
 * @Create 2021/4/24 0:44
 */
@Slf4j
public class KafkaProducerAsyncDemo {

    public static void sendMessageAsync(String topic, String serializer) {
        Properties properties = getProducerAsyncProperties(serializer);
        KafkaProducer<String, String> kafkaProducer = new KafkaProducer<>(properties);

        try {
            for (int i = 0; i < 100; i++) {
                ProducerRecord<String, String> producerRecord = new ProducerRecord<>(topic, null, String.valueOf(i));
                int finalI = i;
                kafkaProducer.send(producerRecord, ((metadata, exception) -> {
                    //不出异常，说明异步投递发送消息成功
                    if (ObjectUtil.isEmpty(exception)) {
                        long offset = metadata.offset();
                        String tempTopic = metadata.topic();
                        int partition = metadata.partition();
                        log.info("Producer Async Send Message Success, " +
                                "topic = {}, offset = {}, partition = {}, value = {}", tempTopic, offset, partition, finalI);
                    } else {
                        log.error("Producer Send Message Error, ErrorMessage = [{}]", exception.getMessage());
                    }
                }));
            }
        } catch (Exception e) {
            log.error("Producer Async Send Message Error! ErrorMessage = [{}]", e.getMessage());
        } finally {
            kafkaProducer.close();
        }
    }

    public static Properties getProducerAsyncProperties(String serializer) {
        return KafkaProducerDemo.getProducerProperties(serializer);
    }

}
