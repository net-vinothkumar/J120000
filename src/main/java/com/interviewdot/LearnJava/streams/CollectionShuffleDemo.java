package com.interviewdot.LearnJava.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionShuffleDemo {
    public static void main(String[] args) {
        // Creating a list
        List<Integer> numbers = new ArrayList<>();
        //Add numbers
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("Sorted ArrayList: " + numbers);

        Collections.shuffle(numbers);
        System.out.println("ArrayList using shuffle: " + numbers);
    }
}
