package com.intelliguru.javastreams.util.leetcode;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6, 8};
        int[] expected = {1, 2, 3, 4, 5, 6, 8};
        System.out.println("Expected Result: "+ Arrays.toString(expected));

        int[] mergedArray = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            mergedArray[i] = arr1[i];
        }

        for (int j = 0; j < arr2.length; j++) {
            mergedArray[arr1.length + j] = arr2[j];
        }
        System.out.println("Merged: " + Arrays.toString(mergedArray));
        for (int i = 0; i<mergedArray.length-1; i++){
            for (int j = 0; j<mergedArray.length-1-i; j++){
                if (mergedArray[j] > mergedArray[j+1]) {
                    int temp = mergedArray[j];
                    mergedArray[j] = mergedArray[j+1];
                    mergedArray[j+1] = temp;
                }
            }
        }
        System.out.println("Actual Result: "+ Arrays.toString(mergedArray));
    }
}
