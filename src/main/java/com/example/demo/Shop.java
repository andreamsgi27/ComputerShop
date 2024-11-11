package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    String shopname = "PC Componentes";
    String propietary = "Andrea";
    String taxId = "B123456789";
    static List <Computer> computerList = new ArrayList<>();
        private static Computer computer;
            
    public static void addPc() {
                Scanner scanner = new Scanner(System.in);
            
                System.out.println("Introduce el modelo del PC: ");
                String brand = scanner.nextLine();
            
                System.out.println("Introduce los GB de RAM: ");
                int ram = scanner.nextInt();
            
                System.out.println("Introduce la marca de procesador: ");
                String processor = scanner.next();
            
                System.out.println("Introduce el precio del PC: ");
                double price = scanner.nextDouble();
                scanner.nextLine();
            
                Computer nuevoPc = new Computer(brand, ram, processor, price);
                computerList.add(nuevoPc);
                System.out.println("Nuevo PC añadido a la lista de la tienda: " + nuevoPc);
    }
        
    public static void removePcByBrand(String brand, List<Computer> computerList){
                if (computer.getBrand().equalsIgnoreCase(brand)) {
            computerList.remove(computer);
        }
    }

    public static void findPcByBrand(String brand){
        for (Computer computer : computerList) {
        if (computer.getBrand().equalsIgnoreCase(brand)){
            System.out.println("El PC de " + brand + " se encuentra en la tienda");
        }}
    }

    public static void getAllPc(List<Computer> computerList){
        System.out.println(computerList);
    }
}
