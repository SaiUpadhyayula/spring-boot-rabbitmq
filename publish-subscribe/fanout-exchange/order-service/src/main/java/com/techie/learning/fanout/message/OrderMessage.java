package com.techie.learning.fanout.message;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderMessage implements Serializable {
    private String orderId;
    private String email;
    private String username;
    private Address shippingAddress;

    @Data
    public static class Address implements Serializable {
        private String street;
        private String city;
        private String state;
        private String zipCode;
    }
}
