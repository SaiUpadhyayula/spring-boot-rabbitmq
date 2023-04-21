package com.techie.learning.sender;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@RequiredArgsConstructor
@Slf4j
@Component
public class MessageSender {

    private final RabbitTemplate rabbitTemplate;
    private final Queue queue;

    AtomicInteger count = new AtomicInteger(0);

    @Scheduled(fixedDelay = 1000, initialDelay = 50)
    public void sendMessage() {
        var string = "hello " + count.incrementAndGet();
        var message = MessageBuilder.withBody(string.getBytes()).build();
        rabbitTemplate.send(queue.getName(), message);
        log.info("Message sent to the RabbitMQ Successfully!!");
    }
}
