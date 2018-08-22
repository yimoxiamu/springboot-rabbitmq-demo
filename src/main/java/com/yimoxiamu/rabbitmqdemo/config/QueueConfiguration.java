package com.yimoxiamu.rabbitmqdemo.config;

import com.yimoxiamu.rabbitmqdemo.util.MQConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName QueueConfiguration
 * @Description TODO
 * @Author xiamu
 * @Email 768840822@qq.com
 * @Date 2018/7/31 14:26
 * @VERSION 1.0
 **/
@Configuration
@Slf4j
public class QueueConfiguration {

    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange(MQConstant.DEFAULT_EXCHANGE, true, false);
    }

    @Bean
    public Queue queue1() {
        Queue queue = new Queue("test", true);
        return queue;
    }

    @Bean
    public Queue queue2() {
        Queue queue = new Queue(MQConstant.HELLO_QUEUE_NAME, true);
        return queue;
    }

    @Bean
    public Queue queue3(){
        return new Queue("xiamu");
    }

    @Bean
    public Binding binding1() {
        return BindingBuilder.bind(queue1()).to(directExchange()).with("test");
    }

    @Bean
    public Binding binding2() {
        return BindingBuilder.bind(queue2()).to(directExchange()).with(MQConstant.HELLO_QUEUE_NAME);
    }

}
