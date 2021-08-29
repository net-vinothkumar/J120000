package com.interviewdot.LearnJava.Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithDemo {
    public static void main(String[] args) throws IOException {
        readFile();
    }

    private static String readFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
