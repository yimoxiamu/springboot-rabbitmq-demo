package com.yimoxiamu.rabbitmqdemo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName FanoutRabbitConfig
 * @Description TODO
 * @Author xiamu
 * @Email 768840822@qq.com
 * @Date 2018/8/22 10:59
 * @VERSION 1.0
 **/
@Configuration
public class FanoutRabbitConfig {

    @Bean
    public Queue messageA(){
        return new Queue("message_A");
    }

    @Bean
    public Queue messageB(){
        return new Queue("message_B");
    }

    @Bean
    public Queue messageC(){
        return new Queue("message_C");
    }

    @Bean
    public FanoutExchange fanoutExchange(){
        return new FanoutExchange("fanoutExchange");
    }

//    @Bean
//    Binding bindingFanoutToA(Queue messageA,FanoutExchange fanoutExchange){
//        return BindingBuilder.bind(messageA).to(fanoutExchange);
//    }
//
//    @Bean
//    Binding bindingFanoutToB(Queue messageB,FanoutExchange fanoutExchange){
//        return BindingBuilder.bind(messageB).to(fanoutExchange);
//    }
//
//    @Bean
//    Binding bindingFanoutToC(Queue messageC,FanoutExchange fanoutExchange){
//        return BindingBuilder.bind(messageC).to(fanoutExchange);
//    }

    @Bean
    Binding bindingFanoutToA(){
        return BindingBuilder.bind(messageA()).to(fanoutExchange());
    }

    @Bean
    Binding bindingFanoutToB(){
        return BindingBuilder.bind(messageB()).to(fanoutExchange());
    }

    @Bean
    Binding bindingFanoutToC(){
        return BindingBuilder.bind(messageC()).to(fanoutExchange());
    }
}
