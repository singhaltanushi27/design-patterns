package com.example.designpatterns.patterns;

public class PaymentFactory {

    public static PaymentProcessor getPaymentProcessor(String type) {
        if (type.equalsIgnoreCase("upi")) {
            return new UpiProcessor();
        } else if (type.equalsIgnoreCase("paypal")) {
            return new PayPalProcessor();
        } else if (type.equalsIgnoreCase("creditcard")) {
            return new CreditCardProcessor();

        }
        throw new IllegalArgumentException("Unknown payment type: " + type);
    }
}
