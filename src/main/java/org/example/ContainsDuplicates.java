package org.example;

import java.util.HashSet;

public class ContainsDuplicates {


    /*
    Brute Force approach
    m*n complexity
     */
    public boolean containsDuplicate(int[] nums) {

        /*
         * Brute Force Approach
         * O(n*n) time complexity
         */
//        int size = nums.length;
//
//        for (int i = 0; i < size; i++) {
//            for (int j = i + 1; j < size; j++) {
//                if (nums[i] == nums[j]) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }


        /*
         * Sorting Technique
         * O(nlogn) here you are comparing with the neighbours
         */
//        int size = nums.length;
//        Arrays.sort(nums);
//        for (int i = 1; i < size; i++) {
//            if (nums[i - 1] == nums[i]) {
//                return true;
//            }
//        }
//        return false;
//
//    }


        /*
        Using HashMap where we sacrifice the space to improve the memory
         */
        HashSet<Integer> map = new HashSet<>();

        for (int num : nums) {
            if (map.contains(num))
                return true;
            map.add(num);
        }
        return false;
    }

}
