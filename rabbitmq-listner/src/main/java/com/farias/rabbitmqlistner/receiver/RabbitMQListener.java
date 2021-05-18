package com.farias.rabbitmqlistner.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;



public class RabbitMQListener {
	
	@RabbitListener(queues = "MyQueue")
    public void receiver(String message) throws InterruptedException  {
		System.out.println("message = ["+ message +"]");
	}

}
