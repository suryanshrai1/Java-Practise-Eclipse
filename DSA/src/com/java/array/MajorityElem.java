package com.java.array;
import java.util.Arrays;

public class MajorityElem {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {
    	MajorityElem solution = new MajorityElem();
        
        // Example input
        int[] nums = {3, 2, 3};
        
        // Finding the majority element
        int majorityElement = solution.majorityElement(nums);
        
        // Printing the result
        System.out.println("The majority element is: " + majorityElement);
    }
}


