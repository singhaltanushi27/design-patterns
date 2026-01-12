package com.example.designpatterns.patterns;

import com.example.designpatterns.patterns.PaymentProcessor;

public class UpiProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing upi payment: " + amount);
    }
}