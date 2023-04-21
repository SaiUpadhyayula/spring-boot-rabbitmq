package com.techie.learning.fanout.listener;

import com.techie.learning.fanout.message.OrderMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EmailServiceListener {

    @RabbitListener(queues = "email-queue")
    public void receive(OrderMessage message) {
        log.info("Received message to Emailservice: " + message);
    }
}
