package com.hezi.springRabbitMq.controller;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 队列的配置文件
 * @author Administrator
 *
 */
@Configuration
public class QueueConfig {
	@Bean
	 public Queue CreateQueue() {
      return new Queue("hello-queue");
	}   
} 
