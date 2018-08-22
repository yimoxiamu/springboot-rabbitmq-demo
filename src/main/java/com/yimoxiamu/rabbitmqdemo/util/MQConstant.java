package com.yimoxiamu.rabbitmqdemo.util;

/**
 * @ClassName MQConstant
 * @Description TODO
 * @Author xiamu
 * @Email 768840822@qq.com
 * @Date 2018/7/31 14:24
 * @VERSION 1.0
 **/
public final class MQConstant {
    //exchange name
    public static final String DEFAULT_EXCHANGE = "xiamu_exchange";

    //DLX QUEUE
    public static final String DEFAULT_DEAD_LETTER_QUEUE_NAME = "kshop.dead.letter.queue";

    //DLX repeat QUEUE 死信转发队列
    public static final String DEFAULT_REPEAT_TRADE_QUEUE_NAME = "kshop.repeat.trade.queue";


    //Hello 测试消息队列名称
    public static final String HELLO_QUEUE_NAME = "HELLO";
}
