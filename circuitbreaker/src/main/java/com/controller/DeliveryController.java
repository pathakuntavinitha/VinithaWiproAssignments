package com.controller;

import com.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @GetMapping("/deliverystatus")
    public String getDeliveryStatus() {
        return deliveryService.callExternalApi();
    }
}
