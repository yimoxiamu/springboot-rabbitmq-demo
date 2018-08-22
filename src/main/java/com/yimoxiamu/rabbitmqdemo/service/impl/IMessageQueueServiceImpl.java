package com.yimoxiamu.rabbitmqdemo.service.impl;

import com.yimoxiamu.rabbitmqdemo.service.IMessageQueueService;
import com.yimoxiamu.rabbitmqdemo.util.MQConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName IMessageQueueServiceImpl
 * @Description TODO
 * @Author xiamu
 * @Email 768840822@qq.com
 * @Date 2018/7/31 14:20
 * @VERSION 1.0
 **/
@Service
@Slf4j
public class IMessageQueueServiceImpl implements IMessageQueueService {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Override
    public void sendMessage(String queueName, String message) {
        rabbitTemplate.convertAndSend(MQConstant.DEFAULT_EXCHANGE, queueName, message);
    }

}
