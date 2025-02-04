package com.example.apache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.apache.service.Producer;



@RestController
@RequestMapping(value="/rest/api/")
public class RestControllerForPackakge {
	
	@Autowired
	Producer producer;
	
	@GetMapping("/producerMessage")
	public void getMessageFromClien(@RequestParam("message") String message) {
	
		producer.sendMessageToTpic(message);

	}
	
	
	

}
