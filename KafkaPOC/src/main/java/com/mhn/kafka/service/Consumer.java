package com.mhn.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
@KafkaListener(topics ="mhn_topic" ,groupId = "mohan_group" )
	public void listinToTopic(String recivedmsg) {
		System.out.println("recived message is"+ recivedmsg);
	}
	
}
