package com.interviewdot.LearnJava.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindLastElementDemo {
    public static void main(String[] args) {
        List<String> programmingLanguages = List.of(
                "Java", "Python", "Rust", "JavaScript",
                "Kotlin", "Scala"
        );
        Optional<String> lastLongestName = programmingLanguages
                .stream()
                .sorted(Comparator.comparing(String::length))
                .peek(System.out::println)
                .skip(programmingLanguages.size() - 1)
                .findFirst(); // "JavaScript"

        System.out.println("");
        lastLongestName.ifPresent(System.out::println);
    }
}





    


















