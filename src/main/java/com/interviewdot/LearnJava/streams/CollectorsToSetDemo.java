package com.interviewdot.LearnJava.streams;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsToSetDemo {
    public static void main(String[] args) {
        Stream<String> strings = Stream.of(
                "Interview",
                "DOT",
                "Java",
                "DOT",
                "Share",
                "DOT"
        );

        Set<String> uniqueItems = strings.collect(Collectors.toSet());

        System.out.println(uniqueItems);
    }
}
