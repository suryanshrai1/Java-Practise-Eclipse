package com.java.array;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		result.add(new ArrayList<>()); // Start with the empty subset

		// Use a standard for loop to iterate through the nums array
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i]; // Get the current number
			int n = result.size(); // Get the current size of the result list

			for (int j = 0; j < n; j++) {
				List<Integer> currSubset = new ArrayList<>(result.get(j));
				currSubset.add(num);
				result.add(currSubset);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Subsets subsets = new Subsets();
		int[] nums1 = { 1, 2, 3 };
		System.out.println(subsets.subsets(nums1)); // Output: [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]

		int[] nums2 = { 0 };
		System.out.println(subsets.subsets(nums2)); // Output: [[], [0]]
	}
}