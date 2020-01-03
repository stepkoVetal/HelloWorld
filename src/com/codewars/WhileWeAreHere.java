package com.codewars;

import java.util.Random;

class WhileWeAreHere {

    public static void main(String[] args) {

        // Creating a random number generator
        Random randomGenerator = new Random();

        // Generate a number between 1 and 6
        int dieRoll = randomGenerator.nextInt(6) + 1;

        // Repeat while roll isn't 5
        while (dieRoll != 5) {
            System.out.println("Before: " + dieRoll);
            dieRoll = randomGenerator.nextInt(6);
            System.out.println("After: " + dieRoll);

        }

    }

}