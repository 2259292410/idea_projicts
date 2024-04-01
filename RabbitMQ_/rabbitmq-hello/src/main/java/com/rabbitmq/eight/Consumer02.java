package com.rabbitmq.eight;

import com.rabbitmq.client.*;
import com.rabbitmq.utils.RabbitMqUtils;

/**
 * 死信队列 消费者C2
 */
public class Consumer02 {
    //死信交换机名称
    private static final String DEAD_EXCHANGE = "dead_exchange";

    public static void main(String[] args) throws Exception {
        Channel channel = RabbitMqUtils.getChannel();
        String deadQueue = "dead-queue";
        channel.queueBind(deadQueue,DEAD_EXCHANGE,deadQueue);
        System.out.println("等待接收消息,把接收到的消息打印在屏幕.....");
        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
            String message = new String(delivery.getBody(), "UTF-8");
            System.out.println("Consumer02控制台打印接收到的消息"+message);
        };
        channel.basicConsume(deadQueue,true,deliverCallback,i->{});
    }
}
