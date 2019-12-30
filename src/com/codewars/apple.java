package com.codewars;

public class apple {
    // instance fields
    String productType;
    double price;

    // constructor method
    public apple(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    // get price with tax method
    public double getPriceWithTax(){
        double tax = 0.08;
        double totalPrice = price + price*tax;
        return totalPrice;
    }

    // main method
    public static void main(String[] args) {
        apple lemonadeStand = new apple("Lemonade", 3.75);
        apple cookieShop = new apple("Cookies", 5);
        System.out.println(lemonadeStand);
        System.out.println(cookieShop);

    }
    public String toString(){
        return "This store sells " + productType + " at a price of " + price +".";

    }
}