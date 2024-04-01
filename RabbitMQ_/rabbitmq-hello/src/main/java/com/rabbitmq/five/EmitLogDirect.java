package com.rabbitmq.five;

import com.rabbitmq.client.Channel;
import com.rabbitmq.utils.RabbitMqUtils;

import java.util.Scanner;

/**
 * fanout类型交换机
 */
public class EmitLogDirect {
    public static final String EXCHANGE_NAME = "logs";

    public static void main(String[] args) throws Exception {
        Channel channel = RabbitMqUtils.getChannel();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String message = scanner.next();
            channel.basicPublish(EXCHANGE_NAME,"",null,message.getBytes());
            System.out.println("发出的消息："+message);
        }
    }
}
