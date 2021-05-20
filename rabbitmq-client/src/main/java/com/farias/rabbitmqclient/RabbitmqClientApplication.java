package com.farias.rabbitmqclient;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.farias.rabbitmqclient.model.SimpleMessage;

@SpringBootApplication
public class RabbitmqClientApplication implements CommandLineRunner {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqClientApplication.class, args);
	}
	
	@Override
	public void run(String... strings) throws Exception {

		SimpleMessage simpleMessage = new SimpleMessage();
		simpleMessage.setName("FirstMessage");
		simpleMessage.setDescription("simpleDescription");

		rabbitTemplate.convertAndSend("MyTopicExchange", "topic", simpleMessage);
	}

}
