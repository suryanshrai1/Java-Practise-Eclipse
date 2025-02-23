package com.java.recursion;

import java.util.ArrayList;

class SubsetSums {
	public ArrayList<Integer> subsetSums(int[] arr) {
		ArrayList<Integer> result = new ArrayList<>();
		calcSubsetSums(arr, 0, 0, result);
		return result;
	}

	private void calcSubsetSums(int[] arr, int index, int currentSum, ArrayList<Integer> result) {
		// Base case: if we've considered all elements, add the current sum to the
		// result
		if (index == arr.length) {
			result.add(currentSum);
			return;
		}

		// Include the current element in the sum
		calcSubsetSums(arr, index + 1, currentSum + arr[index], result);

		// Exclude the current element from the sum
		calcSubsetSums(arr, index + 1, currentSum, result);
	}

	public static void main(String[] args) {
		SubsetSums solution = new SubsetSums();
		int[] arr = { 2, 3 };
		ArrayList<Integer> sums = solution.subsetSums(arr);
		System.out.println(sums);
	}
}
