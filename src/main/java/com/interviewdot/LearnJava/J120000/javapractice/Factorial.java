package com.interviewdot.LearnJava.J120000.javapractice;

public class Factorial {
    public static void main(String[] args) {
        Integer number = 5;
        System.out.println("Factorial Number = " + factorial(number));
    }

    private static Integer factorial(Integer number) {
        Integer factorialResult = 1;
        for (int i = 1; i <= number; i++) {
            factorialResult *= i;
        }
        return factorialResult;
    }
}
