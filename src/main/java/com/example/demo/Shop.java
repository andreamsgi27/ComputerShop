package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    String shopname = "PC Componentes";
    String propietary = "Andrea";
    String taxId = "B123456789";
    List <Computer> computerList = new ArrayList<>();

    public void addPc(List<Computer> computerList) {
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

        Computer nuevoPc = new Computer();
        computerList.add(nuevoPc);
        System.out.println("Nuevo PC añadido a la lista de la tienda: " + nuevoPc);

    }

    public void removePcByBrand(){

    }

    public void findPcByBrand(){

    }

    public void getAllPc(){

    }
}
