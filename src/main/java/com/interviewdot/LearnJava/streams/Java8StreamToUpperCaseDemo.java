package com.interviewdot.LearnJava.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Java8StreamToUpperCaseDemo {
    public static void main(String[] args) {
        List<String> petsInLowerCase = List.of("cat",
                "dog", "rabbit", "parrot", "cow", "goat");

        List<String> petsInUpperCase = petsInLowerCase
                .stream()
                .filter(pet -> pet.startsWith("c"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Pet's in UPPERCASE : ");

        petsInUpperCase
                .forEach(System.out::println);
    }
}
