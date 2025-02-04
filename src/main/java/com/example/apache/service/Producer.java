package com.example.apache.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class Producer {
	
   @Autowired
	KafkaTemplate<String,String> kafkaTemplete;
	
	public void sendMessageToTpic(String message)
	{
		kafkaTemplete.send("codeDecode_topicName",message);
	}
}
