package com.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {


    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates for i
            }
            
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];

                if (total > 0) {
                    k--; // Decrease the sum
                } else if (total < 0) {
                    j++; // Increase the sum
                } else {
                    // Found a triplet
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--; // Move both pointers

                    // Skip duplicates for j
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    // Skip duplicates for k
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }
        return res;        
    }

    public static void main(String[] args) {
        ThreeSum solution = new ThreeSum();
        
        // Example input
        int[] nums = {-1, 0, 1, 2, -1, -4};
        
        // Call the threeSum method
        List<List<Integer>> result = solution.threeSum(nums);
        
        // Print the result
        System.out.println("Triplets that sum to zero:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}

