package com.java.array;

public class SearchInsertPosition {
	
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // To prevent overflow

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return left;
    }

    public static void main(String[] args) {
        SearchInsertPosition SearchInsertPosition = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int result = SearchInsertPosition.searchInsert(nums, target);
        System.out.println("Insert position: " + result); // Output: 2
    }
}