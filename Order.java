package com.tnsif.Shopping.entity;

public class Product {
    private Long id;
    private String productName;
    private double price;
    private String description;
    private int stockQuantity;

    public Product() {
        super();
    }

    public Product(String productName, double price, String description, int stockQuantity) {
        super();
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.stockQuantity = stockQuantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}
