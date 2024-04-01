package com.rabbitmq.eight;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.utils.RabbitMqUtils;
import com.rabbitmq.utils.SleepUtils;

/**
 * 私信队列  生产者代码
 */
public class Producer {
    //普通交换机名称
    private static final String NORMAL_EXCHANGE = "normal_exchange";

    public static void main(String[] args) throws Exception{
        Channel channel = RabbitMqUtils.getChannel();
        //设置消息的 TTL 时间
        AMQP.BasicProperties properties = new AMQP.BasicProperties().builder().expiration("5000").build();

        for (int i = 0; i < 10; i++) {
            String message="info"+i;
            SleepUtils.sleep(1/2);
            channel.basicPublish(NORMAL_EXCHANGE,"zhangsan",properties,message.getBytes());
            System.out.println("生产者发出消息："+message);
        }
    }
}
