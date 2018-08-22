package com.yimoxiamu.rabbitmqdemo.customer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName TestCustomer
 * @Description TODO
 * @Author xiamu
 * @Email 768840822@qq.com
 * @Date 2018/8/22 10:35
 * @VERSION 1.0
 **/
@Component
@RabbitListener(queues="xiamu")
public class TestCustomer {

    @RabbitHandler
    public void test(String content){
        System.out.println("测试一下，客户端二接收到的消息为 ："+content);
    }
}
