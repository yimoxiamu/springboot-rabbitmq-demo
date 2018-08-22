package com.yimoxiamu.rabbitmqdemo.customer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName CusMesB
 * @Description TODO
 * @Author xiamu
 * @Email 768840822@qq.com
 * @Date 2018/8/22 11:07
 * @VERSION 1.0
 **/
@Component
@RabbitListener(queues = "message_B")
public class CusMesB {

    @RabbitHandler
    public void test(String content){
        System.out.println("消费者B收到消息："+content);
    }
}
