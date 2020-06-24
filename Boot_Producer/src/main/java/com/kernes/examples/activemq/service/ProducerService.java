package com.kernes.examples.activemq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Queue;

@Service
public class ProducerService {

    @Autowired
    private Queue queue;
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    public void msgProducer(String msg){
        jmsMessagingTemplate.convertAndSend(queue,msg);
    }
}
