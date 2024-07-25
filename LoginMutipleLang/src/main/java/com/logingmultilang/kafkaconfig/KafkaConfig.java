package com.logingmultilang.kafkaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.logingmultilang.appconst.AppConstant;
import com.logingmultilang.service.KafkaMessageService;

@Configuration
public class KafkaConfig {
//
//
//    @KafkaListener(topics = AppConstant.LOCATION_UPDATE_TOPIC, groupId = AppConstant.GROUP_ID)
//    public void updatedLocation(String value) {
//        System.out.println(value);
//
//    }
	

    @Autowired
    private KafkaMessageService kafkaMessageService;

    @KafkaListener(topics = AppConstant.LOCATION_UPDATE_TOPIC, groupId = AppConstant.GROUP_ID)
    public void updatedLocation(String value) {
        System.out.println(value);
        kafkaMessageService.addMessage(value);
    }
}
