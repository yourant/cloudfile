package com.zhu.base.test;

import com.zhu.base.demo.KafkaConsumerDemo;
import com.zhu.base.demo.KafkaProducerAsyncDemo;
import com.zhu.base.demo.KafkaProducerDemo;
import com.zhu.base.util.KafkaUtils;
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
