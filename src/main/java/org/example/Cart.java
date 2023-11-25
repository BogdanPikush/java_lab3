package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public boolean addProduct(Product product) {
        products.add(product);
        return true;
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }
}
