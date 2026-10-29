package com.intelliguru.javastreams.util.leetcode;

public class MoveZeroes {
    public void processMoveZeroes(int[] nums){
            int nonZeroPosition = 0;
            for (int i =0; i<nums.length; i++) {
                if (nums[i] != 0) {
                    nums[nonZeroPosition] = nums[i];
                    nonZeroPosition++;
                }
            }

            while (nonZeroPosition < nums.length) {
                nums[nonZeroPosition] = 0;
                nonZeroPosition++;
            }
    }
}
