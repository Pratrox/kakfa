package com.example.apache.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics="codeDecode_topics",groupId="codeDecode_group")
	public void listenToTopic(String message)
	{
		
		System.out.println("receiver message is "+message);
	}
}
