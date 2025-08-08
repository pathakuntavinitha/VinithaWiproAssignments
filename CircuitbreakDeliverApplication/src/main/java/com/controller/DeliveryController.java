package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeliveryController {

    @GetMapping("/delivery/status")
    public String getStatus() {
        return "Order is out for delivery";
    }
}
