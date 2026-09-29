package com.intelliguru.javastreams.util.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] processTwoSum(int[] numbers, int target) {
//        for (int i = 0; i < numbers.length - 1; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                if(numbers[i] + numbers[j] == target){
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[]{};
        return processTwoSumWithHashMap(numbers, target);
    }
    private int[] processTwoSumWithHashMap(int[] numbers, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i <= numbers.length - 1; i++) {
           int complement = target - numbers[i];
           if(numMap.containsKey(complement)){
               return new int[] {numMap.get(complement), i};
           }
           numMap.put(numbers[i], i);
        }
        return new int[]{};
    }
}
