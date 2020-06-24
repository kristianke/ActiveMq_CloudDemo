package com.kernes.examples;

import com.kernes.examples.activemq.service.ProducerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProducerServiceTest {

    @Autowired
    ProducerService service;

    @Test
    public void producerTest(){
        service.msgProducer("------------ a message-------");
    }
}
