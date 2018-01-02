package com.andben;

public class Addition {
    private String name;
    private int count;
    private double price;

    public Addition(String name, int count, double price) {
        this.name = name;
        this.count = count;
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
