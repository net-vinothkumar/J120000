package com.interviewdot.LearnJava.AverageDemo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListWithNull {
    public static void main(String[] args) {
        Stream<String> languages = Stream.of(
                null, "Java", "Python", "Node", null, "Ruby", "Php", null
        );
        List<String> result = languages.collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
