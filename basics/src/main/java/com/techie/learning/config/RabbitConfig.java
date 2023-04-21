package com.techie.learning.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RabbitConfig {

    @Bean
    public Queue queue() {
        return new Queue("hello-world");
    }
}
