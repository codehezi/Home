package com.hezi.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hezi.springRabbitMq.SpringHelloApplication;
import com.hezi.springRabbitMq.controller.sender;
/**
 * 消息队列测试类
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= {SpringHelloApplication.class})
public class rabbitMqTest {
   
	@Autowired
	private sender rabbitMqSender;

	@Test
	public void test() {
		this.rabbitMqSender.send("测试效果");
	}
}
