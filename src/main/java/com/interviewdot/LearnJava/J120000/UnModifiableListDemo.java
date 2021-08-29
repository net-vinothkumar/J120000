package com.interviewdot.LearnJava.AverageDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnModifiableListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));
        List<String> unmodifiableList = Collections.unmodifiableList(list);
        unmodifiableList.add("four"); // TODO ERROR WE CANNOT ADD ELEMENT TO IMMUTABLE LIST  [ READ-ONLY LIST ]
    }
}
