package com.rabbitmq.three;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DeliverCallback;
import com.rabbitmq.utils.RabbitMqUtils;
import com.rabbitmq.utils.SleepUtils;

public class Worker03 {
    //队列名称
    public static final String TASK_QUEUE_NAME="ack_queue";

    public static void main(String[] args) throws Exception{
        Channel channel = RabbitMqUtils.getChannel();
        System.out.println("C1处理消息时间较短");
        DeliverCallback deliverCallback=(consumerTag,message)->{
            SleepUtils.sleep(1);
            System.out.println("接受到的消息:"+new String(message.getBody(),"UTF-8"));
            /**
             * 手动应答
             * 1.消息标记tag
             * 2.false：不批量应答 true:批量应答
             */
            channel.basicAck(message.getEnvelope().getDeliveryTag(),false);
        };
        //设置不公平分发
        channel.basicQos(2);
        //是否自动应答
        boolean autoAck=false;
        channel.basicConsume(TASK_QUEUE_NAME,autoAck,deliverCallback,consumerTag->{
            System.out.println(consumerTag+"消费者取消消费接口回调");
        });
    }
}
