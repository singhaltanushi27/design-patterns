package com.example.designpatterns.patterns;

public class PayPalProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing paypal payment: " + amount);
    }
}