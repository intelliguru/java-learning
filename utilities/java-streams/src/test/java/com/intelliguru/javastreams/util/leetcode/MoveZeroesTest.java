package com.intelliguru.javastreams.util.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZeroesTest {

    private final MoveZeroes moveZeroes = new MoveZeroes();

    @Test
    void shouldMoveZeroesToEnd() {
        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes.processMoveZeroes(nums);

        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }

    @Test
    void shouldHandleSingleZero() {
        int[] nums = {0};

        moveZeroes.processMoveZeroes(nums);

        assertArrayEquals(new int[]{0}, nums);
    }

    @Test
    void shouldHandleSingleNonZeroElement() {
        int[] nums = {5};

        moveZeroes.processMoveZeroes(nums);

        assertArrayEquals(new int[]{5}, nums);
    }

    @Test
    void shouldHandleArrayWithNoZeroes() {
        int[] nums = {1, 2, 3, 4, 5};

        moveZeroes.processMoveZeroes(nums);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, nums);
    }

    @Test
    void shouldHandleArrayWithAllZeroes() {
        int[] nums = {0, 0, 0, 0};

        moveZeroes.processMoveZeroes(nums);

        assertArrayEquals(new int[]{0, 0, 0, 0}, nums);
    }

    @Test
    void shouldMoveZeroAtBeginningToEnd() {
        int[] nums = {0, 1, 2, 3};

        moveZeroes.processMoveZeroes(nums);

        assertArrayEquals(new int[]{1, 2, 3, 0}, nums);
    }

    @Test
    void shouldKeepZeroAtEnd() {
        int[] nums = {1, 2, 3, 0};

        moveZeroes.processMoveZeroes(nums);

        assertArrayEquals(new int[]{1, 2, 3, 0}, nums);
    }

    @Test
    void shouldMoveMultipleConsecutiveZeroes() {
        int[] nums = {1, 0, 0, 0, 2, 3};

        moveZeroes.processMoveZeroes(nums);

        assertArrayEquals(new int[]{1, 2, 3, 0, 0, 0}, nums);
    }

    @Test
    void shouldHandleZeroesAtBeginning() {
        int[] nums = {0, 0, 1, 2, 3};

        moveZeroes.processMoveZeroes(nums);

        assertArrayEquals(new int[]{1, 2, 3, 0, 0}, nums);
    }

    @Test
    void shouldHandleZeroesAtEnd() {
        int[] nums = {1, 2, 3, 0, 0};

        moveZeroes.processMoveZeroes(nums);

        assertArrayEquals(new int[]{1, 2, 3, 0, 0}, nums);
    }

    @Test
    void shouldHandleAlternatingZeroes() {
        int[] nums = {0, 1, 0, 2, 0, 3, 0};

        moveZeroes.processMoveZeroes(nums);

        assertArrayEquals(new int[]{1, 2, 3, 0, 0, 0, 0}, nums);
    }

    @Test
    void shouldMaintainRelativeOrderOfNonZeroElements() {
        int[] nums = {4, 0, 1, 0, 3, 0, 2};

        moveZeroes.processMoveZeroes(nums);

        assertArrayEquals(new int[]{4, 1, 3, 2, 0, 0, 0}, nums);
    }

    @Test
    void shouldHandleNegativeNumbers() {
        int[] nums = {0, -1, 0, -2, 3};

        moveZeroes.processMoveZeroes(nums);

        assertArrayEquals(new int[]{-1, -2, 3, 0, 0}, nums);
    }

    @Test
    void shouldHandlePositiveAndNegativeNumbers() {
        int[] nums = {-1, 0, 2, 0, -3, 4};

        moveZeroes.processMoveZeroes(nums);

        assertArrayEquals(new int[]{-1, 2, -3, 4, 0, 0}, nums);
    }

    @Test
    void shouldHandleEmptyArray() {
        int[] nums = {};

        moveZeroes.processMoveZeroes(nums);

        assertArrayEquals(new int[]{}, nums);
    }
}