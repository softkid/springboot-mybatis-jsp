package com.hwq;

import com.hwq.activeMQ.Producer;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.Destination;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDemoApplicationTests {

//	@Autowired
//	private RoncooRedisComponent roncooRedisComponent;
//
//	@Test
//	public void set() {
//		roncooRedisComponent.set("roncoo", "hello world");
//	}
//
//	@Test
//	public void get() {
//		System.out.println(roncooRedisComponent.get("roncoo"));
//	}
//
	@Test
	public void del() {
		roncooRedisComponent.del("roncoo");
	}
	@Autowired
	private Producer producer;

	@Test
	public void contextLoads() throws InterruptedException {
		Destination destination = new ActiveMQQueue("mytest.queue");

		for (int i = 0; i < 100; i++) {
			producer.sendMessage(destination, "myname is chhliu!!!");
		}
	}

}
