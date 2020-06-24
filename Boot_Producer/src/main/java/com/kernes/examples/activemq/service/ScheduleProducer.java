package com.kernes.examples.activemq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.jms.Queue;

@Service
public class ScheduleProducer {

    @Autowired
    JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    Queue queue;

    @Scheduled(fixedDelay = 5000L)
    public void schedulerProduce(){
        jmsMessagingTemplate.convertAndSend(queue,System.currentTimeMillis()+"***");
        System.out.println("produce a message.....");
    }
}
