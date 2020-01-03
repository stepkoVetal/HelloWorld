package com.codewars;

import java.util.ArrayList;

class GettingAnItemIndex {

    public static void main(String[] args) {

        // Sherlock
        ArrayList<String> sherlocksToDos = new ArrayList<String>();

        sherlocksToDos.add("visit the crime scene");
        sherlocksToDos.add("play violin");
        sherlocksToDos.add("interview suspects");
        sherlocksToDos.add("listen to Dr. Watson for amusement");
        sherlocksToDos.add("solve the case");
        sherlocksToDos.add("apprehend the criminal");

        sherlocksToDos.remove("visit the crime scene");

        // Calculate to-dos until case is solved:
        sherlocksToDos.indexOf("solve the case");

        // Change the value printed:
        System.out.println(sherlocksToDos.indexOf("solve the case"));
        /*
        Nice work! You now know the basics of ArrayLists including:

            Creating an ArrayList.
            Adding a new ArrayList item using add().
            Accessing the size of an ArrayList using size().
            Finding an item by index using get().
            Changing the value of an ArrayList item using set().
            Removing an item with a specific value using remove().
            Retrieving the index of an item with a specific value using indexOf().
         */

    }

}