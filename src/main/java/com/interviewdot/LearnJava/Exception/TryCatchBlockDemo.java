package com.interviewdot.LearnJava.Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchBlockDemo {
    public static void main(String[] args) throws IOException {
        readFile();
    }

    private static String readFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        try {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Will still be executed after the return!
            if (br != null) {
                br.close();
            }
        }
        return null;
    }
}
