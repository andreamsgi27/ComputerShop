package com.example.demo;

public class Computer {
    String brand;
    int ram;
    String processor;
    Double price;

    public Computer(String brand, int ram, String processor, Double price) {
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

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
        
}
