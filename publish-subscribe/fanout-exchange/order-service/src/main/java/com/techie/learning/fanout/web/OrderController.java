package com.techie.learning.fanout.web;

import com.techie.learning.fanout.message.OrderMessage;
import com.techie.learning.fanout.sender.OrderSender;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderSender orderSender;

    @PostMapping("/submit")
    public String submitOrder(@RequestBody OrderMessage orderMessage) {
        orderSender.send(orderMessage);
        return "Order submitted successfully";
    }
}
