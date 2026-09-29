package com.intelliguru.javastreams.util.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean processContainsDuplicate(int[] nums) {
//        for (int i = 0; i <= nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    return true;
//                }
//            }
//        }
//        return false;
        return processContainsDuplicateWithHashMap(nums);
    }

    private boolean processContainsDuplicateWithHashMap(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for(int num : nums){
            if(numSet.contains(num)) {
                return true;
            }
            numSet.add(num);
        }
        return false;
    }
}
