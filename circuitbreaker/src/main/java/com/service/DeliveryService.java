package com.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DeliveryService {

    private static final String CIRCUIT_BREAKER_NAME = "deliveryServiceCircuitBreaker";

    RestTemplate restTemplate = new RestTemplate();

    @CircuitBreaker(name = CIRCUIT_BREAKER_NAME, fallbackMethod = "fallbackMethod")
    public String callExternalApi() {
        // Change the URL to simulate actual or dummy failure
        return restTemplate.getForObject("http://localhost:8081/delivery/status", String.class);
    }

    public String fallbackMethod(Throwable t) {
        return "Fallback response: Delivery service is currently unavailable.";
    }
}
