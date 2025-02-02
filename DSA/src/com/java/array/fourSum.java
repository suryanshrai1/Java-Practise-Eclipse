package com.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class fourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates for i
            }

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue; // Skip duplicates for j
                }
                int p = j + 1;
                int q = nums.length - 1;
                while (p < q) {
                    long sum = (long) nums[i] + nums[j] + nums[p] + nums[q];
                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));

                        while (p < q && nums[p] == nums[p + 1]) p++; // Skip duplicates for p
                        while (p < q && nums[q] == nums[q - 1]) q--; // Skip duplicates for q

                        p++;
                        q--;
                    }
                    if (sum < target) {
                        p++;
                    } else if (sum > target) {
                        q--;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        fourSum FourSum = new fourSum();
        
        // Example input
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        
        // Call the fourSum method
        List<List<Integer>> result = FourSum.fourSum(nums, target);
        
        System.out.println("Quadruplets that sum to " + target + ":");
        for (List<Integer> quadruplet : result) {
            System.out.println(quadruplet);
        }
    }
}