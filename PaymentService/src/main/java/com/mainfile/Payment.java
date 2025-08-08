package com.mainfile;

import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class Payment {
	 private static final Logger log = LoggerFactory.getLogger(Payment.class);
    @GetMapping
    public String processPayment() {
    	 log.info("Processing console request");
        return "Payment Service data";
    }
}
