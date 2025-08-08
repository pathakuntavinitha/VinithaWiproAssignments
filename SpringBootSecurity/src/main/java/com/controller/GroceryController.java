package com.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grocery")
public class GroceryController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Welcome to grocery store this is public endpoint)";
    }

    @GetMapping("/items")
    public List<String> getItems() {
        return List.of("Rice","Milk","Bread","Oil");
    }

    @GetMapping("/orders")
    public List<String> getOrders() {
        return List.of("Order1","Order2");
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminOnly() {
        return "Admin only secure information";
    }
}