package com.intelliguru.javastreams.util.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    private final ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    void shouldReturnTrueForSimplePalindrome() {
        String s = "madam";

        boolean result = validPalindrome.processValidPalindrome(s);

        assertTrue(result);
    }

    @Test
    void shouldReturnFalseForNonPalindrome() {
        String s = "hello";

        boolean result = validPalindrome.processValidPalindrome(s);

        assertFalse(result);
    }

    @Test
    void shouldIgnoreSpacesPunctuationAndCase() {
        String s = "A man, a plan, a canal: Panama";

        boolean result = validPalindrome.processValidPalindrome(s);

        assertTrue(result);
    }

    @Test
    void shouldReturnFalseForLeetCodeExample() {
        String s = "race a car";

        boolean result = validPalindrome.processValidPalindrome(s);

        assertFalse(result);
    }

    @Test
    void shouldReturnTrueForSingleCharacter() {
        String s = "a";

        boolean result = validPalindrome.processValidPalindrome(s);

        assertTrue(result);
    }

    @Test
    void shouldReturnTrueForEmptyString() {
        String s = "";

        boolean result = validPalindrome.processValidPalindrome(s);

        assertTrue(result);
    }

    @Test
    void shouldReturnTrueForOnlySpaces() {
        String s = "     ";

        boolean result = validPalindrome.processValidPalindrome(s);

        assertTrue(result);
    }

    @Test
    void shouldReturnTrueForOnlySpecialCharacters() {
        String s = ".,!@#$%^&*";

        boolean result = validPalindrome.processValidPalindrome(s);

        assertTrue(result);
    }

    @Test
    void shouldIgnoreUpperAndLowerCase() {
        String s = "RaceCar";

        boolean result = validPalindrome.processValidPalindrome(s);

        assertTrue(result);
    }

    @Test
    void shouldHandlePalindromeContainingNumbers() {
        String s = "12321";

        boolean result = validPalindrome.processValidPalindrome(s);

        assertTrue(result);
    }

    @Test
    void shouldReturnFalseForNonPalindromeNumbers() {
        String s = "12345";

        boolean result = validPalindrome.processValidPalindrome(s);

        assertFalse(result);
    }

    @Test
    void shouldHandleLettersAndNumbersTogether() {
        String s = "A1b2b1a";

        boolean result = validPalindrome.processValidPalindrome(s);

        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenLettersAndNumbersDoNotFormPalindrome() {
        String s = "A1b2c1a";

        boolean result = validPalindrome.processValidPalindrome(s);

        assertFalse(result);
    }

    @Test
    void shouldIgnoreSpecialCharactersBetweenLetters() {
        String s = "a@b#c$c#b@a";

        boolean result = validPalindrome.processValidPalindrome(s);

        assertTrue(result);
    }

    @Test
    void shouldIgnoreSpacesBetweenCharacters() {
        String s = "n u r s e s r u n";

        boolean result = validPalindrome.processValidPalindrome(s);

        assertTrue(result);
    }

    @Test
    void shouldHandleTwoSameCharacters() {
        String s = "aa";

        boolean result = validPalindrome.processValidPalindrome(s);

        assertTrue(result);
    }

    @Test
    void shouldHandleTwoDifferentCharacters() {
        String s = "ab";

        boolean result = validPalindrome.processValidPalindrome(s);

        assertFalse(result);
    }

    @Test
    void shouldHandleSpecialCharactersAtBeginningAndEnd() {
        String s = "!!!racecar???";

        boolean result = validPalindrome.processValidPalindrome(s);

        assertTrue(result);
    }
}