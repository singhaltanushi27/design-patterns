package com.example.designpatterns.controller;

import com.example.designpatterns.patterns.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @PostMapping("/{type}")
    public String processPayment(@PathVariable String type, @RequestParam double amount) {
        LoggerService logger = LoggerService.getInstance();
        logger.log("Payment request received: " + type + " for " + amount);

        PaymentProcessor processor = PaymentFactory.getPaymentProcessor(type);
        processor.processPayment(amount);
        Order order = new Order.Builder().product("Laptop").quantity(1).giftWrap(true).build();
        logger.log("Order created: " + order);
        Receipt receipt = new Receipt("Payment of " + amount + " via " + type);
        Receipt clonedReceipt = receipt.clone();
        logger.log("Receipt cloned: " + clonedReceipt);
        return "Payment processed successfully!";
    }
}