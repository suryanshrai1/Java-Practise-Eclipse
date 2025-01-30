package com.java.array;

public class RearrangeArrElemBySign {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int posIndex = 0, negIndex = 1;

        for (int num : nums) {
            if (num > 0) {
                result[posIndex] = num;
                posIndex += 2;
            } else {
                result[negIndex] = num;
                negIndex += 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        RearrangeArrElemBySign rearranger = new RearrangeArrElemBySign();
        int[] nums = {3, 1, -2, -5, 2, -4}; 
        int[] rearranged = rearranger.rearrangeArray(nums);

        for (int num : rearranged) {
            System.out.print(num + " ");
        }
    }
}