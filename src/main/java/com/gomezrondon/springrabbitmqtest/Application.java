package com.gomezrondon.springrabbitmqtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

	@Autowired
	RabbitTemplate rabbitTemplate;
	@Autowired
	Binding binding;

	private List<String> names =  Arrays.asList("Alvarez,Bolivar,Colorado,D'Angelo,Epic,Fibonachi".split(","));
	private int i;
	private Random rnd = new Random();

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		i=rnd.nextInt(names.size());
		String name = names.get(i);
		LOGGER.info(">>>>>>>> random "+name);

	}
}
