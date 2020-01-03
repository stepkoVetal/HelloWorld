package com.codewars;

import java.util.ArrayList;

class ForEachLoops {

    public static void main(String[] args) {

        ArrayList<Double> apples = new ArrayList<Double>();
        apples.add(74.46);
        apples.add(63.99);
        apples.add(10.57);
        apples.add(81.37);
        apples.add(101.57);

        double mostExpensive = 0;

        // Iterate over expenses
        for (double apple : apples) {
            if (apple > mostExpensive) {
                mostExpensive = apple;
            }
        }

        System.out.println(mostExpensive);

    }

}