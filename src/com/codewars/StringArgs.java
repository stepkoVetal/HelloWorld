package com.codewars;

import java.util.Arrays;

public class StringArgs {

    String[] topics;

    public StringArgs(String[] initialTopics) {
        topics = initialTopics;
    }

    public static void main(String[] args) {
        StringArgs feed;
        if (args[0].equals("Human")) {

            //topics for a Human feed:
            String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
            feed = new StringArgs(humanTopics);

        } else if(args[0].equals("Robot")) {

            //topics for a Robot feed:
            String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
            feed = new StringArgs(robotTopics);

        } else {
            String[] genericTopics = {"Opinion", "Tech", "Science", "Health"};
            feed = new StringArgs(genericTopics);
        }

        System.out.println("The topics in this feed are:");
        System.out.println(Arrays.toString(feed.topics));
    }
}
