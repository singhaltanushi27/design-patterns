package com.example.designpatterns.patterns;

public class CreditCardProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment: " + amount);
    }
}