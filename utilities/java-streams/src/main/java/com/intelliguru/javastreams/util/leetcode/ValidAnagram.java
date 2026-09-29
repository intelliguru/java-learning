package com.intelliguru.javastreams.util.leetcode;

import java.util.Arrays;

public class ValidAnagram {

    public boolean processValidAnagram(String s, String t) {
//        char[] sourceChars = s.toCharArray();
//        Arrays.sort(sourceChars);
//
//        char[] targetChars = t.toCharArray();
//        Arrays.sort(targetChars);
//
//        return Arrays.toString(sourceChars).equals(Arrays.toString(targetChars));
         return processValidAnagram2ndApproach(s, t);
    }

    private boolean processValidAnagram2ndApproach(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        char[] sourceChars = s.toLowerCase().toCharArray();
        char[] targetChars = t.toLowerCase().toCharArray();
        Arrays.sort(sourceChars);
        Arrays.sort(targetChars);

        return Arrays.equals(sourceChars, targetChars);
    }

}
