package com.example.designpatterns.patterns;

public class Order {

    private int quantity;
    private String product;
    private boolean giftWrap;

    private Order(Builder builder) {
        this.quantity = quantity;
        this.product = product;
        this.giftWrap = giftWrap;
    }

    public static class Builder {
        private String product;
        private int quantity;
        private boolean giftWrap;
        private String color;
        private String deliveryType;

        public Builder product(String product) {
            this.product = product;
            return this;
        }

        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder giftWrap(boolean giftWrap) {
            this.giftWrap = giftWrap;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder deliveryType(String deliveryType) {
            this.deliveryType = deliveryType;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
