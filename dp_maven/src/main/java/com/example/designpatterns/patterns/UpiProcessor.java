package com.example.designpatterns.patterns;

public class UpiProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing upi payment: " + amount);
    }
}