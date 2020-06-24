package com.kernes.examples.activemq.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.TextMessage;

@Service
public class ConsumerListenerService {

    @JmsListener(destination = "${myqueue}")
    public void receive(TextMessage message) throws JMSException {
        System.out.println("***Consumer**:" + message.getText());
    }
}
