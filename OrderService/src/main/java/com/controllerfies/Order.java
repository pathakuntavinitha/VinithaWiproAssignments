package com.controllerfies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class Order {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String placeOrder() {
        String paymentResponse = restTemplate.getForObject("http://localhost:8082/payment", String.class);
        return "Order service successfully consume " + paymentResponse;
    }
}
