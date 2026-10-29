package com.intelliguru.util;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class FinallyReturnDemo {


    public static int getValue() {
        try {
            return 10;
        } finally {
            return 20;
        }
    }

    public static void main(String[] args) {

        int[] numbers = {10, 30, 20, 50, 50, 40};

        Optional<Integer> result = Arrays.stream(numbers)
                .distinct().
                boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();


        System.out.println("Hello World");

        String str = "programming";

     Optional<Character> result1 =   str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                )).entrySet()
                .stream()
                .filter(entry -> entry.getValue() ==1)
                .map(Map.Entry::getKey)
                .findFirst();
                //.forEach((key, value) -> System.out.println(key + " : "+ value));
        System.out.println(result);

    }
}
