package com.yimoxiamu.rabbitmqdemo.customer;

import com.yimoxiamu.rabbitmqdemo.util.MQConstant;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName HelloProcessor
 * @Description TODO
 * @Author xiamu
 * @Email 768840822@qq.com
 * @Date 2018/7/31 15:24
 * @VERSION 1.0
 **/
@Component
@RabbitListener(queues = "test")
@RabbitListener(queues = MQConstant.HELLO_QUEUE_NAME)
@RabbitListener(queues = "xiamu")
public class HelloProcessor {

    @RabbitHandler
    public void process(String context) {
        System.out.println("测试一下，客户端一接收到的消息为" + context);
    }
}
