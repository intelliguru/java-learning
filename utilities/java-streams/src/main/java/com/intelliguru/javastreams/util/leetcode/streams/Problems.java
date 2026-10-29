package com.intelliguru.javastreams.util.leetcode.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problems {

    private void filterEvenNumbers(){
        List<Integer> numbers =
                Arrays.asList(10, 15, 20, 25, 30, 35, 40);

        List<Integer> result = numbers.stream()
                .filter(number -> number%2==0)
                .toList();
    }
    private void convertToUpperCase() {
        List<String> names =
                Arrays.asList("java", "spring", "aws", "kafka");
        List<String> result = names.stream()
                .map(String::toUpperCase)
                .toList();
    }
    private void greaterThan10AndSquare(){
        List<Integer> numbers =
                Arrays.asList(5, 12, 8, 20, 3, 15);

        List<Integer> result = numbers.stream()
                .filter(number -> number>10)
                .map(number -> number * number)
                .toList();
    }

    private void filterSecondHighest(){
        List<Integer> numbers =
                Arrays.asList(10, 5, 20, 8, 20, 15);

        Integer result = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
    }
    private void filterSecondHighestLengthOfWord(){
        String sentence = "my name is Balkrisha";
        String[] word = sentence.split(" ");


        int result = Arrays.stream(word)
                .map(String::length)
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);
    }


    private void findDuplicate(){
        List<Integer> numbers =
                Arrays.asList(10, 20, 10, 30, 20, 40, 50);
        Set<Integer> seen = new HashSet<>();

        List<Integer> result = numbers.stream()
                .filter(number -> !seen.add(number))
                .toList();
    }

    private void countFrequency() {
        List<String> names =
                Arrays.asList("Java", "Spring", "Java", "AWS", "Spring", "Java");

        Map<String, Long> frequesny = names.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
    }

    private void findMax(){
        List<Integer> numbers =
                Arrays.asList(10, 45, 20, 67, 32);
        Integer result = numbers.stream()
                .max(Integer::compareTo)
                .orElse(null);
    }

    public static void main(String[] args) {
        Problems problems = new Problems();
        problems.filterSecondHighestLengthOfWord();
    }


}
