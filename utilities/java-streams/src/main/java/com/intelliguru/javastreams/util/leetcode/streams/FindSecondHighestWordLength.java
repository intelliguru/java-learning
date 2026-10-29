package com.intelliguru.javastreams.util.leetcode.streams;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighestWordLength {

    // Find the Second-Highest Word Length Using Java Streams
    // Input = "Java is a powerful programming language"

    public static void main(String[] args) {

        String sentence = "Java is a powerful programming language";
        String[] words = sentence.split(" ");
        int secondHighest =
                Arrays.stream(words)
                        .map(String::length)
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .skip(1)
                        .findFirst()
                        .orElseThrow();

        System.out.println("Second Highest Length of Word Is: "+ secondHighest);
    }
}
