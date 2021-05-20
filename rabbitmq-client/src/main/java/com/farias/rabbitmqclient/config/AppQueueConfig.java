package com.farias.rabbitmqclient.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppQueueConfig {

	
	private static final String MY_QUEUE = "MyQueue";
	private static final String MY_TOPIC_QUEUE = "MyTopicExchange";
	

	@Bean
	public Queue myQueue() {
		return new Queue(MY_QUEUE, true);
	}
	
	@Bean
	public Exchange topicExchange() {
		return ExchangeBuilder.topicExchange(MY_TOPIC_QUEUE)
				.durable(true)
				.build();
	}

	@Bean
	public Binding dinding() {
		//		return new Binding(MY_QUEUE, Binding.DestinationType.QUEUE, "TopicExchange", "topic", null);
		return BindingBuilder
				.bind(myQueue())
				.to(topicExchange())
				.with("topic")
				.noargs();

	}

	@Bean
	public Queue my2Queue() {
		return QueueBuilder.durable(MY_QUEUE+"_2")
				.autoDelete()
				.exclusive()
				.build();
	}

}
