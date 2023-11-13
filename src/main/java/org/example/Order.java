package org.example;

import java.util.List;

public class Order {
    private int orderId;
    private List<Product> products;
    private String status;

    public Order(List<Product> products) {
        this.products = products;
        this.status = "pending";
    }

    public int getOrderId() {
        return orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getStatus() {
        return status;
    }

    private int generationOrderId() {
        return (int) (Math.random() * 1000);
    }

    public void boughtOrder() {
        this.orderId = generationOrderId();
        this.status = "bought";
    }
}
