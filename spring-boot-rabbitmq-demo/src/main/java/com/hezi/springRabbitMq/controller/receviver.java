package com.hezi.springRabbitMq.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
/*
 *创建接受者（消费者） 
 */
@Component
public class receviver {
	/*
	 * 接受消息的方法：采用消息队列监听器的方式
	 */
    @RabbitListener(queues= {"hello-queue"})
	public void recevie(String msg) {
		System.out.println(msg);
	}
}
