package com.codewars;

import java.util.Arrays;

public class GetElementByIndex {

    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    int[] views = {0, 0, 0, 0};

    public GetElementByIndex(){

    }

    public String[] getTopics(){
        return topics;
    }

    public String getTopTopic(){
        return topics[0];
    }

    public void viewTopic(int topicIndex){
        views[topicIndex] = views[topicIndex] + 1;
    }

    public static void main(String[] args){
        GetElementByIndex sampleFeed = new GetElementByIndex();

        System.out.println("The top topic is "+ sampleFeed.getTopTopic());

        sampleFeed.viewTopic(1);
        sampleFeed.viewTopic(1);
        sampleFeed.viewTopic(3);
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(1);

        System.out.println("The " + sampleFeed.topics[0] + " topic has been viewed " + sampleFeed.views[0] + " times!");
        System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!");
        System.out.println("The " + sampleFeed.topics[2] + " topic has been viewed " + sampleFeed.views[2] + " times!");
        System.out.println("The " + sampleFeed.topics[3] + " topic has been viewed " + sampleFeed.views[3] + " times!");
    }
}

