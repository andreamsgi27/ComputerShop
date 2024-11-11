package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    String shopname = "PC Componentes";
    String propietary = "Andrea";
    String taxId = "B123456789";
    static List <Computer> computerList = new ArrayList<>();
            
    public static void addPc(String brand, int ram, String processor, double price) {
        Computer nuevoPc = new Computer(brand, ram, processor, price);
        computerList.add(nuevoPc);
        System.out.println("Nuevo PC añadido: " + nuevoPc);
    }
        
    public static String removePcByBrand(String brand, List<Computer> computerList){
        for (int i = 0; i < computerList.size(); i++) {
            Computer computer = computerList.get(i);
            
            if (computer.getBrand().equalsIgnoreCase(brand)) {
                computerList.remove(i);
                return "Ordenador eliminado: " + computer;
            }
        }
        return "No se encontró ningún ordenador de la marca: " + brand;
    }
    

    public static String findPcByBrand(String brand){
        for (Computer computer : computerList) {
        if (computer.getBrand().equalsIgnoreCase(brand)){
            return "El PC de " + brand + " se encuentra en la tienda";
        }}
        return "No se encontró ningún ordenador de la marca: " + brand;
    }

    public static void getAllPc(List<Computer> computerList){
        System.out.println(computerList);
    }
}
