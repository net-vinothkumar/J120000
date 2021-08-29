package com.interviewdot.LearnJava.Exception;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8ExceptionDemo {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(3, 9, 7, 0, 10, 20);
        integers.forEach(
                lambdaWrapper(i -> System.out.println(50 / i))
        );
    }
    
    static Consumer<Integer> lambdaWrapper(Consumer<Integer> consumer) {
        return i -> {
            try {
                consumer.accept(i);
            } catch (ArithmeticException e) {
                System.err.println(
                        "Arithmetic Exception occurred : " + e.getMessage());
            }
        };
    }
}
