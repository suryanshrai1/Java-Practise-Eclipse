package com.java.array;

import java.io.*;

public class CeilAndFloor {
    public static void main(String[] args) throws IOException {
        // Sample test cases
        String[] testCases = {
            "1\n5\n1 2 3 4 6 7 8", // Test Case 1
            "2\n10\n1 2 3 4 5\n15\n10 20 30", // Test Case 2
            "1\n0\n-5 -3 -1 1 3 5", // Test Case 3
            "1\n100\n50 60 70 80 90", // Test Case 4
            "1\n-10\n-20 -15 -5 0 5" // Test Case 5
        };

        for (String testCase : testCases) {
            runTestCase(testCase);
        }
    }

    // Method to run a single test case
    public static void runTestCase(String input) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(input));
        int t = Integer.parseInt(br.readLine()); // Read number of test cases

        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine()); // Read the target number
            String[] inputArray = br.readLine().split(" "); // Read the array as a string
            int[] arr = new int[inputArray.length];

            // Convert string array to integer array
            for (int i = 0; i < inputArray.length; i++) {
                arr[i] = Integer.parseInt(inputArray[i]);
            }

            // Get floor and ceil
            int[] result = getFloorAndCeil(x, arr);
            System.out.println(result[0] + " " + result[1]); // Print the result
        }
    }

    // Method to find floor and ceil
    public static int[] getFloorAndCeil(int x, int[] arr) {
        int floor = Integer.MIN_VALUE; // Initialize floor to the smallest integer
        int ceil = Integer.MAX_VALUE;   // Initialize ceil to the largest integer

        for (int num : arr) {
            if (num <= x) {
                floor = Math.max(floor, num); // Update floor
            }
            if (num >= x) {
                ceil = Math.min(ceil, num); // Update ceil
            }
        }

        // If no floor or ceil was found, set them to -1
        if (floor == Integer.MIN_VALUE) floor = -1;
        if (ceil == Integer.MAX_VALUE) ceil = -1;

        return new int[]{floor, ceil}; // Return the result
    }
}