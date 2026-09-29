package com.intelliguru.javastreams.util.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {
    
    private TwoSum twoSum;
    
    @BeforeEach
    void setUp(){
        twoSum = new TwoSum();
    }

    @Test
    void shouldFindTwoNumbersAtBeginning() {
        int[] numbers = {2, 7, 11, 15};

        int[] result = twoSum.processTwoSum(numbers, 9);

        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void shouldFindTwoNumbersInMiddle() {
        int[] numbers = {1, 3, 5, 7, 9};

        int[] result = twoSum.processTwoSum(numbers, 12);

        assertArrayEquals(new int[]{2, 3}, result);
    }

    @Test
    void shouldFindTwoNumbersAtEnd() {
        int[] numbers = {1, 2, 3, 7, 8};

        int[] result = twoSum.processTwoSum(numbers, 15);

        assertArrayEquals(new int[]{3, 4}, result);
    }

    @Test
    void shouldReturnEmptyArrayWhenNoSolutionExists() {
        int[] numbers = {1, 2, 3, 4};

        int[] result = twoSum.processTwoSum(numbers, 100);

        assertArrayEquals(new int[]{}, result);
    }

    @Test
    void shouldHandleDuplicateNumbers() {
        int[] numbers = {3, 3};

        int[] result = twoSum.processTwoSum(numbers, 6);

        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void shouldHandleMultipleDuplicateNumbers() {
        int[] numbers = {3, 3, 3, 3};

        int[] result = twoSum.processTwoSum(numbers, 6);

        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void shouldHandleNegativeNumbers() {
        int[] numbers = {-3, 4, 3, 90};

        int[] result = twoSum.processTwoSum(numbers, 0);

        assertArrayEquals(new int[]{0, 2}, result);
    }

    @Test
    void shouldHandleNegativeTarget() {
        int[] numbers = {-5, -2, -3, 7};

        int[] result = twoSum.processTwoSum(numbers, -8);

        assertArrayEquals(new int[]{0, 2}, result);
    }

    @Test
    void shouldHandleZeroValues() {
        int[] numbers = {0, 4, 3, 0};

        int[] result = twoSum.processTwoSum(numbers, 0);

        assertArrayEquals(new int[]{0, 3}, result);
    }

    @Test
    void shouldHandlePositiveAndNegativeNumbers() {
        int[] numbers = {-10, 5, 15, 20};

        int[] result = twoSum.processTwoSum(numbers, 10);

        assertArrayEquals(new int[]{0, 3}, result);
    }

    @Test
    void shouldReturnFirstMatchingPairWhenMultipleSolutionsExist() {
        int[] numbers = {1, 2, 3, 4, 5};

        int[] result = twoSum.processTwoSum(numbers, 6);

        // 1 + 5 = 6 is encountered first
        assertArrayEquals(new int[]{1, 3}, result);
    }

    @Test
    void shouldHandleTwoElementsWithSolution() {
        int[] numbers = {5, 10};

        int[] result = twoSum.processTwoSum(numbers, 15);

        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void shouldHandleTwoElementsWithoutSolution() {
        int[] numbers = {5, 10};

        int[] result = twoSum.processTwoSum(numbers, 20);

        assertArrayEquals(new int[]{}, result);
    }

    @Test
    void shouldHandleSingleElement() {
        int[] numbers = {5};

        int[] result = twoSum.processTwoSum(numbers, 10);

        assertArrayEquals(new int[]{}, result);
    }

    @Test
    void shouldHandleEmptyArray() {
        int[] numbers = {};

        int[] result = twoSum.processTwoSum(numbers, 10);

        assertArrayEquals(new int[]{}, result);
    }


//    private static int[] twoSum.processTwoSum(int[] numbers, int target) {
//        for (int i = 0; i < numbers.length - 1; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (numbers[i] + numbers[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[]{};
//    }
}