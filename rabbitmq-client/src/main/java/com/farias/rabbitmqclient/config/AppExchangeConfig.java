package com.farias.rabbitmqclient.config;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppExchangeConfig {

	private static final String MY_TOPIC_QUEUE = "TopicExchange";
	
	@Bean
	public Exchange topicExchangeExemple() {
		return new TopicExchange(MY_TOPIC_QUEUE);
	}
	
	@Bean
	public Exchange directExchangeExemple() {
		return ExchangeBuilder.directExchange("DirectExchange")
				.autoDelete()
				.internal()
				.build();
	}
	
	@Bean
	public Exchange topicExchangeExemple2() {
		return ExchangeBuilder.topicExchange("TopicExchange_2")
				.autoDelete()
				.durable(true)
				.internal()
				.build();
	}
	
	@Bean
	public Exchange fanoutExchangeExemple() {
		return ExchangeBuilder.fanoutExchange("FanoutExchange")
				.autoDelete()
				.durable(false)
				.internal()
				.build();
	}
	
	@Bean
	public Exchange headerExchangeExemple() {
		return ExchangeBuilder.headersExchange("HeaderExchange")
				.internal()
				.durable(true)
				.ignoreDeclarationExceptions()
				.build();
	}
	
}
