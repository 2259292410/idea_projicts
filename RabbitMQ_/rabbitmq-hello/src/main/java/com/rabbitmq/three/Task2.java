package com.rabbitmq.three;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.MessageProperties;
import com.rabbitmq.utils.RabbitMqUtils;

import java.util.Scanner;

public class Task2 {
    //队列名称
    public static final String TASK_QUEUE_NAME="ack_queue";

    public static void main(String[] args) throws Exception{
        Channel channel = RabbitMqUtils.getChannel();
        /**
         * 生成一个队列
         * 1.队列名称
         * 2.队列里面的消息是否持久化 默认消息存储在内存中
         * 3.该队列是否只供一个消费者进行消费 是否进行共享 true 可以多个消费者消费
         * 4.是否自动删除 最后一个消费者端开连接以后 该队列是否自动删除 true 自动删除
         * 5.其他参数
         */
        channel.queueDeclare(TASK_QUEUE_NAME,true,false,false,null);
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String message = scanner.next();
            //发送消息
            channel.basicPublish("",TASK_QUEUE_NAME, MessageProperties.PERSISTENT_TEXT_PLAIN,message.getBytes("UTF-8"));
            System.out.println("生产者发出消息" + message);
        }
    }
}
