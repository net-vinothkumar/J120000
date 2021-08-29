package com.interviewdot.LearnJava.AverageDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterNullFromListDemo {
    public static void main(String[] args) {
        Stream<String> languages = Stream.of(
                null, "Java", "Python", "Node", null, "Ruby", "Php", null
        );

        List<String> result = languages
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
