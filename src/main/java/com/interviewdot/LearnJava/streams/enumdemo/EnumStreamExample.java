package com.interviewdot.LearnJava.streams.enumdemo;

public class EnumStreamExample {
    public static void main(String[] args) {
        DaysOfWeekEnum.stream()
                .filter(day -> day.getTypeOfDay().equals("working"))
                .forEach(System.out::println);
    }
}
