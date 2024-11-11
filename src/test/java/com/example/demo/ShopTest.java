package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShopTest {
    private Shop shop;
    
    @BeforeEach
    public void init(){
        this.shop = new Shop();
    }

    @Test
    void addPcTest(){
        String brand = "HP";
        int ram = 16;
        String processor = "Intel";
        double price = 1000;
        List<Computer> testList = new ArrayList<>();
        Shop.addPc(brand, ram, processor, price);
        assertThat(testList.size() == 1);
    }

    @Test
    void removePcByBrandTest(){
        
        Computer computer1 = new Computer("HP", 16, "Intel", 1000);
        Computer computer2 = new Computer("Samsung", 18, "Intel", 1500);
        List<Computer> testList = new ArrayList<>();
        testList.add(computer1);
        testList.add(computer2);
        Shop.removePcByBrand("HP", testList);

        assertThat(testList.size() == 1);
        assertTrue(testList.contains(computer2));
    }

    @Test
    void removePcByBrandNotAbleTest(){
        
        Computer computer1 = new Computer("HP", 16, "Intel", 1000);
        Computer computer2 = new Computer("Samsung", 18, "Intel", 1500);
        List<Computer> testList = new ArrayList<>();
        testList.add(computer1);
        testList.add(computer2);
        String result = Shop.removePcByBrand("Apple", testList);

        assertThat(testList.size() == 1);
        assertEquals(result, "No se encontró ningún ordenador de la marca: Apple");
    }

    @Test
    void findPcByBrandTest(){
        
        Computer computer1 = new Computer("HP", 16, "Intel", 1000);
        Computer computer2 = new Computer("Samsung", 18, "Intel", 1500);
        List<Computer> testList = new ArrayList<>();
        testList.add(computer1);
        testList.add(computer2);
        Shop.findPcByBrand("HP");

        assertThat(testList.size() == 1);
        assertTrue(testList.contains(computer2));
    }

    @Test
    void findPcByBrandNotFoundTest(){
        
        Computer computer1 = new Computer("HP", 16, "Intel", 1000);
        Computer computer2 = new Computer("Samsung", 18, "Intel", 1500);
        List<Computer> testList = new ArrayList<>();
        testList.add(computer1);
        testList.add(computer2);
        String brand = "Apple";
        String result = Shop.findPcByBrand(brand);
        
        assertEquals(result, "No se encontró ningún ordenador de la marca: Apple");
        
    }


    @Test
    void getAllPcTest(){
        
        Computer computer1 = new Computer("HP", 16, "Intel", 1000);
        Computer computer2 = new Computer("Samsung", 18, "Intel", 1500);
        List<Computer> testList = new ArrayList<>();
        testList.add(computer1);
        testList.add(computer2);
        Shop.getAllPc(testList);

        assertThat(testList.size() == 2);
        assertTrue(testList.contains(computer1));
        assertTrue(testList.contains(computer2));
    }
}
