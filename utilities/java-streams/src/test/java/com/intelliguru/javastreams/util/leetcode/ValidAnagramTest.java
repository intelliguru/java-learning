package com.intelliguru.javastreams.util.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidAnagramTest {
    private ValidAnagram validAnagram;

    @BeforeEach
    void setUp() {
        validAnagram = new ValidAnagram();
    }

    @Test
    void shouldReturnTrueForValidAnagram() {
        String s = "anagram";
        String t = "nagaram";

        boolean result = validAnagram.processValidAnagram(s, t);

        assertTrue(result);
    }

    @Test
    void shouldReturnFalseForInvalidAnagram() {
        String s = "rat";
        String t = "car";

        boolean result = validAnagram.processValidAnagram(s, t);

        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenLengthsAreDifferent() {
        String s = "hello";
        String t = "hell";

        boolean result = validAnagram.processValidAnagram(s, t);

        assertFalse(result);
    }

    @Test
    void shouldReturnTrueForSameString() {
        String s = "java";
        String t = "java";

        boolean result = validAnagram.processValidAnagram(s, t);

        assertTrue(result);
    }

    @Test
    void shouldReturnTrueForSingleSameCharacter() {
        String s = "a";
        String t = "a";

        boolean result = validAnagram.processValidAnagram(s, t);

        assertTrue(result);
    }

    @Test
    void shouldReturnFalseForSingleDifferentCharacter() {
        String s = "a";
        String t = "b";

        boolean result = validAnagram.processValidAnagram(s, t);

        assertFalse(result);
    }

    @Test
    void shouldReturnTrueForEmptyStrings() {
        String s = "";
        String t = "";

        boolean result = validAnagram.processValidAnagram(s, t);

        assertTrue(result);
    }

    @Test
    void shouldReturnTrueWhenCharactersRepeatSameNumberOfTimes() {
        String s = "aabbcc";
        String t = "abcabc";

        boolean result = validAnagram.processValidAnagram(s, t);

        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenCharacterFrequencyIsDifferent() {
        String s = "aacc";
        String t = "ccac";

        boolean result = validAnagram.processValidAnagram(s, t);

        assertFalse(result);
    }

    @Test
    void shouldReturnTrueForReversedString() {
        String s = "abcd";
        String t = "dcba";

        boolean result = validAnagram.processValidAnagram(s, t);

        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenOnlyOneCharacterIsDifferent() {
        String s = "abcd";
        String t = "abce";

        boolean result = validAnagram.processValidAnagram(s, t);

        assertFalse(result);
    }

    @Test
    void shouldReturnTrueForTwoCharactersSwapped() {
        String s = "ab";
        String t = "ba";

        boolean result = validAnagram.processValidAnagram(s, t);

        assertTrue(result);
    }
}