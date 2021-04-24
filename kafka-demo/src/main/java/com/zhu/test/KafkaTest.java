package com.zhu.test;

import com.zhu.demo.KafkaConsumerDemo;
import com.zhu.demo.KafkaProducerAsyncDemo;
import com.zhu.demo.KafkaProducerDemo;
import com.zhu.util.KafkaUtils;
import org.junit.Test;

/**
 * @Author ZhuHaiBo
 * @Create 2021/4/24 0:20
 */
public class KafkaTest {

    @Test
    public void testProducer() {
        KafkaProducerDemo.sendMessage(KafkaUtils.TOPIC, KafkaUtils.SERIALIZER);
    }

    @Test
    public void testConsumer() {
        KafkaConsumerDemo.receiverMessage(KafkaUtils.TOPIC, KafkaUtils.GROUP_ID, KafkaUtils.DE_SERIALIZER);
    }

    @Test
    public void testProducerAsync() {
        KafkaProducerAsyncDemo.sendMessageAsync(KafkaUtils.TOPIC, KafkaUtils.SERIALIZER);
    }

}
