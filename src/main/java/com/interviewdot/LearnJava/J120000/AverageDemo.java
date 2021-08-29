package com.interviewdot.LearnJava.AverageDemo;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.OptionalDouble;

public class AverageDemo {
    public static void main(String[] args) {
        Student john = Student.builder().name("John").gender(GENDER.MALE).marks(435L).build();
        Student alex = Student.builder().name("Alex").gender(GENDER.MALE).marks(460L).build();
        Student maria = Student.builder().name("Maria").gender(GENDER.FEMALE).marks(489L).build();
        Student sina = Student.builder().name("Sina").gender(GENDER.FEMALE).marks(477L).build();

        List<Student> students = List.of(john, alex, maria, sina);

        OptionalDouble average = students.stream()
                .filter(student -> student.gender.equals(GENDER.FEMALE))
                .mapToLong(Student::getMarks)
                .average();

        System.out.println("The Average Of Girl's = " + average.orElse(0L));
    }

    @Data
    @Builder
    private static class Student {
        private String name;
        private GENDER gender;
        private Long marks;
    }

    private enum GENDER {
        MALE,
        FEMALE
    }
}
