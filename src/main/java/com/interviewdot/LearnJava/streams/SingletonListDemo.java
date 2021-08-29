package com.interviewdot.LearnJava.streams;

import java.util.Collections;
import java.util.List;

public class SingletonListDemo {
    public static void main(String[] args) {
        try {
            List<String> messages = Collections.singletonList("hi");
            messages.add("don't add me");
            System.out.println(messages);
        } catch (UnsupportedOperationException e) {
            System.out.println("Error occurred....");
            System.out.println(e);
        }
    }
}
