package com.example.designpatterns.patterns;

public class Receipt implements Cloneable {
    private final String details;

    public Receipt(String details) {
        this.details = details;
    }

    public Receipt clone() {
        try {
            return (Receipt) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported");
        }
    }

    @Override
    public String toString() {
        return "Receipt [details=" + details + "]";
    }
}
