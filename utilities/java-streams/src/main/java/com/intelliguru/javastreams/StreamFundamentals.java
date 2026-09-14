package com.intelliguru.javastreams;





import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


public class StreamFundamentals {
    public static void main(String[] args) {

        //streamIntroduction();
        //processStreamMultipleTime();
        //streamLaziness();
        //elementsMovementThroughSteamPipeline();
        //shortCircuitingInStream();
        doesStreamModifyCollections();
    }

    private static void streamIntroduction() {
        List<Integer> numbers =
                List.of(1, 2, 3, 4, 5);

        List<Integer> result = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                number = number * 10;
                result.add(number);
            }
        }

//        List<Integer> result = numbers.stream()
//                .filter(n -> n % 2 == 0)
//                .map(n -> n * 10)
//                .toList();

        System.out.println("Result: "+ result);
    }

    private static void processStreamMultipleTime(){
        List<Integer> numbers =
                List.of(1, 2, 3, 4, 5);
        Stream<Integer> stream = numbers.stream();

        stream.forEach(System.out::println);
        stream.forEach(System.out::println);



//        numbers.stream().forEach(System.out::println);
//        numbers.stream().forEach(System.out::println);
    }

    private static void streamLaziness(){
        List<Integer> numbers =
                List.of(1, 2, 3, 4, 5);
        Stream<Integer> stream = numbers.stream()
                .filter(n -> {
                    System.out.println("Filtering: " + n);
                    return n % 2 == 0;
                });


        //stream.toList();
    }

    private static void elementsMovementThroughSteamPipeline(){
        List<Integer> numbers =
                List.of(1, 2, 3, 4, 5);

        numbers.stream()
                .filter(n -> {
                    System.out.println("FILTER → " + n);

                    boolean result = n % 2 == 0;
                    if(result){
                        System.out.println("Condition passed for number → " + n);
                    }
                    return result;
                })
                .map(n -> {
                    System.out.println("MAP → " + n);
                    return n * 10;
                })
                .toList();
    }

    private static void shortCircuitingInStream(){

        List<Integer> numbers =
                List.of(1, 2, 3, 4, 5);

        Optional<Integer> result = numbers.stream()
                .filter(n -> {
                    System.out.println("Filtering → " + n);
                    return n % 2 == 0;
                })
                .findFirst();

    }

    private static void doesStreamModifyCollections(){

        List<Integer> numbers =
                new ArrayList<>(List.of(1, 2, 3, 4, 5));

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 10)
                .toList();

        System.out.println("Original: " + numbers);
        System.out.println("Result: " + result);
    }
}
