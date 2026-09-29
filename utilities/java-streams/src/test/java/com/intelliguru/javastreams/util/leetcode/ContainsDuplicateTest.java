package com.intelliguru.javastreams.util.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateTest {
    private ContainsDuplicate containsDuplicate;
    @BeforeEach
    void setUp() {
        containsDuplicate = new ContainsDuplicate();
    }

    @Test
    void shouldReturnTrueWhenDuplicateExists() {
        int[] nums = {1, 2, 3, 1};

        boolean result = containsDuplicate.processContainsDuplicate(nums);

        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenAllElementsAreUnique() {
        int[] nums = {1, 2, 3, 4};

        boolean result = containsDuplicate.processContainsDuplicate(nums);

        assertFalse(result);
    }

    @Test
    void shouldReturnTrueWhenMultipleDuplicatesExist() {
        int[] nums = {1, 2, 3, 1, 2, 3};

        boolean result = containsDuplicate.processContainsDuplicate(nums);

        assertTrue(result);
    }

    @Test
    void shouldReturnTrueWhenConsecutiveDuplicatesExist() {
        int[] nums = {1, 2, 2, 3, 4};

        boolean result = containsDuplicate.processContainsDuplicate(nums);

        assertTrue(result);
    }

    @Test
    void shouldReturnTrueWhenAllElementsAreSame() {
        int[] nums = {5, 5, 5, 5};

        boolean result = containsDuplicate.processContainsDuplicate(nums);

        assertTrue(result);
    }

    @Test
    void shouldReturnFalseForSingleElement() {
        int[] nums = {1};

        boolean result = containsDuplicate.processContainsDuplicate(nums);

        assertFalse(result);
    }

    @Test
    void shouldReturnFalseForEmptyArray() {
        int[] nums = {};

        boolean result = containsDuplicate.processContainsDuplicate(nums);

        assertFalse(result);
    }

    @Test
    void shouldHandleNegativeNumbersWithDuplicate() {
        int[] nums = {-1, -2, -3, -1};

        boolean result = containsDuplicate.processContainsDuplicate(nums);

        assertTrue(result);
    }

    @Test
    void shouldHandleNegativeNumbersWithoutDuplicate() {
        int[] nums = {-1, -2, -3, -4};

        boolean result = containsDuplicate.processContainsDuplicate(nums);

        assertFalse(result);
    }

    @Test
    void shouldHandleZeroAsDuplicate() {
        int[] nums = {0, 1, 2, 0};

        boolean result = containsDuplicate.processContainsDuplicate(nums);

        assertTrue(result);
    }

    @Test
    void shouldHandlePositiveNegativeAndZeroValues() {
        int[] nums = {-1, 0, 1, 2, -1};

        boolean result = containsDuplicate.processContainsDuplicate(nums);

        assertTrue(result);
    }

    @Test
    void shouldReturnTrueWhenDuplicateIsAtEnd() {
        int[] nums = {1, 2, 3, 4, 4};

        boolean result = containsDuplicate.processContainsDuplicate(nums);

        assertTrue(result);
    }


    // Put your method here if you're keeping everything
    // in one simple Java class for practice.

    @Test
    void shouldReturnTrueWhenDuplicateElementsAreFarApart() {
        int[] nums = {10, 20, 30, 40, 50, 10};

        boolean result = containsDuplicate.processContainsDuplicate(nums);

        assertTrue(result);
    }
}