package com.codewars;

public class OrderSwitch {
    boolean isFilled;
    double billAmount;
    String shipping;

    public OrderSwitch(boolean filled, double cost, String shippingMethod) {
        if (cost > 24.00) {
            System.out.println("High value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
    }

    public void ship() {
        if (isFilled) {
            System.out.println("Shipping");
            System.out.println("Shipping cost: " + calculateShipping());
        } else {
            System.out.println("Order not ready");
        }
    }

    public double calculateShipping() {
        double shippingCost;
        // declare switch statement here
        switch (shipping) {
            case "Regular":
                shippingCost = 0;
                break;
            case "Express":
                shippingCost = 1.75;
                break;
            default:
                shippingCost = 0.50;
        }

        return shippingCost;
    }

    public static void main(String[] args) {
        // do not alter the main method!
        OrderSwitch book = new OrderSwitch(true, 9.99, "Express");
        OrderSwitch chemistrySet = new OrderSwitch(false, 72.50, "Regular");
        book.ship();
        chemistrySet.ship();
        OrderSwitch My = new OrderSwitch(false, 150.00, "Regular");
        OrderSwitch My2 = new OrderSwitch(true, 10.00, "Express");
        System.out.println(My2.calculateShipping());
        My.ship();
        My2.ship();
    }
}