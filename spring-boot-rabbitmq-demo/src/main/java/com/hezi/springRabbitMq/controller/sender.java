package com.hezi.springRabbitMq.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 创建生产者(消息的发送者)
 * @author Administrator
 *
 */
@Component
public class sender {
   @Autowired
   private AmqpTemplate rabbitTemplate;
   public void send(String msg) {
	   //第一个参数：表示的是要发送到那个队列（也就是队列名标注）
	   //第二个参数：表示要发送的信息
       this.rabbitTemplate.convertAndSend("hello-queue", msg);	   
   }
}
