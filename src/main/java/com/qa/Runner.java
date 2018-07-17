package com.qa;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.qa.constants.Constants;
import com.qa.domain.Trainer;

@Component
public class Runner implements CommandLineRunner {

	private final RabbitTemplate rabbitTemplate;
	private final RestTemplate restTemplate;
	private final Gson gson;

    public Runner(RabbitTemplate rabbitTemplate, RestTemplate restTemplate, Gson gson) {
        this.rabbitTemplate = rabbitTemplate;
        this.restTemplate = restTemplate;
        this.gson = gson;
    }

    @Override
    public void run(String... args) throws Exception {
    	Trainer[] trainer = restTemplate.getForObject(
				Constants.API_ADDRESS, Trainer[].class);
        rabbitTemplate.convertAndSend(Application.topicExchangeName, "foo.bar.baz", gson.toJson(trainer));
    }
}
