package com.interviewdot.LearnJava.streams;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

public class JavaOrElseDemo {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("john", 30L),
                new Person("david", 35L),
                new Person("prasana", 36L)
        );

        Person person = persons.stream()
                .filter(p -> "prasana".equals(p.name))
                .findFirst()
                .orElse(null);

        System.out.println("result = " + person);
    }

    @Data
    @AllArgsConstructor
    static
    class Person {
        private String name;
        private Long age;
    }
}
