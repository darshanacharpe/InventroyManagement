package com.logingmultilang.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logingmultilang.service.KafkaMessageService;

@RestController
@RequestMapping("/api/kafka")
public class KafkaMessageController {

	  @Autowired
	    private KafkaMessageService kafkaMessageService;
  

	  @GetMapping("/latest-messages")
	    public ResponseEntity<List<String>> getLatestMessages() {
	        List<String> messages = kafkaMessageService.getMessages();
	        return ResponseEntity.ok(messages);
	    }
}
