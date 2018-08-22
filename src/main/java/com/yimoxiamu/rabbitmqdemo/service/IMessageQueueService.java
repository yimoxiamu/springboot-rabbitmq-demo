package com.yimoxiamu.rabbitmqdemo.service;

public interface IMessageQueueService {
    /**
     * 向mq发送消息
     *
     * @param queueName 队列名称
     * @param message   消息内容
     */
    void sendMessage(String queueName, String message);
}
