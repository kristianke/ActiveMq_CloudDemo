package com.kernes.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Producer_app {
    public static void main(String[] args) {
        SpringApplication.run(Producer_app.class,args);
    }
}
