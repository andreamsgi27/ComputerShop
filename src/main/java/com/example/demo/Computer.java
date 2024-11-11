package com.example.demo;

public class Computer {
    String brand;
    int ram;
    String processor;
    double price;

    public Computer(String brand, int ram, String processor, double price) {
        this.brand = brand;
        this.ram = ram;
        this.processor = processor;
        this.price = price;
        }

    public Computer() {
    }

    public String getBrand() {
        return brand;
    }
}
