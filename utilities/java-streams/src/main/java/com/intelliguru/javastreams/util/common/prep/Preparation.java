package com.intelliguru.javastreams.util.common.prep;

import com.intelliguru.javastreams.util.common.prep.interfaces.Adder;
import com.intelliguru.javastreams.util.common.prep.interfaces.Printer;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Preparation {

    public static void main(String[] args) {
//        List<Integer> numList = List.of(1, 2, 3, 4, 5, 6,7,8,9,10);
//        Optional<Integer> res = numList.stream().reduce(Integer::sum);
//
//        //////////
//
//        String sentence = "Java Programming is very easy";
//        String[] words = sentence.split(" ");
//        int result = Arrays.stream(words)
//                .map(String::length)
//                .sorted(Comparator.reverseOrder())
//                .distinct()
//                .skip(1)
//                .findFirst()
//                .orElse(null);
//
//        System.out.println("Second Highest Word Length :" + result);
//
//        functionalInterfaceExample();

        secondHighestNum();
    }

    private static void functionalInterfaceExample() {
        //1. Traditional Anonymous inner class approach
        Printer p1 = new Printer() {
            @Override
            public void print(String message) {
                System.out.println("Old way: " + message);
            }
        };

        // 2. Modern Lambda Expression Approach
        Printer p2 = message -> System.out.println("Modern Way: " + message);
        p1.print("Hi I am from Old");
        p2.print("Hi I am from modern");
    }

    private static void lambdaExpressionExample() {
        //1. Traditional way
        Adder adder1 = new Adder() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };

        Adder adder2 = (a, b) -> a + b;
        System.out.println(adder2.add(30, 70));

        //Qu: Can a lambda access a local variable?
        // Yes
        int multiplier = 10;
        Function<Integer, Integer> multiply = n -> n * multiplier;
        System.out.println(multiply.apply(13));

    }

    private static void functionalInterfaceLambdaExpressionAndStream() {

    }


    private static void secondHighestNum(){
        String str = "swiss";
        Map<Character, Long> result = str.chars()
                .mapToObj(c-> (char) c).collect(
                Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
    }































}
