package org.example;

import org.example.factories.shoes.GalaClothesFactory;
import org.example.factories.shoes.SportClothesFactory;
import org.example.products.shirts.GalaShirt;
import org.example.products.shirts.SportShirt;
import org.example.products.shoes.GalaShoe;
import org.example.products.shoes.SportShoe;
import org.example.products.trousers.GalaTrousers;
import org.example.products.trousers.SportTrousers;

public class Main {
    public static void main(String[] args) {

        // Fabrica de ropa deportiva
        ClothesFactory sportClothesFactory = new SportClothesFactory();

        SportShirt sportShirt = (SportShirt) sportClothesFactory.createShirt();
        SportTrousers sportTrousers = (SportTrousers) sportClothesFactory.createTrousers();
        SportShoe sportShoe = (SportShoe) sportClothesFactory.createShoes();

        System.out.println("\n----> Ejemplo ropa deportiva <----");
        sportShirt.hasButtons();
        sportTrousers.getClosureType();
        sportShoe.isRunningShoes();

        // Fabrica de ropa de gala
        ClothesFactory galaClothesFactory = new GalaClothesFactory();

        GalaShirt galaShirt = (GalaShirt) galaClothesFactory.createShirt();
        GalaTrousers galaTrousers = (GalaTrousers) galaClothesFactory.createTrousers();
        GalaShoe galaShoe = (GalaShoe) galaClothesFactory.createShoes();

        System.out.println("\n----> Ejemplo ropa de gala <----");
        galaShirt.hasButtons();
        galaTrousers.getClosureType();
        galaShoe.isRunningShoes();
    }
}