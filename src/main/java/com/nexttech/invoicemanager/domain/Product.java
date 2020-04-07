package com.nexttech.invoicemanager.domain;

import javax.persistence.Id;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Product {
    @Id
    private long productNumber;
    private String name;
    private double price;
    private List<Product> Products;
    public Company company;
    public Random random = new Random();

    public String generateProductNames(){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int stringLength = 5;
        Random random = new Random();
        StringBuilder name = new StringBuilder(stringLength);
        for (int i = 0; i < stringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            name.append((char) randomLimitedInt);
        }
        return name.toString();
    }

    public void generateProducts() {
        for (int i = 1; i <= 48; i++) {
            Product product = new Product();
            product.setName(generateProductNames());
            product.setPrice(0.1 + (999.9 - 0.1) * random.nextDouble()); // this generates the double in a range
            Products.add(product);
        }
    }

    public long getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(long productNumber) {
        this.productNumber = productNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Product> getProducts() {
        return Products;
    }

    public void setProducts(List<Product> products) {
        Products = products;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNumber=" + productNumber +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", Products=" + Products +
                '}';
    }
}
