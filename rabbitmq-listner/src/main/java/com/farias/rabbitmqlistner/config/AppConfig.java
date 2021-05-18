package com.farias.rabbitmqlistner.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.farias.rabbitmqlistner.receiver.RabbitMQListener;


@Configuration
public class AppConfig {

	private static final String MY_QUEUE = "MyQueue";
	
	@Bean
	public Queue myQueue() {
		return new Queue(MY_QUEUE, true);
	}
	
	@Bean
	public RabbitMQListener receiver() {
		return new RabbitMQListener();
	}
}
