package com.yimoxiamu.rabbitmqdemo.control;

import com.yimoxiamu.rabbitmqdemo.service.IMessageQueueService;
import com.yimoxiamu.rabbitmqdemo.util.MQConstant;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName RabbitmqTestControl
 * @Description TODO
 * @Author xiamu
 * @Email 768840822@qq.com
 * @Date 2018/7/31 15:08
 * @VERSION 1.0
 **/
@RestController
public class RabbitmqTestControl {

    @Autowired
    IMessageQueueService iMessageQueueService;

    @Autowired
    RabbitTemplate rabbitTemplate;

    @RequestMapping("test")
    public String test() {
        iMessageQueueService.sendMessage("test", "这是test生产出来的消息哦");
        return "ok";
    }

    @RequestMapping("hello")
    public String hello() {
        iMessageQueueService.sendMessage(MQConstant.HELLO_QUEUE_NAME, "这是hello生产出来的消息哦");
        return "ok";
    }

    @RequestMapping("/")
    public String xiamu(){

            rabbitTemplate.convertAndSend("fanoutExchange","","这是测试广播消息。");

        return "ok";
    }
}
