package com.mhn.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mhn.kafka.service.Producer;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
	@Autowired
	private Producer producer;

	@GetMapping("/topic")
	public void getmessageTopic(@RequestParam("message") String message) {
		producer.sendmessagetoTopic(message);	
	
	}
}
