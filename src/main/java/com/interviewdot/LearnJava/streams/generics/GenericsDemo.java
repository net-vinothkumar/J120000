package com.interviewdot.LearnJava.streams.generics;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        List<Long> longNumbers = new ArrayList<>();
        List<Boolean> flags = new ArrayList<>();
        List<Character> characters = new ArrayList<>();
        List<Subscriber> subscribers = new ArrayList<>();
        List<Double> doubleNumbers = new ArrayList<>();
    }

    @Data
    public static class Subscriber {
        private String id;
        private String name;
    }
}
