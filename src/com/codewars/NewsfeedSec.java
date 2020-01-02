
package com.codewars;
import java.util.Arrays;
public class NewsfeedSec {


    public NewsfeedSec(){

    }

    // Create getTopics() below:
    public String[] getTopics(){
        String[] topics = {"Opinion", "Tech", "Science", "Health"};
        return topics;
    }

    public static void main(String[] args){
        NewsfeedSec sampleFeed = new NewsfeedSec();

        String[] topics = sampleFeed.getTopics();
        String betterPrintout = Arrays.toString(topics);
        System.out.println(betterPrintout);

    }
}
