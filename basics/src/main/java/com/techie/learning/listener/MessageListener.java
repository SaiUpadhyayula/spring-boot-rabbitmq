package com.techie.learning.listener;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Slf4j
@RequiredArgsConstructor
@Component
public class MessageListener {

    @RabbitListener(queues = "hello-world")
    public void handleMessage(Message message) {
        log.info("Received message: " + Arrays.toString(message.getBody()));
    }
}
