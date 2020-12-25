package com.gomezrondon.springrabbitmqtest;

import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sound.midi.Receiver;

@SpringBootApplication
public class SpringRabbitmqTestApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringRabbitmqTestApplication.class, args);
	}

}
