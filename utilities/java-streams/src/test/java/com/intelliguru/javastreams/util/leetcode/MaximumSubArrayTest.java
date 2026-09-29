package com.intelliguru.javastreams.util.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumSubArrayTest {

    private final MaximumSubArray maximumSubArray = new MaximumSubArray();

    @Test
    void shouldReturnMaximumSumForNormalCase() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maximumSubArray.findMaximumSumFromSubArray(nums);

        assertEquals(6, result);
    }

    @Test
    void shouldReturnElementForSingleElementArray() {
        int[] nums = {1};

        int result = maximumSubArray.findMaximumSumFromSubArray(nums);

        assertEquals(1, result);
    }

    @Test
    void shouldReturnNegativeElementForSingleNegativeElement() {
        int[] nums = {-5};

        int result = maximumSubArray.findMaximumSumFromSubArray(nums);

        assertEquals(-5, result);
    }

    @Test
    void shouldReturnSumOfAllElementsWhenAllArePositive() {
        int[] nums = {1, 2, 3, 4, 5};

        int result = maximumSubArray.findMaximumSumFromSubArray(nums);

        assertEquals(15, result);
    }

    @Test
    void shouldReturnLargestElementWhenAllElementsAreNegative() {
        int[] nums = {-8, -3, -6, -2, -5, -4};

        int result = maximumSubArray.findMaximumSumFromSubArray(nums);

        assertEquals(-2, result);
    }

    @Test
    void shouldHandlePositiveAndNegativeNumbers() {
        int[] nums = {5, -2, 3, 4};

        int result = maximumSubArray.findMaximumSumFromSubArray(nums);

        assertEquals(10, result);
    }

    @Test
    void shouldFindMaximumSubArrayAtBeginning() {
        int[] nums = {5, 4, -1, -10, 2};

        int result = maximumSubArray.findMaximumSumFromSubArray(nums);

        assertEquals(9, result);
    }

    @Test
    void shouldFindMaximumSubArrayAtEnd() {
        int[] nums = {-10, -5, 1, 2, 3, 4};

        int result = maximumSubArray.findMaximumSumFromSubArray(nums);

        assertEquals(10, result);
    }

    @Test
    void shouldFindMaximumSubArrayInMiddle() {
        int[] nums = {-10, 4, 5, -2, 6, -20};

        int result = maximumSubArray.findMaximumSumFromSubArray(nums);

        assertEquals(13, result);
    }

    @Test
    void shouldHandleZeros() {
        int[] nums = {0, 0, 0, 0};

        int result = maximumSubArray.findMaximumSumFromSubArray(nums);

        assertEquals(0, result);
    }

    @Test
    void shouldHandleZeroWithNegativeNumbers() {
        int[] nums = {-5, -2, 0, -3, -4};

        int result = maximumSubArray.findMaximumSumFromSubArray(nums);

        assertEquals(0, result);
    }

    @Test
    void shouldHandleZeroWithPositiveNumbers() {
        int[] nums = {0, 2, 3, 0, 4};

        int result = maximumSubArray.findMaximumSumFromSubArray(nums);

        assertEquals(9, result);
    }

    @Test
    void shouldNotIncludeLargeNegativeValue() {
        int[] nums = {4, 5, -100, 10, 20};

        int result = maximumSubArray.findMaximumSumFromSubArray(nums);

        assertEquals(30, result);
    }

    @Test
    void shouldHandleMultiplePossibleSubArrays() {
        int[] nums = {2, -1, 2, 3, -10, 5, 6};

        int result = maximumSubArray.findMaximumSumFromSubArray(nums);

        assertEquals(11, result);
    }

    @Test
    void shouldHandleAlternatingPositiveAndNegativeNumbers() {
        int[] nums = {1, -1, 1, -1, 1};

        int result = maximumSubArray.findMaximumSumFromSubArray(nums);

        assertEquals(1, result);
    }

    @Test
    void shouldKeepSmallNegativeNumberWhenOverallSumIsBetter() {
        int[] nums = {5, -1, 5};

        int result = maximumSubArray.findMaximumSumFromSubArray(nums);

        assertEquals(9, result);
    }
}