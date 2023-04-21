package com.techie.learning.workerqueus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Producer {
    public static void main(String[] args) {
        SpringApplication.run(Producer.class, args);
    }
}
