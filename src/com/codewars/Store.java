package com.codewars;

public class Store {
    // instance fields
    String productType;
    int inventoryCount;
    double inventoryPrice;

    // constructor method
    public Store(String product, int count, double price) {
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
    }

    // main method
    public static void main(String[] args) {
        Store lemonadeStand = new Store("lemonade", 42, .99);
        Store cookieShop = new Store("cookies", 12, 3.75);
        Store vetalShop = new Store("Nout", 1, 100.0);

        System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");

        System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");
        System.out.println("Our Vital shop has " + vetalShop.inventoryCount + " units remaining.");
    }
}