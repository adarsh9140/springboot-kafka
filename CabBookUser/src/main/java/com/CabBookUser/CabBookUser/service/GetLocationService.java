package com.CabBookUser.CabBookUser.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class GetLocationService {


    @KafkaListener(topics = "cab-location",groupId = "user-group")
    public void getLocation(String location){
        System.out.println(location);
    }
}
