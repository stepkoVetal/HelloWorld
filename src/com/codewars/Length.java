package com.codewars;

import java.util.Arrays;

public class Length {

    String[] topicsM = {"Opinion", "Tech", "Science", "Health"};
    int[] views = {0, 0, 0, 0};

    public Length(){

    }

   public String[] getTopics(){
        return topicsM;
    }

    public int getNumTopics(){
        return topicsM.length;
    }

    public static void main(String[] args){
        Length sampleFeed = new Length();

        System.out.println("The number of topics is "+ sampleFeed.getNumTopics());

    }
}