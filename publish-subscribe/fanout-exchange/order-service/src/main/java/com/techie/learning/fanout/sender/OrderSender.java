package com.techie.learning.fanout.sender;

import com.techie.learning.fanout.message.OrderMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderSender {

    private final RabbitTemplate rabbitTemplate;
    private final FanoutExchange fanoutExchange;

    public void send(OrderMessage orderMessage) {
        rabbitTemplate.convertAndSend(fanoutExchange.getName(), "", orderMessage);
    }
}
